package com.functionalInterfaces;

import java.util.function.Consumer;

/**
 * Consumer is a functional_interface that accepts/takes a function (with any type of argument) but return void(nothing)
 */
public class _Consumer {
    public static void main(String[] args) {
        Person dk = new Person("DKSJB DFHIEN", "30");

        // Simple / normal approach
        logPersonInfo(dk);

        // Functional interface/programing approach
        logPersonInfoByConsumerFunction.accept(dk);
    }

    static Consumer<Person> logPersonInfoByConsumerFunction =
            p -> System.out.println("Here is the person info: Name: " + p.name + ", Age: " + (Integer.parseInt(p.age) + 1));

    static void logPersonInfo(Person p) {
        System.out.println("Here is the person info: Name: " + p.name + ", Age: " + p.age);
    }

    static class Person {
        private final String name;
        private final String age;

        public Person(String name, String age) {
            this.name = name;
            this.age = age;
        }

    }
}
