package com.github.galleyltd.boost.opendota.dto
import com.fasterxml.jackson.annotation.JsonProperty

data class MatchData(
        @JsonProperty("match_id") val matchId: String?,
        @JsonProperty("barracks_status_dire") val barracksStatusDire: Int?,
        @JsonProperty("barracks_status_radiant") val barracksStatusRadiant: Int?,
        @JsonProperty("chat") val chat: List<Chat?>?,
        @JsonProperty("cluster") val cluster: Int?,
        @JsonProperty("cosmetics") val cosmetics: Cosmetics?,
        @JsonProperty("dire_score") val direScore: Int?,
        @JsonProperty("dire_team_id") val direTeamId: Int?,
        @JsonProperty("draft_timings") val draftTimings: List<Any?>?,
        @JsonProperty("duration") val duration: Int?,
        @JsonProperty("engine") val engine: Int?,
        @JsonProperty("first_blood_time") val firstBloodTime: Int?,
        @JsonProperty("game_mode") val gameMode: Int?,
        @JsonProperty("human_players") val humanPlayers: Int?,
        @JsonProperty("leagueid") val leagueid: Int?,
        @JsonProperty("lobby_type") val lobbyType: Int?,
        @JsonProperty("match_seq_num") val matchSeqNum: String?,
        @JsonProperty("negative_votes") val negativeVotes: Int?,
        @JsonProperty("objectives") val objectives: List<Objective?>?,
        @JsonProperty("picks_bans") val picksBans: List<PicksBan?>?,
        @JsonProperty("positive_votes") val positiveVotes: Int?,
        @JsonProperty("radiant_gold_adv") val radiantGoldAdv: List<Any?>?,
        @JsonProperty("radiant_score") val radiantScore: Int?,
        @JsonProperty("radiant_team_id") val radiantTeamId: Int?,
        @JsonProperty("radiant_win") val radiantWin: Boolean?,
        @JsonProperty("radiant_xp_adv") val radiantXpAdv: List<Any?>?,
        @JsonProperty("skill") val skill: Any?,
        @JsonProperty("start_time") val startTime: Int?,
        @JsonProperty("teamfights") val teamfights: List<Any?>?,
        @JsonProperty("tower_status_dire") val towerStatusDire: Int?,
        @JsonProperty("tower_status_radiant") val towerStatusRadiant: Int?,
        @JsonProperty("version") val version: Int?,
        @JsonProperty("replay_salt") val replaySalt: Int?,
        @JsonProperty("series_id") val seriesId: Int?,
        @JsonProperty("series_type") val seriesType: Int?,
        @JsonProperty("league") val league: League?,
        @JsonProperty("radiant_team") val radiantTeam: RadiantTeam?,
        @JsonProperty("dire_team") val direTeam: DireTeam?,
        @JsonProperty("players") val players: List<Player?>?,
        @JsonProperty("patch") val patch: Int?,
        @JsonProperty("region") val region: Int?,
        @JsonProperty("all_word_counts") val allWordCounts: AllWordCounts?,
        @JsonProperty("my_word_counts") val myWordCounts: MyWordCounts?,
        @JsonProperty("comeback") val comeback: Any?,
        @JsonProperty("stomp") val stomp: Any?,
        @JsonProperty("replay_url") val replayUrl: String?
)

