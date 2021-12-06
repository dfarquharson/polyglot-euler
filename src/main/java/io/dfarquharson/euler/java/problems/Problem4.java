package io.dfarquharson.euler.java.problems;

import io.dfarquharson.euler.java.utils.MaxPalindromicProductInRange;

import java.util.function.Supplier;

public class Problem4 implements Supplier<String> {

    @Override
    public String get() {
        return "Problem 4 result: %d".formatted(
                new MaxPalindromicProductInRange().apply(100L, 1_000L)
        );
    }

    public static void main(String[] args) {
        System.out.println(new Problem4().get());
    }

}
