package io.dfarquharson.euler.kotlin

import kotlin.test.Test
import kotlin.test.assertEquals

internal class Problem4Test {

    @Test
    fun `largest palindrome product in range 100 to 999`() {
        val actual: Int = Problem4.run()
        val expected: Int = 906609
        assertEquals(expected, actual)
    }

}
