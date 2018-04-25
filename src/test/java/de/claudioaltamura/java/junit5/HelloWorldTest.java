package de.claudioaltamura.java.junit5;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class HelloWorldTest {

	@Test
	void testHello() {
		HelloWorld helloWorld = new HelloWorld();
		assertEquals("Hello World!", helloWorld.hello());
	}

}
