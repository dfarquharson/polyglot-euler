package io.dfarquharson.euler.java.problems;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class Problem10Test {

    @Disabled("Massively slow (~5 seconds), and redundant, because this is already caught in PolyglotSummaryTest")
    @Test
    void resultStringAsExpected() {
        assertThat(new Problem10().get())
                .isEqualTo("Problem 10 result: 142913828922");
    }

}
