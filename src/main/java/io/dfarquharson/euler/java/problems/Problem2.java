package io.dfarquharson.euler.java.problems;

import io.dfarquharson.euler.java.utils.FibonacciSequence;

import java.util.function.Supplier;

public class Problem2 implements Supplier<String> {

    @Override
    public String get() {
        return "Problem 2 result: %d".formatted(
                new FibonacciSequence()
                        .get()
                        .filter(x -> x % 2 == 0)
                        .takeWhile(x -> x < 4_000_000)
                        .sum()
        );
    }

    public static void main(String[] args) {
        System.out.println(new Problem2().get());
    }

}
