package io.dfarquharson.euler.kotlin

import kotlin.test.Test
import kotlin.test.assertEquals

internal class Problem1Test {

    @Test
    fun `sum of multiples of 3 or 5 below 10`() {
        val actual: Int = Problem1.sumOfMultiplesOf3or5BelowN(10)
        val expected: Int = 23
        assertEquals(expected, actual)
    }

    @Test
    fun `sum of multiples of 3 or 5 below 1000`() {
        val actual: Int = Problem1.sumOfMultiplesOf3or5BelowN(1_000)
        val expected: Int = 233168
        assertEquals(expected, actual)
    }

}