data class Player(
        @JsonProperty("match_id") val matchId: String?,
        @JsonProperty("player_slot") val playerSlot: Int?,
        @JsonProperty("ability_targets") val abilityTargets: Any?,
        @JsonProperty("ability_upgrades_arr") val abilityUpgradesArr: Any?,
        @JsonProperty("ability_uses") val abilityUses: AbilityUses?,
        @JsonProperty("account_id") val accountId: Int?,
        @JsonProperty("actions") val actions: Actions?,
        @JsonProperty("additional_units") val additionalUnits: Any?,
        @JsonProperty("assists") val assists: Int?,
        @JsonProperty("backpack_0") val backpack0: Int?,
        @JsonProperty("backpack_1") val backpack1: Int?,
        @JsonProperty("backpack_2") val backpack2: Int?,
        @JsonProperty("buyback_log") val buybackLog: List<Any?>?,
        @JsonProperty("camps_stacked") val campsStacked: Any?,
        @JsonProperty("creeps_stacked") val creepsStacked: Any?,
        @JsonProperty("damage") val damage: Damage?,
        @JsonProperty("damage_inflictor") val damageInflictor: DamageInflictor?,
        @JsonProperty("damage_inflictor_received") val damageInflictorReceived: Any?,
        @JsonProperty("damage_taken") val damageTaken: DamageTaken?,
        @JsonProperty("damage_targets") val damageTargets: Any?,
        @JsonProperty("deaths") val deaths: Int?,
        @JsonProperty("denies") val denies: Int?,
        @JsonProperty("dn_t") val dnT: Any?,
        @JsonProperty("firstblood_claimed") val firstbloodClaimed: Any?,
        @JsonProperty("gold") val gold: Int?,
        @JsonProperty("gold_per_min") val goldPerMin: Int?,
        @JsonProperty("gold_reasons") val goldReasons: GoldReasons?,
        @JsonProperty("gold_spent") val goldSpent: Int?,
        @JsonProperty("gold_t") val goldT: List<Any?>?,
        @JsonProperty("hero_damage") val heroDamage: Int?,
        @JsonProperty("hero_healing") val heroHealing: Int?,
        @JsonProperty("hero_hits") val heroHits: HeroHits?,
        @JsonProperty("hero_id") val heroId: Int?,
        @JsonProperty("item_0") val item0: Int?,
        @JsonProperty("item_1") val item1: Int?,
        @JsonProperty("item_2") val item2: Int?,
        @JsonProperty("item_3") val item3: Int?,
        @JsonProperty("item_4") val item4: Int?,
        @JsonProperty("item_5") val item5: Int?,
        @JsonProperty("item_uses") val itemUses: ItemUses?,
        @JsonProperty("kill_streaks") val killStreaks: KillStreaks?,
        @JsonProperty("killed") val killed: Killed?,
        @JsonProperty("killed_by") val killedBy: KilledBy?,
        @JsonProperty("kills") val kills: Int?,
        @JsonProperty("kills_log") val killsLog: List<Any?>?,
        @JsonProperty("lane_pos") val lanePos: LanePos?,
        @JsonProperty("last_hits") val lastHits: Int?,
        @JsonProperty("leaver_status") val leaverStatus: Int?,
        @JsonProperty("level") val level: Int?,
        @JsonProperty("lh_t") val lhT: List<Any?>?,
        @JsonProperty("life_state") val lifeState: Any?,
        @JsonProperty("max_hero_hit") val maxHeroHit: MaxHeroHit?,
        @JsonProperty("multi_kills") val multiKills: MultiKills?,
        @JsonProperty("obs") val obs: Obs?,
        @JsonProperty("obs_left_log") val obsLeftLog: Any?,
        @JsonProperty("obs_log") val obsLog: List<Any?>?,
        @JsonProperty("obs_placed") val obsPlaced: Any?,
        @JsonProperty("party_id") val partyId: Any?,
        @JsonProperty("party_size") val partySize: Any?,
        @JsonProperty("performance_others") val performanceOthers: Any?,
        @JsonProperty("permanent_buffs") val permanentBuffs: Any?,
        @JsonProperty("pings") val pings: Int?,
        @JsonProperty("pred_vict") val predVict: Any?,
        @JsonProperty("purchase") val purchase: Purchase?,
        @JsonProperty("purchase_log") val purchaseLog: List<Any?>?,
        @JsonProperty("randomed") val randomed: Any?,
        @JsonProperty("repicked") val repicked: Any?,
        @JsonProperty("roshans_killed") val roshansKilled: Any?,
        @JsonProperty("rune_pickups") val runePickups: Any?,
        @JsonProperty("runes") val runes: kotlin.collections.Map<kotlin.String, kotlin.Int>?,
        @JsonProperty("runes_log") val runesLog: Any?,
        @JsonProperty("sen") val sen: Sen?,
        @JsonProperty("sen_left_log") val senLeftLog: Any?,
        @JsonProperty("sen_log") val senLog: List<Any?>?,
        @JsonProperty("sen_placed") val senPlaced: Any?,
        @JsonProperty("stuns") val stuns: Int?,
        @JsonProperty("teamfight_participation") val teamfightParticipation: Any?,
        @JsonProperty("times") val times: List<Any?>?,
        @JsonProperty("tower_damage") val towerDamage: Int?,
        @JsonProperty("towers_killed") val towersKilled: Any?,
        @JsonProperty("xp_per_min") val xpPerMin: Int?,
        @JsonProperty("xp_reasons") val xpReasons: XpReasons?,
        @JsonProperty("xp_t") val xpT: List<Any?>?,
        @JsonProperty("personaname") val personaname: String?,
        @JsonProperty("name") val name: Any?,
        @JsonProperty("last_login") val lastLogin: Any?,
        @JsonProperty("radiant_win") val radiantWin: Boolean?,
        @JsonProperty("start_time") val startTime: Int?,
        @JsonProperty("duration") val duration: Int?,
        @JsonProperty("cluster") val cluster: Int?,
        @JsonProperty("lobby_type") val lobbyType: Int?,
        @JsonProperty("game_mode") val gameMode: Int?,
        @JsonProperty("is_contributor") val isContributor: Boolean?,
        @JsonProperty("patch") val patch: Int?,
        @JsonProperty("region") val region: Int?,
        @JsonProperty("isRadiant") val isRadiant: Boolean?,
        @JsonProperty("win") val win: Int?,
        @JsonProperty("lose") val lose: Int?,
        @JsonProperty("total_gold") val totalGold: Int?,
        @JsonProperty("total_xp") val totalXp: Int?,
        @JsonProperty("kills_per_min") val killsPerMin: Double?,
        @JsonProperty("kda") val kda: Int?,
        @JsonProperty("abandons") val abandons: Int?,
        @JsonProperty("neutral_kills") val neutralKills: Int?,
        @JsonProperty("tower_kills") val towerKills: Int?,
        @JsonProperty("courier_kills") val courierKills: Int?,
        @JsonProperty("lane_kills") val laneKills: Int?,
        @JsonProperty("hero_kills") val heroKills: Int?,
        @JsonProperty("observer_kills") val observerKills: Int?,
        @JsonProperty("sentry_kills") val sentryKills: Int?,
        @JsonProperty("roshan_kills") val roshanKills: Int?,
        @JsonProperty("necronomicon_kills") val necronomiconKills: Int?,
        @JsonProperty("ancient_kills") val ancientKills: Int?,
        @JsonProperty("buyback_count") val buybackCount: Int?,
        @JsonProperty("observer_uses") val observerUses: Int?,
        @JsonProperty("sentry_uses") val sentryUses: Int?,
        @JsonProperty("is_roaming") val isRoaming: Boolean?,
        @JsonProperty("purchase_time") val purchaseTime: PurchaseTime?,
        @JsonProperty("first_purchase_time") val firstPurchaseTime: FirstPurchaseTime?,
        @JsonProperty("item_win") val itemWin: ItemWin?,
        @JsonProperty("item_usage") val itemUsage: ItemUsage?,
        @JsonProperty("actions_per_min") val actionsPerMin: Int?,
        @JsonProperty("life_state_dead") val lifeStateDead: Int?,
        @JsonProperty("rank_tier") val rankTier: Int?,
        @JsonProperty("cosmetics") val cosmetics: List<Any?>?,
        @JsonProperty("benchmarks") val benchmarks: Benchmarks?
)

