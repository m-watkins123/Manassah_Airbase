package org.Manassah.Airbase;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.NullSource;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ManassahAirbaseApplicationTests {
	@ParameterizedTest
	@NullSource
	void testMethodNullSource(Integer argument) {
		assertTrue(argument == null);
	}
	@Test
	void contextLoads() {
	}
	 

}
