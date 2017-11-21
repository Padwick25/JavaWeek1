import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class junit {
	Blackjack blackjack;
	
	@Before
	public void setUp() throws Exception {
		blackjack = new Blackjack();
	}
	
	@Test
	public void blackjackTest1() {
		assertEquals("Result wasn't expected.", 20, blackjack.blackjack(19, 20));
	}
	
	@Test
	public void blackjackTest2() {
		assertEquals("Result wasn't expected.", 0, blackjack.blackjack(22, 22));
	}
	
	@Test
	public void blackjackTest3() {
		assertEquals("Result wasn't expected.", 21, blackjack.blackjack(21, 22));
	}
	
	@Test
	public void blackjackTest4() {
		assertEquals("Result wasn't expected.", 21, blackjack.blackjack(21, 21));
	}
	
	//@After
	
}
