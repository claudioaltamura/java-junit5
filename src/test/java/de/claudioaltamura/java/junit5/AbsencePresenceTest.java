package de.claudioaltamura.java.junit5;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

/**
 * Examples for absence and presence of exceptions.
 *
 * <p>see <a href="https://stackoverflow.com/a/51768474">How to test that no exception is
 * thrown?</a>.
 */
class AbsencePresenceTest {

  @Test
  void assertExecutableDoNotThrowExceptions() {
    assertAll(() -> assertEquals("Hello", new Message("Hello").getMessage()));
  }

  @Test
  void assertExecutableDoesThrowExceptionAnyKind() {
    assertDoesNotThrow(() -> new Message("Hello").getMessage());
  }

  @Test
  void assertExecutableThrowsException() {
    assertThrows(RuntimeException.class, () -> new Inverter().badMethod(42));
  }
}
