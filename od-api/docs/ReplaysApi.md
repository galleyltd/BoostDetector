# ReplaysApi

All URIs are relative to *https://api.opendota.com/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**replaysGet**](ReplaysApi.md#replaysGet) | **GET** /replays | GET /replays


<a name="replaysGet"></a>
# **replaysGet**
> kotlin.Array&lt;Inline_response_200_29&gt; replaysGet(matchId)

GET /replays

Get data to construct a replay URL with

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*

val apiInstance = ReplaysApi()
val matchId : kotlin.Int = 56 // kotlin.Int | Match IDs (array)
try {
    val result : kotlin.Array<Inline_response_200_29> = apiInstance.replaysGet(matchId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ReplaysApi#replaysGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ReplaysApi#replaysGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **matchId** | **kotlin.Int**| Match IDs (array) |

### Return type

[**kotlin.Array&lt;Inline_response_200_29&gt;**](Inline_response_200_29.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

