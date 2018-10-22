# RankingsApi

All URIs are relative to *https://api.opendota.com/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**rankingsGet**](RankingsApi.md#rankingsGet) | **GET** /rankings | GET /rankings


<a name="rankingsGet"></a>
# **rankingsGet**
> Inline_response_200_19 rankingsGet(heroId)

GET /rankings

Top players by hero

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*

val apiInstance = RankingsApi()
val heroId : kotlin.String = heroId_example // kotlin.String | Hero ID
try {
    val result : Inline_response_200_19 = apiInstance.rankingsGet(heroId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling RankingsApi#rankingsGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling RankingsApi#rankingsGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **heroId** | **kotlin.String**| Hero ID |

### Return type

[**Inline_response_200_19**](Inline_response_200_19.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

