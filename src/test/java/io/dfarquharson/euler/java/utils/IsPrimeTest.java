package io.dfarquharson.euler.java.utils;

import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.TestFactory;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class IsPrimeTest {

    @TestFactory
    Stream<DynamicTest> factorsOfN() {
        return Stream.of(
                new Pair<>(12L, false),
                new Pair<>(9L, false),
                new Pair<>(8L, false),
                new Pair<>(2L, true),
                new Pair<>(13195L, false),
                new Pair<>(5L, true),
                new Pair<>(6857L, true),
                new Pair<>(1L, false)
        ).map(p -> DynamicTest.dynamicTest(
                "%d is%sprime".formatted(
                        p.a(),
                        p.b() ? " " : " not "
                ),
                () -> assertThat(new IsPrime().test(p.a()))
                        .isEqualTo(p.b())
        ));
    }

}
