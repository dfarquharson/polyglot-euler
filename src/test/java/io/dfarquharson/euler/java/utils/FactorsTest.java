package io.dfarquharson.euler.java.utils;

import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.TestFactory;

import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class FactorsTest {

    @TestFactory
    Stream<DynamicTest> factorsOfN() {
        return Stream.of(
                new Pair<>(12L, Set.of(1L, 2L, 3L, 4L, 6L, 12L)),
                new Pair<>(9L, Set.of(1L, 3L, 9L)),
                new Pair<>(8L, Set.of(1L, 2L, 4L, 8L)),
                new Pair<>(2L, Set.of(1L, 2L)),
                new Pair<>(13195L, Set.of(
                        1L,
                        5L,
                        7L,
                        13L,
                        29L,
                        35L,
                        65L,
                        91L,
                        145L,
                        203L,
                        377L,
                        455L,
                        1015L,
                        1885L,
                        2639L,
                        13195L
                )),
                new Pair<>(6857L, Set.of(1L, 6857L))
        ).map(p -> DynamicTest.dynamicTest(
                "The factors of %d are %s".formatted(
                        p.a(),
                        p.b()
                                .stream()
                                .sorted()
                                .map(Object::toString)
                                .collect(Collectors.joining(", "))
                ),
                () -> assertThat(new Factors().apply(p.a()))
                        .isEqualTo(p.b())
        ));
    }

}
