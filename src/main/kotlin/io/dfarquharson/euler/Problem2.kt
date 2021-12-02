package io.dfarquharson.euler

fun main() {
    println(Problem2.run())
}

object Problem2 {

    fun sumOfEvenFibsAtOrBelowN(n: Int): Int {
        return Fibonacci.fibs()
            .takeWhile { it <= n }
            .filter { it % 2 == 0 }
            .sum()
    }

    fun run(): Int {
        return sumOfEvenFibsAtOrBelowN(4_000_000)
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