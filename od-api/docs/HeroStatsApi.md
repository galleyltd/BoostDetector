# HeroStatsApi

All URIs are relative to *https://api.opendota.com/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**heroStatsGet**](HeroStatsApi.md#heroStatsGet) | **GET** /heroStats | GET /heroStats


<a name="heroStatsGet"></a>
# **heroStatsGet**
> kotlin.Array&lt;Inline_response_200_22&gt; heroStatsGet()

GET /heroStats

Get stats about hero performance in recent matches

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*

val apiInstance = HeroStatsApi()
try {
    val result : kotlin.Array<Inline_response_200_22> = apiInstance.heroStatsGet()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling HeroStatsApi#heroStatsGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling HeroStatsApi#heroStatsGet")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**kotlin.Array&lt;Inline_response_200_22&gt;**](Inline_response_200_22.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

