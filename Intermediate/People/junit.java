import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

public class junit {
	Methods m;
	
	@Before
	public void setUp() throws Exception {
		m = new Methods();
	}
	
	@Test
	public void personTestName() {
		Person test = new Person("test", 55, "tester");
		assertEquals(test.getName(), "test");
	}
	
	@Test
	public void personTestAge() {
		Person test = new Person("test", 55, "tester");
		assertEquals(test.getAge(), 55);
	}
	
	@Test
	public void personTestJob() {
		Person test = new Person("test", 55, "tester");
		assertEquals(test.getJobTitle(), "tester");
	}
	
	@Test
	public void personTestSetName() {
		Person test = new Person("test", 55, "tester");
		test.setName("Dave");
		assertEquals(test.getName(), "Dave");
	}
	
	@Test
	public void personTestSetAge() {
		Person test = new Person("test", 55, "tester");
		test.setAge(26);
		assertEquals(test.getAge(), 26);
	}
	
	@Test
	public void personTestSetJob() {
		Person test = new Person("test", 55, "tester");
		test.setJobTitle("bloke");
		assertEquals(test.getJobTitle(), "bloke");
	}
	
	@Test
	public void testToString() {
		Person test = new Person("test", 55, "tester");
		assertEquals(test.toString(), "test is 55 years old. They are a tester.");
	}
	
	@Test
	public void testSearch() {
		Person test1 = new Person("test1", 51, "tester");
		Person test2 = new Person("test2", 52, "testerer");
		Person test3 = new Person("test3", 52, "testererer");
		
		ArrayList<Person> testList = new ArrayList<Person>();
		testList.add(test1);
		testList.add(test2);
		testList.add(test3);
		
		assertEquals(m.search(testList, "test1"), test1.toString());
	}
	
	@Test
	public void testSearch2() {
		Person test1 = new Person("test1", 51, "tester");
		Person test2 = new Person("test2", 52, "testerer");
		Person test3 = new Person("test3", 52, "testererer");
		
		ArrayList<Person> testList = new ArrayList<Person>();
		testList.add(test1);
		testList.add(test2);
		testList.add(test3);
		
		assertNull(m.search(testList, "test4"));
	}
}
