package io.dfarquharson.euler.java.utils;

import java.util.function.BiFunction;
import java.util.stream.LongStream;

public class MaxPalindromicProductInRange implements BiFunction<Long, Long, Long> {

    @Override
    public Long apply(Long x, Long y) {
        return LongStream.range(x, y)
                .flatMap(i -> LongStream.range(x, y).map(j -> i * j))
                .filter(n -> new IsPalindrome().test(n))
                .max()
                .orElse(0L);
    }

}
