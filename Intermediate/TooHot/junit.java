import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class junit {
	TooHot th;
	
	@Before
	public void setUp() throws Exception {
		th = new TooHot();
	}

	@Test
	public void thTest1() {
		assertEquals("Result wasn't expected.", false, th.tooHot(100, false));
	}
	
	@Test
	public void thTest2() {
		assertEquals("Result wasn't expected.", true, th.tooHot(100, true));
	}
	
	@Test
	public void thTest3() {
		assertEquals("Result wasn't expected.", true, th.tooHot(90, false));
	}
	
	@Test
	public void thTest4() {
		assertEquals("Result wasn't expected.", false, th.tooHot(100, false));
	}
	
	@Test
	public void thTest5() {
		assertEquals("Result wasn't expected.", true, th.tooHot(60, false));
	}

}
