package de.claudioaltamura.java.junit5;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.DisabledIf;
import org.junit.jupiter.api.condition.DisabledIfEnvironmentVariable;
import org.junit.jupiter.api.condition.EnabledIfSystemProperty;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.OS;

class ConditionTest {

  @Test
  @EnabledIfSystemProperty(named = "my.property", matches = "yes")
  void onlyIfMyPropertyMatchesYes() {
	  assertTrue(true);
  }

  @Test
  @DisabledIfEnvironmentVariable(named = "my.property", matches = "no")
  void disableIfMyPropertyMatchesNo() {
	  assertTrue(true);
  }

  @Test
  void test() {
	  assertTrue(true);
  }

  @Test
  @EnabledOnOs({OS.LINUX, OS.MAC})
  void shouldRunBothLinuxAndMac() {
    assertTrue(true);
  }

  @YesAndMacCondition
  void shouldRunWhenYesAndMac() {
    assertTrue(true);
  }

}
