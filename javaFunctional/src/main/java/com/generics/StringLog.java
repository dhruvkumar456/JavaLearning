package com.generics;

public class StringLog {

    private final String s;

    public StringLog(String s) {
        this.s = s;
    }

    void log() {
        System.out.println(this.s);
    }
}
