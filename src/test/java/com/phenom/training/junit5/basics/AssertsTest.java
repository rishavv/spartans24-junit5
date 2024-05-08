package com.phenom.training.junit5.basics;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class AssertsTest {

    @Test
    void asserts() {
        String message = "sum";
        int sum = Adder.sum(1, 2, 3);
        assertTrue(sum == 6);
        assertEquals(6, sum, "sum");
    }
}

