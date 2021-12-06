package io.dfarquharson.euler.kotlin

fun main() {
    println(Problem7.run())
}

object Problem7 {

    fun run(): Long {
        return Primes.nthPrime(10_001L)
    }

}
