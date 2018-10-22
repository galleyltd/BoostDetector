# ProPlayersApi

All URIs are relative to *https://api.opendota.com/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**proPlayersGet**](ProPlayersApi.md#proPlayersGet) | **GET** /proPlayers | GET /proPlayers


<a name="proPlayersGet"></a>
# **proPlayersGet**
> kotlin.Array&lt;Inline_response_200_13&gt; proPlayersGet()

GET /proPlayers

Get list of pro players

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*

val apiInstance = ProPlayersApi()
try {
    val result : kotlin.Array<Inline_response_200_13> = apiInstance.proPlayersGet()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ProPlayersApi#proPlayersGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProPlayersApi#proPlayersGet")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**kotlin.Array&lt;Inline_response_200_13&gt;**](Inline_response_200_13.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

