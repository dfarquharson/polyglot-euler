package io.dfarquharson.euler.java.problems;

import io.dfarquharson.euler.java.utils.Primes;

import java.util.function.Supplier;

public class Problem7 implements Supplier<String> {

    @Override
    public String get() {
        return "Problem 7 result: %d".formatted(
                new Primes()
                        .get()
                        .limit(10_001)
                        .reduce((a, b) -> b)
                        .orElse(0L)
        );
    }

    public static void main(String[] args) {
        System.out.println(new Problem7().get());
    }

}
