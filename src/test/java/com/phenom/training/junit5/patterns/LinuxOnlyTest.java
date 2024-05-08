package com.phenom.training.junit5.patterns;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.OS;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assumptions.assumeFalse;
import static org.junit.jupiter.api.Assumptions.assumeTrue;

class LinuxOnlyTest {

    @Test
    void packagedOnServer() {
        assumeTrue(System.getProperty("os.name").toLowerCase().contains("linux"), "skip if not linux");

        // assertions here

    }

    @Test
    @EnabledOnOs(OS.LINUX)
    void linuxAnnotation() {

        // assertions here

    }


}