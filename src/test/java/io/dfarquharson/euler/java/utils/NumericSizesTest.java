package io.dfarquharson.euler.java.utils;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class NumericSizesTest {

    @Test
    void largestInteger() {
        assertThat(Integer.MAX_VALUE)
                .isEqualTo(2_147_483_647);
    }

    @Test
    void smallestInteger() {
        assertThat(Integer.MIN_VALUE)
                .isEqualTo(-2_147_483_648);
    }

    @Test
    void largestLong() {
        assertThat(Long.MAX_VALUE)
                .isEqualTo(9_223_372_036_854_775_807L);
    }

    @Test
    void smallestLong() {
        assertThat(Long.MIN_VALUE)
                .isEqualTo(-9_223_372_036_854_775_808L);
    }

}
