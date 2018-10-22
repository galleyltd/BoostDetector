# HeroesApi

All URIs are relative to *https://api.opendota.com/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**heroesGet**](HeroesApi.md#heroesGet) | **GET** /heroes | GET /heroes
[**heroesHeroIdDurationsGet**](HeroesApi.md#heroesHeroIdDurationsGet) | **GET** /heroes/{hero_id}/durations | GET /heroes/{hero_id}/durations
[**heroesHeroIdMatchesGet**](HeroesApi.md#heroesHeroIdMatchesGet) | **GET** /heroes/{hero_id}/matches | GET /heroes/{hero_id}/matches
[**heroesHeroIdMatchupsGet**](HeroesApi.md#heroesHeroIdMatchupsGet) | **GET** /heroes/{hero_id}/matchups | GET /heroes/{hero_id}/matchups
[**heroesHeroIdPlayersGet**](HeroesApi.md#heroesHeroIdPlayersGet) | **GET** /heroes/{hero_id}/players | GET /heroes/{hero_id}/players


<a name="heroesGet"></a>
# **heroesGet**
> kotlin.Array&lt;Inline_response_200_21&gt; heroesGet()

GET /heroes

Get hero data

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*

val apiInstance = HeroesApi()
try {
    val result : kotlin.Array<Inline_response_200_21> = apiInstance.heroesGet()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling HeroesApi#heroesGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling HeroesApi#heroesGet")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**kotlin.Array&lt;Inline_response_200_21&gt;**](Inline_response_200_21.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="heroesHeroIdDurationsGet"></a>
# **heroesHeroIdDurationsGet**
> kotlin.Array&lt;Inline_response_200_24&gt; heroesHeroIdDurationsGet(heroId)

GET /heroes/{hero_id}/durations

Get hero performance over a range of match durations

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*

val apiInstance = HeroesApi()
val heroId : kotlin.Int = 56 // kotlin.Int | Hero ID
try {
    val result : kotlin.Array<Inline_response_200_24> = apiInstance.heroesHeroIdDurationsGet(heroId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling HeroesApi#heroesHeroIdDurationsGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling HeroesApi#heroesHeroIdDurationsGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **heroId** | **kotlin.Int**| Hero ID |

### Return type

[**kotlin.Array&lt;Inline_response_200_24&gt;**](Inline_response_200_24.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="heroesHeroIdMatchesGet"></a>
# **heroesHeroIdMatchesGet**
> kotlin.Array&lt;Inline_response_200_14&gt; heroesHeroIdMatchesGet(heroId)

GET /heroes/{hero_id}/matches

Get recent matches with a hero

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*

val apiInstance = HeroesApi()
val heroId : kotlin.Int = 56 // kotlin.Int | Hero ID
try {
    val result : kotlin.Array<Inline_response_200_14> = apiInstance.heroesHeroIdMatchesGet(heroId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling HeroesApi#heroesHeroIdMatchesGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling HeroesApi#heroesHeroIdMatchesGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **heroId** | **kotlin.Int**| Hero ID |

### Return type

[**kotlin.Array&lt;Inline_response_200_14&gt;**](Inline_response_200_14.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="heroesHeroIdMatchupsGet"></a>
# **heroesHeroIdMatchupsGet**
> kotlin.Array&lt;Inline_response_200_23&gt; heroesHeroIdMatchupsGet(heroId)

GET /heroes/{hero_id}/matchups

Get results against other heroes for a hero

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*

val apiInstance = HeroesApi()
val heroId : kotlin.Int = 56 // kotlin.Int | Hero ID
try {
    val result : kotlin.Array<Inline_response_200_23> = apiInstance.heroesHeroIdMatchupsGet(heroId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling HeroesApi#heroesHeroIdMatchupsGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling HeroesApi#heroesHeroIdMatchupsGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **heroId** | **kotlin.Int**| Hero ID |

### Return type

[**kotlin.Array&lt;Inline_response_200_23&gt;**](Inline_response_200_23.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="heroesHeroIdPlayersGet"></a>
# **heroesHeroIdPlayersGet**
> kotlin.Array&lt;kotlin.Array&lt;kotlin.Any&gt;&gt; heroesHeroIdPlayersGet(heroId)

GET /heroes/{hero_id}/players

Get players who have played this hero

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*

val apiInstance = HeroesApi()
val heroId : kotlin.Int = 56 // kotlin.Int | Hero ID
try {
    val result : kotlin.Array<kotlin.Array<kotlin.Any>> = apiInstance.heroesHeroIdPlayersGet(heroId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling HeroesApi#heroesHeroIdPlayersGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling HeroesApi#heroesHeroIdPlayersGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **heroId** | **kotlin.Int**| Hero ID |

### Return type

**kotlin.Array&lt;kotlin.Array&lt;kotlin.Any&gt;&gt;**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

