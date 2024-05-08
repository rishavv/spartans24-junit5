package com.phenom.training.junit5.patterns;

import org.junit.jupiter.api.Test;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.*;

class ValuesInBeanTest {

    @Test
    void bean() {
       Bean bean = new Bean("Rishav", "Verma");
       assertAll("name",
               () -> assertEquals("Rishav", bean.getFirstName(), "first"),
               () -> assertEquals("Verma", bean.getLastName(), "last"));
    }

    @Test
    void record() {
        Record record = new Record("Rishav", "Verma");
        Record expected = new Record("Rishav", "Verma");
        assertEquals(expected, record, "name");
    }

}