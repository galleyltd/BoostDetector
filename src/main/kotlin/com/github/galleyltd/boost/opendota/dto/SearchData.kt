package com.github.galleyltd.boost.opendota.dto

import com.fasterxml.jackson.annotation.JsonAutoDetect
import com.fasterxml.jackson.annotation.JsonProperty

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
data class SearchData(
    @JsonProperty("account_id") val accountId: Int?,
    @JsonProperty("personaname") val personaname: String?,
    @JsonProperty("avatarfull") val avatarfull: String?,
    @JsonProperty("similarity") val similarity: Double?,
    @JsonProperty("last_match_time") val lastMatchTime: String?
)
