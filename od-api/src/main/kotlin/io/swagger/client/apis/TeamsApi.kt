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
package io.swagger.client.apis

import io.swagger.client.models.Inline_response_200_14
import io.swagger.client.models.Inline_response_200_26
import io.swagger.client.models.Inline_response_200_27
import io.swagger.client.models.Inline_response_200_28

import io.swagger.client.infrastructure.*

class TeamsApi(basePath: kotlin.String = "https://api.opendota.com/api") : ApiClient(basePath) {

    /**
    * GET /teams
    * Get team data
    * @return kotlin.Array<Inline_response_200_26>
    */
    @Suppress("UNCHECKED_CAST")
    fun teamsGet() : kotlin.Array<Inline_response_200_26> {
        val localVariableBody: kotlin.Any? = null
        val localVariableQuery: MultiValueMap = mapOf()
        val localVariableHeaders: kotlin.collections.Map<kotlin.String,kotlin.String> = mapOf()
        val localVariableConfig = RequestConfig(
            RequestMethod.GET,
            "/teams",
            query = localVariableQuery,
            headers = localVariableHeaders
        )
        val response = request<kotlin.Array<Inline_response_200_26>>(
            localVariableConfig,
            localVariableBody
        )

        return when (response.responseType) {
            ResponseType.Success -> (response as Success<*>).data as kotlin.Array<Inline_response_200_26>
            ResponseType.Informational -> TODO()
            ResponseType.Redirection -> TODO()
            ResponseType.ClientError -> throw ClientException((response as ClientError<*>).body as? String ?: "Client error")
            ResponseType.ServerError -> throw ServerException((response as ServerError<*>).message ?: "Server error")
            else -> throw kotlin.IllegalStateException("Undefined ResponseType.")
        }
    }

    /**
    * GET /teams/{team_id}
    * Get data for a team
    * @param teamId Team ID 
    * @return Inline_response_200_26
    */
    @Suppress("UNCHECKED_CAST")
    fun teamsTeamIdGet(teamId: kotlin.Int) : Inline_response_200_26 {
        val localVariableBody: kotlin.Any? = null
        val localVariableQuery: MultiValueMap = mapOf()
        val localVariableHeaders: kotlin.collections.Map<kotlin.String,kotlin.String> = mapOf()
        val localVariableConfig = RequestConfig(
            RequestMethod.GET,
            "/teams/{team_id}".replace("{"+"team_id"+"}", "$teamId"),
            query = localVariableQuery,
            headers = localVariableHeaders
        )
        val response = request<Inline_response_200_26>(
            localVariableConfig,
            localVariableBody
        )

        return when (response.responseType) {
            ResponseType.Success -> (response as Success<*>).data as Inline_response_200_26
            ResponseType.Informational -> TODO()
            ResponseType.Redirection -> TODO()
            ResponseType.ClientError -> throw ClientException((response as ClientError<*>).body as? String ?: "Client error")
            ResponseType.ServerError -> throw ServerException((response as ServerError<*>).message ?: "Server error")
            else -> throw kotlin.IllegalStateException("Undefined ResponseType.")
        }
    }

    /**
    * GET /teams/{team_id}/heroes
    * Get heroes for a team
    * @param teamId Team ID 
    * @return Inline_response_200_28
    */
    @Suppress("UNCHECKED_CAST")
    fun teamsTeamIdHeroesGet(teamId: kotlin.Int) : Inline_response_200_28 {
        val localVariableBody: kotlin.Any? = null
        val localVariableQuery: MultiValueMap = mapOf()
        val localVariableHeaders: kotlin.collections.Map<kotlin.String,kotlin.String> = mapOf()
        val localVariableConfig = RequestConfig(
            RequestMethod.GET,
            "/teams/{team_id}/heroes".replace("{"+"team_id"+"}", "$teamId"),
            query = localVariableQuery,
            headers = localVariableHeaders
        )
        val response = request<Inline_response_200_28>(
            localVariableConfig,
            localVariableBody
        )

        return when (response.responseType) {
            ResponseType.Success -> (response as Success<*>).data as Inline_response_200_28
            ResponseType.Informational -> TODO()
            ResponseType.Redirection -> TODO()
            ResponseType.ClientError -> throw ClientException((response as ClientError<*>).body as? String ?: "Client error")
            ResponseType.ServerError -> throw ServerException((response as ServerError<*>).message ?: "Server error")
            else -> throw kotlin.IllegalStateException("Undefined ResponseType.")
        }
    }

    /**
    * GET /teams/{team_id}/matches
    * Get matches for a team
    * @param teamId Team ID 
    * @return Inline_response_200_14
    */
    @Suppress("UNCHECKED_CAST")
    fun teamsTeamIdMatchesGet(teamId: kotlin.Int) : Inline_response_200_14 {
        val localVariableBody: kotlin.Any? = null
        val localVariableQuery: MultiValueMap = mapOf()
        val localVariableHeaders: kotlin.collections.Map<kotlin.String,kotlin.String> = mapOf()
        val localVariableConfig = RequestConfig(
            RequestMethod.GET,
            "/teams/{team_id}/matches".replace("{"+"team_id"+"}", "$teamId"),
            query = localVariableQuery,
            headers = localVariableHeaders
        )
        val response = request<Inline_response_200_14>(
            localVariableConfig,
            localVariableBody
        )

        return when (response.responseType) {
            ResponseType.Success -> (response as Success<*>).data as Inline_response_200_14
            ResponseType.Informational -> TODO()
            ResponseType.Redirection -> TODO()
            ResponseType.ClientError -> throw ClientException((response as ClientError<*>).body as? String ?: "Client error")
            ResponseType.ServerError -> throw ServerException((response as ServerError<*>).message ?: "Server error")
            else -> throw kotlin.IllegalStateException("Undefined ResponseType.")
        }
    }

    /**
    * GET /teams/{team_id}/players
    * Get players who have played for a team
    * @param teamId Team ID 
    * @return Inline_response_200_27
    */
    @Suppress("UNCHECKED_CAST")
    fun teamsTeamIdPlayersGet(teamId: kotlin.Int) : Inline_response_200_27 {
        val localVariableBody: kotlin.Any? = null
        val localVariableQuery: MultiValueMap = mapOf()
        val localVariableHeaders: kotlin.collections.Map<kotlin.String,kotlin.String> = mapOf()
        val localVariableConfig = RequestConfig(
            RequestMethod.GET,
            "/teams/{team_id}/players".replace("{"+"team_id"+"}", "$teamId"),
            query = localVariableQuery,
            headers = localVariableHeaders
        )
        val response = request<Inline_response_200_27>(
            localVariableConfig,
            localVariableBody
        )

        return when (response.responseType) {
            ResponseType.Success -> (response as Success<*>).data as Inline_response_200_27
            ResponseType.Informational -> TODO()
            ResponseType.Redirection -> TODO()
            ResponseType.ClientError -> throw ClientException((response as ClientError<*>).body as? String ?: "Client error")
            ResponseType.ServerError -> throw ServerException((response as ServerError<*>).message ?: "Server error")
            else -> throw kotlin.IllegalStateException("Undefined ResponseType.")
        }
    }

}
