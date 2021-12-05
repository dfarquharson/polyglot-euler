package io.dfarquharson.euler.java.utils;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class PrimesTest {

    @Test
    void firstTenPrimes() {
        long[] xs = new Primes().get().limit(10).toArray();
        assertThat(xs)
                .isEqualTo(new long[]{2L, 3L, 5L, 7L, 11L, 13L, 17L, 19L, 23L, 29L});
    }

}