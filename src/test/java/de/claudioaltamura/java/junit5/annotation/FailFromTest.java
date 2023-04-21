package de.claudioaltamura.java.junit5.annotation;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

@Disabled
class FailFromTest {

  @Test
  @FailFrom(date = "2022-01-01", reason = "Please refactor the code as agreed upon!")
  void failFrom() {
    assertTrue(true);
  }

  @Test
  void secondTest() {
    assertTrue(true);
  }
}
