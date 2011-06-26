
public class Practice4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] sortNumbers = {5,6,3,4,7,9,8,1,2,4};
		int[] sortedNumbers = sort(sortNumbers);
		String s = "";
		for (int i = 0; i < sortedNumbers.length; i++) {
			s = s + sortedNumbers[i];
		}
		System.out.println("sorted numbers " + s);
		
		System.out.println(reverseStringBuffer("abcdefg"));
		System.out.println(reverseStringLoop("abcdefg"));
		System.out.println(reverseStringRecursive("abcdefg"));
		
		System.out.println("factorial for 5 = " + factorial(5));

		System.out.println("is abba a palindrome = " + palindrome("abba"));
		System.out.println("is radar a palindrome = " + palindrome("radar"));
		System.out.println("is amanaplanacanalpanama a palindrome = " + palindrome("amanaplanacanalpanama"));
		System.out.println("is testing a palindrome = " + palindrome("testing"));

		int[] numbers = {10,11,12,13,14,15,16,17,18,19,20};
		for (int i = 1; i <= 30; i++) {
			System.out.println(
					i + " is in position = " + chop(numbers, i, 0, 10));
		}

		for (int i = 1; i <= 10; i++) {
			System.out.println(
					" fibonacci for " + i + " = " + fibonacci(i));
		}
		
		
}

	private static String reverseStringBuffer(String string) {
		return new StringBuffer(string).reverse().toString();
	}

	private static String reverseStringLoop(String string) {
		String returnValue = "";
		for (int i = 0; i < string.length(); i++) {
			returnValue = string.charAt(i) + returnValue;
		}
		return returnValue;
	}

	private static String reverseStringRecursive(String string) {
		if (string.length() < 1) { return string;}
		
		return reverseStringRecursive(string.substring(1)) + string.charAt(0);
	}

	private static int[] sort(int[] numbers) {
		int i = 0;
		while (i < numbers.length - 1) {
			if (numbers[i] > numbers[i+1]) {
				int temp = numbers[i];
				numbers[i] = numbers[i+1];
				numbers[i+1] = temp;
				i = 0; 	continue;				
			}
			i++;
			continue;
		}
		return numbers;
	}

	private static int fibonacci(int limit) {
		
		int returnValue = 1;
		int prevValue = 0;
		for (int i = 1; i <= limit; i++) {
			int temp = returnValue;
			returnValue = returnValue + prevValue;
			prevValue = temp;
		}
		return returnValue;
	}

	private static int chop(int[] numbers, int numberToFind, int startPos, int endPos) {
		if (numberToFind < numbers[startPos] || numberToFind > numbers[endPos])
			return -1;

		int midpoint = startPos + ((endPos - startPos) / 2);

		if (numberToFind == numbers[midpoint]) return midpoint;

		if (numberToFind < numbers[midpoint]) {
			return chop(numbers, numberToFind, startPos, midpoint - 1);
		} else {
			return chop(numbers, numberToFind, midpoint + 1, endPos);
		}		
	}

	private static boolean palindrome(String string) {
		if (string.length() < 3) {
			return string.charAt(0) == string.charAt(string.length() - 1);
		} else  if (string.charAt(0) == string.charAt(string.length() - 1)){
			return palindrome(string.substring(1, string.length() - 1));
		} else {
			return false;
		}
	}

	private static int factorial(int i) {
		if (i == 0) {
			return 1;
		} else {
			return i * factorial(i - 1);
		}

	}

}
