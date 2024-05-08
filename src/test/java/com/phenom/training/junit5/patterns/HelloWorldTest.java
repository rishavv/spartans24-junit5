package com.phenom.training.junit5.patterns;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class HelloWorldTest {

    private PrintStream originalSystemOut;
    private ByteArrayOutputStream mockSystemOut;

    @BeforeEach
    void setUp() {
        mockSystemOut = new ByteArrayOutputStream();
        System.setOut(new PrintStream(mockSystemOut));
    }

    @AfterEach
    void restoreSystemOut() {
        System.setOut(originalSystemOut);
    }

    @Test
    void prints() {
        HelloWorld.main();
        String actual = mockSystemOut.toString();
        assertEquals("Hello World", actual.strip());
    }


}