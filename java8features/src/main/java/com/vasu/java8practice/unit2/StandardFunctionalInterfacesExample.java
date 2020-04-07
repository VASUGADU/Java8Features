package com.vasu.java8practice.unit2;

import com.vasu.java8practice.Person;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class StandardFunctionalInterfacesExample {

    public static void main(String[] args) {

        List<Person> people = Arrays.asList(new Person("Charles", "Dickens", 60),
                new Person("Lewis", "Carrol", 42),
                new Person("Thomas", "Carlyle", 51),
                new Person("Charlotte", "Bronte", 45),
                new Person("Matthew", "Arnold", 39)
        );

        // Step 1: Sort list by last name
        Collections.sort(people, (p1, p2) -> p1.getLastName().compareTo(p2.getLastName()));

        // Step 2: Create a method that print all elements in the list
        System.out.println("Printing all persons");
        printConditionally(people, p -> true, p -> System.out.println(p));

        // Step 3: Create a method that print all elements in the list having last name beginning with C
        System.out.println("Printing persons, last name beginning with character C");
        printConditionally(people, p -> p.getLastName().startsWith("C"), p -> System.out.println(p.getLastName()));

        System.out.println("Printing persons, first name beginning with last name character C");
        printConditionally(people, p -> p.getLastName().startsWith("C"), p -> System.out.println(p.getFirstName()));

    }


    private static void printConditionally(List<Person> people, Predicate<Person> personPredicate, Consumer<Person> personConsumer) {
        for (Person person : people) {
            if(personPredicate.test(person))
                personConsumer.accept(person);
        }

    }

}
