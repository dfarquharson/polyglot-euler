package io.dfarquharson.euler

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