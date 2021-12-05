package io.dfarquharson.euler.java.utils;

import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class PrimeFactors implements Function<Long, Set<Long>> {

    @Override
    public Set<Long> apply(Long n) {
        return new Factors().apply(n)
                .stream()
                .filter(x -> new IsPrime().test(x))
                .collect(Collectors.toSet());
    }

}
