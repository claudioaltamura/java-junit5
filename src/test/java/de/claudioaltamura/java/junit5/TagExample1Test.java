package de.claudioaltamura.java.junit5;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("example1")
class TagExample1Test {

  @Test
  @DisplayName("test message")
  void testHello() {
    Message message = new Message("This is a message!");
    assertEquals("This is a message!", message.getMessage());
  }
}
