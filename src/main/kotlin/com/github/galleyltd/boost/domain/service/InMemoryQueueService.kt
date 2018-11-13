package com.github.galleyltd.boost.domain.service

import java.util.*
import java.util.concurrent.ConcurrentLinkedQueue

class InMemoryQueueService {
    private val queue: Queue<Long> = ConcurrentLinkedQueue()

    fun submitTask(accountId: Long) {
        queue.offer(accountId)
    }

    fun getNext(): Long? = queue.poll()
}
