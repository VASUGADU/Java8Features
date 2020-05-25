# Java8Features
Implement Java8 Features
. Understanding lambdas - Lambdas are functions exists in Isolation. Lambda behaves as instance of matching Interface.
. Using lambdas
. Functional interfaces - Interface is the type for Lambda, Interfaces having single abstract method are called as Functional Interface. It gives backward compatibility.
. Method references
. Collections improvements

Why Lambdas?
------------
Advantage of lambdas enable us to write functional programming
Readable and concise code (Eliminates some boiler plate code)
Easier-to-use APIs and libraries (Enables us to write better APIs and libraries)
Enables us to support parallel processing

Functional programming vs Object oriented programming

Lambda syntax:
--------------
greetingFunction = () -> System.out.print("HEllo World..!!");

doubleNumberFunction = (int a) -> a*2;

addFunction = (int a, int b) -> a+b;

safeDivideFunction = (int a, int b) -> {
if(b==0) return 0;
return a/b;
};

stringLengthCountFunction = (String s) -> s.length();

Functional Interface:
---------------------
. @FunctionalInterface helps to not to change the behaviour of interface from functional interface.
. Any Functional Interface can have one and only one abstract method. 
. Generic type interfaces in java.util.function package. (Out of box interfaces Ex: Predicate, Consumer, Supplier and Function etc.,)

Streams:
--------
. Will make you a more efficient java programmer .
. Make heavy use of lambda expressions.
. Parallel threads make it very easy to multi-threaded operations.

A stream pipeline consists of a source, followed by zero or more intermediate operations; and a terminal operation.

Source -> (Filter -> Sort -> Map) Intermediate operations -> Collect (Terminal Operation)

. Stream Source:
- Streams can be created from Collections, Lists, Sets, ints, longs, doubles, arrays, lines of a file.

. Stream operations are either intermediate or terminal
- Intermediate operations such as filter, map or sort return a stream so we can chain multiple intermediate operations.
- Terminal operations such as forEach, collect or reduce are either void or return a non-stream result.

Intermediate Operations:
- Zero or more intermediate operations are allowed.
- Order matters for large datasets: filter first, then sort or map.
- For very large datasets use ParallelStream to enable multi threads.
- Intermediate operations include:

Methods: anyMatch(), distinct(), filter(), findFirst(), flatmap(), map(), skip(), sorted()         
         
Terminal Operations:
- One terminal operation is allowed.
- forEach applies the same function to each element.
- collect saves the elements into a collection.
- other options reduce the stream to a single summary element.

Methods: count(), min(), max(), reduce(), summaryStatistics()



