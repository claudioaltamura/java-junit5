package de.claudioaltamura.java.junit5;

import static java.time.Duration.ofMillis;
import static java.time.Duration.ofMinutes;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTimeout;
import static org.junit.jupiter.api.Assertions.assertTimeoutPreemptively;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class AssertionsTest {

  @Test
  void test() {
    Message message = new Message("Hallo");
    assertAll(
        "message", () -> assertNotNull(message), () -> assertEquals("Hallo", message.getMessage()));
  }

  @Test
  void testException() {
    Inverter inverter = new Inverter();
    Exception exception = assertThrows(RuntimeException.class, () -> inverter.badMethod(42));
    assertEquals("bad method", exception.getMessage());
  }

  @Test
  void timeoutNoExceed() {
    assertTimeout(
        ofMinutes(2),
        () -> {
          // Perform task that takes less than 2 minutes.
        });
  }

  @Test
  void timeoutNotExceededWithResult() {
    String actualResult =
        assertTimeout(
            ofMinutes(2),
            () -> {
              return "a result";
            });
    assertEquals("a result", actualResult);
  }

  @Test
  @Disabled
  void timeoutExceeded() {
    assertTimeout(
        ofMillis(10),
        () -> {
          Thread.sleep(100);
        });
  }

  @Test
  @Disabled
  void timeoutExceededWithPreemptiveTermination() {
    assertTimeoutPreemptively(
        ofMillis(10),
        () -> {
          Thread.sleep(100);
        });
  }
}
