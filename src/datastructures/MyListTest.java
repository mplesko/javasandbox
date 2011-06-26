package datastructures;

import junit.framework.TestCase;

public class MyListTest extends TestCase {
	
	public void testUnsorted() {
		MyList myList = new MyList(10, new MyUnsortedListUtils());
		assertEquals(10, myList.getSize());
		assertEquals(0, myList.getNumberOfElements());
		assertFalse(myList.isFull());
		
		assertEquals(0, myList.add(new MyComparable("one")));
		assertEquals(10, myList.getSize());
		assertEquals(1, myList.getNumberOfElements());
		assertFalse(myList.isFull());
		assertEquals(0, myList.add(new MyComparable("two")));
		assertEquals(2, myList.getNumberOfElements());
		assertFalse(myList.isFull());
		assertEquals(0, myList.add(new MyComparable("three")));
		assertEquals(3, myList.getNumberOfElements());
		assertEquals(0, myList.add(new MyComparable("four")));
		assertEquals(0, myList.add(new MyComparable("five")));
		assertEquals(0, myList.add(new MyComparable("six")));
		assertEquals(0, myList.add(new MyComparable("seven")));
		assertEquals(0, myList.add(new MyComparable("eight")));
		assertEquals(0, myList.add(new MyComparable("nine")));
		assertEquals(0, myList.add(new MyComparable("ten")));
		assertEquals(10, myList.getNumberOfElements());
		
		assertTrue(myList.isFull());
		
		assertEquals(-1, myList.add(new MyComparable("three")));
		assertEquals(-1, myList.add(new MyComparable("eleven")));
		
		assertTrue(myList.contains(new MyComparable("one")));
		assertTrue(myList.contains(new MyComparable("two")));
		assertTrue(myList.contains(new MyComparable("three")));
		assertFalse(myList.contains(new MyComparable("test")));
		
		assertEquals(-1, myList.remove(new MyComparable("eleven")));
		assertEquals(0, myList.remove(new MyComparable("ten")));
		assertEquals(9, myList.getNumberOfElements());
		assertEquals(0, myList.remove(new MyComparable("five")));
		assertEquals(8, myList.getNumberOfElements());
		assertEquals(0, myList.remove(new MyComparable("one")));
		assertEquals(7, myList.getNumberOfElements());
	}
	
	public void testUnsortedNext() {
		MyList myList = new MyList(3, new MyUnsortedListUtils());
		myList.add(new MyComparable("one"));
		myList.add(new MyComparable("two"));
		myList.add(new MyComparable("three"));
		
		assertEquals("one", ((MyComparable)myList.getNext()).value);
		assertEquals("two", ((MyComparable)myList.getNext()).value);
		assertEquals("three", ((MyComparable)myList.getNext()).value);
		assertEquals("one", ((MyComparable)myList.getNext()).value);
		assertEquals("two", ((MyComparable)myList.getNext()).value);

		myList.reset();
		assertEquals("one", ((MyComparable)myList.getNext()).value);
		
		myList = new MyList(5, new MyUnsortedListUtils());
		myList.add(new MyComparable("one"));
		myList.add(new MyComparable("two"));
		myList.add(new MyComparable("three"));
		assertEquals("one", ((MyComparable)myList.getNext()).value);
		assertEquals("two", ((MyComparable)myList.getNext()).value);
		assertEquals("three", ((MyComparable)myList.getNext()).value);
		assertEquals("one", ((MyComparable)myList.getNext()).value);
		assertEquals("two", ((MyComparable)myList.getNext()).value);

	}
	
	public void testSorted() {
		MyList myList = new MyList(10, new MySortedListUtils());
		assertEquals(10, myList.getSize());
		assertEquals(0, myList.getNumberOfElements());
		assertFalse(myList.isFull());
		
		assertEquals(0, myList.add(new MyComparable("one")));
		assertEquals(10, myList.getSize());
		assertEquals(1, myList.getNumberOfElements());
		assertFalse(myList.isFull());
		assertEquals(0, myList.add(new MyComparable("two")));
		assertEquals(2, myList.getNumberOfElements());
		assertFalse(myList.isFull());
		assertEquals(0, myList.add(new MyComparable("three")));
		assertEquals(3, myList.getNumberOfElements());
		assertEquals(0, myList.add(new MyComparable("four")));
		assertEquals(0, myList.add(new MyComparable("five")));
		assertEquals(0, myList.add(new MyComparable("six")));
		assertEquals(0, myList.add(new MyComparable("seven")));
		assertEquals(0, myList.add(new MyComparable("eight")));
		assertEquals(0, myList.add(new MyComparable("nine")));
		assertEquals(0, myList.add(new MyComparable("ten")));
		assertEquals(10, myList.getNumberOfElements());
		
		assertTrue(myList.isFull());
		
		assertEquals(-1, myList.add(new MyComparable("three")));
		assertEquals(-1, myList.add(new MyComparable("eleven")));
		
		assertTrue(myList.contains(new MyComparable("one")));
		assertTrue(myList.contains(new MyComparable("two")));
		assertTrue(myList.contains(new MyComparable("three")));
		assertFalse(myList.contains(new MyComparable("test")));
		
		assertEquals(-1, myList.remove(new MyComparable("eleven")));
		assertEquals(0, myList.remove(new MyComparable("ten")));
		assertEquals(9, myList.getNumberOfElements());
		assertEquals(0, myList.remove(new MyComparable("five")));
		assertEquals(8, myList.getNumberOfElements());
		assertEquals(0, myList.remove(new MyComparable("one")));
		assertEquals(7, myList.getNumberOfElements());
	}
	
	public void testSortedNext() {
		MyList myList = new MyList(3, new MySortedListUtils());
		myList.add(new MyComparable("one"));
		myList.add(new MyComparable("two"));
		myList.add(new MyComparable("three"));
		
		assertEquals("one", ((MyComparable)myList.getNext()).value);
		assertEquals("three", ((MyComparable)myList.getNext()).value);
		assertEquals("two", ((MyComparable)myList.getNext()).value);
		assertEquals("one", ((MyComparable)myList.getNext()).value);
		assertEquals("three", ((MyComparable)myList.getNext()).value);

		myList.reset();
		assertEquals("one", ((MyComparable)myList.getNext()).value);
		
		myList = new MyList(5, new MySortedListUtils());
		myList.add(new MyComparable("one"));
		myList.add(new MyComparable("two"));
		myList.add(new MyComparable("three"));
		assertEquals("one", ((MyComparable)myList.getNext()).value);
		assertEquals("three", ((MyComparable)myList.getNext()).value);
		assertEquals("two", ((MyComparable)myList.getNext()).value);
		assertEquals("one", ((MyComparable)myList.getNext()).value);
		assertEquals("three", ((MyComparable)myList.getNext()).value);

	}

}
