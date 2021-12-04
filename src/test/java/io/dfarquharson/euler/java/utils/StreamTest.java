package io.dfarquharson.euler.java.utils;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.IntStream;

import static org.assertj.core.api.Assertions.assertThat;

class StreamTest {

    @Test
    void streamOfNaturalNumbersTo10() {
        List<Integer> xs = IntStream.iterate(1, n -> n + 1)
                .takeWhile(n -> n <= 10)
                .boxed()
                .toList();
        assertThat(xs).isEqualTo(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
    }

    @Test
    void streamOfNaturalNumbersTo10_alternateIterateSignature_unboxed() {
        int[] xs = IntStream.iterate(1, n -> n <= 10, n -> n + 1).toArray();
        assertThat(xs).isEqualTo(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10});
    }

}
