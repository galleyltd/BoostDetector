package com.github.galleyltd.boost.service

import com.github.galleyltd.boost.opendota.dto.MatchData
import org.junit.jupiter.api.Assertions.assertTrue

import org.junit.jupiter.api.Test
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.CsvSource
import kotlin.random.Random

class AnalysisServiceTest {

    private val service = SimpleAnalysisService()

    private val matches: List<MatchData> = generateTestMatches()

    private fun generateTestMatches(): List<MatchData> {
        val size = Random.nextInt(10, 100)
        for (i <- 0 until size) {

        }
    }

    @Test
    fun testWindowedAvg() {
        assertTrue(false)
    }
}
