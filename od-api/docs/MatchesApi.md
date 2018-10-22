# MatchesApi

All URIs are relative to *https://api.opendota.com/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**matchesMatchIdGet**](MatchesApi.md#matchesMatchIdGet) | **GET** /matches/{match_id} | GET /matches/{match_id}


<a name="matchesMatchIdGet"></a>
# **matchesMatchIdGet**
> Inline_response_200 matchesMatchIdGet(matchId)

GET /matches/{match_id}

Match data

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*

val apiInstance = MatchesApi()
val matchId : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : Inline_response_200 = apiInstance.matchesMatchIdGet(matchId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling MatchesApi#matchesMatchIdGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling MatchesApi#matchesMatchIdGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **matchId** | **kotlin.Int**|  |

### Return type

[**Inline_response_200**](Inline_response_200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

