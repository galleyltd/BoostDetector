# RequestApi

All URIs are relative to *https://api.opendota.com/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**requestJobIdGet**](RequestApi.md#requestJobIdGet) | **GET** /request/{jobId} | GET /request/{jobId}
[**requestMatchIdPost**](RequestApi.md#requestMatchIdPost) | **POST** /request/{match_id} | POST /request/{match_id}


<a name="requestJobIdGet"></a>
# **requestJobIdGet**
> kotlin.Any requestJobIdGet(jobId)

GET /request/{jobId}

Get parse request state

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*

val apiInstance = RequestApi()
val jobId : kotlin.String = jobId_example // kotlin.String | The job ID to query.
try {
    val result : kotlin.Any = apiInstance.requestJobIdGet(jobId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling RequestApi#requestJobIdGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling RequestApi#requestJobIdGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **jobId** | **kotlin.String**| The job ID to query. |

### Return type

[**kotlin.Any**](kotlin.Any.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="requestMatchIdPost"></a>
# **requestMatchIdPost**
> kotlin.Any requestMatchIdPost(matchId)

POST /request/{match_id}

Submit a new parse request

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*

val apiInstance = RequestApi()
val matchId : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : kotlin.Any = apiInstance.requestMatchIdPost(matchId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling RequestApi#requestMatchIdPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling RequestApi#requestMatchIdPost")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **matchId** | **kotlin.Int**|  |

### Return type

[**kotlin.Any**](kotlin.Any.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

