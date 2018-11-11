package com.github.galleyltd.boost.domain

import com.github.galleyltd.boost.domain.service.AccountFeedback
import java.time.Instant

data class CheckResult(
    val accountFeedback: AccountFeedback,
    val checkDate: Instant = Instant.now()
)

data class AccountChecks(
    val checkResults: MutableList<CheckResult> = mutableListOf()
) {
    fun appendCheck(accountFeedback: AccountFeedback) {
        checkResults.add(CheckResult(accountFeedback))
    }
}

enum class SubmitResult {
    ACCEPTED,
    DENIED
}
