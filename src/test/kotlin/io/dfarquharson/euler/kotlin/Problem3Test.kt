package io.dfarquharson.euler.kotlin

import kotlin.test.Test
import kotlin.test.assertEquals

internal class Problem3Test {

    @Test
    fun `largest prime factor of 600851475143`() {
        val actual: Long = Problem3.run()
        val expected: Long = 6857L
        assertEquals(expected, actual)
    }

}
