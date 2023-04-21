package ilu2.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import ilu2.Welcome;

class WelcomeTest {

	@Test
	void ex1() {
		assertEquals(Welcome.welcome("bob"),"Hello, Bob.");
		assertEquals(Welcome.welcome("rasa"),"Hello, Rasa.");
	}
	
	@Test
	void ex2() {
		assertEquals(Welcome.welcome("   "),"Hello, my friend");
		assertEquals(Welcome.welcome(""),"Hello, my friend");
		assertEquals(Welcome.welcome(null),"Hello, my friend");
	}
	
	@Test
	void ex3() {
		assertEquals(Welcome.welcome("JERRY"),"HELLO, JERRY !");
		assertEquals(Welcome.welcome("VEJO"),"HELLO, VEJO !");
	}
	
	@Test
	void ex4() {
		assertEquals(Welcome.welcome("amy,bob"),"Hello, Amy and Bob.");
		assertEquals(Welcome.welcome("rasa,vejo"), "Hello, Rasa and Vejo.");
	}
	
	@Test
	void ex5() {
		assertEquals(Welcome.welcome("Amy,bob,jerry"), "Hello, Amy, Bob and Jerry.");
		assertEquals(Welcome.welcome("ra,sa,ve,jo"),"Hello, Ra, Sa, Ve and Jo.");
	}
	
	@Test
	void ex6() {
		assertEquals(Welcome.welcome("Amy,BOB,jerry"), "Hello, Amy and Jerry. AND HELLO, BOB !");
		assertEquals(Welcome.welcome("ra,VE,sa,JO"),"Hello, Ra and Sa. AND HELLO, VE AND JO !");
		assertEquals(Welcome.welcome("RA,PHA,EL"), "HELLO, RA, PHA AND EL !");
	}
	
	@Test
	void ex7() {
		assertEquals(Welcome.welcome("Amy,bob,jerry"), "Hello, Amy, Bob and Jerry.");
		assertEquals(Welcome.welcome("bob,AMY,jerry,JACK"), "Hello, Bob and Jerry. AND HELLO, AMY AND JACK !");
	}
	
	@Test
	void ex8() {
		assertEquals(Welcome.welcome("bob      ,amy    "),"Hello, Bob and Amy.");
		assertEquals(Welcome.welcome("      RA,PHA,EL  "), "HELLO, RA, PHA AND EL !");
	}

}
