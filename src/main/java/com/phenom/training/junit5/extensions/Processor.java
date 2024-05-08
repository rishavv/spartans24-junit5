package com.phenom.training.junit5.extensions;

import java.util.function.Function;

public class Processor {

    private Function<String, Integer> function;

    public Processor(Function<String, Integer> function) {
        this.function = function;
    }

    public Integer process(String text) {
        return function.apply(text);
    }
}
