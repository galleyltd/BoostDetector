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

import io.swagger.client.models.Inline_response_200_17_ranks_fields
import io.swagger.client.models.Inline_response_200_17_ranks_rows
import io.swagger.client.models.Inline_response_200_17_ranks_sum

/**
 * mmr
 * @param commmand command
 * @param rowCount rowCount
 * @param rows rows
 * @param fields fields
 * @param rowAsArray rowAsArray
 * @param sum 
 */
data class Inline_response_200_17_mmr (
    /* command */
    val commmand: kotlin.String? = null,
    /* rowCount */
    val rowCount: kotlin.Int? = null,
    /* rows */
    val rows: kotlin.Array<Inline_response_200_17_ranks_rows>? = null,
    /* fields */
    val fields: kotlin.Array<Inline_response_200_17_ranks_fields>? = null,
    /* rowAsArray */
    val rowAsArray: kotlin.Boolean? = null,
    val sum: Inline_response_200_17_ranks_sum? = null
) {

}

