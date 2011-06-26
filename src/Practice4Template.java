
public class Practice4Template {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
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

	private static int fibonacci(int limit) {
		
		return 0;
	}

	private static int chop(int[] numbers, int numberToFind, int startPos, int endPos) {
		
		return 0;
	}

	private static boolean palindrome(String string) {
		return false;
	}

	private static int factorial(int i) {
		return 0;

	}

}
