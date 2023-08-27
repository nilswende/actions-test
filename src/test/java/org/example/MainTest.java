package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
	@Test
	void add() {
		assertEquals(5, Main.add(2, 3));
	}
	@Test
	void add1() {
		assertEquals(6, Main.add(3, 3));
	}
}