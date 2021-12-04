package io.dfarquharson.euler.kotlin

import kotlin.test.Test
import kotlin.test.assertEquals

private class TestInfiniteSequenceGeneration {

    @Test
    fun `seed included in sequence generated via generateSequence`() {
        val actual: List<Int> = generateSequence(1) { it + 1 }
            .take(10)
            .toList()
        val expected: List<Int> = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
        assertEquals(expected, actual)
    }

}