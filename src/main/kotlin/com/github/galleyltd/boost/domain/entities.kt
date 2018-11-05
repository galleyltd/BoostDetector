package com.github.galleyltd.boost.domain

import java.time.Instant

data class CheckResult(
    val checkDate: Instant,
    val status: Status
)

data class PlayerChecks(
    val checkResults: List<CheckResult>
)

enum class Status {
    CHECK_IN_PROGRESS,
    SUSPICIOUS,
    CLEAN
}

enum class SubmitResult {
    ACCEPTED,
    DENIED
}
