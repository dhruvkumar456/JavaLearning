package com.functionalInterfaces;


import java.util.function.Function;
import java.util.function.BiFunction;

/**
 * Function is a functional_interface that accepts/takes a function (with any type of argument) but return anything
 */
public class _Function {
    public static void main(String[] args) {
        int[] arr = {12, 213, 15, 78, 54};

        // Simple way
        totalDivisibleNumber(arr);

        System.out.println();

        // Functional interface approach
        totalDivisibleNumberByFunction.apply(arr);
    }


    static Function<int[], Integer> totalDivisibleNumberByFunction = (arr) -> {
        int totalNumber = 0;
        for (int a: arr) {
            if(a % 2 == 0) {
                System.out.println(a);
                totalNumber++;
            }
        }
        return totalNumber;
    };


    static int totalDivisibleNumber(int[] arr) {
        int totalNumber = 0;
        for(int a: arr) {
            if(a % 2 == 0) {
                System.out.println(a);
                totalNumber++;
            }
        }
        return totalNumber;
    }

}
