package io.dfarquharson.euler.kotlin

import kotlin.test.Test
import kotlin.test.assertEquals

internal class FibonacciTest {

    @Test
    fun `first 10 fibs`() {
        val actual: List<Int> = Fibonacci.fibs()
            .take(10)
            .toList()
        val expected: List<Int> = listOf(1, 2, 3, 5, 8, 13, 21, 34, 55, 89)
        assertEquals(expected, actual)
    }

    @Test
    fun `first even fibs below 10`() {
        val actual = Fibonacci.fibs()
            .takeWhile { it < 10 }
            .filter { it % 2 == 0 }
            .toList()
        val expected = listOf(2, 8)
        assertEquals(expected, actual)
    }

}
