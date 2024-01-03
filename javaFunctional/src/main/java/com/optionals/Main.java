package com.optionals;

import java.util.Optional;

/**
 * Optional is used a lot to avoid null point exception in java & we to validate data & verify that we didn't get null data
 */

public class Main {
    public static void main(String[] args) {
        Optional.ofNullable(null)
                .ifPresentOrElse(email -> System.out.println("Sending mail to " + email),
                        () -> System.out.println("Sending email Failed"));

        Optional.ofNullable("dkumar@gmail.com")
                .ifPresentOrElse(email -> System.out.println("Sending mail to " + email),
                        () -> System.out.println("Sending email Failed"));
    }
}
