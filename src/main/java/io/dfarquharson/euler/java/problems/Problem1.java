package io.dfarquharson.euler.java.problems;

import io.dfarquharson.euler.java.utils.SumOfMultiplesOfAnyXinXsBelowN;

import java.util.Set;
import java.util.function.Supplier;

public class Problem1 implements Supplier<String> {

    @Override
    public String get() {
        return "Problem 1 result: %d".formatted(
                new SumOfMultiplesOfAnyXinXsBelowN()
                        .apply(Set.of(3, 5), 1_000)
        );
    }

    public static void main(String[] args) {
        System.out.println(new Problem1().get());
    }

}
