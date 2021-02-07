package de.claudioaltamura.java.junit5;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class BeforeAfterAllTest {

  private static String test = "";

  @BeforeAll
  static void setUp() {
    test = "test";
  }

  @AfterAll
  static void tearDown() {
    test = "";
  }

  @Test
  @DisplayName("simple test")
  void test() {
    System.out.println(test);
    assertTrue(true);
  }
}
