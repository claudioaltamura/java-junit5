package de.claudioaltamura.java.junit5;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.stream.Stream;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
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

  private static Stream<Arguments> providedArguments() {
    return Stream.of(Arguments.of(2, 5, 10, "easy"), Arguments.of(7, 8, 56, "more difficult"));
  }

  @ParameterizedTest
  @MethodSource("providedArguments")
  void multipleArguments(int a, int b, int result, String message) {
    Calculator calculator = new Calculator();

    System.out.println("message: " + message);

    assertEquals(result, calculator.multiply(a, b));
  }
}
