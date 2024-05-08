package com.phenom.training.junit5.extensions;

import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.MatcherAssert.assertThat;

public class HamcrestTest {

    @Test
    void matcher() {
        assertThat("kc", containsString("kc"));
    }
}
