package de.claudioaltamura.java.junit5;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

class ParameterTest {

  private Inverter inverter;

  @BeforeEach
  void beforeEach() {
    inverter = new Inverter("Hello", "World");
  }

  @ParameterizedTest
  @ValueSource(strings = {"olleH", "dlroW"})
  void isInverted(String input) {
    assertTrue(inverter.isInverted(input));
  }

  @ParameterizedTest
  @MethodSource("notInverted")
  void isNotInverted(String input) {
    assertFalse(inverter.isInverted(input));
  }

  static String[] notInverted() {
    return new String[] {"Hello", "World"};
  }

}
