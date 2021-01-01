package de.claudioaltamura.java.junit5;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.DisabledIfEnvironmentVariable;
import org.junit.jupiter.api.condition.EnabledIfSystemProperty;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.OS;

import static org.junit.jupiter.api.Assertions.assertTrue;

class ConditionTest {

    @Test
    @EnabledIfSystemProperty(named = "my.property", matches = "yes")
    void onlyIfMyPropertyMatchesYes() {
        System.out.println("yes");
    }

    @Test
    @DisabledIfEnvironmentVariable(named = "my.property", matches = "no")
    void disableIfMyPropertyMatchesNo() {
        System.out.println("my.property != no");
    }

    @Test
    void test() {
        System.out.println("running every time");
    }

	@Test
	@EnabledOnOs({OS.LINUX, OS.MAC})
	void shouldRunBothLinuxAndMac() {
		assertTrue(true);
	}

}
