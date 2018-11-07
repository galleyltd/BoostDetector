package com.github.galleyltd.boost.domain.opendota.dto

import com.fasterxml.jackson.annotation.JsonAutoDetect
import com.fasterxml.jackson.annotation.JsonProperty

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
data class MatchData(
    @JsonProperty("match_id") val matchId: String,
    @JsonProperty("cluster") val cluster: Int,
    @JsonProperty("dire_score") val direScore: Int,
    @JsonProperty("duration") val duration: Int,
    @JsonProperty("game_mode") val gameMode: Int,
    @JsonProperty("match_seq_num") val matchSeqNum: String,
    @JsonProperty("negative_votes") val negativeVotes: Int,
    @JsonProperty("positive_votes") val positiveVotes: Int,
    @JsonProperty("radiant_gold_adv") val radiantGoldAdv: List<Any>?,
    @JsonProperty("radiant_score") val radiantScore: Int,
    @JsonProperty("radiant_win") val radiantWin: Boolean,
    @JsonProperty("radiant_xp_adv") val radiantXpAdv: List<Any>?,
    @JsonProperty("skill") val skill: Any?,
    @JsonProperty("start_time") val startTime: Int,
    @JsonProperty("teamfights") val teamfights: List<Any>?,
    @JsonProperty("tower_status_dire") val towerStatusDire: Int,
    @JsonProperty("tower_status_radiant") val towerStatusRadiant: Int,
    @JsonProperty("version") val version: Int,
    @JsonProperty("players") val players: List<Player>,
    @JsonProperty("patch") val patch: Int,
    @JsonProperty("region") val region: Int,
    @JsonProperty("comeback") val comeback: Any?,
    @JsonProperty("stomp") val stomp: Any?,
    @JsonProperty("replay_url") val replayUrl: String?,
    @JsonProperty("chat") val chat: List<Chat>?
)

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
data class Player(
    @JsonProperty("match_id") val matchId: String,
    @JsonProperty("account_id") val accountId: Int,
    @JsonProperty("additional_units") val additionalUnits: Any?,
    @JsonProperty("assists") val assists: Int,
    @JsonProperty("backpack_0") val backpack0: Int,
    @JsonProperty("backpack_1") val backpack1: Int,
    @JsonProperty("backpack_2") val backpack2: Int,
    @JsonProperty("buyback_log") val buybackLog: List<Any>?,
    @JsonProperty("camps_stacked") val campsStacked: Any?,
    @JsonProperty("creeps_stacked") val creepsStacked: Any?,
    @JsonProperty("damage_inflictor_received") val damageInflictorReceived: Any?,
    @JsonProperty("damage_targets") val damageTargets: Any?,
    @JsonProperty("deaths") val deaths: Int,
    @JsonProperty("denies") val denies: Int,
    @JsonProperty("dn_t") val dnT: Any?,
    @JsonProperty("firstblood_claimed") val firstbloodClaimed: Any?,
    @JsonProperty("gold") val gold: Int,
    @JsonProperty("gold_per_min") val goldPerMin: Int,
    @JsonProperty("gold_spent") val goldSpent: Int,
    @JsonProperty("gold_t") val goldT: List<Any>?,
    @JsonProperty("hero_damage") val heroDamage: Int,
    @JsonProperty("hero_healing") val heroHealing: Int,
    @JsonProperty("hero_id") val heroId: Int,
    @JsonProperty("item_0") val item0: Int,
    @JsonProperty("item_1") val item1: Int,
    @JsonProperty("item_2") val item2: Int,
    @JsonProperty("item_3") val item3: Int,
    @JsonProperty("item_4") val item4: Int,
    @JsonProperty("item_5") val item5: Int,
    @JsonProperty("kills") val kills: Int,
    @JsonProperty("kills_log") val killsLog: List<Any>?,
    @JsonProperty("last_hits") val lastHits: Int,
    @JsonProperty("leaver_status") val leaverStatus: Int,
    @JsonProperty("level") val level: Int,
    @JsonProperty("lh_t") val lhT: List<Any>?,
    @JsonProperty("life_state") val lifeState: Any?,
    @JsonProperty("max_hero_hit") val maxHeroHit: MaxHeroHit?,
    @JsonProperty("obs_left_log") val obsLeftLog: Any?,
    @JsonProperty("obs_log") val obsLog: List<Any>?,
    @JsonProperty("obs_placed") val obsPlaced: Any?,
    @JsonProperty("performance_others") val performanceOthers: Any?,
    @JsonProperty("permanent_buffs") val permanentBuffs: Any?,
    @JsonProperty("purchase") val purchase: Purchase?,
    @JsonProperty("purchase_log") val purchaseLog: List<Any>?,
    @JsonProperty("randomed") val randomed: Any?,
    @JsonProperty("repicked") val repicked: Any?,
    @JsonProperty("roshans_killed") val roshansKilled: Any?,
    @JsonProperty("rune_pickups") val runePickups: Any?,
    @JsonProperty("runes") val runes: kotlin.collections.Map<kotlin.String, kotlin.Int>?,
    @JsonProperty("runes_log") val runesLog: Any?,
    @JsonProperty("sen_left_log") val senLeftLog: Any?,
    @JsonProperty("sen_log") val senLog: List<Any>?,
    @JsonProperty("sen_placed") val senPlaced: Any?,
    @JsonProperty("stuns") val stuns: Int,
    @JsonProperty("teamfight_participation") val teamfightParticipation: Any?,
    @JsonProperty("times") val times: List<Any>?,
    @JsonProperty("tower_damage") val towerDamage: Int,
    @JsonProperty("towers_killed") val towersKilled: Any?,
    @JsonProperty("xp_per_min") val xpPerMin: Int,
    @JsonProperty("xp_t") val xpT: List<Any>?,
    @JsonProperty("personaname") val personaname: String?,
    @JsonProperty("name") val name: Any?,
    @JsonProperty("last_login") val lastLogin: Any?,
    @JsonProperty("radiant_win") val radiantWin: Boolean,
    @JsonProperty("start_time") val startTime: Int,
    @JsonProperty("duration") val duration: Int,
    @JsonProperty("cluster") val cluster: Int,
    @JsonProperty("game_mode") val gameMode: Int,
    @JsonProperty("is_contributor") val isContributor: Boolean,
    @JsonProperty("patch") val patch: Int,
    @JsonProperty("region") val region: Int,
    @JsonProperty("isRadiant") val isRadiant: Boolean,
    @JsonProperty("win") val win: Int,
    @JsonProperty("lose") val lose: Int,
    @JsonProperty("total_gold") val totalGold: Int,
    @JsonProperty("total_xp") val totalXp: Int,
    @JsonProperty("kills_per_min") val killsPerMin: Double,
    @JsonProperty("kda") val kda: Int,
    @JsonProperty("abandons") val abandons: Int,
    @JsonProperty("neutral_kills") val neutralKills: Int,
    @JsonProperty("tower_kills") val towerKills: Int,
    @JsonProperty("courier_kills") val courierKills: Int,
    @JsonProperty("lane_kills") val laneKills: Int,
    @JsonProperty("hero_kills") val heroKills: Int,
    @JsonProperty("observer_kills") val observerKills: Int,
    @JsonProperty("sentry_kills") val sentryKills: Int,
    @JsonProperty("roshan_kills") val roshanKills: Int,
    @JsonProperty("necronomicon_kills") val necronomiconKills: Int,
    @JsonProperty("ancient_kills") val ancientKills: Int,
    @JsonProperty("buyback_count") val buybackCount: Int,
    @JsonProperty("observer_uses") val observerUses: Int,
    @JsonProperty("sentry_uses") val sentryUses: Int,
    @JsonProperty("is_roaming") val isRoaming: Boolean,
    @JsonProperty("actions_per_min") val actionsPerMin: Int,
    @JsonProperty("life_state_dead") val lifeStateDead: Int,
    @JsonProperty("rank_tier") val rankTier: Int,
    @JsonProperty("cosmetics") val cosmetics: List<Any>?,
    @JsonProperty("benchmarks") val benchmarks: Benchmarks
)

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
data class Benchmarks(
    @JsonProperty("gold_per_min") val goldPerMin: GoldPerMin,
    @JsonProperty("xp_per_min") val xpPerMin: XpPerMin,
    @JsonProperty("kills_per_min") val killsPerMin: KillsPerMin,
    @JsonProperty("last_hits_per_min") val lastHitsPerMin: LastHitsPerMin,
    @JsonProperty("hero_damage_per_min") val heroDamagePerMin: HeroDamagePerMin,
    @JsonProperty("hero_healing_per_min") val heroHealingPerMin: HeroHealingPerMin,
    @JsonProperty("tower_damage") val towerDamage: TowerDamage,
    @JsonProperty("stuns_per_min") val stunsPerMin: StunsPerMin
)

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
data class LastHitsPerMin(
    @JsonProperty("raw") val raw: Double,
    @JsonProperty("pct") val pct: Double
)

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
data class TowerDamage(
    @JsonProperty("raw") val raw: Int,
    @JsonProperty("pct") val pct: Double
)

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
data class KillsPerMin(
    @JsonProperty("raw") val raw: Double,
    @JsonProperty("pct") val pct: Double
)

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
data class StunsPerMin(
    @JsonProperty("raw") val raw: Int,
    @JsonProperty("pct") val pct: Double
)

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
data class HeroDamagePerMin(
    @JsonProperty("raw") val raw: Double,
    @JsonProperty("pct") val pct: Double
)

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
data class HeroHealingPerMin(
    @JsonProperty("raw") val raw: Int,
    @JsonProperty("pct") val pct: Double
)

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
data class XpPerMin(
    @JsonProperty("raw") val raw: Int,
    @JsonProperty("pct") val pct: Double
)

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
data class GoldPerMin(
    @JsonProperty("raw") val raw: Int,
    @JsonProperty("pct") val pct: Double
)

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
data class MaxHeroHit(
    @JsonProperty("value") val value: Int
)

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
data class Purchase(
    @JsonProperty("dust") val dust: Any?
)

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
data class Chat(
    @JsonProperty("time") val time: Int,
    @JsonProperty("type") val type: String,
    @JsonProperty("unit") val unit: String?,
    @JsonProperty("key") val key: String
)
