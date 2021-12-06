package io.dfarquharson.euler.kotlin

import org.junit.jupiter.api.DynamicTest
import org.junit.jupiter.api.TestFactory
import kotlin.test.assertEquals

internal class PalindromesTest {

    @TestFactory
    fun `isPalindrome Strings`(): List<DynamicTest> = listOf(
        Pair("wow", true),
        Pair("mom", true),
        Pair("dog", false),
        Pair("a man a plan a canal panama".replace(oldValue = " ", newValue = ""), true),
    ).map { (s: String, expected: Boolean) ->
        DynamicTest.dynamicTest("$s is ${if (expected) "" else "not "}a palindrome") {
            val actual: Boolean = Palindromes.isPalindrome(s)
            assertEquals(expected, actual)
        }
    }

    @TestFactory
    fun `isPalindrome Numbers`(): List<DynamicTest> = listOf(
        Pair(1, true),
        Pair(101, true),
        Pair(123, false),
        Pair(222, true),
        Pair(9009, true),
        Pair(906609, true),
    ).map { (n: Int, expected: Boolean) ->
        DynamicTest.dynamicTest("$n is ${if (expected) "" else "not "}a palindrome") {
            val actual: Boolean = Palindromes.isPalindrome(n)
            assertEquals(expected, actual)
        }
    }

    @TestFactory
    fun `palindromic products in range`(): List<DynamicTest> = listOf(
        Triple(10, 20, setOf(121, 252, 272, 323)),
        Triple(100, 120, setOf(10201, 11211, 12321)),
    ).map { (x: Int, y: Int, expected: Set<Int>) ->
        DynamicTest.dynamicTest(
            "Palindromic products in range from $x to $y are ${
                expected.sorted().joinToString(", ")
            }"
        ) {
            val actual: Set<Int> = Palindromes.palindromicProductsInRange(start = x, end = y)
            assertEquals(expected, actual)
        }
    }

    @TestFactory
    fun `maximum palindromic product in range`(): List<DynamicTest> = listOf(
        Triple(10, 20, 323),
        Triple(10, 99, 9009),
        Triple(100, 999, 906609),
    ).map { (x: Int, y: Int, expected: Int) ->
        DynamicTest.dynamicTest("Max palindromic product in range from $x to $y is $expected") {
            val actual: Int = Palindromes.palindromicProductsInRange(start = x, end = y).maxOrNull() ?: 0
            assertEquals(expected, actual)
        }
    }

}
