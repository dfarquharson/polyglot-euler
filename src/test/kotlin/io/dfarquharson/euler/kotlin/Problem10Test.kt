package io.dfarquharson.euler.kotlin

import kotlin.test.Ignore
import kotlin.test.Test
import kotlin.test.assertEquals

internal class Problem10Test {

    @Ignore("Massively slow (~5 seconds)") // TODO: tag slow tests, and include them in full run, but don't slow down TDD loop
    @Test
    fun `sum of all primes below 2 million`() {
        val actual: Long = Problem10.run()
        val expected: Long = 142913828922L
        assertEquals(expected, actual)
    }

}
