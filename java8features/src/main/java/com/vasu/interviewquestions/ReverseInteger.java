package com.vasu.interviewquestions;

public class ReverseInteger {

    public static void main(String[] args) {
        ReverseInteger reverseInteger = new ReverseInteger();
        System.out.println(reverseInteger.reverseInt(154628));
    }

    private int reverseInt(int input) {
        long reversed = 0;
        while (input !=0) {
            reversed = reversed * 10 + input % 10;
            input = input/10;
            if(reversed > Integer.MAX_VALUE || reversed < Integer.MIN_VALUE)
                return 0;
        }
        return (int)reversed;
    }
}
