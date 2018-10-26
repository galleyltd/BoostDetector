package com.github.galleyltd.boost.opendota.dto

import com.fasterxml.jackson.annotation.JsonAutoDetect
import com.fasterxml.jackson.annotation.JsonProperty

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
data class MatchData(
    @JsonProperty("match_id") private val matchId: String?,
    @JsonProperty("cluster") private val cluster: Int?,
    @JsonProperty("dire_score") private val direScore: Int?,
    @JsonProperty("duration") private val duration: Int?,
    @JsonProperty("game_mode") private val gameMode: Int?,
    @JsonProperty("match_seq_num") private val matchSeqNum: String?,
    @JsonProperty("negative_votes") private val negativeVotes: Int?,
    @JsonProperty("positive_votes") private val positiveVotes: Int?,
    @JsonProperty("radiant_gold_adv") private val radiantGoldAdv: List<Any?>?,
    @JsonProperty("radiant_score") private val radiantScore: Int?,
    @JsonProperty("radiant_win") private val radiantWin: Boolean?,
    @JsonProperty("radiant_xp_adv") private val radiantXpAdv: List<Any?>?,
    @JsonProperty("skill") private val skill: Any?,
    @JsonProperty("start_time") private val startTime: Int?,
    @JsonProperty("teamfights") private val teamfights: List<Any?>?,
    @JsonProperty("tower_status_dire") private val towerStatusDire: Int?,
    @JsonProperty("tower_status_radiant") private val towerStatusRadiant: Int?,
    @JsonProperty("version") private val version: Int?,
    @JsonProperty("players") private val players: List<Player?>?,
    @JsonProperty("patch") private val patch: Int?,
    @JsonProperty("region") private val region: Int?,
    @JsonProperty("comeback") private val comeback: Any?,
    @JsonProperty("stomp") private val stomp: Any?,
    @JsonProperty("replay_url") private val replayUrl: String?,
    @JsonProperty("chat") private val chat: List<Chat?>?
)

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
data class Player(
    @JsonProperty("match_id") private val matchId: String?,
    @JsonProperty("account_id") private val accountId: Int?,
    @JsonProperty("additional_units") private val additionalUnits: Any?,
    @JsonProperty("assists") private val assists: Int?,
    @JsonProperty("backpack_0") private val backpack0: Int?,
    @JsonProperty("backpack_1") private val backpack1: Int?,
    @JsonProperty("backpack_2") private val backpack2: Int?,
    @JsonProperty("buyback_log") private val buybackLog: List<Any?>?,
    @JsonProperty("camps_stacked") private val campsStacked: Any?,
    @JsonProperty("creeps_stacked") private val creepsStacked: Any?,
    @JsonProperty("damage_inflictor_received") private val damageInflictorReceived: Any?,
    @JsonProperty("damage_targets") private val damageTargets: Any?,
    @JsonProperty("deaths") private val deaths: Int?,
    @JsonProperty("denies") private val denies: Int?,
    @JsonProperty("dn_t") private val dnT: Any?,
    @JsonProperty("firstblood_claimed") private val firstbloodClaimed: Any?,
    @JsonProperty("gold") private val gold: Int?,
    @JsonProperty("gold_per_min") private val goldPerMin: Int?,
    @JsonProperty("gold_spent") private val goldSpent: Int?,
    @JsonProperty("gold_t") private val goldT: List<Any?>?,
    @JsonProperty("hero_damage") private val heroDamage: Int?,
    @JsonProperty("hero_healing") private val heroHealing: Int?,
    @JsonProperty("hero_id") private val heroId: Int?,
    @JsonProperty("item_0") private val item0: Int?,
    @JsonProperty("item_1") private val item1: Int?,
    @JsonProperty("item_2") private val item2: Int?,
    @JsonProperty("item_3") private val item3: Int?,
    @JsonProperty("item_4") private val item4: Int?,
    @JsonProperty("item_5") private val item5: Int?,
    @JsonProperty("kills") private val kills: Int?,
    @JsonProperty("kills_log") private val killsLog: List<Any?>?,
    @JsonProperty("last_hits") private val lastHits: Int?,
    @JsonProperty("leaver_status") private val leaverStatus: Int?,
    @JsonProperty("level") private val level: Int?,
    @JsonProperty("lh_t") private val lhT: List<Any?>?,
    @JsonProperty("life_state") private val lifeState: Any?,
    @JsonProperty("max_hero_hit") private val maxHeroHit: MaxHeroHit?,
    @JsonProperty("obs_left_log") private val obsLeftLog: Any?,
    @JsonProperty("obs_log") private val obsLog: List<Any?>?,
    @JsonProperty("obs_placed") private val obsPlaced: Any?,
    @JsonProperty("performance_others") private val performanceOthers: Any?,
    @JsonProperty("permanent_buffs") private val permanentBuffs: Any?,
    @JsonProperty("purchase") private val purchase: Purchase?,
    @JsonProperty("purchase_log") private val purchaseLog: List<Any?>?,
    @JsonProperty("randomed") private val randomed: Any?,
    @JsonProperty("repicked") private val repicked: Any?,
    @JsonProperty("roshans_killed") private val roshansKilled: Any?,
    @JsonProperty("rune_pickups") private val runePickups: Any?,
    @JsonProperty("runes") private val runes: kotlin.collections.Map<kotlin.String, kotlin.Int>?,
    @JsonProperty("runes_log") private val runesLog: Any?,
    @JsonProperty("sen_left_log") private val senLeftLog: Any?,
    @JsonProperty("sen_log") private val senLog: List<Any?>?,
    @JsonProperty("sen_placed") private val senPlaced: Any?,
    @JsonProperty("stuns") private val stuns: Int?,
    @JsonProperty("teamfight_participation") private val teamfightParticipation: Any?,
    @JsonProperty("times") private val times: List<Any?>?,
    @JsonProperty("tower_damage") private val towerDamage: Int?,
    @JsonProperty("towers_killed") private val towersKilled: Any?,
    @JsonProperty("xp_per_min") private val xpPerMin: Int?,
    @JsonProperty("xp_t") private val xpT: List<Any?>?,
    @JsonProperty("personaname") private val personaname: String?,
    @JsonProperty("name") private val name: Any?,
    @JsonProperty("last_login") private val lastLogin: Any?,
    @JsonProperty("radiant_win") private val radiantWin: Boolean?,
    @JsonProperty("start_time") private val startTime: Int?,
    @JsonProperty("duration") private val duration: Int?,
    @JsonProperty("cluster") private val cluster: Int?,
    @JsonProperty("game_mode") private val gameMode: Int?,
    @JsonProperty("is_contributor") private val isContributor: Boolean?,
    @JsonProperty("patch") private val patch: Int?,
    @JsonProperty("region") private val region: Int?,
    @JsonProperty("isRadiant") private val isRadiant: Boolean?,
    @JsonProperty("win") private val win: Int?,
    @JsonProperty("lose") private val lose: Int?,
    @JsonProperty("total_gold") private val totalGold: Int?,
    @JsonProperty("total_xp") private val totalXp: Int?,
    @JsonProperty("kills_per_min") private val killsPerMin: Double?,
    @JsonProperty("kda") private val kda: Int?,
    @JsonProperty("abandons") private val abandons: Int?,
    @JsonProperty("neutral_kills") private val neutralKills: Int?,
    @JsonProperty("tower_kills") private val towerKills: Int?,
    @JsonProperty("courier_kills") private val courierKills: Int?,
    @JsonProperty("lane_kills") private val laneKills: Int?,
    @JsonProperty("hero_kills") private val heroKills: Int?,
    @JsonProperty("observer_kills") private val observerKills: Int?,
    @JsonProperty("sentry_kills") private val sentryKills: Int?,
    @JsonProperty("roshan_kills") private val roshanKills: Int?,
    @JsonProperty("necronomicon_kills") private val necronomiconKills: Int?,
    @JsonProperty("ancient_kills") private val ancientKills: Int?,
    @JsonProperty("buyback_count") private val buybackCount: Int?,
    @JsonProperty("observer_uses") private val observerUses: Int?,
    @JsonProperty("sentry_uses") private val sentryUses: Int?,
    @JsonProperty("is_roaming") private val isRoaming: Boolean?,
    @JsonProperty("actions_per_min") private val actionsPerMin: Int?,
    @JsonProperty("life_state_dead") private val lifeStateDead: Int?,
    @JsonProperty("rank_tier") private val rankTier: Int?,
    @JsonProperty("cosmetics") private val cosmetics: List<Any?>?,
    @JsonProperty("benchmarks") private val benchmarks: Benchmarks?
)

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
data class Benchmarks(
    @JsonProperty("gold_per_min") private val goldPerMin: GoldPerMin?,
    @JsonProperty("xp_per_min") private val xpPerMin: XpPerMin?,
    @JsonProperty("kills_per_min") private val killsPerMin: KillsPerMin?,
    @JsonProperty("last_hits_per_min") private val lastHitsPerMin: LastHitsPerMin?,
    @JsonProperty("hero_damage_per_min") private val heroDamagePerMin: HeroDamagePerMin?,
    @JsonProperty("hero_healing_per_min") private val heroHealingPerMin: HeroHealingPerMin?,
    @JsonProperty("tower_damage") private val towerDamage: TowerDamage?,
    @JsonProperty("stuns_per_min") private val stunsPerMin: StunsPerMin?
)

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
data class LastHitsPerMin(
    @JsonProperty("raw") private val raw: Double?,
    @JsonProperty("pct") private val pct: Double?
)

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
data class TowerDamage(
    @JsonProperty("raw") private val raw: Int?,
    @JsonProperty("pct") private val pct: Double?
)

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
data class KillsPerMin(
    @JsonProperty("raw") private val raw: Double?,
    @JsonProperty("pct") private val pct: Double?
)

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
data class StunsPerMin(
    @JsonProperty("raw") private val raw: Int?,
    @JsonProperty("pct") private val pct: Double?
)

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
data class HeroDamagePerMin(
    @JsonProperty("raw") private val raw: Double?,
    @JsonProperty("pct") private val pct: Double?
)

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
data class HeroHealingPerMin(
    @JsonProperty("raw") private val raw: Int?,
    @JsonProperty("pct") private val pct: Double?
)

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
data class XpPerMin(
    @JsonProperty("raw") private val raw: Int?,
    @JsonProperty("pct") private val pct: Double?
)

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
data class GoldPerMin(
    @JsonProperty("raw") private val raw: Int?,
    @JsonProperty("pct") private val pct: Double?
)

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
data class MaxHeroHit(
    @JsonProperty("value") private val value: Int?
)

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
data class Purchase(
    @JsonProperty("dust") private val dust: Any?
)

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
data class Chat(
    @JsonProperty("time") private val time: Int?,
    @JsonProperty("type") private val type: String?,
    @JsonProperty("unit") private val unit: String?,
    @JsonProperty("key") private val key: String?
)
