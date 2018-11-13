package com.github.galleyltd.boost.domain.api.dto

import com.fasterxml.jackson.annotation.JsonAutoDetect
import com.fasterxml.jackson.annotation.JsonProperty

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
data class MatchPreviewData(
    @JsonProperty("match_id") val matchId: Long,
    @JsonProperty("player_slot") val playerSlot: Int?,
    @JsonProperty("radiant_win") val radiantWin: Boolean?,
    @JsonProperty("duration") val duration: Int?,
    @JsonProperty("game_mode") val gameMode: Int?,
    @JsonProperty("lobby_type") val lobbyType: Int?,
    @JsonProperty("hero_id") val heroId: Int?,
    @JsonProperty("start_time") val startTime: Int?,
    @JsonProperty("version") val version: Any?,
    @JsonProperty("kills") val kills: Int?,
    @JsonProperty("deaths") val deaths: Int?,
    @JsonProperty("assists") val assists: Int?,
    @JsonProperty("skill") val skill: Any?,
    @JsonProperty("leaver_status") val leaverStatus: Int?,
    @JsonProperty("party_size") val partySize: Any?
)
