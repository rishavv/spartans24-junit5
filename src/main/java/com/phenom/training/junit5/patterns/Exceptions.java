package com.phenom.training.junit5.patterns;

public class Exceptions {

    public static void validate(String str) {
        if(str == null) {
            throw new IllegalArgumentException("str can't be null");
        }
    }
}
