package io.dfarquharson.euler.java.utils;

import java.util.Set;
import java.util.function.BiFunction;
import java.util.stream.IntStream;

public class SumOfMultiplesOfAnyXinXsBelowN implements BiFunction<Set<Integer>, Integer, Integer> {

    @Override
    public Integer apply(Set<Integer> xs, Integer n) {
        return IntStream.iterate(1, i -> i + 1)
                .takeWhile(i -> i < n)
                .filter(i -> new NisMultipleOfAnyX().apply(xs.stream(), i))
                .sum();
    }

}
