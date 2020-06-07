package com.vasu.interviewquestions;

public class StackInJava {
    private int array[];
    private int top;
    private int capacity;

    public StackInJava(int capacity) {
        this.array = new int[capacity];
        this.top = -1;
        this.capacity = capacity;
    }

    public static void main(String[] args) {
        StackInJava stackInJava = new StackInJava(2);
        stackInJava.push(10);
        stackInJava.push(20);
        stackInJava.push(30);
        System.out.println(stackInJava.peek());
        System.out.println(stackInJava.pop());
        System.out.println(stackInJava.peek());
    }

    private void push(int item) {

        if(top < capacity)
            array[++top] = item;
        else
            throw new RuntimeException("Stack is full");
    }

    private int pop() {
        if(top != -1)
            return array[top--];
        else
            throw new RuntimeException("Stack is empty");
    }

    private int peek() {
        if(top != -1)
            return array[top];
        else
            throw new RuntimeException("Stack is empty");
    }


}
