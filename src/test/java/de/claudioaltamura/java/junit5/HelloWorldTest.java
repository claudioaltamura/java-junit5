package de.claudioaltamura.java.junit5;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class HelloWorldTest {

	@Test
	@DisplayName("test hello")
	void testHello() {
		HelloWorld helloWorld = new HelloWorld();
		assertEquals("Hello World!", helloWorld.hello());
	}

}
