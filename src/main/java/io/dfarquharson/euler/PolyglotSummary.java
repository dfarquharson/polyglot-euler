package io.dfarquharson.euler;

import java.util.stream.Stream;

public class PolyglotSummary {

    public static void main(String[] args) {
        Stream.of(
                "Java Results:",
                new io.dfarquharson.euler.java.EulerSummary().get(),
                "Kotlin Results:",
                new io.dfarquharson.euler.kotlin.EulerSummary().get()
        ).forEach(System.out::println);
    }

}
