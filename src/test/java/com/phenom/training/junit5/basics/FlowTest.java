package com.phenom.training.junit5.basics;

import org.junit.jupiter.api.*;

import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FlowTest {

    private static String flow = "";

    @BeforeAll
    static void before() {
        flow+="x";
    }

    @AfterAll
    static void after() {
        System.out.println(flow);
    }


    @BeforeEach
    void setUp() {
        flow+="y";
    }

    @AfterEach
    void tearDown() {
        flow+="-";
    }

    @Test
    void one() {
        flow+="z";
    }

    @Test
    void two() {
        flow+="z";
    }
}