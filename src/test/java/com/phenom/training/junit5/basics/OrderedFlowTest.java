package com.phenom.training.junit5.basics;

import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class OrderedFlowTest {

    private static String flow = "";

    @AfterAll
    static void after() {
        System.out.println(flow);
    }

    @Test
    @Order(1)
    void one() {
        flow+="1";
    }

    @Test
    @Order(2)
    void two() {
        flow+="2";
    }
}