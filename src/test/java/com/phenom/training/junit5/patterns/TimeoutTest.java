package com.phenom.training.junit5.patterns;

import org.junit.jupiter.api.Test;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.*;

class TimeoutTest {

    @Test
    void tooLong() {
       assertTimeout(Duration.ofSeconds(2), this::sketchyCode);
    }

    private void sketchyCode() {
        try {
            Thread.sleep(5_000);
        } catch (InterruptedException e) {
            // ignore
        }
    }
}