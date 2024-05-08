package com.phenom.training.junit5.basics;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ReportWithCacheTest {

    private static Map<String, String> CACHE;
    private ReportWithCache report;

    @BeforeAll
    static void createCache() {
        CACHE = Map.of("Intro to JUnit 5", "Rishav Verma");
    }

    @BeforeEach
    void setUp() {
        report = new ReportWithCache(CACHE);
    }

    @Test
    void createRow_match() {
        String expected = "Rishav Verma,Intro to JUnit 5";
        String actual = report.createRow("Intro to JUnit 5");
        assertEquals(expected, actual, "row");
    }

    @Test
    void createRow_noMatch() {
        String expected = "Unknown,Lunch";
        String actual = report.createRow("Lunch");
        assertEquals(expected, actual, "default value");
    }
}