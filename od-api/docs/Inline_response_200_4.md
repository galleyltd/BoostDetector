
# Inline_response_200_4

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**match_id** | **kotlin.Int** | Match ID |  [optional]
**player_slot** | **kotlin.Int** | Which slot the player is in. 0-127 are Radiant, 128-255 are Dire |  [optional]
**radiant_win** | **kotlin.Boolean** | Boolean indicating whether Radiant won the match |  [optional]
**duration** | **kotlin.Int** | Duration of the game in seconds |  [optional]
**game_mode** | **kotlin.Int** | Integer corresponding to game mode played. List of constants can be found here: https://github.com/odota/dotaconstants/blob/master/json/game_mode.json |  [optional]
**lobby_type** | **kotlin.Int** | Integer corresponding to lobby type of match. List of constants can be found here: https://github.com/odota/dotaconstants/blob/master/json/lobby_type.json |  [optional]
**hero_id** | **kotlin.Int** | The ID value of the hero played |  [optional]
**start_time** | **kotlin.Int** | Time the game started in seconds since 1970 |  [optional]
**version** | **kotlin.Int** | version |  [optional]
**kills** | **kotlin.Int** | Total kills the player had at the end of the game |  [optional]
**deaths** | **kotlin.Int** | Total deaths the player had at the end of the game |  [optional]
**assists** | **kotlin.Int** | Total assists the player had at the end of the game |  [optional]
**skill** | **kotlin.Int** | Skill bracket assigned by Valve (Normal, High, Very High) |  [optional]
**party_size** | **kotlin.Int** | Size of the player&#39;s party |  [optional]
**heroes** | [**Playersaccount_idmatches_heroes**](Playersaccount_idmatches_heroes.md) |  |  [optional]



