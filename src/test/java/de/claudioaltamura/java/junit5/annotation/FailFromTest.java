package de.claudioaltamura.java.junit5.annotation;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class FailFromTest {

    @Test
    @FailFrom(date="2022-01-01", reason = "Please refactor the code as agreed upon!")
    void failFrom() {
        assertTrue(true);
    }

    @Test
    void secondTest() {
        assertTrue(true);
    }

}
