package lab15;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class StackTester {

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
	public void ArrayStackTest() {
		Stack<Integer> stack = new ArrayStack<Integer>();
		stack.push(new Integer(1));
		stack.push(new Integer(10));
		stack.push(new Integer(6));
		
		try{
			assertTrue(stack.size() == 3);
			assertTrue(stack.peek().intValue() == 6);
			assertTrue(stack.pop().intValue() == 6);
			assertTrue(stack.pop().intValue() == 10);
			
			assertTrue(stack.size() == 1);
			assertTrue(!stack.isEmpty());
			assertTrue(stack.pop().intValue() == 1);
			assertTrue(stack.isEmpty());
			assertTrue(stack.size() == 0);
		}catch(EmptyCollectionException ece) {
			System.err.println("Should not ever be here.");
		}
	}
	
	@Test
	public void EmptyTest() {
		ArrayStack<Integer> stack = new ArrayStack<Integer>();
		
		try{
			stack.peek();
		}catch(EmptyCollectionException ece){
		}
		
		try{
			stack.pop();
		}catch(EmptyCollectionException ece){
		}
	}
	
	
}
