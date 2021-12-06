package io.dfarquharson.euler.java;

import io.dfarquharson.euler.java.problems.Problem1;
import io.dfarquharson.euler.java.problems.Problem2;
import io.dfarquharson.euler.java.problems.Problem3;

import java.util.function.Supplier;
import java.util.stream.Stream;

public class EulerSummary implements Supplier<String> {

    @Override
    public String get() {
        return String.join("\n", Stream.of(
                new Problem1(),
                new Problem2(),
                new Problem3()
        ).map(Supplier::get).toList());
    }

    public static void main(String[] args) {
        System.out.println(new EulerSummary().get());
    }

}
