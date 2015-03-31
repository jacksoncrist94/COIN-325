package lab14;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class GCDTester {

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
	public void test() {
		assertTrue(DivisorCalc.gcd(3, 9) == 3);
		assertTrue(DivisorCalc.gcd(10, 15) == 5);
		assertTrue(DivisorCalc.gcd(27, 9) == 9);
		assertTrue(DivisorCalc.gcd(42, 36) == 6);
		assertTrue(DivisorCalc.gcd(7, 7) == 7);
		
	}

}
