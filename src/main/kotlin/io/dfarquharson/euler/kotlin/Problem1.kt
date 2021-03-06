package io.dfarquharson.euler.kotlin

fun main() {
    println(Problem1.run())
}

object Problem1 {

    fun sumOfMultiplesOf3or5BelowN(n: Int): Int {
        val multiples = Multiples(listOf(3, 5))
        return generateSequence(1) { it + 1 }
            .take(n - 1)
            .filter { multiples.isCleanMultiple(it) }
            .sum()
    }

    fun run(): Int {
        return sumOfMultiplesOf3or5BelowN(1_000)
    }

}

class Multiples(private val multiples: List<Int>) {
    fun isCleanMultiple(n: Int): Boolean {
        return multiples
            .map { n % it == 0 }
            .any { it }
    }
}
