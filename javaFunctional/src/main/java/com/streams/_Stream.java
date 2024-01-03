package com.streams;

/**
 * Streams is collections of apis,
 * In streams there are multiple methods are available in which we can pass lambda functions(functional_interface)
 * It makes code very easy, sort & easy to understand
 */

import java.util.List;

public class _Stream {
    public static void main(String[] args) {
        List<Person> people = List.of(
                new Person("D", Gender.MALE),
                new Person("DK", Gender.MALE),
                new Person("DDF", Gender.FEMALE)
        );

        // TASK - Log all the persons whose name length is greater than 2

        // 1. Normal approach
        for(Person p: people) {
            if(p.name.length() > 2) {
                System.out.println(p.name);
            }
        }
        System.out.println();

        // 2. Functional programing/interface + streams
        people.stream()
                .map(p -> p.name)
                .filter(name -> name.length() > 2)
                .forEach(name -> System.out.println(name));
    }

    static class Person{
        private final String name;
        private final Gender gender;

        public Person(String name, Gender gender) {
            this.name = name;
            this.gender = gender;
        }


        @Override
        public String toString() { // System.out.println(personObject); -> This is print out whatever is written in toString() function
            return "Person{" +
                    "name='" + name + '\'' +
                    ", gender=" + gender +
                    '}';
        }
    }

    enum Gender {
        MALE,
        FEMALE
    }
}
