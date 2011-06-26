package datastructures;

public class MyStack {

	private int topElementIndex;
	private Object[] stack;


	public MyStack(int stackSize) {
		stack = new Object[stackSize];
		topElementIndex = -1;
	}

	public int getSize() {
		return stack.length;
	}

	public int getNumberOfElements() {
		return topElementIndex + 1;
	}

	public Object top() {
		if (topElementIndex < 0) {
			return null;}
		else {
			return stack[topElementIndex];
		}
	}
	
	public void push(Object obj) {
		if (isFull()) {
			return;
		} else {
			topElementIndex++;
			stack[topElementIndex] = obj;			
		}		
	}
	
	public void pop() {
		if (isEmpty()) {
			return;
		} else {
			stack[topElementIndex] = null;
			topElementIndex--;
		}		
	}
	
	private boolean isEmpty() {
		return topElementIndex < 0;
	}
	public boolean isFull() {
		return topElementIndex == (getSize() - 1);
	}
}