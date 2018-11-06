package com.github.galleyltd.boost.service

import com.github.galleyltd.boost.di.KoinContainer
import com.github.galleyltd.boost.opendota.dto.MatchData
import kotlinx.coroutines.runBlocking
import org.junit.Assert.assertTrue
import org.junit.jupiter.api.Test

class AnalysisServiceTest {

    private val koinContainer = KoinContainer().also { it.init() }
    private val openDotaApiClient = koinContainer.openDotaApiClient
    private val service = SimpleAnalysisService()

    private fun requestTestMatches(ids: List<String>): List<MatchData> {
        val matches = mutableListOf<MatchData>()
        runBlocking {
            for (id in ids) {
                matches.add(openDotaApiClient.getMatchData(id))
            }
        }
        return matches
    }

    @Test
    fun testWindowedAvg() {
        val matches = requestTestMatches(
            listOf(
                "3361901428",
                "3443905190",
                "3981938989",
                "4040513022",
                "4087082146",
                "4173573070",
                "4173654727",
                "4174586560",
                "4174904803",
                "4176511736",
                "4176574180"
            )
        )
        val feedback = service.accountFeedback(matches, 116894024)
        assertTrue(feedback.xpmSpike)
        assertTrue(feedback.gpmSpike)
    }
}