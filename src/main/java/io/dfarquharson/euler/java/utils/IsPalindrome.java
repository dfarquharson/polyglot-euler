package io.dfarquharson.euler.java.utils;

import java.util.function.Predicate;

public class IsPalindrome implements Predicate<Long> {

    @Override
    public boolean test(Long n) {
        return n.toString().equals(
                new StringBuilder(n.toString())
                        .reverse()
                        .toString()
        );
    }

}
