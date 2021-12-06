package io.dfarquharson.euler.kotlin

import kotlin.test.Ignore
import kotlin.test.Test
import kotlin.test.assertEquals

private class TestSanity {

    @Test
    fun `1 does in fact equal 1`() {
        assertEquals(1, 1)
    }

    @Ignore
    @Test
    fun `1 also equals 2 (lol intentional fail)`() {
        assertEquals(1, 2)
    }

}
