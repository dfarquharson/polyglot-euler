package io.dfarquharson.euler

import kotlin.test.Test
import kotlin.test.assertEquals

internal class Problem2Test {

    @Test
    fun `sum of even fibs below 4 million`() {
        val actual: Int = Problem2.sumOfEvenFibsAtOrBelowN(4_000_000)
        val expected: Int = 4613732
        assertEquals(expected, actual)
    }

}