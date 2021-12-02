package io.dfarquharson.euler

fun main() {
    listOf(
        "Problem 1 result: ${Problem1.run()}",
        "Problem 2 result: ${Problem2.run()}",
    ).map { println(it) }
}
