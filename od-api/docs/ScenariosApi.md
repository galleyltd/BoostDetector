# ScenariosApi

All URIs are relative to *https://api.opendota.com/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**scenariosItemTimingsGet**](ScenariosApi.md#scenariosItemTimingsGet) | **GET** /scenarios/itemTimings | GET /scenarios/itemTimings
[**scenariosLaneRolesGet**](ScenariosApi.md#scenariosLaneRolesGet) | **GET** /scenarios/laneRoles | GET /scenarios/laneRoles
[**scenariosMiscGet**](ScenariosApi.md#scenariosMiscGet) | **GET** /scenarios/misc | GET /scenarios/misc


<a name="scenariosItemTimingsGet"></a>
# **scenariosItemTimingsGet**
> kotlin.Array&lt;Inline_response_200_31&gt; scenariosItemTimingsGet(item, heroId)

GET /scenarios/itemTimings

Win rates for certain item timings on a hero for items that cost at least 1400 gold

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*

val apiInstance = ScenariosApi()
val item : kotlin.String = item_example // kotlin.String | Filter by item name e.g. \"spirit_vessel\"
val heroId : kotlin.Int = 56 // kotlin.Int | Hero ID
try {
    val result : kotlin.Array<Inline_response_200_31> = apiInstance.scenariosItemTimingsGet(item, heroId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ScenariosApi#scenariosItemTimingsGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ScenariosApi#scenariosItemTimingsGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **item** | **kotlin.String**| Filter by item name e.g. \&quot;spirit_vessel\&quot; | [optional]
 **heroId** | **kotlin.Int**| Hero ID | [optional]

### Return type

[**kotlin.Array&lt;Inline_response_200_31&gt;**](Inline_response_200_31.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="scenariosLaneRolesGet"></a>
# **scenariosLaneRolesGet**
> kotlin.Array&lt;Inline_response_200_32&gt; scenariosLaneRolesGet(laneRole, heroId)

GET /scenarios/laneRoles

Win rates for heroes in certain lane roles

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*

val apiInstance = ScenariosApi()
val laneRole : kotlin.String = laneRole_example // kotlin.String | Filter by lane role 1-4 (Safe, Mid, Off, Jungle)
val heroId : kotlin.Int = 56 // kotlin.Int | Hero ID
try {
    val result : kotlin.Array<Inline_response_200_32> = apiInstance.scenariosLaneRolesGet(laneRole, heroId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ScenariosApi#scenariosLaneRolesGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ScenariosApi#scenariosLaneRolesGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **laneRole** | **kotlin.String**| Filter by lane role 1-4 (Safe, Mid, Off, Jungle) | [optional]
 **heroId** | **kotlin.Int**| Hero ID | [optional]

### Return type

[**kotlin.Array&lt;Inline_response_200_32&gt;**](Inline_response_200_32.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="scenariosMiscGet"></a>
# **scenariosMiscGet**
> kotlin.Array&lt;Inline_response_200_33&gt; scenariosMiscGet(scenario)

GET /scenarios/misc

Miscellaneous team scenarios

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*

val apiInstance = ScenariosApi()
val scenario : kotlin.String = scenario_example // kotlin.String | pos_chat_1min,neg_chat_1min,courier_kill,first_blood
try {
    val result : kotlin.Array<Inline_response_200_33> = apiInstance.scenariosMiscGet(scenario)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ScenariosApi#scenariosMiscGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ScenariosApi#scenariosMiscGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **scenario** | **kotlin.String**| pos_chat_1min,neg_chat_1min,courier_kill,first_blood | [optional]

### Return type

[**kotlin.Array&lt;Inline_response_200_33&gt;**](Inline_response_200_33.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

