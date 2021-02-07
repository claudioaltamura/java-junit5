package de.claudioaltamura.java.junit5;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class BeforeAfterEachTest {

  @BeforeEach
  void setUp() {
    System.out.println("@BeforeEach");
  }

  @AfterEach
  void tearDown() {
    System.out.println("@AfterEach");
  }

  @Test
  @DisplayName("simple test")
  void test() {
    assertTrue(true);
  }
}
