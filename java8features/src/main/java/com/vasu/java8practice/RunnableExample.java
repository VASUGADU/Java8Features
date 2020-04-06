package com.vasu.java8practice;

public class RunnableExample {

    public static void main(String[] args) {

        Thread myThread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Printed from inside runnable");
            }
        });

        myThread.run();

        Runnable lambdaRunnable = () -> System.out.println("Printed from inside lambda runnable");
        Thread lambdaThread = new Thread(() -> System.out.println("Printed from inside lambda thread"));
        lambdaRunnable.run();
        lambdaThread.run();
    }
}
