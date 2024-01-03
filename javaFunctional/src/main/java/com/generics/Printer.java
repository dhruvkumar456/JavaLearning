package com.generics;

/**
 * We can Dynamically(on runtime) pass the Type by defining <T> after className & before {
 * We can name it <WhateverWeWant>
 * <T> - is the type of thing that this class Printer will store while executing code.
 *
 * NOTE: <T> In this generic Type we cannot have Primitive dataType, if we want to use for 'int' then use it wrapper
 * class ie - new Integer();
 *
 * in <T extends InterfaceOrClassName> we can extend & define that out 'T' will be of subclass of this InterfaceName & we can use
 * <T>'s method in our code also. This is also known as bounded generics
 *
 * <T extends className & interfaceName> -> Valid, we cannot use mutiple className here, because JAVA doesn't support
 * multiple inheritance
 *
 * @param <T>
 */
public class Printer<T> {

    T data;

    public Printer(T data) {
        this.data = data;
    }

    public void log() {
        System.out.println(this.data);
    }
}
