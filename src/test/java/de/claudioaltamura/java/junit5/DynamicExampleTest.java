package de.claudioaltamura.java.junit5;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.DynamicTest.dynamicTest;

import java.util.Arrays;
import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.TestFactory;

class DynamicExampleTest {

  @TestFactory
  Iterable<DynamicTest> test() {
    return Arrays.asList(
        dynamicTest("2 * 2", () -> assertEquals(4, 2 * 2)),
        dynamicTest("3 * 3", () -> assertEquals(9, 3 * 3)));
  }
}
