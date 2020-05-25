package com.vasu.javastreams;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class JavaStreamsExample1 {

    public static void main(String[] args) {
        // 1. Integer Stream
        IntStream.range(1, 10).forEach(System.out::print);
        System.out.println();

        // 2. Integer Stream with skip
        IntStream.range(1, 10).skip(5).forEach(x -> System.out.println(x));

        // 3. Integer stream with sum
        System.out.println(IntStream.range(1, 10).sum());

        // 4. Sort array of elements
        Stream.of( "Ava", "Alvin", "Alberto").sorted().findFirst().ifPresent(System.out::println);

        // 5. Stream from Array, sort, filter and print
        String[] strArray = {"Ava", "Alvin", "Alberto", "Siva", "Santu", "Sams"};
        Arrays.stream(strArray).filter(p -> p.startsWith("S")).forEach(p -> System.out.println(p));
    }
}
