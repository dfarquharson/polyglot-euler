package io.dfarquharson.euler.java.problems;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class Problem1Test {

    @Test
    void resultStringAsExpected() {
        assertThat(new Problem1().get())
                .isEqualTo("Problem 1 result: 233168");
    }

}