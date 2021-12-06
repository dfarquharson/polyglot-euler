package io.dfarquharson.euler.kotlin

import org.junit.jupiter.api.DynamicTest
import org.junit.jupiter.api.TestFactory
import kotlin.test.assertEquals

internal class FactorsTest {

    @TestFactory
    fun `multiples of 3 or 5`(): List<DynamicTest> = listOf(
        Pair(12L, setOf(1L, 2L, 3L, 4L, 6L, 12L)),
        Pair(9L, setOf(1L, 3L, 9L)),
        Pair(8L, setOf(1L, 2L, 4L, 8L)),
        Pair(2L, setOf(1L, 2L)),
        Pair(13195L, setOf(1L, 5L, 7L, 13L, 29L, 35L, 65L, 91L, 145L, 203L, 377L, 455L, 1015L, 1885L, 2639L, 13195L)),
        Pair(6857L, setOf(1L, 6857L)),
    ).map { (n: Long, expected: Set<Long>) ->
        DynamicTest.dynamicTest("The factors of $n are ${expected.sorted().joinToString(", ")}") {
            val actual: Set<Long> = Factors.factors(n)
            assertEquals(expected, actual)
        }
    }

}
