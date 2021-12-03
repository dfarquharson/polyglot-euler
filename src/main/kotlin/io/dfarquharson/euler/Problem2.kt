package io.dfarquharson.euler

fun main() {
    println(Problem2.run())
}

object Problem2 {

    fun sumOfEvenFibsAtOrBelowN(n: Int): Int {
        return Fibonacci.fibs()
            .takeWhile { it <= n }
            .filter { isEven(it) }
            .sum()
    }

    fun isEven(n: Int): Boolean {
        return n % 2 == 0
    }

    fun run(): Int {
        return sumOfEvenFibsAtOrBelowN(4_000_000)
    }

}

object Fibonacci {

    fun fibs() = sequence<Int> {
        var elements: Pair<Int, Int> = Pair(1, 2)
        while (true) {
            yield(elements.first)
            elements = Pair(elements.second, elements.first + elements.second)
        }
    }

}