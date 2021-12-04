package io.dfarquharson.euler.java.utils;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class PairTest {

    @Test
    void toStringIsAsExpected() {
        assertThat(new Pair<>(1, 3.14).toString())
                .isEqualTo("Pair[a=1, b=3.14]");
    }

    @Test
    void hashCodeIsAsExpected() {
        assertThat(new Pair<>("lol", 1_000_000).hashCode())
                .isEqualTo(4327447);
    }

    @Test
    void equalsIsAsExpected() {
        assertThat(new Pair<>("wut", "wat"))
                .isEqualTo(new Pair<>("wut", "wat"))
                .isNotEqualTo(new Pair<>("wat", "wut"));
    }

    @Test
    void getterMethodForFirstSlotIsAsExpected() {
        assertThat(new Pair<>("first value", "second value").a())
                .isEqualTo("first value");
    }

    @Test
    void getterMethodForSecondSlotIsAsExpected() {
        assertThat(new Pair<>("first value", "second value").b())
                .isEqualTo("second value");
    }

}