import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class junit {
	UniqueSum us;
	
	@Before
	public void setUp() throws Exception {
		us = new UniqueSum();
	}

	@Test
	public void usTest1() {
		assertEquals("Result wasn't expected.", 6, us.uniqueSum(1, 2, 3));
	}
	
	@Test
	public void usTest2() {
		assertEquals("Result wasn't expected.", 3, us.uniqueSum(2, 2, 3));
	}
	
	@Test
	public void usTest3() {
		assertEquals("Result wasn't expected.", 0, us.uniqueSum(2, 2, 2));
	}
	
	@Test
	public void usTest4() {
		assertEquals("Result wasn't expected.", 3, us.uniqueSum(2, 3, 2));
	}
	
	@Test
	public void usTest5() {
		assertEquals("Result wasn't expected.", 3, us.uniqueSum(3, 2, 2));
	}

}
