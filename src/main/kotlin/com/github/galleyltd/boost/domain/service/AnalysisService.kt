package com.github.galleyltd.boost.domain.service

import com.github.galleyltd.boost.domain.api.dto.MatchData
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
        private const val WINDOW_SIZE = 2
        private const val STEP = 1
        private const val SMALL_DIFF = 0.1
        private const val DIFF = 0.2
        private const val BIG_DIFF = 0.30
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
        // TODO produce metrics, saying how spiky items location are
        return 0.0f
    }


    override fun accountFeedback(matches: List<MatchData>, accountId: Long): AccountFeedback {

        val playerMatches = matches.map { it.players.first { it.accountId == accountId } }

        // get items in inventory
        val item0 = playerMatches.map { it.item0 }
        val item1 = playerMatches.map { it.item1 }
        val item2 = playerMatches.map { it.item2 }
        val item3 = playerMatches.map { it.item3 }
        val item4 = playerMatches.map { it.item4 }
        val item5 = playerMatches.map { it.item5 }

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


        val xpmData = playerMatches.map { it.xpPerMin }
        val gpmData = playerMatches.map { it.goldPerMin }
        val kpmData = playerMatches.map { it.killsPerMin }
        val heroDamage = playerMatches.map { it.heroDamage }
        val kdaData = playerMatches.map { it.kda }

        val movingAverageXPM = xpmData.windowed(WINDOW_SIZE, STEP) { it.average() }
        val movingAverageGPM = gpmData.windowed(WINDOW_SIZE, STEP) { it.average() }
        val movingAverageKPM = kpmData.windowed(WINDOW_SIZE, STEP) { it.average() }
        val movingAverageHD = heroDamage.windowed(WINDOW_SIZE, STEP) { it.average() }
        val movingAverageKDA = kdaData.windowed(WINDOW_SIZE, STEP) { it.average() }

        return AccountFeedback(
            accountId,
            analyzeMoving(xpmData, movingAverageXPM),
            analyzeMoving(gpmData, movingAverageGPM),
            analyzeMoving(kpmData, movingAverageKPM),
            analyzeMoving(heroDamage, movingAverageHD),
            analyzeMoving(kdaData, movingAverageKDA),
            analyzeItems(sortedItems)
        )
    }

}
