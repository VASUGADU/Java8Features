package com.vasu.interviewquestions;

public class TrickyJavaInterviewQues {

    //Question11
    static int a = 1111;
    static {
        a = a-- - --a;
    }
    {a = a++ + ++a;}

    public static void main(String[] args) {

        //Question1
        //Single line comment
        //\u000d System.out.println("HelloWorld");

        //Question2
        String strConcat = "ONE"+1+2+3;
        System.out.println(strConcat);

        //Question3
        int i = 10+ +11- -12+ +13- -14+ +15;
        System.out.println(i);

        //Question4
        String one = "Random";
        String two = "RAndom";
        String three = "Random";
        if(one==two)
            System.out.println("one==two");
        else
            System.out.println("one!=two");
        if(one==three)
            System.out.println("one==three");

        //Question5
        System.out.println(Fruit.TYPE);

        //Question6
        System.out.println(FruitClass.TYPE);

        //Question7
        final class Constants { public final static String name = "PI"; }
        Thread thread = new Thread(() -> System.out.println(Constants.name));
        thread.start();

        //Question8
        Integer i1 = 127;
        Integer i2 = 127;
        System.out.println(i1==i2);

        Integer i3 = 128;
        Integer i4 = 128;
        System.out.println(i3==i4);

        //Question9
        System.out.println(Math.min(Double.MIN_VALUE, 0.0d));
        System.out.println(Math.min(Integer.MIN_VALUE, 0.0d));

        //Question10
        System.out.println(1000*60*60*24*365L);
        System.out.println(1000*60*60*24*365);

        //Question11
        System.out.println(a);

    }
}

interface IFruit {
    String TYPE = "Apple";
}

class Fruit implements IFruit {}

class CFruit {
    protected static String TYPE = "Apple";
}

class FruitClass extends CFruit {}
