package com.github.galleyltd.boost.domain.util

class ExecutionCounter(private val executionsBeforeDefault: Int = 5) {
    private var executionsCount = 0

    fun shouldExecuteDefault(): Boolean {
        return if (executionsCount == 0) {
            executionsCount++
            true
        } else {
            executionsCount++
            if (executionsCount == executionsBeforeDefault) {
                executionsCount = 0
            }
            false
        }
    }
}
