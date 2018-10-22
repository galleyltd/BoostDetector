# DistributionsApi

All URIs are relative to *https://api.opendota.com/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**distributionsGet**](DistributionsApi.md#distributionsGet) | **GET** /distributions | GET /distributions


<a name="distributionsGet"></a>
# **distributionsGet**
> Inline_response_200_17 distributionsGet()

GET /distributions

Distributions of MMR data by bracket and country

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*

val apiInstance = DistributionsApi()
try {
    val result : Inline_response_200_17 = apiInstance.distributionsGet()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DistributionsApi#distributionsGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DistributionsApi#distributionsGet")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**Inline_response_200_17**](Inline_response_200_17.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

