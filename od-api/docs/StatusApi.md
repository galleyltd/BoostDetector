# StatusApi

All URIs are relative to *https://api.opendota.com/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**adminApiMetricsGet**](StatusApi.md#adminApiMetricsGet) | **GET** /admin/apiMetrics | GET /admin/apiMetrics
[**statusGet**](StatusApi.md#statusGet) | **GET** /status | GET /status


<a name="adminApiMetricsGet"></a>
# **adminApiMetricsGet**
> kotlin.Any adminApiMetricsGet()

GET /admin/apiMetrics

Get API request metrics

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*

val apiInstance = StatusApi()
try {
    val result : kotlin.Any = apiInstance.adminApiMetricsGet()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling StatusApi#adminApiMetricsGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling StatusApi#adminApiMetricsGet")
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

<a name="statusGet"></a>
# **statusGet**
> kotlin.Any statusGet()

GET /status

Get current service statistics

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*

val apiInstance = StatusApi()
try {
    val result : kotlin.Any = apiInstance.statusGet()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling StatusApi#statusGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling StatusApi#statusGet")
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

