package com.github.galleyltd.boost.opendota.dto

import com.fasterxml.jackson.annotation.JsonAutoDetect
import com.fasterxml.jackson.annotation.JsonProperty

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
data class SearchData(
    @JsonProperty("account_id") private val accountId: Int?,
    @JsonProperty("personaname") private val personaname: String?,
    @JsonProperty("avatarfull") private val avatarfull: String?,
    @JsonProperty("similarity") private val similarity: Double?,
    @JsonProperty("last_match_time") private val lastMatchTime: String?
)
