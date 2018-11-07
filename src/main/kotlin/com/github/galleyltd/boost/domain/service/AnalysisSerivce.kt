package com.github.galleyltd.boost.domain.service

import com.github.galleyltd.boost.domain.opendota.dto.MatchData
import kotlin.math.abs

interface AnalysisSerivce {
    fun accountFeedback(matches: List<MatchData>, accountId: Int): AccountFeedback
}

data class AccountFeedback(
    val accountId: Int, val xpmSpike: Boolean = false, val gpmSpike: Boolean = false, val kpmSpike: Boolean = false,
    val heroDamageSpike: Boolean = false, val kdaSpike: Boolean = false
)

class SimpleAnalysisService : AnalysisSerivce {
    companion object {
        private val WINDOW_SIZE = 3
        private val STEP = 1
        private val DIFFERENCE = 0.2
    }

    private fun relativeDifference(v1: Double, v2: Double): Double {
        return abs(v1 - v2) / ((v1 + v2) / 2.0)
    }

    override fun accountFeedback(matches: List<MatchData>, accountId: Int): AccountFeedback {
        val xpmData = matches.map { it.players.first { it -> it.accountId == accountId }.xpPerMin }
        val gpmData = matches.map { it.players.first { it -> it.accountId == accountId }.goldPerMin }
        val kpmData = matches.map { it.players.first { it -> it.accountId == accountId }.killsPerMin }
        val heroDamage = matches.map { it.players.first { it -> it.accountId == accountId }.heroDamage }
        val kdaData = matches.map { it.players.first { it -> it.accountId == accountId }.kda }
        val movingAverageXPM =
            xpmData.windowed(WINDOW_SIZE, STEP) { it.average() }.windowed(WINDOW_SIZE, STEP) { it.average() }
        val movingAverageGPM =
            gpmData.windowed(WINDOW_SIZE, STEP) { it.average() }.windowed(WINDOW_SIZE, STEP) { it.average() }
        val movingAverageKPM =
            kpmData.windowed(WINDOW_SIZE, STEP) { it.average() }.windowed(WINDOW_SIZE, STEP) { it.average() }
        val movingAverageHD =
            heroDamage.windowed(WINDOW_SIZE, STEP) { it.average() }.windowed(WINDOW_SIZE, STEP) { it.average() }
        val movingAverageKDA =
            kdaData.windowed(WINDOW_SIZE, STEP) { it.average() }.windowed(WINDOW_SIZE, STEP) { it.average() }

        return AccountFeedback(
            accountId,
            relativeDifference(movingAverageXPM.max()!!, movingAverageXPM.min()!!) > DIFFERENCE,
            relativeDifference(movingAverageGPM.max()!!, movingAverageGPM.min()!!) > DIFFERENCE,
            relativeDifference(movingAverageKPM.max()!!, movingAverageKPM.min()!!) > DIFFERENCE,
            relativeDifference(movingAverageHD.max()!!, movingAverageHD.min()!!) > DIFFERENCE,
            relativeDifference(movingAverageKDA.max()!!, movingAverageKDA.min()!!) > DIFFERENCE
        )
    }
}
