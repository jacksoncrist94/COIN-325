package Lab7;

import static org.junit.Assert.*;
import junit.framework.Assert;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class PushRandomPanelTester {

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
		PushRandomPanel panel = new PushRandomPanel();
		
		panel.button.doClick();
		
		int testNum = panel.randNum;
		
		assertTrue((testNum >= 1 && testNum <= 100));
		
	}

}
