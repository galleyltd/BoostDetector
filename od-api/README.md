# io.swagger.client - Kotlin client library for OpenDota API

## Requires

* Kotlin 1.1.2
* Gradle 3.3

## Build

First, create the gradle wrapper script:

```
gradle wrapper
```

Then, run:

```
./gradlew check assemble
```

This runs all tests and packages the library.

## Features/Implementation Notes

* Supports JSON inputs/outputs, File inputs, and Form inputs.
* Supports collection formats for query parameters: csv, tsv, ssv, pipes.
* Some Kotlin and Java types are fully qualified to avoid conflicts with types defined in Swagger definitions.
* Implementation of ApiClient is intended to reduce method counts, specifically to benefit Android targets.

<a name="documentation-for-api-endpoints"></a>
## Documentation for API Endpoints

All URIs are relative to *https://api.opendota.com/api*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*BenchmarksApi* | [**benchmarksGet**](docs/BenchmarksApi.md#benchmarksget) | **GET** /benchmarks | GET /benchmarks
*DistributionsApi* | [**distributionsGet**](docs/DistributionsApi.md#distributionsget) | **GET** /distributions | GET /distributions
*ExplorerApi* | [**explorerGet**](docs/ExplorerApi.md#explorerget) | **GET** /explorer | GET /explorer
*HealthApi* | [**healthGet**](docs/HealthApi.md#healthget) | **GET** /health | GET /health
*HeroStatsApi* | [**heroStatsGet**](docs/HeroStatsApi.md#herostatsget) | **GET** /heroStats | GET /heroStats
*HeroesApi* | [**heroesGet**](docs/HeroesApi.md#heroesget) | **GET** /heroes | GET /heroes
*HeroesApi* | [**heroesHeroIdDurationsGet**](docs/HeroesApi.md#heroesheroiddurationsget) | **GET** /heroes/{hero_id}/durations | GET /heroes/{hero_id}/durations
*HeroesApi* | [**heroesHeroIdMatchesGet**](docs/HeroesApi.md#heroesheroidmatchesget) | **GET** /heroes/{hero_id}/matches | GET /heroes/{hero_id}/matches
*HeroesApi* | [**heroesHeroIdMatchupsGet**](docs/HeroesApi.md#heroesheroidmatchupsget) | **GET** /heroes/{hero_id}/matchups | GET /heroes/{hero_id}/matchups
*HeroesApi* | [**heroesHeroIdPlayersGet**](docs/HeroesApi.md#heroesheroidplayersget) | **GET** /heroes/{hero_id}/players | GET /heroes/{hero_id}/players
*LeaguesApi* | [**leaguesGet**](docs/LeaguesApi.md#leaguesget) | **GET** /leagues | GET /leagues
*LiveApi* | [**liveGet**](docs/LiveApi.md#liveget) | **GET** /live | GET /live
*MatchesApi* | [**matchesMatchIdGet**](docs/MatchesApi.md#matchesmatchidget) | **GET** /matches/{match_id} | GET /matches/{match_id}
*MetadataApi* | [**metadataGet**](docs/MetadataApi.md#metadataget) | **GET** /metadata | GET /metadata
*PlayersApi* | [**playersAccountIdCountsGet**](docs/PlayersApi.md#playersaccountidcountsget) | **GET** /players/{account_id}/counts | GET /players/{account_id}/counts
*PlayersApi* | [**playersAccountIdGet**](docs/PlayersApi.md#playersaccountidget) | **GET** /players/{account_id} | GET /players/{account_id}
*PlayersApi* | [**playersAccountIdHeroesGet**](docs/PlayersApi.md#playersaccountidheroesget) | **GET** /players/{account_id}/heroes | GET /players/{account_id}/heroes
*PlayersApi* | [**playersAccountIdHistogramsFieldGet**](docs/PlayersApi.md#playersaccountidhistogramsfieldget) | **GET** /players/{account_id}/histograms/{field} | GET /players/{account_id}/histograms
*PlayersApi* | [**playersAccountIdMatchesGet**](docs/PlayersApi.md#playersaccountidmatchesget) | **GET** /players/{account_id}/matches | GET /players/{account_id}/matches
*PlayersApi* | [**playersAccountIdPeersGet**](docs/PlayersApi.md#playersaccountidpeersget) | **GET** /players/{account_id}/peers | GET /players/{account_id}/peers
*PlayersApi* | [**playersAccountIdProsGet**](docs/PlayersApi.md#playersaccountidprosget) | **GET** /players/{account_id}/pros | GET /players/{account_id}/pros
*PlayersApi* | [**playersAccountIdRankingsGet**](docs/PlayersApi.md#playersaccountidrankingsget) | **GET** /players/{account_id}/rankings | GET /players/{account_id}/rankings
*PlayersApi* | [**playersAccountIdRatingsGet**](docs/PlayersApi.md#playersaccountidratingsget) | **GET** /players/{account_id}/ratings | GET /players/{account_id}/ratings
*PlayersApi* | [**playersAccountIdRecentMatchesGet**](docs/PlayersApi.md#playersaccountidrecentmatchesget) | **GET** /players/{account_id}/recentMatches | GET /players/{account_id}/recentMatches
*PlayersApi* | [**playersAccountIdRefreshPost**](docs/PlayersApi.md#playersaccountidrefreshpost) | **POST** /players/{account_id}/refresh | POST /players/{account_id}/refresh
*PlayersApi* | [**playersAccountIdTotalsGet**](docs/PlayersApi.md#playersaccountidtotalsget) | **GET** /players/{account_id}/totals | GET /players/{account_id}/totals
*PlayersApi* | [**playersAccountIdWardmapGet**](docs/PlayersApi.md#playersaccountidwardmapget) | **GET** /players/{account_id}/wardmap | GET /players/{account_id}/wardmap
*PlayersApi* | [**playersAccountIdWlGet**](docs/PlayersApi.md#playersaccountidwlget) | **GET** /players/{account_id}/wl | GET /players/{account_id}/wl
*PlayersApi* | [**playersAccountIdWordcloudGet**](docs/PlayersApi.md#playersaccountidwordcloudget) | **GET** /players/{account_id}/wordcloud | GET /players/{account_id}/wordcloud
*ProMatchesApi* | [**proMatchesGet**](docs/ProMatchesApi.md#promatchesget) | **GET** /proMatches | GET /proMatches
*ProPlayersApi* | [**proPlayersGet**](docs/ProPlayersApi.md#proplayersget) | **GET** /proPlayers | GET /proPlayers
*PublicMatchesApi* | [**publicMatchesGet**](docs/PublicMatchesApi.md#publicmatchesget) | **GET** /publicMatches | GET /publicMatches
*RankingsApi* | [**rankingsGet**](docs/RankingsApi.md#rankingsget) | **GET** /rankings | GET /rankings
*RecordsApi* | [**recordsFieldGet**](docs/RecordsApi.md#recordsfieldget) | **GET** /records/{field} | GET /records/{field}
*ReplaysApi* | [**replaysGet**](docs/ReplaysApi.md#replaysget) | **GET** /replays | GET /replays
*RequestApi* | [**requestJobIdGet**](docs/RequestApi.md#requestjobidget) | **GET** /request/{jobId} | GET /request/{jobId}
*RequestApi* | [**requestMatchIdPost**](docs/RequestApi.md#requestmatchidpost) | **POST** /request/{match_id} | POST /request/{match_id}
*ScenariosApi* | [**scenariosItemTimingsGet**](docs/ScenariosApi.md#scenariositemtimingsget) | **GET** /scenarios/itemTimings | GET /scenarios/itemTimings
*ScenariosApi* | [**scenariosLaneRolesGet**](docs/ScenariosApi.md#scenarioslanerolesget) | **GET** /scenarios/laneRoles | GET /scenarios/laneRoles
*ScenariosApi* | [**scenariosMiscGet**](docs/ScenariosApi.md#scenariosmiscget) | **GET** /scenarios/misc | GET /scenarios/misc
*SchemaApi* | [**schemaGet**](docs/SchemaApi.md#schemaget) | **GET** /schema | GET /schema
*SearchApi* | [**searchGet**](docs/SearchApi.md#searchget) | **GET** /search | GET /search
*StatusApi* | [**adminApiMetricsGet**](docs/StatusApi.md#adminapimetricsget) | **GET** /admin/apiMetrics | GET /admin/apiMetrics
*StatusApi* | [**statusGet**](docs/StatusApi.md#statusget) | **GET** /status | GET /status
*TeamsApi* | [**teamsGet**](docs/TeamsApi.md#teamsget) | **GET** /teams | GET /teams
*TeamsApi* | [**teamsTeamIdGet**](docs/TeamsApi.md#teamsteamidget) | **GET** /teams/{team_id} | GET /teams/{team_id}
*TeamsApi* | [**teamsTeamIdHeroesGet**](docs/TeamsApi.md#teamsteamidheroesget) | **GET** /teams/{team_id}/heroes | GET /teams/{team_id}/heroes
*TeamsApi* | [**teamsTeamIdMatchesGet**](docs/TeamsApi.md#teamsteamidmatchesget) | **GET** /teams/{team_id}/matches | GET /teams/{team_id}/matches
*TeamsApi* | [**teamsTeamIdPlayersGet**](docs/TeamsApi.md#teamsteamidplayersget) | **GET** /teams/{team_id}/players | GET /teams/{team_id}/players


<a name="documentation-for-models"></a>
## Documentation for Models

 - [io.swagger.client.models.Inline_response_200](docs/Inline_response_200.md)
 - [io.swagger.client.models.Inline_response_200_1](docs/Inline_response_200_1.md)
 - [io.swagger.client.models.Inline_response_200_10](docs/Inline_response_200_10.md)
 - [io.swagger.client.models.Inline_response_200_11](docs/Inline_response_200_11.md)
 - [io.swagger.client.models.Inline_response_200_12](docs/Inline_response_200_12.md)
 - [io.swagger.client.models.Inline_response_200_13](docs/Inline_response_200_13.md)
 - [io.swagger.client.models.Inline_response_200_14](docs/Inline_response_200_14.md)
 - [io.swagger.client.models.Inline_response_200_15](docs/Inline_response_200_15.md)
 - [io.swagger.client.models.Inline_response_200_16](docs/Inline_response_200_16.md)
 - [io.swagger.client.models.Inline_response_200_16_cheese](docs/Inline_response_200_16_cheese.md)
 - [io.swagger.client.models.Inline_response_200_17](docs/Inline_response_200_17.md)
 - [io.swagger.client.models.Inline_response_200_17_country_mmr](docs/Inline_response_200_17_country_mmr.md)
 - [io.swagger.client.models.Inline_response_200_17_country_mmr_fields](docs/Inline_response_200_17_country_mmr_fields.md)
 - [io.swagger.client.models.Inline_response_200_17_country_mmr_rows](docs/Inline_response_200_17_country_mmr_rows.md)
 - [io.swagger.client.models.Inline_response_200_17_mmr](docs/Inline_response_200_17_mmr.md)
 - [io.swagger.client.models.Inline_response_200_17_ranks](docs/Inline_response_200_17_ranks.md)
 - [io.swagger.client.models.Inline_response_200_17_ranks_fields](docs/Inline_response_200_17_ranks_fields.md)
 - [io.swagger.client.models.Inline_response_200_17_ranks_rows](docs/Inline_response_200_17_ranks_rows.md)
 - [io.swagger.client.models.Inline_response_200_17_ranks_sum](docs/Inline_response_200_17_ranks_sum.md)
 - [io.swagger.client.models.Inline_response_200_18](docs/Inline_response_200_18.md)
 - [io.swagger.client.models.Inline_response_200_19](docs/Inline_response_200_19.md)
 - [io.swagger.client.models.Inline_response_200_19_rankings](docs/Inline_response_200_19_rankings.md)
 - [io.swagger.client.models.Inline_response_200_1_mmr_estimate](docs/Inline_response_200_1_mmr_estimate.md)
 - [io.swagger.client.models.Inline_response_200_1_profile](docs/Inline_response_200_1_profile.md)
 - [io.swagger.client.models.Inline_response_200_2](docs/Inline_response_200_2.md)
 - [io.swagger.client.models.Inline_response_200_20](docs/Inline_response_200_20.md)
 - [io.swagger.client.models.Inline_response_200_20_result](docs/Inline_response_200_20_result.md)
 - [io.swagger.client.models.Inline_response_200_20_result_gold_per_min](docs/Inline_response_200_20_result_gold_per_min.md)
 - [io.swagger.client.models.Inline_response_200_21](docs/Inline_response_200_21.md)
 - [io.swagger.client.models.Inline_response_200_22](docs/Inline_response_200_22.md)
 - [io.swagger.client.models.Inline_response_200_23](docs/Inline_response_200_23.md)
 - [io.swagger.client.models.Inline_response_200_24](docs/Inline_response_200_24.md)
 - [io.swagger.client.models.Inline_response_200_25](docs/Inline_response_200_25.md)
 - [io.swagger.client.models.Inline_response_200_26](docs/Inline_response_200_26.md)
 - [io.swagger.client.models.Inline_response_200_27](docs/Inline_response_200_27.md)
 - [io.swagger.client.models.Inline_response_200_28](docs/Inline_response_200_28.md)
 - [io.swagger.client.models.Inline_response_200_29](docs/Inline_response_200_29.md)
 - [io.swagger.client.models.Inline_response_200_3](docs/Inline_response_200_3.md)
 - [io.swagger.client.models.Inline_response_200_30](docs/Inline_response_200_30.md)
 - [io.swagger.client.models.Inline_response_200_31](docs/Inline_response_200_31.md)
 - [io.swagger.client.models.Inline_response_200_32](docs/Inline_response_200_32.md)
 - [io.swagger.client.models.Inline_response_200_33](docs/Inline_response_200_33.md)
 - [io.swagger.client.models.Inline_response_200_34](docs/Inline_response_200_34.md)
 - [io.swagger.client.models.Inline_response_200_4](docs/Inline_response_200_4.md)
 - [io.swagger.client.models.Inline_response_200_5](docs/Inline_response_200_5.md)
 - [io.swagger.client.models.Inline_response_200_6](docs/Inline_response_200_6.md)
 - [io.swagger.client.models.Inline_response_200_7](docs/Inline_response_200_7.md)
 - [io.swagger.client.models.Inline_response_200_8](docs/Inline_response_200_8.md)
 - [io.swagger.client.models.Inline_response_200_9](docs/Inline_response_200_9.md)
 - [io.swagger.client.models.Inline_response_200_buyback_log](docs/Inline_response_200_buyback_log.md)
 - [io.swagger.client.models.Inline_response_200_chat](docs/Inline_response_200_chat.md)
 - [io.swagger.client.models.Inline_response_200_draft_timings](docs/Inline_response_200_draft_timings.md)
 - [io.swagger.client.models.Inline_response_200_kills_log](docs/Inline_response_200_kills_log.md)
 - [io.swagger.client.models.Inline_response_200_players](docs/Inline_response_200_players.md)
 - [io.swagger.client.models.Inline_response_200_purchase_log](docs/Inline_response_200_purchase_log.md)
 - [io.swagger.client.models.Inline_response_200_runes_log](docs/Inline_response_200_runes_log.md)
 - [io.swagger.client.models.Playersaccount_idmatches_heroes](docs/Playersaccount_idmatches_heroes.md)
 - [io.swagger.client.models.Playersaccount_idmatches_heroes_player_slot](docs/Playersaccount_idmatches_heroes_player_slot.md)


<a name="documentation-for-authorization"></a>
## Documentation for Authorization

<a name="api_key"></a>
### api_key

- **Type**: API key
- **API key parameter name**: api_key
- **Location**: URL query string