class XpReasons

class MultiKills

class KillStreaks

class Sen

data class Benchmarks(
        @JsonProperty("gold_per_min") val goldPerMin: GoldPerMin?,
        @JsonProperty("xp_per_min") val xpPerMin: XpPerMin?,
        @JsonProperty("kills_per_min") val killsPerMin: KillsPerMin?,
        @JsonProperty("last_hits_per_min") val lastHitsPerMin: LastHitsPerMin?,
        @JsonProperty("hero_damage_per_min") val heroDamagePerMin: HeroDamagePerMin?,
        @JsonProperty("hero_healing_per_min") val heroHealingPerMin: HeroHealingPerMin?,
        @JsonProperty("tower_damage") val towerDamage: TowerDamage?,
        @JsonProperty("stuns_per_min") val stunsPerMin: StunsPerMin?,
        @JsonProperty("lhten") val lhten: Lhten?
)

class Lhten

data class LastHitsPerMin(
    @JsonProperty("raw") val raw: Double?,
    @JsonProperty("pct") val pct: Double?
)

data class TowerDamage(
    @JsonProperty("raw") val raw: Int?,
    @JsonProperty("pct") val pct: Double?
)

data class KillsPerMin(
    @JsonProperty("raw") val raw: Double?,
    @JsonProperty("pct") val pct: Double?
)

