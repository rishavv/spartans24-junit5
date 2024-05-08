package com.phenom.training.junit5.basics;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class AssertionExamplesTest {

    @Test
    void asserts() {
        assertNotNull("");
        assertTrue("".isEmpty());
        assertNotSame("", new String(""));
        assertLinesMatch(List.of("xyz"), Arrays.asList("xyz"));
    }
}