# SearchApi

All URIs are relative to *https://api.opendota.com/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**searchGet**](SearchApi.md#searchGet) | **GET** /search | GET /search


<a name="searchGet"></a>
# **searchGet**
> kotlin.Array&lt;Inline_response_200_18&gt; searchGet(q)

GET /search

Search players by personaname.

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*

val apiInstance = SearchApi()
val q : kotlin.String = q_example // kotlin.String | Search string
try {
    val result : kotlin.Array<Inline_response_200_18> = apiInstance.searchGet(q)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SearchApi#searchGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SearchApi#searchGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **q** | **kotlin.String**| Search string |

### Return type

[**kotlin.Array&lt;Inline_response_200_18&gt;**](Inline_response_200_18.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

