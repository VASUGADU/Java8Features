# Java8Features
Implement Java8 Features
. Understanding lambdas - Lambdas are functions exists in Isolation.
. Using lambdas
. Functional interfaces
. Method references
. Collections improvements

Why Lambdas?
Advantage of lambdas enable us to write functional programming
Readable and concise code (Eliminates some boiler plate code)
Easier-to-use APIs and libraries (Enables us to write better APIs and libraries)
Enables us to support parallel processing

Functional programming vs Object oriented programming

Lambda syntax:
greetingFunction = () -> System.out.print("HEllo World..!!");

doubleNumberFunction = (int a) -> a*2;

addFunction = (int a, int b) -> a+b;

safeDivideFunction = (int a, int b) -> {
if(b==0) return 0;
return a/b;
};

stringLengthCountFunction = (String s) -> s.length();
