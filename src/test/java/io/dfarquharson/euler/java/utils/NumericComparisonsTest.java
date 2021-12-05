package io.dfarquharson.euler.java.utils;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class NumericComparisonsTest {

    @Test
    void longLessThanDouble() {
        Long x = 123L;
        Double y = 123.1;
        assertThat(x < y)
                .isTrue();
    }

    @Test
    void longNotLessThanDouble() {
        long x = 123L;
        double y = 123.1;
        assertThat(x > y)
                .isFalse();
    }

}
