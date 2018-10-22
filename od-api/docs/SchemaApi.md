# SchemaApi

All URIs are relative to *https://api.opendota.com/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**schemaGet**](SchemaApi.md#schemaGet) | **GET** /schema | GET /schema


<a name="schemaGet"></a>
# **schemaGet**
> kotlin.Array&lt;Inline_response_200_34&gt; schemaGet()

GET /schema

Get database schema

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*

val apiInstance = SchemaApi()
try {
    val result : kotlin.Array<Inline_response_200_34> = apiInstance.schemaGet()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SchemaApi#schemaGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SchemaApi#schemaGet")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**kotlin.Array&lt;Inline_response_200_34&gt;**](Inline_response_200_34.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

