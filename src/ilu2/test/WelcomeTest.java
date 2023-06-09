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
	
	@Test
	void ex9() {
		assertEquals(Welcome.welcome("bob, JERRY, amy, bob, JERRY, bob"),"Hello, Bob (x3) and Amy. AND HELLO, JERRY (x2) !");
		assertEquals(Welcome.welcome("bob, JERRY, amy, bob, JERRY, bob,amy"),"Hello, Bob (x3) and Amy (x2). AND HELLO, JERRY (x2) !");
		assertEquals(Welcome.welcome("ra,ra,ra,ra"),"Hello, Ra (x4).");
		assertEquals(Welcome.welcome("SA,SA,SA,SA,SA"),"HELLO, SA (x5) !");
	}
	
	@Test
	void ex10() {
		assertEquals(Welcome.welcome("bob, yoda, amy, JERRY"),"Bob, Yoda and Amy, Hello. AND HELLO, JERRY !");
		assertEquals(Welcome.welcome("bob, YODA, amy, JERRY, YODA"),"Hello, Bob and Amy. AND YODA (x2) AND JERRY, HELLO !");
		assertEquals(Welcome.welcome("bob, yoda, amy, JERRY, YODA"),"Bob, Yoda and Amy, Hello. AND JERRY AND YODA, HELLO !");
	}

}
