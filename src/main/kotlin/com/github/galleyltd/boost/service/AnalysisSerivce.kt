package com.github.galleyltd.boost.service

import com.github.galleyltd.boost.opendota.dto.MatchData

interface AnalysisSerivce {

    fun accountFeedback(matches: List<MatchData>, accountId: Int): AccountFeedback

}

data class AccountFeedback(
    val accountId: Int, val xpmSpike: Boolean = false, val gpmSpike: Boolean = false, val kpmSpike: Boolean = false,
    val heroDamageSpike: Boolean = false, val kdaSpike: Boolean = false
)

class SimpleAnalysisService : AnalysisSerivce {

    private val WINDOW_SIZE = 5
    private val STEP = 1
    private val DIFFERENCE = 0.2

    override fun accountFeedback(matches: List<MatchData>, accountId: Int): AccountFeedback {
        println()
        val xpmData = matches.map { it.players.first { it -> it.accountId == accountId }.xpPerMin }
            .map { it -> it }
        val gpmData = matches.map { it.players.first { it -> it.accountId == accountId }.goldPerMin }
            .map { it -> it }
        val kpmData = matches.map { it.players.first { it -> it.accountId == accountId }.killsPerMin }
            .map { it -> it }
        val heroDamage = matches.map { it.players.first { it -> it.accountId == accountId }.heroDamage }
            .map { it -> it }
        val kdaData = matches.map { it.players.first { it -> it.accountId == accountId }.kda }
            .map { it -> it }
        val movingAverageXPM = xpmData.windowed(WINDOW_SIZE, STEP) { it.average() }
        val movingAverageGPM = gpmData.windowed(WINDOW_SIZE, STEP) { it.average() }
        val movingAverageKPM = kpmData.windowed(WINDOW_SIZE, STEP) { it.average() }
        val movingAverageHD = heroDamage.windowed(WINDOW_SIZE, STEP) { it.average() }
        val movingAverageKDA = kdaData.windowed(WINDOW_SIZE, STEP) { it.average() }
        return AccountFeedback(accountId)
    }

}