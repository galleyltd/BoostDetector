# ProMatchesApi

All URIs are relative to *https://api.opendota.com/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**proMatchesGet**](ProMatchesApi.md#proMatchesGet) | **GET** /proMatches | GET /proMatches


<a name="proMatchesGet"></a>
# **proMatchesGet**
> kotlin.Array&lt;Inline_response_200_14&gt; proMatchesGet(lessThanMatchId)

GET /proMatches

Get list of pro matches

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*

val apiInstance = ProMatchesApi()
val lessThanMatchId : kotlin.Int = 56 // kotlin.Int | Get matches with a match ID lower than this value
try {
    val result : kotlin.Array<Inline_response_200_14> = apiInstance.proMatchesGet(lessThanMatchId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ProMatchesApi#proMatchesGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProMatchesApi#proMatchesGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **lessThanMatchId** | **kotlin.Int**| Get matches with a match ID lower than this value | [optional]

### Return type

[**kotlin.Array&lt;Inline_response_200_14&gt;**](Inline_response_200_14.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

