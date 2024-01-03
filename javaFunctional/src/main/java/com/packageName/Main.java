package com.packageName;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        List<Person> people = List.of(
                new Person("D", Gender.MALE),
                new Person("DK", Gender.MALE),
                new Person("DDF", Gender.FEMALE)
        );


        // TASK - Log only FEMALE people
        // 1. Imperative approach -
        List<Person> females = new ArrayList<>();
        for(Person p: people) {
            if(Gender.FEMALE.equals(p.gender)) {
                females.add(p);
            }
        }

        for (Person p: females) {
            System.out.println(p);
        }


        // 2. Declarative approach
//        Function


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

    static enum Gender {
        MALE,
        FEMALE
    }

}


/**
 * Originally when I created Maven the project only 2 files were created:
 *  *      1. src(folder) -> main -> java -> com.packageName -> Main
 *                                -> resources
 *                        -> test -> java
 *  *      2. .gitignore (file)
 *  *      3. .idea
 *  *      4. pom.xml
 *  *
 *   When I first run(green icon) the program, following new things gor created
 *  *      1.target folder
 */