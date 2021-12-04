package io.dfarquharson.euler.java;

import io.dfarquharson.euler.java.problems.Problem1;
import io.dfarquharson.euler.java.problems.Problem2;

import java.util.function.Supplier;
import java.util.stream.Stream;

public class EulerSummary {

    public static void main(String[] args) {
        Stream.of(
                        new Problem1(),
                        new Problem2()
                ).map(Supplier::get)
                .forEach(System.out::println);
    }

}
