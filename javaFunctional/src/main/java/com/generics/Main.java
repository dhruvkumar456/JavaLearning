package com.generics;

import java.util.ArrayList;

/**
 * TASK - Need a class that can log Integer, String, double float
 * Reference - https://www.youtube.com/watch?v=K1iu1kXkVoA
 */
public class Main {
    public static void main(String[] args) {
        // Normal way - create class for each type
        IntegerLog no = new IntegerLog(100);
        no.log();

        DoubleLog noo = new DoubleLog(30.143);
        noo.log();

        StringLog s = new StringLog("My name");
        s.log();

        // GENERIC WAY - Will make a class & will make it generic, ie passing the Type of the thing while creating the class
        Printer<Integer> nn = new Printer<Integer>(100);
        nn.log();;

        Printer<String> ss = new Printer<String>("My data");
        ss.log();

        Printer<Double> d = new Printer<>(20.311);
        d.log();

        // We already use generics in out code - ArrayList<T>, T is generic
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(10); arr.add(20);
        System.out.println(arr.toString());


        // Java supports multiple Generic types also, here is an example & we can use generics in static function also
        logger(100, "Any string to...");

        // Wildcard is also there - '?' instead of defining generic type
    }


    // In function, we declare generic type before functionName, In class we declare generic type after className
    public static <T, V> void logger(T first, V second) {
        System.out.println("First: " + first + ", Second: " + second);
    }
}
