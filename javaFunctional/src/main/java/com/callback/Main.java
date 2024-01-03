package com.callback;

import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {
        logName("DDDDD", "LLLL", (name) -> {
            System.out.println(name + " don't have any last name.");
        });

        logName("DDDDD", null, (name) -> {
            System.out.println(name + "don't have any last name.");
        });

        logName2("DDDDD", "LLLLLL", () -> System.out.println("No last name is provided"));
        logName2("DDDDD", null, () -> System.out.println("No last name is provided"));


    }

    static void logName(String firstName, String lastName, Consumer<String> callback) {
        System.out.println(firstName);
        if(lastName != null) {
            System.out.println(lastName);
        } else {
            callback.accept(firstName);
        }
    }

    static void logName2(String firstName, String lastName, Runnable callback) {
        System.out.println(firstName);
        if(lastName != null) {
            System.out.println(lastName);
        } else {
            callback.run();
        }
    }

}
