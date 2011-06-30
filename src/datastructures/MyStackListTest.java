package datastructures;

import junit.framework.TestCase;

public class MyStackListTest extends TestCase {
	
	public void test1() {
		MyStackList myStackList = new MyStackList();
		assertEquals(0, myStackList.getNumberOfElements());
		assertNull(myStackList.top());
		
		myStackList.pop();
		assertEquals(0, myStackList.getNumberOfElements());
		assertNull(myStackList.top());
		
		String s1 = new String("1");
		myStackList.push(s1);
		assertEquals(1, myStackList.getNumberOfElements());
		assertEquals(s1, myStackList.top());
		
		String s2 = new String("2");
		myStackList.push(s2);
		assertEquals(2, myStackList.getNumberOfElements());
		assertEquals(s2, myStackList.top());
		
		String s3 = new String("3");
		myStackList.push(s3);
		assertEquals(3, myStackList.getNumberOfElements());
		assertEquals(s3, myStackList.top());
		
		myStackList.pop();
		assertEquals(2, myStackList.getNumberOfElements());
		assertEquals(s2, myStackList.top());
		
		myStackList.pop();
		assertEquals(1, myStackList.getNumberOfElements());
		assertEquals(s1, myStackList.top());
		
		myStackList.pop();
		assertEquals(0, myStackList.getNumberOfElements());
		assertNull(myStackList.top());
		
	}
	
	public void testSpecialChars() {
		MyStackList myStackList = new MyStackList();
		char[] chars1 = {'a','{','a','{','[',']','(',')',')','}','a'};
		System.out.println(chars1);
		
		testLoop(myStackList, chars1);

		myStackList = new MyStackList();
		char[] chars2 = {'a','{','a','{','[',']','(',')','}','}','a'};
		System.out.println();
		System.out.println(chars2);

		testLoop(myStackList, chars2);

	}

	private void testLoop(MyStackList myStackList, char[] chars1) {
		for (int i = 0; i < chars1.length; i++) {
			System.out.print(chars1[i]);
			if (isStartChar(chars1[i])) {
				myStackList.push(Character.valueOf(chars1[i]));
			} else if (isEndChar(chars1[i])) {
				char c = ((Character)myStackList.top()).charValue();
				myStackList.pop();
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
