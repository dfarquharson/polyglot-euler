package io.dfarquharson.euler.kotlin

import java.util.function.Supplier

fun main() {
    println(EulerSummary().get())
}


class EulerSummary : Supplier<String> {

    override fun get(): String {
        return listOf(
            "Problem 1 result: ${Problem1.run()}",
            "Problem 2 result: ${Problem2.run()}",
            "Problem 3 result: ${Problem3.run()}",
            "Problem 4 result: ${Problem4.run()}",
            "Problem 7 result: ${Problem7.run()}",
            "Problem 10 result: ${Problem10.run()}",
        ).joinToString(separator = "\n")
    }

}
