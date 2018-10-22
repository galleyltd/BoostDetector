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


/**
 * 
 * @param team_id Team's identifier
 * @param rating The Elo rating of the team
 * @param wins The number of games won by this team
 * @param losses The number of losses by this team
 * @param last_match_time The Unix timestamp of the last match played by this team
 * @param name Team name, eg. 'Newbee'
 * @param tag The team tag/abbreviation
 */
data class Inline_response_200_26 (
    /* Team's identifier */
    val team_id: kotlin.Int? = null,
    /* The Elo rating of the team */
    val rating: java.math.BigDecimal? = null,
    /* The number of games won by this team */
    val wins: kotlin.Int? = null,
    /* The number of losses by this team */
    val losses: kotlin.Int? = null,
    /* The Unix timestamp of the last match played by this team */
    val last_match_time: kotlin.Int? = null,
    /* Team name, eg. 'Newbee' */
    val name: kotlin.String? = null,
    /* The team tag/abbreviation */
    val tag: kotlin.String? = null
) {

}

