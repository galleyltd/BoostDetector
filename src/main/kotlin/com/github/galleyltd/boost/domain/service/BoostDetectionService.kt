package com.github.galleyltd.boost.domain.service

import com.github.galleyltd.boost.domain.AccountChecks
import com.github.galleyltd.boost.domain.util.NotFoundException

class BoostDetectionService(
    private val dataService: DataService,
    private val queueService: InMemoryQueueService
) {
    fun submitAccountCheck(accountId: Long) {
        queueService.submitTask(accountId)
    }

    fun getAccountChecks(accountId: Long): AccountChecks {
        return dataService.getAccountChecks(accountId) ?: throw NotFoundException()
    }
}
