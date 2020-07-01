package com.clough.magic8ball;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class Magic8BallTest {

	private static Magic8Ball m8b2;
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		m8b2 = new Magic8Ball();//class under test
	}
	

	@Test
	@Order(1)
	void magic8BAll_GivenNoParameters_ShouldContructObject() {
		assertTrue(m8b2 instanceof Magic8Ball);
	}
	
	@Test
	@Order(2)
	void askQuestion_GivenAString_ShouldReturnTrue() {
		boolean success = false;
		String question = "Should I cut my own bangs?";
		success = m8b2.askQuestion(question);
		assertTrue(success);
		assertEquals(question, m8b2.getQuestion());
	}
	@Test
	@Order(3)
	void shake_GivenNoParameters_ShouldReturnAnswer() {
		String answer = null;
		answer = m8b2.shake();
		assertEquals("Ask again later.", answer);
	}

}
