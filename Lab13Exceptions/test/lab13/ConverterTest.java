package lab13;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class ConverterTest {

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
	public void ConverterTest01() {
		assertTrue(Converter.utoi("10").equals(new Integer(10)));
		assertTrue(Converter.utoi("This is not an integer") == null);
		assertTrue(Converter.utoi("5.5") == null);
		assertTrue(Converter.utoi("$$$") == null);
	}

}
