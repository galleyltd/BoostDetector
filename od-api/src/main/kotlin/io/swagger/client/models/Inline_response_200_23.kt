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
 * @param hero_id Numeric identifier for the hero object
 * @param games_played Number of games played
 * @param wins Number of games won
 */
data class Inline_response_200_23 (
    /* Numeric identifier for the hero object */
    val hero_id: kotlin.Int? = null,
    /* Number of games played */
    val games_played: kotlin.Int? = null,
    /* Number of games won */
    val wins: kotlin.Int? = null
) {

}

