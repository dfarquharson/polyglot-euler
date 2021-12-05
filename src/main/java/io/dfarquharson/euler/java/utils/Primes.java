package io.dfarquharson.euler.java.utils;

import java.util.function.Supplier;
import java.util.stream.LongStream;

public class Primes implements Supplier<LongStream> {

    @Override
    public LongStream get() {
        return LongStream.iterate(2L, n -> n + 1)
                .filter(n -> new IsPrime().test(n));
    }

}
