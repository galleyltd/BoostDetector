# PlayersApi

All URIs are relative to *https://api.opendota.com/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**playersAccountIdCountsGet**](PlayersApi.md#playersAccountIdCountsGet) | **GET** /players/{account_id}/counts | GET /players/{account_id}/counts
[**playersAccountIdGet**](PlayersApi.md#playersAccountIdGet) | **GET** /players/{account_id} | GET /players/{account_id}
[**playersAccountIdHeroesGet**](PlayersApi.md#playersAccountIdHeroesGet) | **GET** /players/{account_id}/heroes | GET /players/{account_id}/heroes
[**playersAccountIdHistogramsFieldGet**](PlayersApi.md#playersAccountIdHistogramsFieldGet) | **GET** /players/{account_id}/histograms/{field} | GET /players/{account_id}/histograms
[**playersAccountIdMatchesGet**](PlayersApi.md#playersAccountIdMatchesGet) | **GET** /players/{account_id}/matches | GET /players/{account_id}/matches
[**playersAccountIdPeersGet**](PlayersApi.md#playersAccountIdPeersGet) | **GET** /players/{account_id}/peers | GET /players/{account_id}/peers
[**playersAccountIdProsGet**](PlayersApi.md#playersAccountIdProsGet) | **GET** /players/{account_id}/pros | GET /players/{account_id}/pros
[**playersAccountIdRankingsGet**](PlayersApi.md#playersAccountIdRankingsGet) | **GET** /players/{account_id}/rankings | GET /players/{account_id}/rankings
[**playersAccountIdRatingsGet**](PlayersApi.md#playersAccountIdRatingsGet) | **GET** /players/{account_id}/ratings | GET /players/{account_id}/ratings
[**playersAccountIdRecentMatchesGet**](PlayersApi.md#playersAccountIdRecentMatchesGet) | **GET** /players/{account_id}/recentMatches | GET /players/{account_id}/recentMatches
[**playersAccountIdRefreshPost**](PlayersApi.md#playersAccountIdRefreshPost) | **POST** /players/{account_id}/refresh | POST /players/{account_id}/refresh
[**playersAccountIdTotalsGet**](PlayersApi.md#playersAccountIdTotalsGet) | **GET** /players/{account_id}/totals | GET /players/{account_id}/totals
[**playersAccountIdWardmapGet**](PlayersApi.md#playersAccountIdWardmapGet) | **GET** /players/{account_id}/wardmap | GET /players/{account_id}/wardmap
[**playersAccountIdWlGet**](PlayersApi.md#playersAccountIdWlGet) | **GET** /players/{account_id}/wl | GET /players/{account_id}/wl
[**playersAccountIdWordcloudGet**](PlayersApi.md#playersAccountIdWordcloudGet) | **GET** /players/{account_id}/wordcloud | GET /players/{account_id}/wordcloud


<a name="playersAccountIdCountsGet"></a>
# **playersAccountIdCountsGet**
> Inline_response_200_9 playersAccountIdCountsGet(accountId, limit, offset, win, patch, gameMode, lobbyType, region, date, laneRole, heroId, isRadiant, includedAccountId, excludedAccountId, withHeroId, againstHeroId, significant, having, sort)

GET /players/{account_id}/counts

Counts in categories

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*

val apiInstance = PlayersApi()
val accountId : kotlin.Int = 56 // kotlin.Int | Steam32 account ID
val limit : kotlin.Int = 56 // kotlin.Int | Number of matches to limit to
val offset : kotlin.Int = 56 // kotlin.Int | Number of matches to offset start by
val win : kotlin.Int = 56 // kotlin.Int | Whether the player won
val patch : kotlin.Int = 56 // kotlin.Int | Patch ID
val gameMode : kotlin.Int = 56 // kotlin.Int | Game Mode ID
val lobbyType : kotlin.Int = 56 // kotlin.Int | Lobby type ID
val region : kotlin.Int = 56 // kotlin.Int | Region ID
val date : kotlin.Int = 56 // kotlin.Int | Days previous
val laneRole : kotlin.Int = 56 // kotlin.Int | Lane Role ID
val heroId : kotlin.Int = 56 // kotlin.Int | Hero ID
val isRadiant : kotlin.Int = 56 // kotlin.Int | Whether the player was radiant
val includedAccountId : kotlin.Int = 56 // kotlin.Int | Account IDs in the match (array)
val excludedAccountId : kotlin.Int = 56 // kotlin.Int | Account IDs not in the match (array)
val withHeroId : kotlin.Int = 56 // kotlin.Int | Hero IDs on the player's team (array)
val againstHeroId : kotlin.Int = 56 // kotlin.Int | Hero IDs against the player's team (array)
val significant : kotlin.Int = 56 // kotlin.Int | Whether the match was significant for aggregation purposes
val having : kotlin.Int = 56 // kotlin.Int | The minimum number of games played, for filtering hero stats
val sort : kotlin.String = sort_example // kotlin.String | The field to return matches sorted by in descending order
try {
    val result : Inline_response_200_9 = apiInstance.playersAccountIdCountsGet(accountId, limit, offset, win, patch, gameMode, lobbyType, region, date, laneRole, heroId, isRadiant, includedAccountId, excludedAccountId, withHeroId, againstHeroId, significant, having, sort)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PlayersApi#playersAccountIdCountsGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PlayersApi#playersAccountIdCountsGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountId** | **kotlin.Int**| Steam32 account ID |
 **limit** | **kotlin.Int**| Number of matches to limit to | [optional]
 **offset** | **kotlin.Int**| Number of matches to offset start by | [optional]
 **win** | **kotlin.Int**| Whether the player won | [optional]
 **patch** | **kotlin.Int**| Patch ID | [optional]
 **gameMode** | **kotlin.Int**| Game Mode ID | [optional]
 **lobbyType** | **kotlin.Int**| Lobby type ID | [optional]
 **region** | **kotlin.Int**| Region ID | [optional]
 **date** | **kotlin.Int**| Days previous | [optional]
 **laneRole** | **kotlin.Int**| Lane Role ID | [optional]
 **heroId** | **kotlin.Int**| Hero ID | [optional]
 **isRadiant** | **kotlin.Int**| Whether the player was radiant | [optional]
 **includedAccountId** | **kotlin.Int**| Account IDs in the match (array) | [optional]
 **excludedAccountId** | **kotlin.Int**| Account IDs not in the match (array) | [optional]
 **withHeroId** | **kotlin.Int**| Hero IDs on the player&#39;s team (array) | [optional]
 **againstHeroId** | **kotlin.Int**| Hero IDs against the player&#39;s team (array) | [optional]
 **significant** | **kotlin.Int**| Whether the match was significant for aggregation purposes | [optional]
 **having** | **kotlin.Int**| The minimum number of games played, for filtering hero stats | [optional]
 **sort** | **kotlin.String**| The field to return matches sorted by in descending order | [optional]

### Return type

[**Inline_response_200_9**](Inline_response_200_9.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="playersAccountIdGet"></a>
# **playersAccountIdGet**
> Inline_response_200_1 playersAccountIdGet(accountId)

GET /players/{account_id}

Player data

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*

val apiInstance = PlayersApi()
val accountId : kotlin.Int = 56 // kotlin.Int | Steam32 account ID
try {
    val result : Inline_response_200_1 = apiInstance.playersAccountIdGet(accountId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PlayersApi#playersAccountIdGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PlayersApi#playersAccountIdGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountId** | **kotlin.Int**| Steam32 account ID |

### Return type

[**Inline_response_200_1**](Inline_response_200_1.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="playersAccountIdHeroesGet"></a>
# **playersAccountIdHeroesGet**
> kotlin.Array&lt;Inline_response_200_5&gt; playersAccountIdHeroesGet(accountId, limit, offset, win, patch, gameMode, lobbyType, region, date, laneRole, heroId, isRadiant, includedAccountId, excludedAccountId, withHeroId, againstHeroId, significant, having, sort)

GET /players/{account_id}/heroes

Heroes played

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*

val apiInstance = PlayersApi()
val accountId : kotlin.Int = 56 // kotlin.Int | Steam32 account ID
val limit : kotlin.Int = 56 // kotlin.Int | Number of matches to limit to
val offset : kotlin.Int = 56 // kotlin.Int | Number of matches to offset start by
val win : kotlin.Int = 56 // kotlin.Int | Whether the player won
val patch : kotlin.Int = 56 // kotlin.Int | Patch ID
val gameMode : kotlin.Int = 56 // kotlin.Int | Game Mode ID
val lobbyType : kotlin.Int = 56 // kotlin.Int | Lobby type ID
val region : kotlin.Int = 56 // kotlin.Int | Region ID
val date : kotlin.Int = 56 // kotlin.Int | Days previous
val laneRole : kotlin.Int = 56 // kotlin.Int | Lane Role ID
val heroId : kotlin.Int = 56 // kotlin.Int | Hero ID
val isRadiant : kotlin.Int = 56 // kotlin.Int | Whether the player was radiant
val includedAccountId : kotlin.Int = 56 // kotlin.Int | Account IDs in the match (array)
val excludedAccountId : kotlin.Int = 56 // kotlin.Int | Account IDs not in the match (array)
val withHeroId : kotlin.Int = 56 // kotlin.Int | Hero IDs on the player's team (array)
val againstHeroId : kotlin.Int = 56 // kotlin.Int | Hero IDs against the player's team (array)
val significant : kotlin.Int = 56 // kotlin.Int | Whether the match was significant for aggregation purposes
val having : kotlin.Int = 56 // kotlin.Int | The minimum number of games played, for filtering hero stats
val sort : kotlin.String = sort_example // kotlin.String | The field to return matches sorted by in descending order
try {
    val result : kotlin.Array<Inline_response_200_5> = apiInstance.playersAccountIdHeroesGet(accountId, limit, offset, win, patch, gameMode, lobbyType, region, date, laneRole, heroId, isRadiant, includedAccountId, excludedAccountId, withHeroId, againstHeroId, significant, having, sort)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PlayersApi#playersAccountIdHeroesGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PlayersApi#playersAccountIdHeroesGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountId** | **kotlin.Int**| Steam32 account ID |
 **limit** | **kotlin.Int**| Number of matches to limit to | [optional]
 **offset** | **kotlin.Int**| Number of matches to offset start by | [optional]
 **win** | **kotlin.Int**| Whether the player won | [optional]
 **patch** | **kotlin.Int**| Patch ID | [optional]
 **gameMode** | **kotlin.Int**| Game Mode ID | [optional]
 **lobbyType** | **kotlin.Int**| Lobby type ID | [optional]
 **region** | **kotlin.Int**| Region ID | [optional]
 **date** | **kotlin.Int**| Days previous | [optional]
 **laneRole** | **kotlin.Int**| Lane Role ID | [optional]
 **heroId** | **kotlin.Int**| Hero ID | [optional]
 **isRadiant** | **kotlin.Int**| Whether the player was radiant | [optional]
 **includedAccountId** | **kotlin.Int**| Account IDs in the match (array) | [optional]
 **excludedAccountId** | **kotlin.Int**| Account IDs not in the match (array) | [optional]
 **withHeroId** | **kotlin.Int**| Hero IDs on the player&#39;s team (array) | [optional]
 **againstHeroId** | **kotlin.Int**| Hero IDs against the player&#39;s team (array) | [optional]
 **significant** | **kotlin.Int**| Whether the match was significant for aggregation purposes | [optional]
 **having** | **kotlin.Int**| The minimum number of games played, for filtering hero stats | [optional]
 **sort** | **kotlin.String**| The field to return matches sorted by in descending order | [optional]

### Return type

[**kotlin.Array&lt;Inline_response_200_5&gt;**](Inline_response_200_5.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="playersAccountIdHistogramsFieldGet"></a>
# **playersAccountIdHistogramsFieldGet**
> kotlin.Array&lt;kotlin.Any&gt; playersAccountIdHistogramsFieldGet(accountId, field, limit, offset, win, patch, gameMode, lobbyType, region, date, laneRole, heroId, isRadiant, includedAccountId, excludedAccountId, withHeroId, againstHeroId, significant, having, sort)

GET /players/{account_id}/histograms

Distribution of matches in a single stat

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*

val apiInstance = PlayersApi()
val accountId : kotlin.Int = 56 // kotlin.Int | Steam32 account ID
val field : kotlin.String = field_example // kotlin.String | Field to aggregate on
val limit : kotlin.Int = 56 // kotlin.Int | Number of matches to limit to
val offset : kotlin.Int = 56 // kotlin.Int | Number of matches to offset start by
val win : kotlin.Int = 56 // kotlin.Int | Whether the player won
val patch : kotlin.Int = 56 // kotlin.Int | Patch ID
val gameMode : kotlin.Int = 56 // kotlin.Int | Game Mode ID
val lobbyType : kotlin.Int = 56 // kotlin.Int | Lobby type ID
val region : kotlin.Int = 56 // kotlin.Int | Region ID
val date : kotlin.Int = 56 // kotlin.Int | Days previous
val laneRole : kotlin.Int = 56 // kotlin.Int | Lane Role ID
val heroId : kotlin.Int = 56 // kotlin.Int | Hero ID
val isRadiant : kotlin.Int = 56 // kotlin.Int | Whether the player was radiant
val includedAccountId : kotlin.Int = 56 // kotlin.Int | Account IDs in the match (array)
val excludedAccountId : kotlin.Int = 56 // kotlin.Int | Account IDs not in the match (array)
val withHeroId : kotlin.Int = 56 // kotlin.Int | Hero IDs on the player's team (array)
val againstHeroId : kotlin.Int = 56 // kotlin.Int | Hero IDs against the player's team (array)
val significant : kotlin.Int = 56 // kotlin.Int | Whether the match was significant for aggregation purposes
val having : kotlin.Int = 56 // kotlin.Int | The minimum number of games played, for filtering hero stats
val sort : kotlin.String = sort_example // kotlin.String | The field to return matches sorted by in descending order
try {
    val result : kotlin.Array<kotlin.Any> = apiInstance.playersAccountIdHistogramsFieldGet(accountId, field, limit, offset, win, patch, gameMode, lobbyType, region, date, laneRole, heroId, isRadiant, includedAccountId, excludedAccountId, withHeroId, againstHeroId, significant, having, sort)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PlayersApi#playersAccountIdHistogramsFieldGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PlayersApi#playersAccountIdHistogramsFieldGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountId** | **kotlin.Int**| Steam32 account ID |
 **field** | **kotlin.String**| Field to aggregate on |
 **limit** | **kotlin.Int**| Number of matches to limit to | [optional]
 **offset** | **kotlin.Int**| Number of matches to offset start by | [optional]
 **win** | **kotlin.Int**| Whether the player won | [optional]
 **patch** | **kotlin.Int**| Patch ID | [optional]
 **gameMode** | **kotlin.Int**| Game Mode ID | [optional]
 **lobbyType** | **kotlin.Int**| Lobby type ID | [optional]
 **region** | **kotlin.Int**| Region ID | [optional]
 **date** | **kotlin.Int**| Days previous | [optional]
 **laneRole** | **kotlin.Int**| Lane Role ID | [optional]
 **heroId** | **kotlin.Int**| Hero ID | [optional]
 **isRadiant** | **kotlin.Int**| Whether the player was radiant | [optional]
 **includedAccountId** | **kotlin.Int**| Account IDs in the match (array) | [optional]
 **excludedAccountId** | **kotlin.Int**| Account IDs not in the match (array) | [optional]
 **withHeroId** | **kotlin.Int**| Hero IDs on the player&#39;s team (array) | [optional]
 **againstHeroId** | **kotlin.Int**| Hero IDs against the player&#39;s team (array) | [optional]
 **significant** | **kotlin.Int**| Whether the match was significant for aggregation purposes | [optional]
 **having** | **kotlin.Int**| The minimum number of games played, for filtering hero stats | [optional]
 **sort** | **kotlin.String**| The field to return matches sorted by in descending order | [optional]

### Return type

[**kotlin.Array&lt;kotlin.Any&gt;**](kotlin.Any.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="playersAccountIdMatchesGet"></a>
# **playersAccountIdMatchesGet**
> kotlin.Array&lt;Inline_response_200_4&gt; playersAccountIdMatchesGet(accountId, limit, offset, win, patch, gameMode, lobbyType, region, date, laneRole, heroId, isRadiant, includedAccountId, excludedAccountId, withHeroId, againstHeroId, significant, having, sort, project)

GET /players/{account_id}/matches

Matches played

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*

val apiInstance = PlayersApi()
val accountId : kotlin.Int = 56 // kotlin.Int | Steam32 account ID
val limit : kotlin.Int = 56 // kotlin.Int | Number of matches to limit to
val offset : kotlin.Int = 56 // kotlin.Int | Number of matches to offset start by
val win : kotlin.Int = 56 // kotlin.Int | Whether the player won
val patch : kotlin.Int = 56 // kotlin.Int | Patch ID
val gameMode : kotlin.Int = 56 // kotlin.Int | Game Mode ID
val lobbyType : kotlin.Int = 56 // kotlin.Int | Lobby type ID
val region : kotlin.Int = 56 // kotlin.Int | Region ID
val date : kotlin.Int = 56 // kotlin.Int | Days previous
val laneRole : kotlin.Int = 56 // kotlin.Int | Lane Role ID
val heroId : kotlin.Int = 56 // kotlin.Int | Hero ID
val isRadiant : kotlin.Int = 56 // kotlin.Int | Whether the player was radiant
val includedAccountId : kotlin.Int = 56 // kotlin.Int | Account IDs in the match (array)
val excludedAccountId : kotlin.Int = 56 // kotlin.Int | Account IDs not in the match (array)
val withHeroId : kotlin.Int = 56 // kotlin.Int | Hero IDs on the player's team (array)
val againstHeroId : kotlin.Int = 56 // kotlin.Int | Hero IDs against the player's team (array)
val significant : kotlin.Int = 56 // kotlin.Int | Whether the match was significant for aggregation purposes
val having : kotlin.Int = 56 // kotlin.Int | The minimum number of games played, for filtering hero stats
val sort : kotlin.String = sort_example // kotlin.String | The field to return matches sorted by in descending order
val project : kotlin.String = project_example // kotlin.String | Fields to project (array)
try {
    val result : kotlin.Array<Inline_response_200_4> = apiInstance.playersAccountIdMatchesGet(accountId, limit, offset, win, patch, gameMode, lobbyType, region, date, laneRole, heroId, isRadiant, includedAccountId, excludedAccountId, withHeroId, againstHeroId, significant, having, sort, project)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PlayersApi#playersAccountIdMatchesGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PlayersApi#playersAccountIdMatchesGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountId** | **kotlin.Int**| Steam32 account ID |
 **limit** | **kotlin.Int**| Number of matches to limit to | [optional]
 **offset** | **kotlin.Int**| Number of matches to offset start by | [optional]
 **win** | **kotlin.Int**| Whether the player won | [optional]
 **patch** | **kotlin.Int**| Patch ID | [optional]
 **gameMode** | **kotlin.Int**| Game Mode ID | [optional]
 **lobbyType** | **kotlin.Int**| Lobby type ID | [optional]
 **region** | **kotlin.Int**| Region ID | [optional]
 **date** | **kotlin.Int**| Days previous | [optional]
 **laneRole** | **kotlin.Int**| Lane Role ID | [optional]
 **heroId** | **kotlin.Int**| Hero ID | [optional]
 **isRadiant** | **kotlin.Int**| Whether the player was radiant | [optional]
 **includedAccountId** | **kotlin.Int**| Account IDs in the match (array) | [optional]
 **excludedAccountId** | **kotlin.Int**| Account IDs not in the match (array) | [optional]
 **withHeroId** | **kotlin.Int**| Hero IDs on the player&#39;s team (array) | [optional]
 **againstHeroId** | **kotlin.Int**| Hero IDs against the player&#39;s team (array) | [optional]
 **significant** | **kotlin.Int**| Whether the match was significant for aggregation purposes | [optional]
 **having** | **kotlin.Int**| The minimum number of games played, for filtering hero stats | [optional]
 **sort** | **kotlin.String**| The field to return matches sorted by in descending order | [optional]
 **project** | **kotlin.String**| Fields to project (array) | [optional]

### Return type

[**kotlin.Array&lt;Inline_response_200_4&gt;**](Inline_response_200_4.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="playersAccountIdPeersGet"></a>
# **playersAccountIdPeersGet**
> kotlin.Array&lt;Inline_response_200_6&gt; playersAccountIdPeersGet(accountId, limit, offset, win, patch, gameMode, lobbyType, region, date, laneRole, heroId, isRadiant, includedAccountId, excludedAccountId, withHeroId, againstHeroId, significant, having, sort)

GET /players/{account_id}/peers

Players played with

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*

val apiInstance = PlayersApi()
val accountId : kotlin.Int = 56 // kotlin.Int | Steam32 account ID
val limit : kotlin.Int = 56 // kotlin.Int | Number of matches to limit to
val offset : kotlin.Int = 56 // kotlin.Int | Number of matches to offset start by
val win : kotlin.Int = 56 // kotlin.Int | Whether the player won
val patch : kotlin.Int = 56 // kotlin.Int | Patch ID
val gameMode : kotlin.Int = 56 // kotlin.Int | Game Mode ID
val lobbyType : kotlin.Int = 56 // kotlin.Int | Lobby type ID
val region : kotlin.Int = 56 // kotlin.Int | Region ID
val date : kotlin.Int = 56 // kotlin.Int | Days previous
val laneRole : kotlin.Int = 56 // kotlin.Int | Lane Role ID
val heroId : kotlin.Int = 56 // kotlin.Int | Hero ID
val isRadiant : kotlin.Int = 56 // kotlin.Int | Whether the player was radiant
val includedAccountId : kotlin.Int = 56 // kotlin.Int | Account IDs in the match (array)
val excludedAccountId : kotlin.Int = 56 // kotlin.Int | Account IDs not in the match (array)
val withHeroId : kotlin.Int = 56 // kotlin.Int | Hero IDs on the player's team (array)
val againstHeroId : kotlin.Int = 56 // kotlin.Int | Hero IDs against the player's team (array)
val significant : kotlin.Int = 56 // kotlin.Int | Whether the match was significant for aggregation purposes
val having : kotlin.Int = 56 // kotlin.Int | The minimum number of games played, for filtering hero stats
val sort : kotlin.String = sort_example // kotlin.String | The field to return matches sorted by in descending order
try {
    val result : kotlin.Array<Inline_response_200_6> = apiInstance.playersAccountIdPeersGet(accountId, limit, offset, win, patch, gameMode, lobbyType, region, date, laneRole, heroId, isRadiant, includedAccountId, excludedAccountId, withHeroId, againstHeroId, significant, having, sort)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PlayersApi#playersAccountIdPeersGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PlayersApi#playersAccountIdPeersGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountId** | **kotlin.Int**| Steam32 account ID |
 **limit** | **kotlin.Int**| Number of matches to limit to | [optional]
 **offset** | **kotlin.Int**| Number of matches to offset start by | [optional]
 **win** | **kotlin.Int**| Whether the player won | [optional]
 **patch** | **kotlin.Int**| Patch ID | [optional]
 **gameMode** | **kotlin.Int**| Game Mode ID | [optional]
 **lobbyType** | **kotlin.Int**| Lobby type ID | [optional]
 **region** | **kotlin.Int**| Region ID | [optional]
 **date** | **kotlin.Int**| Days previous | [optional]
 **laneRole** | **kotlin.Int**| Lane Role ID | [optional]
 **heroId** | **kotlin.Int**| Hero ID | [optional]
 **isRadiant** | **kotlin.Int**| Whether the player was radiant | [optional]
 **includedAccountId** | **kotlin.Int**| Account IDs in the match (array) | [optional]
 **excludedAccountId** | **kotlin.Int**| Account IDs not in the match (array) | [optional]
 **withHeroId** | **kotlin.Int**| Hero IDs on the player&#39;s team (array) | [optional]
 **againstHeroId** | **kotlin.Int**| Hero IDs against the player&#39;s team (array) | [optional]
 **significant** | **kotlin.Int**| Whether the match was significant for aggregation purposes | [optional]
 **having** | **kotlin.Int**| The minimum number of games played, for filtering hero stats | [optional]
 **sort** | **kotlin.String**| The field to return matches sorted by in descending order | [optional]

### Return type

[**kotlin.Array&lt;Inline_response_200_6&gt;**](Inline_response_200_6.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="playersAccountIdProsGet"></a>
# **playersAccountIdProsGet**
> kotlin.Array&lt;Inline_response_200_7&gt; playersAccountIdProsGet(accountId, limit, offset, win, patch, gameMode, lobbyType, region, date, laneRole, heroId, isRadiant, includedAccountId, excludedAccountId, withHeroId, againstHeroId, significant, having, sort)

GET /players/{account_id}/pros

Pro players played with

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*

val apiInstance = PlayersApi()
val accountId : kotlin.Int = 56 // kotlin.Int | Steam32 account ID
val limit : kotlin.Int = 56 // kotlin.Int | Number of matches to limit to
val offset : kotlin.Int = 56 // kotlin.Int | Number of matches to offset start by
val win : kotlin.Int = 56 // kotlin.Int | Whether the player won
val patch : kotlin.Int = 56 // kotlin.Int | Patch ID
val gameMode : kotlin.Int = 56 // kotlin.Int | Game Mode ID
val lobbyType : kotlin.Int = 56 // kotlin.Int | Lobby type ID
val region : kotlin.Int = 56 // kotlin.Int | Region ID
val date : kotlin.Int = 56 // kotlin.Int | Days previous
val laneRole : kotlin.Int = 56 // kotlin.Int | Lane Role ID
val heroId : kotlin.Int = 56 // kotlin.Int | Hero ID
val isRadiant : kotlin.Int = 56 // kotlin.Int | Whether the player was radiant
val includedAccountId : kotlin.Int = 56 // kotlin.Int | Account IDs in the match (array)
val excludedAccountId : kotlin.Int = 56 // kotlin.Int | Account IDs not in the match (array)
val withHeroId : kotlin.Int = 56 // kotlin.Int | Hero IDs on the player's team (array)
val againstHeroId : kotlin.Int = 56 // kotlin.Int | Hero IDs against the player's team (array)
val significant : kotlin.Int = 56 // kotlin.Int | Whether the match was significant for aggregation purposes
val having : kotlin.Int = 56 // kotlin.Int | The minimum number of games played, for filtering hero stats
val sort : kotlin.String = sort_example // kotlin.String | The field to return matches sorted by in descending order
try {
    val result : kotlin.Array<Inline_response_200_7> = apiInstance.playersAccountIdProsGet(accountId, limit, offset, win, patch, gameMode, lobbyType, region, date, laneRole, heroId, isRadiant, includedAccountId, excludedAccountId, withHeroId, againstHeroId, significant, having, sort)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PlayersApi#playersAccountIdProsGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PlayersApi#playersAccountIdProsGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountId** | **kotlin.Int**| Steam32 account ID |
 **limit** | **kotlin.Int**| Number of matches to limit to | [optional]
 **offset** | **kotlin.Int**| Number of matches to offset start by | [optional]
 **win** | **kotlin.Int**| Whether the player won | [optional]
 **patch** | **kotlin.Int**| Patch ID | [optional]
 **gameMode** | **kotlin.Int**| Game Mode ID | [optional]
 **lobbyType** | **kotlin.Int**| Lobby type ID | [optional]
 **region** | **kotlin.Int**| Region ID | [optional]
 **date** | **kotlin.Int**| Days previous | [optional]
 **laneRole** | **kotlin.Int**| Lane Role ID | [optional]
 **heroId** | **kotlin.Int**| Hero ID | [optional]
 **isRadiant** | **kotlin.Int**| Whether the player was radiant | [optional]
 **includedAccountId** | **kotlin.Int**| Account IDs in the match (array) | [optional]
 **excludedAccountId** | **kotlin.Int**| Account IDs not in the match (array) | [optional]
 **withHeroId** | **kotlin.Int**| Hero IDs on the player&#39;s team (array) | [optional]
 **againstHeroId** | **kotlin.Int**| Hero IDs against the player&#39;s team (array) | [optional]
 **significant** | **kotlin.Int**| Whether the match was significant for aggregation purposes | [optional]
 **having** | **kotlin.Int**| The minimum number of games played, for filtering hero stats | [optional]
 **sort** | **kotlin.String**| The field to return matches sorted by in descending order | [optional]

### Return type

[**kotlin.Array&lt;Inline_response_200_7&gt;**](Inline_response_200_7.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="playersAccountIdRankingsGet"></a>
# **playersAccountIdRankingsGet**
> kotlin.Array&lt;kotlin.Any&gt; playersAccountIdRankingsGet(accountId)

GET /players/{account_id}/rankings

Player hero rankings

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*

val apiInstance = PlayersApi()
val accountId : kotlin.Int = 56 // kotlin.Int | Steam32 account ID
try {
    val result : kotlin.Array<kotlin.Any> = apiInstance.playersAccountIdRankingsGet(accountId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PlayersApi#playersAccountIdRankingsGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PlayersApi#playersAccountIdRankingsGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountId** | **kotlin.Int**| Steam32 account ID |

### Return type

[**kotlin.Array&lt;kotlin.Any&gt;**](kotlin.Any.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="playersAccountIdRatingsGet"></a>
# **playersAccountIdRatingsGet**
> kotlin.Array&lt;Inline_response_200_12&gt; playersAccountIdRatingsGet(accountId)

GET /players/{account_id}/ratings

Player rating history

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*

val apiInstance = PlayersApi()
val accountId : kotlin.Int = 56 // kotlin.Int | Steam32 account ID
try {
    val result : kotlin.Array<Inline_response_200_12> = apiInstance.playersAccountIdRatingsGet(accountId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PlayersApi#playersAccountIdRatingsGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PlayersApi#playersAccountIdRatingsGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountId** | **kotlin.Int**| Steam32 account ID |

### Return type

[**kotlin.Array&lt;Inline_response_200_12&gt;**](Inline_response_200_12.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="playersAccountIdRecentMatchesGet"></a>
# **playersAccountIdRecentMatchesGet**
> kotlin.Array&lt;Inline_response_200_3&gt; playersAccountIdRecentMatchesGet(accountId)

GET /players/{account_id}/recentMatches

Recent matches played

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*

val apiInstance = PlayersApi()
val accountId : kotlin.Int = 56 // kotlin.Int | Steam32 account ID
try {
    val result : kotlin.Array<Inline_response_200_3> = apiInstance.playersAccountIdRecentMatchesGet(accountId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PlayersApi#playersAccountIdRecentMatchesGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PlayersApi#playersAccountIdRecentMatchesGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountId** | **kotlin.Int**| Steam32 account ID |

### Return type

[**kotlin.Array&lt;Inline_response_200_3&gt;**](Inline_response_200_3.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="playersAccountIdRefreshPost"></a>
# **playersAccountIdRefreshPost**
> kotlin.Any playersAccountIdRefreshPost(accountId)

POST /players/{account_id}/refresh

Refresh player match history

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*

val apiInstance = PlayersApi()
val accountId : kotlin.Int = 56 // kotlin.Int | Steam32 account ID
try {
    val result : kotlin.Any = apiInstance.playersAccountIdRefreshPost(accountId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PlayersApi#playersAccountIdRefreshPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PlayersApi#playersAccountIdRefreshPost")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountId** | **kotlin.Int**| Steam32 account ID |

### Return type

[**kotlin.Any**](kotlin.Any.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="playersAccountIdTotalsGet"></a>
# **playersAccountIdTotalsGet**
> kotlin.Array&lt;Inline_response_200_8&gt; playersAccountIdTotalsGet(accountId, limit, offset, win, patch, gameMode, lobbyType, region, date, laneRole, heroId, isRadiant, includedAccountId, excludedAccountId, withHeroId, againstHeroId, significant, having, sort)

GET /players/{account_id}/totals

Totals in stats

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*

val apiInstance = PlayersApi()
val accountId : kotlin.Int = 56 // kotlin.Int | Steam32 account ID
val limit : kotlin.Int = 56 // kotlin.Int | Number of matches to limit to
val offset : kotlin.Int = 56 // kotlin.Int | Number of matches to offset start by
val win : kotlin.Int = 56 // kotlin.Int | Whether the player won
val patch : kotlin.Int = 56 // kotlin.Int | Patch ID
val gameMode : kotlin.Int = 56 // kotlin.Int | Game Mode ID
val lobbyType : kotlin.Int = 56 // kotlin.Int | Lobby type ID
val region : kotlin.Int = 56 // kotlin.Int | Region ID
val date : kotlin.Int = 56 // kotlin.Int | Days previous
val laneRole : kotlin.Int = 56 // kotlin.Int | Lane Role ID
val heroId : kotlin.Int = 56 // kotlin.Int | Hero ID
val isRadiant : kotlin.Int = 56 // kotlin.Int | Whether the player was radiant
val includedAccountId : kotlin.Int = 56 // kotlin.Int | Account IDs in the match (array)
val excludedAccountId : kotlin.Int = 56 // kotlin.Int | Account IDs not in the match (array)
val withHeroId : kotlin.Int = 56 // kotlin.Int | Hero IDs on the player's team (array)
val againstHeroId : kotlin.Int = 56 // kotlin.Int | Hero IDs against the player's team (array)
val significant : kotlin.Int = 56 // kotlin.Int | Whether the match was significant for aggregation purposes
val having : kotlin.Int = 56 // kotlin.Int | The minimum number of games played, for filtering hero stats
val sort : kotlin.String = sort_example // kotlin.String | The field to return matches sorted by in descending order
try {
    val result : kotlin.Array<Inline_response_200_8> = apiInstance.playersAccountIdTotalsGet(accountId, limit, offset, win, patch, gameMode, lobbyType, region, date, laneRole, heroId, isRadiant, includedAccountId, excludedAccountId, withHeroId, againstHeroId, significant, having, sort)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PlayersApi#playersAccountIdTotalsGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PlayersApi#playersAccountIdTotalsGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountId** | **kotlin.Int**| Steam32 account ID |
 **limit** | **kotlin.Int**| Number of matches to limit to | [optional]
 **offset** | **kotlin.Int**| Number of matches to offset start by | [optional]
 **win** | **kotlin.Int**| Whether the player won | [optional]
 **patch** | **kotlin.Int**| Patch ID | [optional]
 **gameMode** | **kotlin.Int**| Game Mode ID | [optional]
 **lobbyType** | **kotlin.Int**| Lobby type ID | [optional]
 **region** | **kotlin.Int**| Region ID | [optional]
 **date** | **kotlin.Int**| Days previous | [optional]
 **laneRole** | **kotlin.Int**| Lane Role ID | [optional]
 **heroId** | **kotlin.Int**| Hero ID | [optional]
 **isRadiant** | **kotlin.Int**| Whether the player was radiant | [optional]
 **includedAccountId** | **kotlin.Int**| Account IDs in the match (array) | [optional]
 **excludedAccountId** | **kotlin.Int**| Account IDs not in the match (array) | [optional]
 **withHeroId** | **kotlin.Int**| Hero IDs on the player&#39;s team (array) | [optional]
 **againstHeroId** | **kotlin.Int**| Hero IDs against the player&#39;s team (array) | [optional]
 **significant** | **kotlin.Int**| Whether the match was significant for aggregation purposes | [optional]
 **having** | **kotlin.Int**| The minimum number of games played, for filtering hero stats | [optional]
 **sort** | **kotlin.String**| The field to return matches sorted by in descending order | [optional]

### Return type

[**kotlin.Array&lt;Inline_response_200_8&gt;**](Inline_response_200_8.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="playersAccountIdWardmapGet"></a>
# **playersAccountIdWardmapGet**
> Inline_response_200_10 playersAccountIdWardmapGet(accountId, limit, offset, win, patch, gameMode, lobbyType, region, date, laneRole, heroId, isRadiant, includedAccountId, excludedAccountId, withHeroId, againstHeroId, significant, having, sort)

GET /players/{account_id}/wardmap

Wards placed in matches played

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*

val apiInstance = PlayersApi()
val accountId : kotlin.Int = 56 // kotlin.Int | Steam32 account ID
val limit : kotlin.Int = 56 // kotlin.Int | Number of matches to limit to
val offset : kotlin.Int = 56 // kotlin.Int | Number of matches to offset start by
val win : kotlin.Int = 56 // kotlin.Int | Whether the player won
val patch : kotlin.Int = 56 // kotlin.Int | Patch ID
val gameMode : kotlin.Int = 56 // kotlin.Int | Game Mode ID
val lobbyType : kotlin.Int = 56 // kotlin.Int | Lobby type ID
val region : kotlin.Int = 56 // kotlin.Int | Region ID
val date : kotlin.Int = 56 // kotlin.Int | Days previous
val laneRole : kotlin.Int = 56 // kotlin.Int | Lane Role ID
val heroId : kotlin.Int = 56 // kotlin.Int | Hero ID
val isRadiant : kotlin.Int = 56 // kotlin.Int | Whether the player was radiant
val includedAccountId : kotlin.Int = 56 // kotlin.Int | Account IDs in the match (array)
val excludedAccountId : kotlin.Int = 56 // kotlin.Int | Account IDs not in the match (array)
val withHeroId : kotlin.Int = 56 // kotlin.Int | Hero IDs on the player's team (array)
val againstHeroId : kotlin.Int = 56 // kotlin.Int | Hero IDs against the player's team (array)
val significant : kotlin.Int = 56 // kotlin.Int | Whether the match was significant for aggregation purposes
val having : kotlin.Int = 56 // kotlin.Int | The minimum number of games played, for filtering hero stats
val sort : kotlin.String = sort_example // kotlin.String | The field to return matches sorted by in descending order
try {
    val result : Inline_response_200_10 = apiInstance.playersAccountIdWardmapGet(accountId, limit, offset, win, patch, gameMode, lobbyType, region, date, laneRole, heroId, isRadiant, includedAccountId, excludedAccountId, withHeroId, againstHeroId, significant, having, sort)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PlayersApi#playersAccountIdWardmapGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PlayersApi#playersAccountIdWardmapGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountId** | **kotlin.Int**| Steam32 account ID |
 **limit** | **kotlin.Int**| Number of matches to limit to | [optional]
 **offset** | **kotlin.Int**| Number of matches to offset start by | [optional]
 **win** | **kotlin.Int**| Whether the player won | [optional]
 **patch** | **kotlin.Int**| Patch ID | [optional]
 **gameMode** | **kotlin.Int**| Game Mode ID | [optional]
 **lobbyType** | **kotlin.Int**| Lobby type ID | [optional]
 **region** | **kotlin.Int**| Region ID | [optional]
 **date** | **kotlin.Int**| Days previous | [optional]
 **laneRole** | **kotlin.Int**| Lane Role ID | [optional]
 **heroId** | **kotlin.Int**| Hero ID | [optional]
 **isRadiant** | **kotlin.Int**| Whether the player was radiant | [optional]
 **includedAccountId** | **kotlin.Int**| Account IDs in the match (array) | [optional]
 **excludedAccountId** | **kotlin.Int**| Account IDs not in the match (array) | [optional]
 **withHeroId** | **kotlin.Int**| Hero IDs on the player&#39;s team (array) | [optional]
 **againstHeroId** | **kotlin.Int**| Hero IDs against the player&#39;s team (array) | [optional]
 **significant** | **kotlin.Int**| Whether the match was significant for aggregation purposes | [optional]
 **having** | **kotlin.Int**| The minimum number of games played, for filtering hero stats | [optional]
 **sort** | **kotlin.String**| The field to return matches sorted by in descending order | [optional]

### Return type

[**Inline_response_200_10**](Inline_response_200_10.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="playersAccountIdWlGet"></a>
# **playersAccountIdWlGet**
> Inline_response_200_2 playersAccountIdWlGet(accountId, limit, offset, win, patch, gameMode, lobbyType, region, date, laneRole, heroId, isRadiant, includedAccountId, excludedAccountId, withHeroId, againstHeroId, significant, having, sort)

GET /players/{account_id}/wl

Win/Loss count

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*

val apiInstance = PlayersApi()
val accountId : kotlin.Int = 56 // kotlin.Int | Steam32 account ID
val limit : kotlin.Int = 56 // kotlin.Int | Number of matches to limit to
val offset : kotlin.Int = 56 // kotlin.Int | Number of matches to offset start by
val win : kotlin.Int = 56 // kotlin.Int | Whether the player won
val patch : kotlin.Int = 56 // kotlin.Int | Patch ID
val gameMode : kotlin.Int = 56 // kotlin.Int | Game Mode ID
val lobbyType : kotlin.Int = 56 // kotlin.Int | Lobby type ID
val region : kotlin.Int = 56 // kotlin.Int | Region ID
val date : kotlin.Int = 56 // kotlin.Int | Days previous
val laneRole : kotlin.Int = 56 // kotlin.Int | Lane Role ID
val heroId : kotlin.Int = 56 // kotlin.Int | Hero ID
val isRadiant : kotlin.Int = 56 // kotlin.Int | Whether the player was radiant
val includedAccountId : kotlin.Int = 56 // kotlin.Int | Account IDs in the match (array)
val excludedAccountId : kotlin.Int = 56 // kotlin.Int | Account IDs not in the match (array)
val withHeroId : kotlin.Int = 56 // kotlin.Int | Hero IDs on the player's team (array)
val againstHeroId : kotlin.Int = 56 // kotlin.Int | Hero IDs against the player's team (array)
val significant : kotlin.Int = 56 // kotlin.Int | Whether the match was significant for aggregation purposes
val having : kotlin.Int = 56 // kotlin.Int | The minimum number of games played, for filtering hero stats
val sort : kotlin.String = sort_example // kotlin.String | The field to return matches sorted by in descending order
try {
    val result : Inline_response_200_2 = apiInstance.playersAccountIdWlGet(accountId, limit, offset, win, patch, gameMode, lobbyType, region, date, laneRole, heroId, isRadiant, includedAccountId, excludedAccountId, withHeroId, againstHeroId, significant, having, sort)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PlayersApi#playersAccountIdWlGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PlayersApi#playersAccountIdWlGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountId** | **kotlin.Int**| Steam32 account ID |
 **limit** | **kotlin.Int**| Number of matches to limit to | [optional]
 **offset** | **kotlin.Int**| Number of matches to offset start by | [optional]
 **win** | **kotlin.Int**| Whether the player won | [optional]
 **patch** | **kotlin.Int**| Patch ID | [optional]
 **gameMode** | **kotlin.Int**| Game Mode ID | [optional]
 **lobbyType** | **kotlin.Int**| Lobby type ID | [optional]
 **region** | **kotlin.Int**| Region ID | [optional]
 **date** | **kotlin.Int**| Days previous | [optional]
 **laneRole** | **kotlin.Int**| Lane Role ID | [optional]
 **heroId** | **kotlin.Int**| Hero ID | [optional]
 **isRadiant** | **kotlin.Int**| Whether the player was radiant | [optional]
 **includedAccountId** | **kotlin.Int**| Account IDs in the match (array) | [optional]
 **excludedAccountId** | **kotlin.Int**| Account IDs not in the match (array) | [optional]
 **withHeroId** | **kotlin.Int**| Hero IDs on the player&#39;s team (array) | [optional]
 **againstHeroId** | **kotlin.Int**| Hero IDs against the player&#39;s team (array) | [optional]
 **significant** | **kotlin.Int**| Whether the match was significant for aggregation purposes | [optional]
 **having** | **kotlin.Int**| The minimum number of games played, for filtering hero stats | [optional]
 **sort** | **kotlin.String**| The field to return matches sorted by in descending order | [optional]

### Return type

[**Inline_response_200_2**](Inline_response_200_2.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="playersAccountIdWordcloudGet"></a>
# **playersAccountIdWordcloudGet**
> Inline_response_200_11 playersAccountIdWordcloudGet(accountId, limit, offset, win, patch, gameMode, lobbyType, region, date, laneRole, heroId, isRadiant, includedAccountId, excludedAccountId, withHeroId, againstHeroId, significant, having, sort)

GET /players/{account_id}/wordcloud

Words said/read in matches played

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*

val apiInstance = PlayersApi()
val accountId : kotlin.Int = 56 // kotlin.Int | Steam32 account ID
val limit : kotlin.Int = 56 // kotlin.Int | Number of matches to limit to
val offset : kotlin.Int = 56 // kotlin.Int | Number of matches to offset start by
val win : kotlin.Int = 56 // kotlin.Int | Whether the player won
val patch : kotlin.Int = 56 // kotlin.Int | Patch ID
val gameMode : kotlin.Int = 56 // kotlin.Int | Game Mode ID
val lobbyType : kotlin.Int = 56 // kotlin.Int | Lobby type ID
val region : kotlin.Int = 56 // kotlin.Int | Region ID
val date : kotlin.Int = 56 // kotlin.Int | Days previous
val laneRole : kotlin.Int = 56 // kotlin.Int | Lane Role ID
val heroId : kotlin.Int = 56 // kotlin.Int | Hero ID
val isRadiant : kotlin.Int = 56 // kotlin.Int | Whether the player was radiant
val includedAccountId : kotlin.Int = 56 // kotlin.Int | Account IDs in the match (array)
val excludedAccountId : kotlin.Int = 56 // kotlin.Int | Account IDs not in the match (array)
val withHeroId : kotlin.Int = 56 // kotlin.Int | Hero IDs on the player's team (array)
val againstHeroId : kotlin.Int = 56 // kotlin.Int | Hero IDs against the player's team (array)
val significant : kotlin.Int = 56 // kotlin.Int | Whether the match was significant for aggregation purposes
val having : kotlin.Int = 56 // kotlin.Int | The minimum number of games played, for filtering hero stats
val sort : kotlin.String = sort_example // kotlin.String | The field to return matches sorted by in descending order
try {
    val result : Inline_response_200_11 = apiInstance.playersAccountIdWordcloudGet(accountId, limit, offset, win, patch, gameMode, lobbyType, region, date, laneRole, heroId, isRadiant, includedAccountId, excludedAccountId, withHeroId, againstHeroId, significant, having, sort)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PlayersApi#playersAccountIdWordcloudGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PlayersApi#playersAccountIdWordcloudGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountId** | **kotlin.Int**| Steam32 account ID |
 **limit** | **kotlin.Int**| Number of matches to limit to | [optional]
 **offset** | **kotlin.Int**| Number of matches to offset start by | [optional]
 **win** | **kotlin.Int**| Whether the player won | [optional]
 **patch** | **kotlin.Int**| Patch ID | [optional]
 **gameMode** | **kotlin.Int**| Game Mode ID | [optional]
 **lobbyType** | **kotlin.Int**| Lobby type ID | [optional]
 **region** | **kotlin.Int**| Region ID | [optional]
 **date** | **kotlin.Int**| Days previous | [optional]
 **laneRole** | **kotlin.Int**| Lane Role ID | [optional]
 **heroId** | **kotlin.Int**| Hero ID | [optional]
 **isRadiant** | **kotlin.Int**| Whether the player was radiant | [optional]
 **includedAccountId** | **kotlin.Int**| Account IDs in the match (array) | [optional]
 **excludedAccountId** | **kotlin.Int**| Account IDs not in the match (array) | [optional]
 **withHeroId** | **kotlin.Int**| Hero IDs on the player&#39;s team (array) | [optional]
 **againstHeroId** | **kotlin.Int**| Hero IDs against the player&#39;s team (array) | [optional]
 **significant** | **kotlin.Int**| Whether the match was significant for aggregation purposes | [optional]
 **having** | **kotlin.Int**| The minimum number of games played, for filtering hero stats | [optional]
 **sort** | **kotlin.String**| The field to return matches sorted by in descending order | [optional]

### Return type

[**Inline_response_200_11**](Inline_response_200_11.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

