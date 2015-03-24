package lab12;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class ListTester {

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
	public void SLinkedListTest1() {
		List list = new SLinkedList();
		
		list.add(new Integer(10));
		list.add(new Integer(11));
		list.add(new Integer(16));
		
		assertTrue(list.size() == 3);
		list.add(new Integer(11));
		list.add(new Integer(16));
		assertTrue(list.size() == 5);
		
		assertTrue(list.get(3).equals(new Integer(16)));
	}
	
	@Test
	public void SLinkedListTest2() {
		List list = new SLinkedList();
		
		list.add(new String("These"));
		list.add(new String("are"));
		list.add(new String("some"));
		list.add(new String("test"));
		list.add(new String("words."));
		assertTrue(list.size() == 5);
		
		list.add(new String("Here is a sentence."));
		list.add(new String("Do or do not. There is no try."));
		assertTrue(list.size() == 7);
		assertTrue(list.get(7).equals(new String("Do or do not. There is no try.")));
	}
	
	@Test
	public void ArrayListTest1() {
		List list = new ArrayList();
		
		list.add(new Integer(2));
		list.add(new Integer(4));
		list.add(new Integer(6));
		list.add(new Integer(8));
		
		assertTrue(list.size() == 4);
		assertTrue(list.get(2).equals(new Integer(4)));
	}
	
	@Test
	public void ArrayListTest2() {
		List list = new ArrayList();
		
		list.add(new Character('a'));
		list.add(new Character('e'));
		list.add(new Character('i'));
		list.add(new Character('o'));
		list.add(new Character('u'));
		
		assertTrue(list.size() == 5);
		
		list.add(new Character('3'));
		list.add(new Character('5'));
		list.add(new Character('7'));
		
		assertTrue(list.size() == 8);
		assertTrue(list.get(7).equals(new Character('5')));
	}

}
