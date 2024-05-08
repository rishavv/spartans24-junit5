package com.phenom.training.junit5.patterns;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;


@Tag("slow")
class TagTest {


    @Test
    @Tag("full-suite")
    void test() {

    }
}