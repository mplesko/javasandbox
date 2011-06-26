package datastructures;

import junit.framework.TestCase;

public class MyStackTest extends TestCase {
	
	public void test1() {
		MyStack myStack = new MyStack(3);
		assertEquals(3, myStack.getSize());
		assertEquals(0, myStack.getNumberOfElements());
		assertFalse(myStack.isFull());
		assertNull(myStack.top());
		
		myStack.pop();
		assertEquals(0, myStack.getNumberOfElements());
		assertNull(myStack.top());
		
		String s1 = new String("1");
		myStack.push(s1);
		assertEquals(1, myStack.getNumberOfElements());
		assertEquals(s1, myStack.top());
		
		String s2 = new String("2");
		myStack.push(s2);
		assertEquals(2, myStack.getNumberOfElements());
		assertEquals(s2, myStack.top());
		
		String s3 = new String("3");
		myStack.push(s3);
		assertEquals(3, myStack.getNumberOfElements());
		assertEquals(s3, myStack.top());
		assertTrue(myStack.isFull());
		
		String s4 = new String("4");
		myStack.push(s4);
		assertEquals(3, myStack.getNumberOfElements());
		assertEquals(s3, myStack.top());
		assertTrue(myStack.isFull());
		
		myStack.pop();
		assertEquals(2, myStack.getNumberOfElements());
		assertEquals(s2, myStack.top());
		
		myStack.pop();
		assertEquals(1, myStack.getNumberOfElements());
		assertEquals(s1, myStack.top());
		
		myStack.pop();
		assertEquals(0, myStack.getNumberOfElements());
		assertNull(myStack.top());
		
	}
	
	public void testSpecialChars() {
		MyStack myStack = new MyStack(10);
		char[] chars1 = {'a','{','a','{','[',']','(',')',')','}','a'};
		System.out.println(chars1);
		
		testLoop(myStack, chars1);

		myStack = new MyStack(10);
		char[] chars2 = {'a','{','a','{','[',']','(',')','}','}','a'};
		System.out.println();
		System.out.println(chars2);

		testLoop(myStack, chars2);

	}

	private void testLoop(MyStack myStack, char[] chars1) {
		for (int i = 0; i < chars1.length; i++) {
			System.out.print(chars1[i]);
			if (isStartChar(chars1[i])) {
				myStack.push(Character.valueOf(chars1[i]));
			} else if (isEndChar(chars1[i])) {
				char c = ((Character)myStack.top()).charValue();
				myStack.pop();
				if (! matchingChars(chars1[i], c)) {
					System.out.print(" mismatch");
					break;
				}
			}
		}
	}
	
	private boolean matchingChars(char endChar, char startChar) {
		if (startChar == '{') {
			return endChar == '}';
		} else if (startChar == '[') {
			return endChar == ']';
		} else if (startChar == '(') {
			return endChar == ')';
		}
		return false;
	}
	 
	public boolean isSpecialChar(char value) {
		return isStartChar(value) || isEndChar(value);
	}
	public boolean isStartChar(char value) {
		return value == '{' || value == '[' || value == '(';
	}
	public boolean isEndChar(char value) {
		return value == '}' || value == ']' || value == ')';
	}


}
