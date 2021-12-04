package io.dfarquharson.euler.java.utils;

import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.TestFactory;

import java.util.Set;
import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class SumOfMultiplesOfAnyXinXsBelowNTest {

    @TestFactory
    Stream<DynamicTest> sumOfMultiplesOf3or5BelowN() {
        return Stream.of(
                new Pair<>(10, 23),
                new Pair<>(1_000, 233168)
        ).map(p -> DynamicTest.dynamicTest(
                "sum of multiples of 3 or 5 below %d should be %d".formatted(p.a(), p.b()),
                () -> assertThat(new SumOfMultiplesOfAnyXinXsBelowN().apply(Set.of(3, 5), p.a()))
                        .isEqualTo(p.b())
        ));
    }

}