package com.phenom.training.junit5.patterns;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assumptions.*;
import static org.junit.jupiter.api.Assertions.*;

class AssumingTest {

    @Test
    void bean() {
        Bean bean = null;
        assumeFalse(bean == null, "no name");

        assertEquals("Rishav", bean.getFirstName(), "first");
        assertEquals("Verma", bean.getLastName(), "last");

    }


}