package de.claudioaltamura.java.junit5;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
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

}
