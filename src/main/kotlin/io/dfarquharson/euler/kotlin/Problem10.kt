package io.dfarquharson.euler.kotlin

fun main() {
    println(Problem10.run())
}

object Problem10 {

    fun run(): Long {
        return Primes.primes().takeWhile { it < 2_000_000 }.sum()
    }

}