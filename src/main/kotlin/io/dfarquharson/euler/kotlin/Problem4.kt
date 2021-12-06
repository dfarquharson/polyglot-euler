package io.dfarquharson.euler.kotlin

fun main() {
    println(Problem4.run())
}

object Problem4 {

    fun run(): Int {
        return Palindromes.palindromicProductsInRange(start = 100, end = 999).maxOrNull() ?: 0
    }

}

object Palindromes {

    fun isPalindrome(n: Int): Boolean {
        return isPalindrome(n.toString())
    }

    fun isPalindrome(s: String): Boolean {
        return s.reversed() == s
    }

    fun palindromicProductsInRange(start: Int, end: Int): Set<Int> {
        return (start..end)
            .flatMap { x ->
                (start..end).map { y ->
                    x * y
                }
            }.filter {
                isPalindrome(it)
            }.toSet()
    }

}
