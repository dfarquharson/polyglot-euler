package io.dfarquharson.euler.java.problems;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class Problem2Test {

    @Test
    void resultStringAsExpected() {
        assertThat(new Problem2().get())
                .isEqualTo("Problem 2 result: 4613732");
    }

}