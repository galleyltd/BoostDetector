package com.github.galleyltd.boost.service

import com.github.galleyltd.boost.FakeService
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class FakeTest {
    @Test
    fun some() {
        val fakeService = FakeService()
        assertEquals(3, fakeService.sum(1, 2))
    }
}
