package io.dfarquharson.euler.java.utils;

import java.util.function.IntSupplier;
import java.util.function.Supplier;
import java.util.stream.IntStream;

public class FibonacciSequence implements Supplier<IntStream> {

    private static class FibonacciSupplier implements IntSupplier {

        private int previous = 0;
        private int current = 1;

        @Override
        public int getAsInt() {
            int result = previous + current;
            previous = current;
            current = result;
            return result;
        }
    }

    @Override
    public IntStream get() {
        return IntStream.generate(new FibonacciSupplier());
    }

}
