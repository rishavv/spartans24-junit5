package com.phenom.training.junit5.demo;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

public class BbqTest {

    private Bbq bbq;

    @BeforeEach
    void create() {
        bbq = new Bbq("Grill");
    }

    @RepeatedTest(50)
    void name() {
        assertEquals("Grill", bbq.name());
    }

    @ParameterizedTest
    @ValueSource(strings = { "spicy", "sweet"})
    void isSauceInStock(String sauce) {
        assertTrue(bbq.isSauceInStock(sauce));
    }

    @ParameterizedTest(name = "Sauce {0}")
    @ValueSource(strings = { "bbq"})
    void sauceOutOfStock(String sauce) {
        assertFalse(bbq.isSauceInStock(sauce));
    }

}
