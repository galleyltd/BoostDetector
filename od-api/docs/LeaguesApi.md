# LeaguesApi

All URIs are relative to *https://api.opendota.com/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**leaguesGet**](LeaguesApi.md#leaguesGet) | **GET** /leagues | GET /leagues


<a name="leaguesGet"></a>
# **leaguesGet**
> kotlin.Array&lt;Inline_response_200_25&gt; leaguesGet()

GET /leagues

Get league data

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*

val apiInstance = LeaguesApi()
try {
    val result : kotlin.Array<Inline_response_200_25> = apiInstance.leaguesGet()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling LeaguesApi#leaguesGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling LeaguesApi#leaguesGet")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**kotlin.Array&lt;Inline_response_200_25&gt;**](Inline_response_200_25.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

