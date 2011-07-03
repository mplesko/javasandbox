package datastructures;

import junit.framework.TestCase;

public class MyQueueLinkTest extends TestCase {
	
	public void testIt() {
		MyQueueLink myQueueLink = new MyQueueLink();
		assertEquals(0, myQueueLink.getSize());
		assertEquals(0, myQueueLink.getNumberOfElements());
		assertNull(myQueueLink.front());
		
		myQueueLink.dequeue();
		assertEquals(0, myQueueLink.getNumberOfElements());
		
		myQueueLink.enqueue("one");
		assertEquals(1, myQueueLink.getNumberOfElements());
		assertEquals("one", myQueueLink.front());
		
		myQueueLink.enqueue("two");
		assertEquals(2, myQueueLink.getNumberOfElements());
		assertEquals("one", myQueueLink.front());

		myQueueLink.enqueue("three");
		assertEquals(3, myQueueLink.getNumberOfElements());
		assertEquals("one", myQueueLink.front());

		myQueueLink.enqueue("four");
		assertEquals(4, myQueueLink.getNumberOfElements());
		assertEquals("one", myQueueLink.front());

		myQueueLink.dequeue();
		assertEquals(3, myQueueLink.getNumberOfElements());
		assertEquals("two", myQueueLink.front());

		myQueueLink.dequeue();
		assertEquals(2, myQueueLink.getNumberOfElements());
		assertEquals("three", myQueueLink.front());
		
		myQueueLink.dequeue();
		assertEquals(1, myQueueLink.getNumberOfElements());
		assertEquals("four", myQueueLink.front());

		myQueueLink.enqueue("one");
		myQueueLink.enqueue("two");
		myQueueLink.enqueue("three");
		myQueueLink.dequeue();
		myQueueLink.enqueue("four");
		assertEquals("one", myQueueLink.front());
		
		myQueueLink.dequeue();
		assertEquals("two", myQueueLink.front());
		myQueueLink.dequeue();
		assertEquals("three", myQueueLink.front());
		myQueueLink.enqueue("five");
		myQueueLink.enqueue("six");
		assertEquals("three", myQueueLink.front());
		myQueueLink.dequeue();
		assertEquals("four", myQueueLink.front());
		myQueueLink.dequeue();
		myQueueLink.dequeue();
		myQueueLink.dequeue();
		assertNull(myQueueLink.front());
	}
}
