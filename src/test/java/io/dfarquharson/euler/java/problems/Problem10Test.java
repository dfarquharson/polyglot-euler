package io.dfarquharson.euler.java.problems;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class Problem10Test {

    @Test
    void resultStringAsExpected() {
        assertThat(new Problem10().get())
                .isEqualTo("Problem 10 result: 142913828922");
    }

}
