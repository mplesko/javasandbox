package practice;
 
import junit.framework.TestCase;
 
public class PracticeTemplate extends TestCase{
 
      public void testFactorial() {
            assertEquals("factorial for 0", 1, factorial(0));
            assertEquals("factorial for 1", 1, factorial(1));
            assertEquals("factorial for 5", 120, factorial(5));
            assertEquals("factorial for 7", 5040, factorial(7));
            assertEquals("factorialLoop for 0", 1, factorialLoop(0));
            assertEquals("factorialLoop for 1", 1, factorialLoop(1));
            assertEquals("factorialLoop for 5", 120, factorialLoop(5));
            assertEquals("factorialLoop for 7", 5040, factorialLoop(7));
      }
      private int factorial(int limit) {
            if (limit == 0) return 1;
            return 0;
      }
      private int factorialLoop(int limit) {
            if (limit == 0) return 1;
            int returnValue = 1;
            return 0;
      }
 
      public void testPalindrome() {
            assertTrue("abba palindrome", palindrome("abba"));
            assertTrue("radar palindrome", palindrome("radar"));
            assertTrue("amanaplanacanalpanama palindrome", palindrome("amanaplanacanalpanama"));
            assertFalse("testing palindrome", palindrome("testing"));
            assertTrue("abba palindromeLoop", palindromeLoop("abba"));
            assertTrue("radar palindromeLoop", palindromeLoop("radar"));
            assertTrue("amanaplanacanalpanama palindromeLoop", palindromeLoop("amanaplanacanalpanama"));
            assertFalse("testing palindromeLoop", palindromeLoop("testing"));
      }
      private boolean palindrome(String string) {
            return false;
      }
      private boolean palindromeLoop(String string) {
            boolean returnValue = true;
            return returnValue;
      }
     
      public void testChop() {
            int[] numbers = {10,11,12,13,14,15,16,17,18,20};
            for (int i = 1; i <= 30; i++) {
                  if (i < 10 || i > 20 || i == 19) {
                        assertEquals("chop for " + i, -1, chop(numbers, i, 0, 9));
                        assertEquals("chop for " + i, -1, chopLoop(numbers, i));
                  } else if (i == 20) {
                        assertEquals("chop for 20", 9, chop(numbers, i, 0, 9));
                        assertEquals("chop for 20", 9, chopLoop(numbers, i));
                  } else {
                        assertEquals("chop for " + i, i - 10, chop(numbers, i, 0, 9));
                        assertEquals("chop for " + i, i - 10, chopLoop(numbers, i));
                  }
            }
      }
      private int chop(int[] numbers, int key, int startPos, int endPos) {
            if (key < numbers[startPos] || key > numbers[endPos]) {
                  return -1;
            }
            return 0;
      }
      private int chopLoop(int[] numbers, int key) {
            if (key < numbers[0] || key > numbers[numbers.length -1]) {
                  return -1;
            }
            return 0;
      }
 
      public void testFibonacci() {
            assertEquals("fibonacci for 0", 0, fibonacci(0));
            assertEquals("fibonacci for 1", 1, fibonacci(1));
            assertEquals("fibonacci for 2", 1, fibonacci(2));
            assertEquals("fibonacci for 3", 2, fibonacci(3));
            assertEquals("fibonacci for 4", 3, fibonacci(4));
            assertEquals("fibonacci for 5", 5, fibonacci(5));
            assertEquals("fibonacci for 7", 13, fibonacci(7));
            assertEquals("fibonacci for 10", 55, fibonacci(10));       
      }
      private int fibonacci(int limit) {
            if (limit == 0) return 0;
            if (limit == 1) return 1;
            return 0;
      }
 
      public void testWordReverse() {
            assertEquals("test a is This", wordReverse("This is a test"));
      }
      private String wordReverse(String string) {
            String returnValue = "";
            return returnValue;
      }
     
      public void testStringReverse() {
            assertEquals("gfedcba", stringReverseApi("abcdefg"));
            assertEquals("gfedcba", stringReverseRecursive("abcdefg"));
            assertEquals("gfedcba", stringReverseLoop("abcdefg"));
      }
      private static String stringReverseApi(String string) {
            return null;
      }
      private static String stringReverseRecursive(String string) {
            return null;
      }
      private static String stringReverseLoop(String string) {
            String returnValue = "";
            return returnValue;
      }
     
      public void testBubbleSort() {
      int[] sortedNumbers = sort(new int[] {5,6,3,4,4,9,8,1,2});
      String sortedAsString = "";
      for (int i = 0; i < sortedNumbers.length; i++) {
            sortedAsString = sortedAsString + sortedNumbers[i];
      }
      assertEquals("123445689", sortedAsString);           
      }
      private int[] sort(int[] numbers) {
            return new int[]{};
      }
     
      public void testFizzbuzz() {
            String expected = "12fizz4buzzfizz78fizzbuzz" +
            "11fizz1314fizzbuzz1617fizz19buzz" +
            "fizz2223fizzbuzz26fizz2829fizzbuzz" +
            "3132fizz34buzzfizz3738fizzbuzz" +
            "41fizz4344fizzbuzz4647fizz49buzz";
           
            assertEquals(expected, fizzbuzz(50));
            assertEquals(expected, fizzbuzzRecursive(50));
      }
      private String fizzbuzz(int limit) {
            String returnValue = "";
            return returnValue;          
      }
      private String fizzbuzzRecursive(int limit) {
            return "";
      }
      private String doFizzBuzz(int i) {
            return "";
      }
}