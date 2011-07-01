package datastructures;

public class MyQueue {

	private int frontElementIndex;
	private int endElementIndex;
	private int numberOfElements;
	private Object[] theQueue;


	public MyQueue(int theQueueSize) {
		theQueue = new Object[theQueueSize];
		frontElementIndex = 0;
		endElementIndex = 0;
		numberOfElements = 0;
	}

	public int getSize() {
		return theQueue.length;
	}

	public int getNumberOfElements() {
		return numberOfElements;
	}

	public Object front() {
		if (numberOfElements == 0) {
			return null;
		} else {
			return theQueue[frontElementIndex];
		}
	}
	
	public void enqueue(Object obj) {
		if (isFull()) {
			return;
		} else if (isNotEmpty()) {
			endElementIndex++;
			if (endElementIndex == getSize()) {
				endElementIndex = 0;
			}
		}
		theQueue[endElementIndex] = obj;					
		numberOfElements++;
	}
	
	public void dequeue() {
		if (isEmpty()) {
			return;
		}
		theQueue[frontElementIndex] = null;
		numberOfElements--;
		if (numberOfElements == 0) {
			frontElementIndex = 0;
			endElementIndex = 0;			
		} else {
			frontElementIndex++;
			if (frontElementIndex == getSize()) {
				frontElementIndex = 0;
			}
		}
	}
	
	boolean isEmpty() {
		return getNumberOfElements() == 0;
	}
	boolean isNotEmpty() {
		return ! isEmpty();
	}
	public boolean isFull() {
		return getNumberOfElements() == getSize();
	}
}