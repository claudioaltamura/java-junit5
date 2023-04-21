package de.claudioaltamura.java.junit5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/**
 * @see <a href="https://stackoverflow.com/a/51768474">test exceptions with JUnit 5</a>
 */
class ExceptionTest {

  @Test
  void assertAllNoExceptions() {
    Inverter inverter = new Inverter("hello");
    assertAll(() -> inverter.isInverted("olleh"));
  }

  @Test
  void assertDoesNotThrowExceptions() {
    Inverter inverter = new Inverter("hello");
    assertDoesNotThrow(() -> inverter.isInverted("elloh"));
  }

  @Test
  void assertThrowsException() {
    Inverter inverter = new Inverter("hello");
    assertThrows(RuntimeException.class, () -> inverter.badMethod(42));
  }
}
