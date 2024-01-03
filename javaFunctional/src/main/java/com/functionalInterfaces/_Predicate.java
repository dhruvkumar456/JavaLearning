package com.functionalInterfaces;


import java.util.function.Predicate;
import java.util.function.BiPredicate; // takes 2 argument
/**
 * Predicate is a functional_interface that accepts/takes a function (with any type of argument) but return boolean
 */
public class _Predicate {
    public static void main(String[] args) {
        // Simple approach
        System.out.println(isPhoneNumberValid("8047757225"));
        System.out.println(isPhoneNumberValid("804775722"));
        System.out.println();

        // Functional interface approach
        System.out.println(isPhoneNumberValidByPredicate.test("8047757225"));
        System.out.println(isPhoneNumberValidByPredicate.test("804775722"));
        System.out.println();

        // Functional interface chaining
        System.out.println(isPhoneNumberValidByPredicate.and(isContain3).test(("8047757225")));
        System.out.println(isPhoneNumberValidByPredicate.or(isContain3).test(("8047757225")));
        System.out.println(isPhoneNumberValidByPredicate.and(isContain3).test(("8047757223")));
    }

    static Predicate<String> isPhoneNumberValidByPredicate = phoneNo -> phoneNo.length() == 10;
    static Predicate<String> isContain3 = phoneNo -> phoneNo.contains("3");

    static boolean isPhoneNumberValid(String phoneNo) {
        return phoneNo.length() == 10;
    }
}
