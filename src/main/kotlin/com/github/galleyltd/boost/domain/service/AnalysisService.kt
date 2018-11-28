package com.github.galleyltd.boost.domain.service

import com.github.galleyltd.boost.domain.api.dto.MatchData
import org.slf4j.LoggerFactory
import kotlin.math.abs

interface AnalysisService {
    fun accountFeedback(matches: List<MatchData>, accountId: Long): AccountFeedback
}

data class AccountFeedback(
    val accountId: Long,
    val xpmSpike: Float = 0.0f,
    val gpmSpike: Float = 0.0f,
    val kpmSpike: Float = 0.0f,
    val heroDamageSpike: Float = 0.0f,
    val kdaSpike: Float = 0.0f,
    val apmSpike: Float = 0.0f,
    val itemsSpike: Float = 0.0f
)

data class InventoryDistribution(
    val item: Int,
    val total: Int,
    val slot0: Float,
    val slot1: Float,
    val slot2: Float,
    val slot3: Float,
    val slot4: Float,
    val slot5: Float
)

class SimpleAnalysisService : AnalysisService {
    companion object {
        private const val DIFF = 0.2
        private const val ALPHA = 0.4
        private const val ITEM_DIFF = 0.9
        private val log = LoggerFactory.getLogger(this::class.java)
        private val ITEMS_TO_LOOK_FOR = listOf(
            1, // blink
            48, //travel
            79, // meka
            90, // pipe
            96, // hex
            98, // orchid
            102, // force
            116, // bkb
            119, // shiva
            127, // blademail
            147, // manta
            151, // armlet
            152, //lotar
            156, // satanic
            172, // mom
            174, //diffusal
            176, //eblade
            190, //veil
            206, // atos
            208, //abysal
            210, // halberd
            220, // travel2
            223, //meteor
            225, // nullifier
            226, // lotus
            229, //solar
            231, // greaves
            242, // crimson
            249, // silver
            250, // bloodthorn
            254, //glimmer
            263,  // pike
            267 //vessel
        )
    }

    private fun relativeDifference(v1: Double, v2: Double): Double {
        return abs(v1 - v2) / v2
    }

    private fun analyzeMoving(
        data: List<Number>,
        moving: List<Number>
    ): Float {
        val zippedData = data.zip(listOf(data[0]) + moving)
        val isSpikeList = zippedData.map { relativeDifference(it.first.toDouble(), it.second.toDouble()) > DIFF }
        return isSpikeList.count { it }.toFloat() / isSpikeList.size
    }

    private fun analyzeItems(sortedItems: List<InventoryDistribution>): Float {
        val filtered =
            sortedItems.filter { it.item == 1 || it.item == 116 || it.item == 102 || it.item == 263 || it.item == 48 || it.item == 254 || it.item == 220 }
        val itemSpike = filtered.count { it ->
            (it.slot0 < ITEM_DIFF && it.slot0 > 0.0) ||
                    (it.slot1 < ITEM_DIFF && it.slot1 > 0.0) ||
                    (it.slot2 < ITEM_DIFF && it.slot2 > 0.0) ||
                    (it.slot3 < ITEM_DIFF && it.slot3 > 0.0) ||
                    (it.slot4 < ITEM_DIFF && it.slot4 > 0.0) ||
                    (it.slot5 < ITEM_DIFF && it.slot5 > 0.0)
        }.toFloat() / filtered.size
        log.info(filtered.toString())
        return itemSpike
    }


    override fun accountFeedback(matches: List<MatchData>, accountId: Long): AccountFeedback {

        val wonMatches =
            matches.map { match -> match.players.first { it.accountId == accountId } }.filter { it.win == 1 }

        val lostMatches =
            matches.map { match -> match.players.first { it.accountId == accountId } }.filter { it.win == 0 }

        // get items in inventory
        val item0 = wonMatches.map { it.item0 }
        val item1 = wonMatches.map { it.item1 }
        val item2 = wonMatches.map { it.item2 }
        val item3 = wonMatches.map { it.item3 }
        val item4 = wonMatches.map { it.item4 }
        val item5 = wonMatches.map { it.item5 }

        val distributionPerItem = ITEMS_TO_LOOK_FOR.map { item ->
            val total = item0.count { it == item } +
                    item1.count { it == item } +
                    item2.count { it == item } +
                    item3.count { it == item } +
                    item4.count { it == item } +
                    item5.count { it == item }
            InventoryDistribution(
                item,
                total,
                item0.count { it == item }.toFloat() / total,
                item1.count { it == item }.toFloat() / total,
                item2.count { it == item }.toFloat() / total,
                item3.count { it == item }.toFloat() / total,
                item4.count { it == item }.toFloat() / total,
                item5.count { it == item }.toFloat() / total
            )
        }
        val sortedItems = distributionPerItem.filter { it.total > 0 }.sortedByDescending { it.total }

        val xpmData = wonMatches.map { it.xpPerMin.toDouble() }
        val gpmData = wonMatches.map { it.goldPerMin.toDouble() }
        val kpmData = wonMatches.map { it.killsPerMin }
        val apmData = wonMatches.map { it.actionsPerMin }
        val heroDamage = wonMatches.map { it.heroDamage.toDouble() }
        val kdaData = wonMatches.map { it.kda.toDouble() }

        val movingAverageXPM = xpmData.zipWithNext().map { it -> ALPHA * it.first + (1.0f - ALPHA) * it.second }
        val movingAverageGPM = gpmData.zipWithNext().map { it -> ALPHA * it.first + (1.0f - ALPHA) * it.second }
        val movingAverageKPM = kpmData.zipWithNext().map { it -> ALPHA * it.first + (1.0f - ALPHA) * it.second }
        val movingAverageHD = heroDamage.zipWithNext().map { it -> ALPHA * it.first + (1.0f - ALPHA) * it.second }
        val movingAverageKDA = kdaData.zipWithNext().map { it -> ALPHA * it.first + (1.0f - ALPHA) * it.second }
        val movingAverageAPM = apmData.zipWithNext().map { it -> ALPHA * it.first + (1.0f - ALPHA) * it.second }

        return AccountFeedback(
            accountId,
            analyzeMoving(xpmData, movingAverageXPM),
            analyzeMoving(gpmData, movingAverageGPM),
            analyzeMoving(kpmData, movingAverageKPM),
            analyzeMoving(heroDamage, movingAverageHD),
            analyzeMoving(kdaData, movingAverageKDA),
            analyzeMoving(apmData, movingAverageAPM),
            analyzeItems(sortedItems)
        )
    }
}
