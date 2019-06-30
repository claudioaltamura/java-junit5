package de.claudioaltamura.java.junit5;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assumptions.assumeTrue;
import static org.junit.jupiter.api.Assumptions.assumingThat;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class AssumptionTest {

  @Test
  @Disabled
  void testOnlyOnDeveloperWorkstation() {
    assumeTrue("DEV".equals(System.getenv("ENV")),
        () -> "Aborting test: not on developer workstation");
    // remainder of test
  }

  @Test
  void testInAllEnvironments() {
      assumingThat("CI".equals(System.getenv("ENV")),
          () -> {
              // perform these assertions only on the CI server
              assertEquals(2, 2 + 2);
          });

      // perform these assertions in all environments
      assertEquals(42, 6 * 7);
  }
}