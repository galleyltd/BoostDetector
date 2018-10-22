/**
* OpenDota API
* # Introduction The OpenDota API provides Dota 2 related data including advanced match data extracted from match replays.  **Beginning 2018-04-22, the OpenDota API is limited to 50,000 free calls per month and 60 requests/minute** We offer a Premium Tier with unlimited API calls and higher rate limits. Check out the [API page](https://www.opendota.com/api-keys) to learn more. 
*
* OpenAPI spec version: 17.6.1
* 
*
* NOTE: This class is auto generated by the swagger code generator program.
* https://github.com/swagger-api/swagger-codegen.git
* Do not edit the class manually.
*/
package io.swagger.client.models

import io.swagger.client.models.Inline_response_200_1_mmr_estimate
import io.swagger.client.models.Inline_response_200_1_profile

/**
 * 
 * @param tracked_until tracked_until
 * @param solo_competitive_rank solo_competitive_rank
 * @param competitive_rank competitive_rank
 * @param rank_tier rank_tier
 * @param leaderboard_rank leaderboard_rank
 * @param mmr_estimate 
 * @param profile 
 */
data class Inline_response_200_1 (
    /* tracked_until */
    val tracked_until: kotlin.String? = null,
    /* solo_competitive_rank */
    val solo_competitive_rank: kotlin.String? = null,
    /* competitive_rank */
    val competitive_rank: kotlin.String? = null,
    /* rank_tier */
    val rank_tier: java.math.BigDecimal? = null,
    /* leaderboard_rank */
    val leaderboard_rank: java.math.BigDecimal? = null,
    val mmr_estimate: Inline_response_200_1_mmr_estimate? = null,
    val profile: Inline_response_200_1_profile? = null
) {

}

