package io.dfarquharson.euler.java.utils;

import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.TestFactory;

import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class PrimeFactorsTest {

    @TestFactory
    Stream<DynamicTest> factorsOfN() {
        return Stream.of(
                new Pair<>(12L, Set.of(2L, 3L)),
                new Pair<>(9L, Set.of(3L)),
                new Pair<>(8L, Set.of(2L)),
                new Pair<>(2L, Set.of(2L)),
                new Pair<>(13195L, Set.of(5L, 7L, 13L, 29L)),
                new Pair<>(600851475143L, Set.of(71L, 839L, 1471L, 6857L))
        ).map(p -> DynamicTest.dynamicTest(
                "Prime factors of %d are %s".formatted(
                        p.a(),
                        p.b()
                                .stream()
                                .sorted()
                                .map(Object::toString)
                                .collect(Collectors.joining(", "))
                ),
                () -> assertThat(new PrimeFactors().apply(p.a()))
                        .isEqualTo(p.b())
        ));
    }

}