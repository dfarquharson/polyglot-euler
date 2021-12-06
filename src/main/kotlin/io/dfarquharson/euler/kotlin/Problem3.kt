package io.dfarquharson.euler.kotlin

import kotlin.math.ceil
import kotlin.math.sqrt

fun main() {
    println(Problem3.run())
}

object Problem3 {

    fun run(): Long {
        return Primes.primeFactors(600851475143).maxOrNull() ?: 0L
    }

}

object Primes {

    fun primes(): Sequence<Long> = generateSequence(1L) { n ->
        n + 1L
    }.filter { isPrime(it) }

    fun isPrime(n: Long): Boolean {
        return Factors.factors(n).size == 2
    }

    fun primeFactors(n: Long): Set<Long> {
        return Factors.factors(n)
            .filter { isPrime(it) }
            .toSet()
    }

}

object Factors {

    fun factors(n: Long): Set<Long> {
        return (1L..ceil(sqrt(n.toDouble())).toLong())
            .filter {
                n % it == 0L
            }.flatMap {
                setOf(it, n / it)
            }.toSet()
    }

}
