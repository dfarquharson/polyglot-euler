package io.dfarquharson.euler.java.problems;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class Problem3Test {

    @Test
    void resultStringAsExpected() {
        assertThat(new Problem3().get())
                .isEqualTo("Problem 3 result: 6857");
    }

}
