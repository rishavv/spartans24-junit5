package com.phenom.training.junit5.basics;

import org.junit.jupiter.api.*;

import java.lang.annotation.Target;

import static org.junit.jupiter.api.Assertions.assertNotNull;

class AnnotationsTest {
    private String z;

    @BeforeAll
    static void a() {
        // lookup next id
    }

    @AfterAll
    static void b() {
       // Target.cache.clear();
    }

    @BeforeEach
    void c() {
        z = "test data";
    }

    @AfterEach
    void d() {
        z = null;
    }

    @Test
    void e() {
        assertNotNull(z);
    }
}

