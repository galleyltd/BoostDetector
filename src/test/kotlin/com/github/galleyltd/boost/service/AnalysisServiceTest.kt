package com.github.galleyltd.boost.service

import com.fasterxml.jackson.databind.DeserializationFeature
import com.fasterxml.jackson.module.kotlin.jacksonObjectMapper
import com.github.galleyltd.boost.opendota.dto.MatchData
import org.junit.Assert.assertTrue
import org.junit.jupiter.api.Test

class AnalysisServiceTest {

    private val service = SimpleAnalysisService()

    @Test
    fun testWindowedAvg() {
        val matches = readMatches(
            listOf(
                "3361901428",
                "3443905190",
                "3981938989",
                "4040513022",
                "4087082146",
                "4128363713",
                "4129097124",
                "4133021957",
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
        assertTrue(feedback.kdaSpike)
        assertTrue(feedback.kpmSpike)
        assertTrue(feedback.heroDamageSpike)
    }

    private fun readMatches(ids: List<String>): List<MatchData> {
        val matches = mutableListOf<MatchData>()
        for (id in ids) {
            val l = jacksonObjectMapper().disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES).readValue(
                this::class.java.classLoader.getResourceAsStream("$id.json").readBytes(),
                MatchData::class.java
            )
            matches.add(l)
        }
        return matches
    }
}
