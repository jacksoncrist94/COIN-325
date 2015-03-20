package lab11;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class ShapeTester {

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

	private double delta = 0.0001;
	
	@Test
	public void CircleTest(){
		Shape2D circle = new Circle(1.0);
		
		assertTrue(circle.getNumberOfAngles() == 0);
		assertEquals((Math.PI * 1.0 * 1.0), circle.getArea(), delta);
		assertEquals((2 * Math.PI * 1.0), circle.getCircumference(), delta);
		assertEquals((Math.PI * 2.5 * 2.5), new Circle(2.5).getArea(), delta);
		assertEquals((2 * Math.PI * 4.5), new Circle(4.5).getCircumference(), delta);
	}
	
	@Test
	public void RightTriangleTest(){
		Shape2D triangle = new RightTriangle(1.0, 1.0);
		
		assertTrue(triangle.getNumberOfAngles() == 3);
		assertEquals((1.0 * 1.0 / 2.0), triangle.getArea(), delta);
		assertEquals((1.0 + 1.0 + Math.sqrt(2.0)), triangle.getCircumference(), delta);
		assertEquals((3.4 * 6.5 / 2.0), new RightTriangle(3.4, 6.5).getArea(), delta);
		assertEquals((3.0 + 4.0 + 5.0), new RightTriangle(3.0, 4.0).getCircumference(), delta);
	}
	
	@Test
	public void RectangleTest(){
		Shape2D rect = new Rectangle(1.0, 1.0);
		
		assertTrue(rect.getNumberOfAngles() == 4);
		assertEquals((1.0 * 1.0), rect.getArea(), delta);
		assertEquals((2 * 1.0 + 2 * 1.0), rect.getCircumference(), delta);
		assertEquals((3.4 * 6.5), new Rectangle(3.4, 6.5).getArea(), delta);
		assertEquals((2 * 5.6 + 2 * 8.7), new Rectangle(5.6, 8.7).getCircumference(), delta);
	}

}
