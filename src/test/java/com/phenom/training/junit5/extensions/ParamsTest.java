package com.phenom.training.junit5.extensions;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.stream.Stream;

public class ParamsTest {

    enum Env { DEV, QA, PROD};

    @ParameterizedTest
    @EnumSource(Env.class)
    void byEnum(Env env) {

    }

    @ParameterizedTest
    @ValueSource(strings = { "SpaceX", "Boeing"})
    void byValue(String company) {

    }

    static Stream<Double> data() {
        return Stream.generate(() -> Math.random()).limit(10);
    }

    @ParameterizedTest
    @MethodSource("data")
    void byMethod(Double number) {

    }

    @ParameterizedTest
    @MethodSource("com.phenom.training.junit5." +
            "extensions.Enabled#getEnabled")
    void byMethodElsewhere(String name) {

    }
}
