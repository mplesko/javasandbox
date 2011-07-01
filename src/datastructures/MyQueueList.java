package datastructures;

import java.util.ArrayList;
import java.util.List;

public class MyQueueList {

	private List<Object> theQueue = new ArrayList<Object>();


	public MyQueueList() {
	}

	public int getSize() {
		return theQueue.size();
	}

	public int getNumberOfElements() {
		return getSize();
	}

	public Object front() {
		if (isEmpty()) {
			return null;
		} else {
			return theQueue.get(0);
		}
	}
	
	public void enqueue(Object obj) {
		theQueue.add(obj);
	}
	
	public void dequeue() {
		if (isEmpty()) {
			return;
		}
		theQueue.remove(0);
	}
	
	boolean isEmpty() {
		return getSize() == 0;
	}
	boolean isNotEmpty() {
		return ! isEmpty();
	}
	public boolean isFull() {
		return false;
	}
}