package io.dfarquharson.euler.kotlin

import org.junit.jupiter.api.DynamicTest
import org.junit.jupiter.api.TestFactory
import kotlin.test.Test
import kotlin.test.assertEquals

internal class PrimesTest {

    @TestFactory
    fun isPrime(): List<DynamicTest> = listOf(
        Pair(12L, false),
        Pair(9L, false),
        Pair(8L, false),
        Pair(2L, true),
        Pair(13195L, false),
        Pair(6857L, true),
        Pair(1L, false),
    ).map { (n: Long, expected: Boolean) ->
        DynamicTest.dynamicTest("$n is ${if (expected) "" else "not "}prime") {
            val actual: Boolean = Primes.isPrime(n)
            assertEquals(expected, actual)
        }
    }

    @TestFactory
    fun `prime factors`(): List<DynamicTest> = listOf(
        Pair(12L, setOf(2L, 3L)),
        Pair(9L, setOf(3L)),
        Pair(8L, setOf(2L)),
        Pair(2L, setOf(2L)),
        Pair(13195L, setOf(5L, 7L, 13L, 29L)),
        Pair(600851475143L, setOf(71L, 839L, 1471L, 6857L))
    ).map { (n: Long, expected: Set<Long>) ->
        DynamicTest.dynamicTest("The prime factors of $n are ${expected.sorted().joinToString(", ")}") {
            val actual: Set<Long> = Primes.primeFactors(n)
            assertEquals(expected, actual)
        }
    }

    @Test
    fun `first ten primes`() {
        val actual: List<Long> = Primes.primes().take(10).toList()
        val expected: List<Long> = listOf(2L, 3L, 5L, 7L, 11L, 13L, 17L, 19L, 23L, 29L)
        assertEquals(expected, actual)
    }

}
