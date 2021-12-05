package io.dfarquharson.euler.java.problems;

import io.dfarquharson.euler.java.utils.PrimeFactors;

import java.util.function.Supplier;

public class Problem3 implements Supplier<String> {

    @Override
    public String get() {
        return "Problem 3 result: %d".formatted(
                new PrimeFactors()
                        .apply(600851475143L)
                        .stream()
                        .mapToLong(x -> x)
                        .max()
                        .orElse(-1L)
        );
    }

    public static void main(String[] args) {
        System.out.println(new Problem3().get());
    }

}
