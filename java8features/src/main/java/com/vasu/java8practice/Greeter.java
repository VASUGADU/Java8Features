package com.vasu.java8practice;

public class Greeter {

    public void greet (Greeting greeting) {
        greeting.perform();
    }

    public static void main(String[] args) {
        Greeter greeter = new Greeter();
        Greeting greetingLambda = () -> System.out.println("Hello World..!!");
        Greeting innerClassGreeting = new Greeting() {
            @Override
            public void perform() {
                System.out.println("Hello World..!!");
            }
        };
        greeter.greet(greetingLambda);
        greeter.greet(innerClassGreeting);

        StringLengthLambda stringLengthLambda = s -> s.length();
        System.out.println(stringLengthLambda.perform("What is the length of a String"));

    }

    public interface StringLengthLambda {
        int perform(String s);
    }
}
