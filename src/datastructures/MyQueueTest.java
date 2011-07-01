package datastructures;

import junit.framework.TestCase;

public class MyQueueTest extends TestCase {
	
	public void testUnsorted() {
		MyQueue myQueue = new MyQueue(3);
		assertEquals(3, myQueue.getSize());
		assertEquals(0, myQueue.getNumberOfElements());
		assertFalse(myQueue.isFull());
		assertTrue(myQueue.isEmpty());
		assertFalse(myQueue.isNotEmpty());
		assertNull(myQueue.front());
		
		myQueue.dequeue();
		assertEquals(0, myQueue.getNumberOfElements());
		
		myQueue.enqueue("one");
		assertEquals(1, myQueue.getNumberOfElements());
		assertFalse(myQueue.isFull());
		assertTrue(myQueue.isNotEmpty());
		assertEquals("one", myQueue.front());
		
		myQueue.enqueue("two");
		assertEquals(2, myQueue.getNumberOfElements());
		assertFalse(myQueue.isFull());
		assertTrue(myQueue.isNotEmpty());
		assertEquals("one", myQueue.front());

		myQueue.enqueue("three");
		assertEquals(3, myQueue.getNumberOfElements());
		assertTrue(myQueue.isFull());
		assertTrue(myQueue.isNotEmpty());
		assertEquals("one", myQueue.front());

		myQueue.enqueue("four");
		assertEquals(3, myQueue.getNumberOfElements());
		assertTrue(myQueue.isFull());
		assertTrue(myQueue.isNotEmpty());
		assertEquals("one", myQueue.front());

		myQueue.dequeue();
		assertEquals(2, myQueue.getNumberOfElements());
		assertFalse(myQueue.isFull());
		assertTrue(myQueue.isNotEmpty());
		assertEquals("two", myQueue.front());

		myQueue.dequeue();
		assertEquals(1, myQueue.getNumberOfElements());
		assertFalse(myQueue.isFull());
		assertTrue(myQueue.isNotEmpty());
		assertEquals("three", myQueue.front());
		
		myQueue.dequeue();
		assertEquals(0, myQueue.getNumberOfElements());
		assertFalse(myQueue.isFull());
		assertTrue(myQueue.isEmpty());
		assertNull(myQueue.front());

		myQueue.enqueue("one");
		myQueue.enqueue("two");
		myQueue.enqueue("three");
		myQueue.dequeue();
		myQueue.enqueue("four");
		assertEquals("two", myQueue.front());
		
		myQueue.dequeue();
		assertEquals("three", myQueue.front());
		myQueue.dequeue();
		assertEquals("four", myQueue.front());
		myQueue.enqueue("five");
		myQueue.enqueue("six");
		assertEquals("four", myQueue.front());
		myQueue.dequeue();
		assertEquals("five", myQueue.front());
		myQueue.dequeue();
		myQueue.dequeue();
		assertNull(myQueue.front());
	}
	

}
