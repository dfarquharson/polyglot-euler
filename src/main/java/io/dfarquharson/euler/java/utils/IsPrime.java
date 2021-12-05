package io.dfarquharson.euler.java.utils;

import java.util.function.Predicate;

public class IsPrime implements Predicate<Long> {

    @Override
    public boolean test(Long n) {
        return new Factors().apply(n).size() == 2;
    }

}
