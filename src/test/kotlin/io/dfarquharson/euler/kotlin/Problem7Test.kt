package io.dfarquharson.euler.kotlin

import kotlin.test.Test
import kotlin.test.assertEquals

internal class Problem7Test {

    @Test
    fun `10,001st prime number`() {
        val actual: Long = Problem7.run()
        val expected: Long = 104743L
        assertEquals(expected, actual)
    }

}
