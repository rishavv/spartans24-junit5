package com.phenom.training.junit5.extensions;

import io.github.artsok.ParameterizedRepeatedIfExceptionsTest;
import io.github.artsok.RepeatedIfExceptionsTest;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.io.IOException;
import java.io.UncheckedIOException;
import java.util.stream.Stream;

public class RetryTest {

    @RepeatedIfExceptionsTest(repeats = 3)
    void flakeyTest()  {
        throw new RuntimeException("Uh oh");
    }

    @RepeatedIfExceptionsTest(repeats = 3)
    void goodTest()  {
    }

    @ParameterizedRepeatedIfExceptionsTest
    @ValueSource(ints = {1,2,3})
    void params(int num) {

    }
}
