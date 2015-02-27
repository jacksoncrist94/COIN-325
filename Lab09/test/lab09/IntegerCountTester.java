package lab09;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class IntegerCountTester {

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
	public void test1() {
		IntegerCount intCount1 = new IntegerCount();
		
		intCount1.receiveInteger(1);
		intCount1.receiveInteger(40);
		intCount1.receiveInteger(1);
		intCount1.receiveInteger(40);
		intCount1.receiveInteger(40);
		
		intCount1.printout(1, intCount1.receiveCount(1));
		intCount1.printout(40, intCount1.receiveCount(40));
		
		assertTrue(intCount1.receiveCount(1) == 2);
		assertTrue(intCount1.receiveCount(40) == 3);
	}
	
	@Test
	public void test2() {
		IntegerCount intCount2 = new IntegerCount();
		
		intCount2.receiveInteger(0);
		intCount2.receiveInteger(5);
		intCount2.receiveInteger(-4);
		intCount2.receiveInteger(101);
		intCount2.receiveInteger(5);
		
		intCount2.printout(5, intCount2.receiveCount(5));
		
		assertTrue(intCount2.receiveCount(5) == 2);
	}
	

}
