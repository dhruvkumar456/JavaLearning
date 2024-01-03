/**
 * 1. WHEN AN INTERFACE HAS EXACTLY ONE ABSTRACT METHOD THEN THE INTERFACE IS CALLED FUNCTIONAL_INTERFACE
 * 2. Lambda is basically a shortcut of defining the method(implementation) of functional interface instead of create a
 *    class that implements the method of functional interface.
 */

package com.packageName;

@java.lang.FunctionalInterface
interface FunctionalInterface {
    void print();

    // "default" allow us to add new methods to an interface that are automatically available in the implementations.
    default void test() {
        System.out.println("testing");
    }

    // From Java 8, In interface we can define/implement in static method but it will not automatically available in the implementations.
    static void log(){
        System.out.println("Logging...");
    }

}

class FunctionalClass implements FunctionalInterface {

    public void print() {
        System.out.println("Print via normal way");
    }
}

class LambdaFunction {
    public static void main(String[] args) {
        // Normal way - implement a class that will implement the method of an interface
        FunctionalInterface f = new FunctionalClass();
        f.print();
        f.test();

        // lambda approach - implement method via lambda (without creating a class)
        FunctionalInterface ff = () -> System.out.println("Print via lambda interface"); // () -> System.out.println("Done")
            // This will automatically assign to print method
        ff.print();

    }
}
