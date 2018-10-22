# BenchmarksApi

All URIs are relative to *https://api.opendota.com/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**benchmarksGet**](BenchmarksApi.md#benchmarksGet) | **GET** /benchmarks | GET /benchmarks


<a name="benchmarksGet"></a>
# **benchmarksGet**
> Inline_response_200_20 benchmarksGet(heroId)

GET /benchmarks

Benchmarks of average stat values for a hero

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*

val apiInstance = BenchmarksApi()
val heroId : kotlin.String = heroId_example // kotlin.String | Hero ID
try {
    val result : Inline_response_200_20 = apiInstance.benchmarksGet(heroId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BenchmarksApi#benchmarksGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BenchmarksApi#benchmarksGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **heroId** | **kotlin.String**| Hero ID |

### Return type

[**Inline_response_200_20**](Inline_response_200_20.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

