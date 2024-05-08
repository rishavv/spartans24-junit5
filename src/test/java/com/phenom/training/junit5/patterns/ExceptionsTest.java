package com.phenom.training.junit5.patterns;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ExceptionsTest {

    @Test
    void throwsException() {
        assertThrows(IllegalArgumentException.class, () -> Exceptions.validate(null));
    }

    @Test
    void message() {
        IllegalArgumentException actual = assertThrows(IllegalArgumentException.class, () -> Exceptions.validate(null));
        assertEquals("str can't be null", actual.getMessage());
    }
}