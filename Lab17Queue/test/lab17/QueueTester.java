package lab17;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class QueueTester {

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
	public void LinkedQueueTest() throws EmptyCollectionException {
		LinkedQueue<Integer> q = new LinkedQueue<Integer>();
				
				assertTrue(q.isEmpty());
				
				q.enqueue(new Integer(3));
				q.enqueue(new Integer(4));
				q.enqueue(new Integer(5));
				q.enqueue(new Integer(6));
				
				assertTrue(q.dequeue() == 3);
				assertTrue(q.first() == 4);
				assertTrue(q.size() == 3);
				
	}

	@Test
	public void ArrayQueueTest() throws EmptyCollectionException {
		CircularArrayQueue<Integer> q = new CircularArrayQueue<Integer>();
		
		assertTrue(q.isEmpty());
		
		q.enqueue(new Integer(3));
		q.enqueue(new Integer(4));
		q.enqueue(new Integer(5));
		q.enqueue(new Integer(6));
		
		assertTrue(q.dequeue() == 3);
		assertTrue(q.first() == 4);
		assertTrue(q.size() == 3);
		
		
	}
	
}