data class StunsPerMin(
    @JsonProperty("raw") val raw: Int?,
    @JsonProperty("pct") val pct: Double?
)

data class HeroDamagePerMin(
    @JsonProperty("raw") val raw: Double?,
    @JsonProperty("pct") val pct: Double?
)

data class HeroHealingPerMin(
    @JsonProperty("raw") val raw: Int?,
    @JsonProperty("pct") val pct: Double?
)

data class XpPerMin(
    @JsonProperty("raw") val raw: Int?,
    @JsonProperty("pct") val pct: Double?
)

data class GoldPerMin(
    @JsonProperty("raw") val raw: Int?,
    @JsonProperty("pct") val pct: Double?
)

class Damage

class HeroHits

class ItemUsage

class FirstPurchaseTime

class GoldReasons

class AbilityUses

class PurchaseTime

data class MaxHeroHit(
    @JsonProperty("value") val value: Int?
)

class ItemWin

class DamageInflictor

class DamageTaken

class ItemUses

class LanePos

class Actions

class Killed

class Obs

class KilledBy

data class Purchase(
    @JsonProperty("dust") val dust: Any?
)

data class AllWordCounts(
    @JsonProperty("glgl") val glgl: Int?,
    @JsonProperty("hfhf") val hfhf: Int?,
    @JsonProperty("glhf") val glhf: Int?,
    @JsonProperty("gl") val gl: Int?,
    @JsonProperty("hf") val hf: Int?,
    @JsonProperty("gg") val gg: Int?,
    @JsonProperty("grats") val grats: Int?
)

data class DireTeam(
    @JsonProperty("team_id") val teamId: Int?,
    @JsonProperty("name") val name: String?,
    @JsonProperty("tag") val tag: String?,
    @JsonProperty("logo_url") val logoUrl: String?
)

data class League(
    @JsonProperty("leagueid") val leagueid: Int?,
    @JsonProperty("ticket") val ticket: String?,
    @JsonProperty("banner") val banner: String?,
    @JsonProperty("tier") val tier: String?,
    @JsonProperty("name") val name: String?
)

class MyWordCounts

data class PicksBan(
    @JsonProperty("is_pick") val isPick: Boolean?,
    @JsonProperty("hero_id") val heroId: Int?,
    @JsonProperty("team") val team: Int?,
    @JsonProperty("order") val order: Int?,
    @JsonProperty("ord") val ord: Int?,
    @JsonProperty("match_id") val matchId: String?
)

data class RadiantTeam(
    @JsonProperty("team_id") val teamId: Int?,
    @JsonProperty("name") val name: String?,
    @JsonProperty("tag") val tag: String?,
    @JsonProperty("logo_url") val logoUrl: String?
)

class Cosmetics

data class Objective(
    @JsonProperty("time") val time: Int?,
    @JsonProperty("type") val type: String?,
    @JsonProperty("slot") val slot: Int?,
    @JsonProperty("key") val key: String?,
    @JsonProperty("unit") val unit: String?,
    @JsonProperty("team") val team: Int?
)

data class Chat(
    @JsonProperty("time") val time: Int?,
    @JsonProperty("type") val type: String?,
    @JsonProperty("unit") val unit: String?,
    @JsonProperty("key") val key: String?
)