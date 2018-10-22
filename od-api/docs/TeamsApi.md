# TeamsApi

All URIs are relative to *https://api.opendota.com/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**teamsGet**](TeamsApi.md#teamsGet) | **GET** /teams | GET /teams
[**teamsTeamIdGet**](TeamsApi.md#teamsTeamIdGet) | **GET** /teams/{team_id} | GET /teams/{team_id}
[**teamsTeamIdHeroesGet**](TeamsApi.md#teamsTeamIdHeroesGet) | **GET** /teams/{team_id}/heroes | GET /teams/{team_id}/heroes
[**teamsTeamIdMatchesGet**](TeamsApi.md#teamsTeamIdMatchesGet) | **GET** /teams/{team_id}/matches | GET /teams/{team_id}/matches
[**teamsTeamIdPlayersGet**](TeamsApi.md#teamsTeamIdPlayersGet) | **GET** /teams/{team_id}/players | GET /teams/{team_id}/players


<a name="teamsGet"></a>
# **teamsGet**
> kotlin.Array&lt;Inline_response_200_26&gt; teamsGet()

GET /teams

Get team data

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*

val apiInstance = TeamsApi()
try {
    val result : kotlin.Array<Inline_response_200_26> = apiInstance.teamsGet()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TeamsApi#teamsGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TeamsApi#teamsGet")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**kotlin.Array&lt;Inline_response_200_26&gt;**](Inline_response_200_26.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="teamsTeamIdGet"></a>
# **teamsTeamIdGet**
> Inline_response_200_26 teamsTeamIdGet(teamId)

GET /teams/{team_id}

Get data for a team

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*

val apiInstance = TeamsApi()
val teamId : kotlin.Int = 56 // kotlin.Int | Team ID
try {
    val result : Inline_response_200_26 = apiInstance.teamsTeamIdGet(teamId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TeamsApi#teamsTeamIdGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TeamsApi#teamsTeamIdGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **teamId** | **kotlin.Int**| Team ID |

### Return type

[**Inline_response_200_26**](Inline_response_200_26.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="teamsTeamIdHeroesGet"></a>
# **teamsTeamIdHeroesGet**
> Inline_response_200_28 teamsTeamIdHeroesGet(teamId)

GET /teams/{team_id}/heroes

Get heroes for a team

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*

val apiInstance = TeamsApi()
val teamId : kotlin.Int = 56 // kotlin.Int | Team ID
try {
    val result : Inline_response_200_28 = apiInstance.teamsTeamIdHeroesGet(teamId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TeamsApi#teamsTeamIdHeroesGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TeamsApi#teamsTeamIdHeroesGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **teamId** | **kotlin.Int**| Team ID |

### Return type

[**Inline_response_200_28**](Inline_response_200_28.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="teamsTeamIdMatchesGet"></a>
# **teamsTeamIdMatchesGet**
> Inline_response_200_14 teamsTeamIdMatchesGet(teamId)

GET /teams/{team_id}/matches

Get matches for a team

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*

val apiInstance = TeamsApi()
val teamId : kotlin.Int = 56 // kotlin.Int | Team ID
try {
    val result : Inline_response_200_14 = apiInstance.teamsTeamIdMatchesGet(teamId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TeamsApi#teamsTeamIdMatchesGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TeamsApi#teamsTeamIdMatchesGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **teamId** | **kotlin.Int**| Team ID |

### Return type

[**Inline_response_200_14**](Inline_response_200_14.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="teamsTeamIdPlayersGet"></a>
# **teamsTeamIdPlayersGet**
> Inline_response_200_27 teamsTeamIdPlayersGet(teamId)

GET /teams/{team_id}/players

Get players who have played for a team

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*

val apiInstance = TeamsApi()
val teamId : kotlin.Int = 56 // kotlin.Int | Team ID
try {
    val result : Inline_response_200_27 = apiInstance.teamsTeamIdPlayersGet(teamId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TeamsApi#teamsTeamIdPlayersGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TeamsApi#teamsTeamIdPlayersGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **teamId** | **kotlin.Int**| Team ID |

### Return type

[**Inline_response_200_27**](Inline_response_200_27.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

