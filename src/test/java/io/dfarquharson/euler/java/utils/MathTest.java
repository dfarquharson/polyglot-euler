package io.dfarquharson.euler.java.utils;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class MathTest {

    @Test
    void sqrt4() {
        double x = Math.sqrt(4.0);
        assertThat(x)
                .isEqualTo(2.0);
    }

    @Test
    void sqrt2() {
        double x = Math.sqrt(2.0);
        assertThat(x)
                .isEqualTo(1.4142135623730951);
    }

    @Test
    void ceilSqrt2() {
        Integer x = Double.valueOf(Math.ceil(Math.sqrt(2.0))).intValue();
        assertThat(x)
                .isEqualTo(2);
    }

}
