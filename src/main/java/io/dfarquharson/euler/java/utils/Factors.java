package io.dfarquharson.euler.java.utils;

import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class Factors implements Function<Long, Set<Long>> {

    @Override
    public Set<Long> apply(Long n) {
        return LongStream.range(1, Double.valueOf(
                        Math.ceil(
                                Math.sqrt(n.doubleValue())
                        )).longValue() + 1L)
                .filter(x -> n % x == 0)
                .boxed()
                .flatMap(x -> Stream.of(x, n / x))
                .collect(Collectors.toSet());
    }

}
