package datastructures;

import junit.framework.TestCase;

public class MyStackLinkTest extends TestCase {
	
	public void test1() {
		MyStackLink myStackLink = new MyStackLink();
		assertEquals(0, myStackLink.getNumberOfElements());
		assertNull(myStackLink.top());
		
		myStackLink.pop();
		assertEquals(0, myStackLink.getNumberOfElements());
		assertNull(myStackLink.top());
		
		String s1 = new String("1");
		myStackLink.push(s1);
		assertEquals(1, myStackLink.getNumberOfElements());
		assertEquals(s1, myStackLink.top());
		
		String s2 = new String("2");
		myStackLink.push(s2);
		assertEquals(2, myStackLink.getNumberOfElements());
		assertEquals(s2, myStackLink.top());
		
		String s3 = new String("3");
		myStackLink.push(s3);
		assertEquals(3, myStackLink.getNumberOfElements());
		assertEquals(s3, myStackLink.top());
		
		myStackLink.pop();
		assertEquals(2, myStackLink.getNumberOfElements());
		assertEquals(s2, myStackLink.top());
		
		myStackLink.pop();
		assertEquals(1, myStackLink.getNumberOfElements());
		assertEquals(s1, myStackLink.top());
		
		myStackLink.pop();
		assertEquals(0, myStackLink.getNumberOfElements());
		assertNull(myStackLink.top());
		
	}
	
	public void testSpecialChars() {
		MyStackLink myStackLink = new MyStackLink();
		char[] chars1 = {'a','{','a','{','[',']','(',')',')','}','a'};
		System.out.println(chars1);
		
		testLoop(myStackLink, chars1);

		myStackLink = new MyStackLink();
		char[] chars2 = {'a','{','a','{','[',']','(',')','}','}','a'};
		System.out.println();
		System.out.println(chars2);

		testLoop(myStackLink, chars2);

	}

	private void testLoop(MyStackLink myStackLink, char[] chars1) {
		for (int i = 0; i < chars1.length; i++) {
			System.out.print(chars1[i]);
			if (isStartChar(chars1[i])) {
				myStackLink.push(Character.valueOf(chars1[i]));
			} else if (isEndChar(chars1[i])) {
				char c = ((Character)myStackLink.top()).charValue();
				myStackLink.pop();
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
