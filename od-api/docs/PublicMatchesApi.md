# PublicMatchesApi

All URIs are relative to *https://api.opendota.com/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**publicMatchesGet**](PublicMatchesApi.md#publicMatchesGet) | **GET** /publicMatches | GET /publicMatches


<a name="publicMatchesGet"></a>
# **publicMatchesGet**
> kotlin.Array&lt;Inline_response_200_15&gt; publicMatchesGet(mmrAscending, mmrDescending, lessThanMatchId)

GET /publicMatches

Get list of randomly sampled public matches

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*

val apiInstance = PublicMatchesApi()
val mmrAscending : kotlin.Int = 56 // kotlin.Int | Order by MMR ascending
val mmrDescending : kotlin.Int = 56 // kotlin.Int | Order by MMR descending
val lessThanMatchId : kotlin.Int = 56 // kotlin.Int | Get matches with a match ID lower than this value
try {
    val result : kotlin.Array<Inline_response_200_15> = apiInstance.publicMatchesGet(mmrAscending, mmrDescending, lessThanMatchId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PublicMatchesApi#publicMatchesGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PublicMatchesApi#publicMatchesGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **mmrAscending** | **kotlin.Int**| Order by MMR ascending | [optional]
 **mmrDescending** | **kotlin.Int**| Order by MMR descending | [optional]
 **lessThanMatchId** | **kotlin.Int**| Get matches with a match ID lower than this value | [optional]

### Return type

[**kotlin.Array&lt;Inline_response_200_15&gt;**](Inline_response_200_15.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

