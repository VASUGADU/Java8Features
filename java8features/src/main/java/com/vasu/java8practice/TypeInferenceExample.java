package com.vasu.java8practice;

public class TypeInferenceExample {

    public static void main(String[] args) {
        IntAddLambda intAddLambda = (x,y) -> x+y;
        System.out.println(intAddLambda.getAddition(10, 40));
    }

    interface IntAddLambda {
        int getAddition(int a, int b);
    }

}
