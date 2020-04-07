package com.vasu.java8practice.unit2;

import java.util.function.BiConsumer;

public class EceptionalHandlingExample2 {
    public static void main(String[] args) {

        int[] someNumbers = {1, 2, 3, 4, 5};
        int key = 2;
        process(someNumbers, key, (v, k) -> System.out.println(v / k));

    }

    private static void process(int[] someNumbers, int key, BiConsumer<Integer, Integer> biConsumer) {
        for ( int i: someNumbers ) {
            biConsumer.accept(i, key);
        }
    }

    private BiConsumer<Integer, Integer> wrapperLambda(BiConsumer<Integer, Integer> biConsumer) {
        return (v, k) -> {
            try {
                biConsumer.accept(v, k);
            } catch (ArithmeticException ae) {
                System.out.println("An Arithmetic Exception caught in wrapper lambda");
            }
        };
    }
}
