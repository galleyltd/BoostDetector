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
 * @param account_id account_id
 * @param avatarfull avatarfull
 * @param personaname personaname
 * @param last_match_time last_match_time. May not be present or null.
 * @param similarity similarity
 */
data class Inline_response_200_18 (
    /* account_id */
    val account_id: kotlin.Int? = null,
    /* avatarfull */
    val avatarfull: kotlin.String? = null,
    /* personaname */
    val personaname: kotlin.String? = null,
    /* last_match_time. May not be present or null. */
    val last_match_time: kotlin.String? = null,
    /* similarity */
    val similarity: java.math.BigDecimal? = null
) {

}

