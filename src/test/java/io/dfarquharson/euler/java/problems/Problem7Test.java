package io.dfarquharson.euler.java.problems;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class Problem7Test {

    @Test
    void resultStringAsExpected() {
        assertThat(new Problem7().get())
                .isEqualTo("Problem 7 result: 104743");
    }

}
