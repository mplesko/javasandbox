package datastructures;

import java.util.ArrayList;
import java.util.List;

public class MyStackList {

	private int topElementIndex;
	private List<Object> stack = new ArrayList<Object>();


	public MyStackList() {
		topElementIndex = -1;
	}

	public int getNumberOfElements() {
		return topElementIndex + 1;
	}

	public Object top() {
		if (topElementIndex < 0) {
			return null;
	} else {
			return stack.get(topElementIndex);
		}
	}
	
	public void push(Object obj) {
		topElementIndex++;
		stack.add(obj);			
	}
	
	public void pop() {
		if (isEmpty()) {
			return;
		} else {
			stack.remove(topElementIndex);
			topElementIndex--;
		}		
	}
	
	private boolean isEmpty() {
		return topElementIndex < 0;
	}
}