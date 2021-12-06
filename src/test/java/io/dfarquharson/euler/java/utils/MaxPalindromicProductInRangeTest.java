package io.dfarquharson.euler.java.utils;

import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.TestFactory;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class MaxPalindromicProductInRangeTest {

    @TestFactory
    Stream<DynamicTest> maxPalindromicProductInRange() {
        return Stream.of(
                new Triple<>(10L, 100L, 9009L),
                new Triple<>(100L, 1000L, 906609L)
        ).map(t -> DynamicTest.dynamicTest(
                "Max palindromic product in range from %d to %d is %d".formatted(t.a(), t.b(), t.c()),
                () -> assertThat(new MaxPalindromicProductInRange().apply(t.a(), t.b()))
                        .isEqualTo(t.c())
        ));
    }

}
