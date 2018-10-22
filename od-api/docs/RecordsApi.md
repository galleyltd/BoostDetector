# RecordsApi

All URIs are relative to *https://api.opendota.com/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**recordsFieldGet**](RecordsApi.md#recordsFieldGet) | **GET** /records/{field} | GET /records/{field}


<a name="recordsFieldGet"></a>
# **recordsFieldGet**
> kotlin.Array&lt;Inline_response_200_30&gt; recordsFieldGet(field)

GET /records/{field}

Get top performances in a stat

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*

val apiInstance = RecordsApi()
val field : kotlin.String = field_example // kotlin.String | Field name to query
try {
    val result : kotlin.Array<Inline_response_200_30> = apiInstance.recordsFieldGet(field)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling RecordsApi#recordsFieldGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling RecordsApi#recordsFieldGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **field** | **kotlin.String**| Field name to query |

### Return type

[**kotlin.Array&lt;Inline_response_200_30&gt;**](Inline_response_200_30.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

