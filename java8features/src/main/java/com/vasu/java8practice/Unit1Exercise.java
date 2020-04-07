package com.vasu.java8practice;

import java.util.*;

public class Unit1Exercise {

    public static void main(String[] args) {

        List<Person> people = Arrays.asList(
              new Person("Charles", "Dickens", 60),
              new Person("Lewis", "Carroll", 42),
              new Person("Thomas", "Carlyle", 51),
              new Person("Charlotte", "Bronte", 45),
              new Person("Matthew", "Arnold", 39)
        );


        //Step 1: Sort list by last name
        getSortByLastName(people);

        //Step 2: Create a method that prints all elements in the list
        printAllElements(people);

        /*Have the methods accept behaviour instead hard-coding them. For example,
         pass in behaviour to find if a person's last name begins with 'C'*/
        //Step 3: Create a method that prints all people that have last name beginning with C
        printElementsByLastNameStartsWithC(people);

    }

    private static void getSortByLastName(List<Person> people) {
        System.out.println(people);

        Collections.sort(people, new PersonComparator());
        System.out.println(people);

        Collections.sort(people, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {

                if(o1.getLastName().compareTo(o2.getLastName()) != 0){
                    return o1.getLastName().compareTo(o2.getLastName());
                }

                return 0;
            }
        });
        System.out.println(people);

        Collections.sort(people, ((p1, p2) -> {

            if(p1.getLastName().compareTo(p2.getLastName()) != 0){
                return p1.getLastName().compareTo(p2.getLastName());
            }

            return 0;
        }));
        System.out.println(people);
    }

    private static void printAllElements(List<Person> people) {
        Iterator<Person> iterator = people.iterator();
        while (iterator.hasNext()) {
            Person person = iterator.next();
            System.out.println(person);
        }
    }

    private static void printElementsByLastNameStartsWithC(List<Person> people) {
        Iterator<Person> iterator1 = people.iterator();
        while (iterator1.hasNext()) {
            Person person = iterator1.next();
            if(person.getLastName().startsWith("C"))
                System.out.println("---" + person);
        }
    }

    static class PersonComparator implements Comparator {
        @Override
        public int compare(Object o1, Object o2) {

            Person p1 = (Person) o1;
            Person p2 = (Person) o2;

            if(p1.getLastName().compareTo(p2.getLastName()) != 0){
                return p1.getLastName().compareTo(p2.getLastName());
            }

            return 0;
        }
    }
}
