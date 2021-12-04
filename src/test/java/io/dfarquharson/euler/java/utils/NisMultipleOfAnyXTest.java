package io.dfarquharson.euler.java.utils;

import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestFactory;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class NisMultipleOfAnyXTest {

    @Test
    void fourIsMultipleOfTwo() {
        assertThat(new NisMultipleOfAnyX().apply(Stream.of(2), 4))
                .isTrue();
    }

    @TestFactory
    Stream<DynamicTest> nIsMultipleOfAnyX() {
        return Stream.of(
                new Pair<>(10, true),
                new Pair<>(9, true),
                new Pair<>(8, false)
        ).map(p -> DynamicTest.dynamicTest(
                "%d should be multiple of 3 or 5".formatted(p.a()),
                () -> assertThat(new NisMultipleOfAnyX().apply(Stream.of(3, 5), p.a()))
                        .isEqualTo(p.b())
        ));
    }

}