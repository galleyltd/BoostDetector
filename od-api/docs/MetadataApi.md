# MetadataApi

All URIs are relative to *https://api.opendota.com/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**metadataGet**](MetadataApi.md#metadataGet) | **GET** /metadata | GET /metadata


<a name="metadataGet"></a>
# **metadataGet**
> Inline_response_200_16 metadataGet()

GET /metadata

Site metadata

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*

val apiInstance = MetadataApi()
try {
    val result : Inline_response_200_16 = apiInstance.metadataGet()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling MetadataApi#metadataGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling MetadataApi#metadataGet")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**Inline_response_200_16**](Inline_response_200_16.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

