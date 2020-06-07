package com.vasu.interviewquestions;

public class ReverseString {

    public static void main(String[] args) {

        String str = "Hello World..!!";

        System.out.println(reverseStringUsingAPI(str));
        System.out.println(reverseStringManually(str));

    }

    private static String reverseStringUsingAPI(String string) {
        StringBuilder strBuilder = new StringBuilder(string);
        return strBuilder.reverse().toString();
    }

    private static String reverseStringManually(String string) {
        StringBuilder strBuilder = new StringBuilder();

        for(int i = string.length()-1; i>=0; i--) {
            strBuilder.append(string.charAt(i));
        }
        return strBuilder.toString();
    }
}
