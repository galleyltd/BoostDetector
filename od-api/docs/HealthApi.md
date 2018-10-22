# HealthApi

All URIs are relative to *https://api.opendota.com/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**healthGet**](HealthApi.md#healthGet) | **GET** /health | GET /health


<a name="healthGet"></a>
# **healthGet**
> kotlin.Any healthGet()

GET /health

Get service health data

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*

val apiInstance = HealthApi()
try {
    val result : kotlin.Any = apiInstance.healthGet()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling HealthApi#healthGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling HealthApi#healthGet")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**kotlin.Any**](kotlin.Any.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

