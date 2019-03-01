package de.claudioaltamura.java.junit5;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.Test;

class AssertionsTest {

  @Test
  void test() {
    Message message = new Message("Hallo");
    assertAll("message",
        () -> assertNotNull(message),
        () -> assertEquals("Hallo", message.getMessage())
    );
  }

  @Test
  void testException() {
    Inverter inverter = new Inverter();
    Exception exception = assertThrows(RuntimeException.class, () ->
    inverter.badMethod(42));
    assertEquals("/ by zero", exception.getMessage());
  }

}
