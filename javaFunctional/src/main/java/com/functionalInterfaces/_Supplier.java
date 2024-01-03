package com.functionalInterfaces;

import java.util.function.Supplier;
/**
 * Supplier is a functional_interface that accepts/takes a function (without any argument) but return any Type - <T>
 */

public class _Supplier {
    public static void main(String[] args) {
        // Normal way of getting db url
        System.out.println(getMongoUrl());

        // Functional interface for getting MongoUrl
        System.out.println(getMongoUrlSupplier.get());
    }

    static Supplier<String> getMongoUrlSupplier = () ->  "mongodb://admin:password@localhost:27017/";

    static String getMongoUrl() {
        return "mongodb://admin:password@localhost:27017/";
    }
}
