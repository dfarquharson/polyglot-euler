package io.dfarquharson.euler.java.utils;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class FibonacciSequenceTest {

    @Test
    void firstTenFibs() {
        int[] fibs = new FibonacciSequence()
                .get()
                .limit(10)
                .toArray();
        assertThat(fibs)
                .isEqualTo(new int[]{1, 2, 3, 5, 8, 13, 21, 34, 55, 89});
    }

    @Test
    void sumOfFibsBelow100() {
        int actual = new FibonacciSequence()
                .get()
                .takeWhile(n -> n < 100)
                .sum();
        assertThat(actual)
                .isEqualTo(231);
    }

    @Test
    void sumOfEvenFibsBelow100() {
        int actual = new FibonacciSequence()
                .get()
                .filter(x -> x % 2 == 0)
                .takeWhile(x -> x < 100)
                .sum();
        assertThat(actual)
                .isEqualTo(44);
    }

    @Test
    void sumOfOddFibsBelow100() {
        int actual = new FibonacciSequence()
                .get()
                .filter(x -> x % 2 != 0)
                .takeWhile(x -> x < 100)
                .sum();
        assertThat(actual)
                .isEqualTo(187);
    }

    @Test
    void sumOfEvenFibsBelowFourMillion() {
        int actual = new FibonacciSequence()
                .get()
                .filter(x -> x % 2 == 0)
                .takeWhile(x -> x < 4_000_000)
                .sum();
        assertThat(actual)
                .isEqualTo(4613732);
    }

}