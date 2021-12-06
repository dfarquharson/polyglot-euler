package io.dfarquharson.euler.java.utils;

import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.TestFactory;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class IsPalindromeTest {

    @TestFactory
    Stream<DynamicTest> isPalindrome() {
        return Stream.of(
                new Pair<>(1L, true),
                new Pair<>(10L, false),
                new Pair<>(11L, true),
                new Pair<>(121L, true),
                new Pair<>(123L, false),
                new Pair<>(9009L, true),
                new Pair<>(906609L, true)
        ).map(p -> DynamicTest.dynamicTest("%d is%s a palindrome".formatted(
                        p.a(),
                        p.b() ? "" : " not"
                ),
                () -> assertThat(new IsPalindrome().test(p.a()))
                        .isEqualTo(p.b())
        ));
    }

}
