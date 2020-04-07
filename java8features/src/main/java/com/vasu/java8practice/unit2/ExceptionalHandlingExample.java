package com.vasu.java8practice.unit2;

import java.util.function.BiConsumer;

public class ExceptionalHandlingExample {

    public static void main(String[] args) {

        int[] someNumbers = {1, 2, 3, 4, 5};
        int key = 0;
        process(someNumbers, key, (v, k) -> {
            try {
                System.out.println(v / k);
            } catch (ArithmeticException ae) {
                System.out.println("An Arithmetic Exception happened");
            }
        });
    }

    private static void process(int[] someNumbers, int key, BiConsumer<Integer, Integer> biConsumer) {
        for ( int i: someNumbers ) {
            biConsumer.accept(i, key);
        }
    }

}
