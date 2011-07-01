package datastructures;

import junit.framework.TestCase;

public class MyQueueListTest extends TestCase {
	
	public void testIt() {
		MyQueueList myQueueList = new MyQueueList();
		assertEquals(0, myQueueList.getSize());
		assertEquals(0, myQueueList.getNumberOfElements());
		assertFalse(myQueueList.isFull());
		assertTrue(myQueueList.isEmpty());
		assertFalse(myQueueList.isNotEmpty());
		assertNull(myQueueList.front());
		
		myQueueList.dequeue();
		assertEquals(0, myQueueList.getNumberOfElements());
		
		myQueueList.enqueue("one");
		assertEquals(1, myQueueList.getNumberOfElements());
		assertFalse(myQueueList.isFull());
		assertTrue(myQueueList.isNotEmpty());
		assertEquals("one", myQueueList.front());
		
		myQueueList.enqueue("two");
		assertEquals(2, myQueueList.getNumberOfElements());
		assertFalse(myQueueList.isFull());
		assertTrue(myQueueList.isNotEmpty());
		assertEquals("one", myQueueList.front());

		myQueueList.enqueue("three");
		assertEquals(3, myQueueList.getNumberOfElements());
		assertFalse(myQueueList.isFull());
		assertTrue(myQueueList.isNotEmpty());
		assertEquals("one", myQueueList.front());

		myQueueList.enqueue("four");
		assertEquals(4, myQueueList.getNumberOfElements());
		assertFalse(myQueueList.isFull());
		assertTrue(myQueueList.isNotEmpty());
		assertEquals("one", myQueueList.front());

		myQueueList.dequeue();
		assertEquals(3, myQueueList.getNumberOfElements());
		assertFalse(myQueueList.isFull());
		assertTrue(myQueueList.isNotEmpty());
		assertEquals("two", myQueueList.front());

		myQueueList.dequeue();
		assertEquals(2, myQueueList.getNumberOfElements());
		assertFalse(myQueueList.isFull());
		assertTrue(myQueueList.isNotEmpty());
		assertEquals("three", myQueueList.front());
		
		myQueueList.dequeue();
		assertEquals(1, myQueueList.getNumberOfElements());
		assertFalse(myQueueList.isFull());
		assertFalse(myQueueList.isEmpty());
		assertEquals("four", myQueueList.front());

		myQueueList.enqueue("one");
		myQueueList.enqueue("two");
		myQueueList.enqueue("three");
		myQueueList.dequeue();
		myQueueList.enqueue("four");
		assertEquals("one", myQueueList.front());
		
		myQueueList.dequeue();
		assertEquals("two", myQueueList.front());
		myQueueList.dequeue();
		assertEquals("three", myQueueList.front());
		myQueueList.enqueue("five");
		myQueueList.enqueue("six");
		assertEquals("three", myQueueList.front());
		myQueueList.dequeue();
		assertEquals("four", myQueueList.front());
		myQueueList.dequeue();
		myQueueList.dequeue();
		myQueueList.dequeue();
		assertNull(myQueueList.front());
	}
	

}
