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
            1, 48, 79, 90, 96, 98, 102, 250, 116, 119, 127, 147, 151, 156, 172, 210, 220, 225, 231, 242, 249, 263
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
        val isSpike = zippedData.map { it -> relativeDifference(it.first.toDouble(), it.second.toDouble()) > DIFF }
        println()
        return isSpike.count { it }.toFloat() / isSpike.size
    }

    private fun analyzeItems(sortedItems: List<InventoryDistribution>): Float {
        // TODO produce metrics, saying how spiky items location are
        return 0.0f
    }


    override fun accountFeedback(matches: List<MatchData>, accountId: Long): AccountFeedback {
        // get items in inventory
        val item0 = matches.map { it.players.first { it -> it.accountId == accountId }.item0 }
        val item1 = matches.map { it.players.first { it -> it.accountId == accountId }.item1 }
        val item2 = matches.map { it.players.first { it -> it.accountId == accountId }.item2 }
        val item3 = matches.map { it.players.first { it -> it.accountId == accountId }.item3 }
        val item4 = matches.map { it.players.first { it -> it.accountId == accountId }.item4 }
        val item5 = matches.map { it.players.first { it -> it.accountId == accountId }.item5 }

        val distributionPerItem = ITEMS_TO_LOOK_FOR.map { item ->
            val total = item0.count { it -> it == item } +
                    item1.count { it -> it == item } +
                    item2.count { it -> it == item } +
                    item3.count { it -> it == item } +
                    item4.count { it -> it == item } +
                    item5.count { it -> it == item }
            InventoryDistribution(
                item,
                total,
                item0.count { it -> it == item }.toFloat() / total,
                item1.count { it -> it == item }.toFloat() / total,
                item2.count { it -> it == item }.toFloat() / total,
                item3.count { it -> it == item }.toFloat() / total,
                item4.count { it -> it == item }.toFloat() / total,
                item5.count { it -> it == item }.toFloat() / total
            )
        }
        val sortedItems = distributionPerItem.filter { it -> it.total > 0 }.sortedBy { it -> -it.total }

        val xpmData = matches.map { it.players.first { it -> it.accountId == accountId }.xpPerMin }
        val gpmData = matches.map { it.players.first { it -> it.accountId == accountId }.goldPerMin }
        val kpmData = matches.map { it.players.first { it -> it.accountId == accountId }.killsPerMin }
        val heroDamage = matches.map { it.players.first { it -> it.accountId == accountId }.heroDamage }
        val kdaData = matches.map { it.players.first { it -> it.accountId == accountId }.kda }

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
