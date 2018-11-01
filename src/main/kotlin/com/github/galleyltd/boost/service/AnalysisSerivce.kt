package com.github.galleyltd.boost.service

import com.github.galleyltd.boost.opendota.dto.MatchData

interface AnalysisSerivce {

    fun analyse(matches: List<MatchData>, accountId: Int): Boolean

}

class SimpleAnalysisService : AnalysisSerivce {

    private val WINDOW_SIZE = 5
    private val STEP = 1

    override fun analyse(matches: List<MatchData>, accountId: Int): Boolean {
        println()
        val xpmData = matches.map { it.players?.first { it -> it?.accountId == accountId }?.xpPerMin }
            .map { it -> it!! }
        val gpmData = matches.map { it.players?.first { it -> it?.accountId == accountId }?.goldPerMin }
            .map { it -> it!! }
        val kpmData = matches.map { it.players?.first { it -> it?.accountId == accountId }?.killsPerMin }
            .map { it -> it!! }
        val apmData = matches.map { it.players?.first { it -> it?.accountId == accountId }?.actionsPerMin }
            .map { it -> it!! }
        val movingAverageXPM = xpmData.windowed(WINDOW_SIZE, STEP) { it.average() }
        val movingAverageGPM = gpmData.windowed(WINDOW_SIZE, STEP) { it.average() }
        val movingAverageKPM = kpmData.windowed(WINDOW_SIZE, STEP) { it.average() }
        val movingAverageAPM = apmData.windowed(WINDOW_SIZE, STEP) { it.average() }
        println(movingAverageXPM)
        return false
    }

}