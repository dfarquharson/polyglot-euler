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
        ).joinToString(separator = "\n")
    }

}
