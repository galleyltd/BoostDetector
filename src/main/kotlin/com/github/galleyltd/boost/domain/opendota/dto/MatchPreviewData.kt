package com.github.galleyltd.boost.domain.opendota.dto

import com.fasterxml.jackson.annotation.JsonAutoDetect
import com.fasterxml.jackson.annotation.JsonProperty

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
data class MatchPreviewData(
    @JsonProperty("match_id") private val matchId: String?,
    @JsonProperty("player_slot") private val playerSlot: Int?,
    @JsonProperty("radiant_win") private val radiantWin: Boolean?,
    @JsonProperty("duration") private val duration: Int?,
    @JsonProperty("game_mode") private val gameMode: Int?,
    @JsonProperty("lobby_type") private val lobbyType: Int?,
    @JsonProperty("hero_id") private val heroId: Int?,
    @JsonProperty("start_time") private val startTime: Int?,
    @JsonProperty("version") private val version: Any?,
    @JsonProperty("kills") private val kills: Int?,
    @JsonProperty("deaths") private val deaths: Int?,
    @JsonProperty("assists") private val assists: Int?,
    @JsonProperty("skill") private val skill: Any?,
    @JsonProperty("leaver_status") private val leaverStatus: Int?,
    @JsonProperty("party_size") private val partySize: Any?
)
