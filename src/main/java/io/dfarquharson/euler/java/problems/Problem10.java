package io.dfarquharson.euler.java.problems;

import io.dfarquharson.euler.java.utils.Primes;

import java.util.function.Supplier;

public class Problem10 implements Supplier<String> {

    @Override
    public String get() {
        return "Problem 10 result: %d".formatted(
                new Primes()
                        .get()
                        .takeWhile(n -> n < 2_000_000)
                        .sum()
        );
    }

}
