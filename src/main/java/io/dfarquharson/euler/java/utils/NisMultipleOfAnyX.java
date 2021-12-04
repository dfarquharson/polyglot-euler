package io.dfarquharson.euler.java.utils;

import java.util.function.BiFunction;
import java.util.stream.Stream;

public class NisMultipleOfAnyX implements BiFunction<Stream<Integer>, Integer, Boolean> {

    @Override
    public Boolean apply(Stream<Integer> xs, Integer n) {
        return xs.anyMatch(x -> n % x == 0);
    }

}
