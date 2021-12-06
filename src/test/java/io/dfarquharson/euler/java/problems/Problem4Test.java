package io.dfarquharson.euler.java.problems;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class Problem4Test {

    @Test
    void resultStringAsExpected() {
        assertThat(new Problem4().get())
                .isEqualTo("Problem 4 result: 906609");
    }

}
