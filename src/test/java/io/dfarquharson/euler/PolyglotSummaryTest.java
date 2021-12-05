package io.dfarquharson.euler;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class PolyglotSummaryTest {

    @Test
    void polyglotResultsComparison() {
        assertThat(new io.dfarquharson.euler.java.EulerSummary().get())
                .isEqualTo(new io.dfarquharson.euler.kotlin.EulerSummary().get());
    }

}