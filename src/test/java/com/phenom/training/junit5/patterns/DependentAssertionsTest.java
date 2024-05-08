package com.phenom.training.junit5.patterns;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DependentAssertionsTest {

    @Test
    void bean() {
        Bean bean = null;
        assertAll("found name",
                () -> {
                    assertNotNull(bean);
                    assertAll("name values",
                            () -> assertEquals("Rishav", bean.getFirstName(), "first"),
                            () -> assertEquals("Verma", bean.getLastName(), "last"));

                });
    }


}