package com.phenom.training.junit5.basics;

import java.util.stream.IntStream;

public class Adder {

    public static int sum(int... nums) {
        return IntStream.of(nums).sum() ;
    }
}
