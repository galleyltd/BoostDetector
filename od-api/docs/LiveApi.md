# LiveApi

All URIs are relative to *https://api.opendota.com/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**liveGet**](LiveApi.md#liveGet) | **GET** /live | GET /live


<a name="liveGet"></a>
# **liveGet**
> kotlin.Array&lt;kotlin.Any&gt; liveGet()

GET /live

Get top currently ongoing live games

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*

val apiInstance = LiveApi()
try {
    val result : kotlin.Array<kotlin.Any> = apiInstance.liveGet()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling LiveApi#liveGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling LiveApi#liveGet")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**kotlin.Array&lt;kotlin.Any&gt;**](kotlin.Any.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

