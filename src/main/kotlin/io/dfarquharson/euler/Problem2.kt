package io.dfarquharson.euler

fun main() {
    println(Problem2.sumOfEvenFibsAtOrBelowN(4_000_000))
}

object Problem2 {

    fun sumOfEvenFibsAtOrBelowN(n: Int): Int {
        return Fibonacci.fibs()
            .takeWhile { it <= n }
            .filter { it % 2 == 0 }
            .sum()
    }

}

object Fibonacci {

    fun fibs() = sequence<Int> {
        var elements = Pair(1, 2)
        while (true) {
            yield(elements.first)
            elements = Pair(elements.second, elements.first + elements.second)
        }
    }

}