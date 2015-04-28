package lab18;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class HashTester {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void HashPutTest() {
		HashLinkedChaining<String, Employee> hash = 
				new HashLinkedChaining<String, Employee>();
		
		Employee dan = new Employee("Dan", "123-45-6789", "01-01-2000", "Vulcan");
		Employee kirk = new Employee("Captain Kirk", "123-45-6000", "01-01-2263", "Human");
		Employee uhura = new Employee("Uhura", "123-45-5000", "01-02-2263", "Human");
		
		hash.put(dan.getKey(), dan);
		hash.put(kirk.getKey(), kirk);
		hash.put(uhura.getKey(), uhura);
		
		assertTrue(hash.get("123-45-6789Vulcan").getBDay().equals("01-01-2000"));
		assertTrue(hash.get("123-45-6000Human").getBDay().equals("01-01-2263"));
		assertTrue(hash.get("123-45-5000Human").getBDay().equals("01-02-2263"));
		
		assertTrue(hash.size() == 3);

		
	}

}
