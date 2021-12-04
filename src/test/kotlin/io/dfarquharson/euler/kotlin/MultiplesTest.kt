package io.dfarquharson.euler.kotlin

import org.junit.jupiter.api.DynamicTest
import org.junit.jupiter.api.TestFactory
import kotlin.test.assertEquals

internal class MultiplesTest {

    @TestFactory
    fun `multiples of 3 or 5`() = listOf(
        Pair(10, true),
        Pair(9, true),
        Pair(8, false),
    ).map { (n: Int, expected: Boolean) ->
        DynamicTest.dynamicTest("$n should ${if (expected) "" else "not"} be multiple of 3 or 5") {
            val actual: Boolean = Multiples(listOf(3, 5)).isCleanMultiple(n)
            assertEquals(expected, actual)
        }
    }

}