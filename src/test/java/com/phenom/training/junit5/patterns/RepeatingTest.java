package com.phenom.training.junit5.patterns;

import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.OS;

import static org.junit.jupiter.api.Assumptions.assumeTrue;

class RepeatingTest {

    @RepeatedTest(100)
    void threadsDoNotFail() {

    }


}