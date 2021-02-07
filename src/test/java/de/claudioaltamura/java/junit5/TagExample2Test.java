package de.claudioaltamura.java.junit5;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class TagExample2Test {

  @Tag("example1")
  @Test
  @DisplayName("test hello")
  void testHello() {
    HelloWorld helloWorld = new HelloWorld();
    assertEquals("Hello World!", helloWorld.hello());
  }

  @Test
  @Tag("example2")
  void testDisable() {
    System.out.println("test is disabled");
  }
}
