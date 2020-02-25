package de.claudioaltamura.java.junit5;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

@ExtendWith(NonDevExecutionConditionExtension.class)
class NonDevExecutionConditionEnviromentTest {

  @Test
  @DisplayName("test hello only in TEST enviroment")
  void testHello() {
    HelloWorld helloWorld = new HelloWorld();
    assertEquals("Hello World!", helloWorld.hello());
  }
}
