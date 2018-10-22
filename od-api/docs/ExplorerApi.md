# ExplorerApi

All URIs are relative to *https://api.opendota.com/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**explorerGet**](ExplorerApi.md#explorerGet) | **GET** /explorer | GET /explorer


<a name="explorerGet"></a>
# **explorerGet**
> kotlin.Any explorerGet(sql)

GET /explorer

Submit arbitrary SQL queries to the database

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*

val apiInstance = ExplorerApi()
val sql : kotlin.String = sql_example // kotlin.String | The PostgreSQL query as percent-encoded string.
try {
    val result : kotlin.Any = apiInstance.explorerGet(sql)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ExplorerApi#explorerGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ExplorerApi#explorerGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sql** | **kotlin.String**| The PostgreSQL query as percent-encoded string. | [optional]

### Return type

[**kotlin.Any**](kotlin.Any.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

