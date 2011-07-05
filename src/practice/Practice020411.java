package practice;
 
import junit.framework.TestCase;
 
public class Practice020411 extends TestCase{
 
      public void testFactorial() {
            assertEquals("factorial for 0", 0, factorial(0));
            assertEquals("factorial for 1", 1, factorial(1));
            assertEquals("factorial for 5", 120, factorial(5));
            assertEquals("factorial for 7", 5040, factorial(7));
            assertEquals("factorialLoop for 0", 0, factorialLoop(0));
            assertEquals("factorialLoop for 1", 1, factorialLoop(1));
            assertEquals("factorialLoop for 5", 120, factorialLoop(5));
            assertEquals("factorialLoop for 7", 5040, factorialLoop(7));
      }
      private int factorial(int limit) {
            if (limit == 0) return 0;
            if (limit == 1) return 1;
            return factorial(limit -1) * limit;
      }
      private int factorialLoop(int limit) {
            if (limit == 0) return 0;
            int returnValue = 1;
            for (int i=1; i<= limit; i++) {
                  returnValue *= i;
            }
            return returnValue;
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
            if (string.length() < 2) return true;
            if (string.charAt(0) == string.charAt(string.length() -1)) {
                  return palindrome(string.substring(1, string.length() -1));
            } else {
                  return false;
            }
      }
      private boolean palindromeLoop(String string) {
            boolean returnValue = true;
            while(string.length() > 1) {
                  if (string.charAt(0) == string.charAt(string.length() -1)) {
                        string = string.substring(1, string.length() -1);
                  } else {
                        returnValue = false;
                        break;
                  }
            }
            return returnValue;
      }
     
      public void testChop() {
            int[] numbers = {10,11,12,13,14,15,16,17,18,20};
            for (int i = 1; i <= 30; i++) {
                  if (i < 10 || i > 20 || i == 19) {
                        assertEquals("chop for " + i, -1, chop(numbers, i, 0, 9));
                  } else if (i == 20) {
                        assertEquals("chop for 20", 9, chop(numbers, i, 0, 9));
                  } else {
                        assertEquals("chop for " + i, i - 10, chop(numbers, i, 0, 9));
                  }
            }
      }
      private int chop(int[] numbers, int key, int startPos, int endPos) {
            if (key < numbers[startPos] || key > numbers[endPos]) {
                  return -1;
            }
            int midPos = startPos + (endPos - startPos) / 2;
            if (key == numbers[midPos]) {
                  return midPos;
            }
            if (key < numbers[midPos]) {
                  return chop(numbers,key,startPos,midPos-1);
            } else {
                  return chop(numbers,key, midPos +1, endPos);
            }
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
            return fibonacci(limit -2) + fibonacci(limit -1);
      }
 
      public void testWordReverse() {
            assertEquals("test a is This", wordReverse("This is a test"));
      }
      private String wordReverse(String string) {
            String returnValue = "";
            String[] words = string.split("\\s");
            for (int i = 0; i < words.length; i++) {
                  if (i > 0) returnValue = " " + returnValue;
                  returnValue = words[i] + returnValue;
            }
            return returnValue;
      }
     
      public void testStringReverse() {
            assertEquals("gfedcba", stringReverseApi("abcdefg"));
            assertEquals("gfedcba", stringReverseRecursive("abcdefg"));
            assertEquals("gfedcba", stringReverseLoop("abcdefg"));
      }
      private static String stringReverseApi(String string) {
            return new StringBuilder(string).reverse().toString();
      }
      private static String stringReverseRecursive(String string) {
            if (string.length() ==1) return string;
            return stringReverseRecursive(string.substring(1)) + string.charAt(0);
      }
      private static String stringReverseLoop(String string) {
            String returnValue = "";
            while(string.length() > 0) {
                  returnValue = string.charAt(0) + returnValue;
                  string = string.substring(1);
            }
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
            if (numbers.length < 2) return numbers;
            int i = 0;
            while(i < numbers.length - 1) {
                  if (numbers[i] > numbers[i+1]) {
                        int temp = numbers[i];
                        numbers[i] = numbers[i+1];
                        numbers[i+1] = temp;
                        i = 0;
                        continue;
                  }
                  i++;
            }
            return numbers;
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
            for (int i = 1; i <= limit; i++) {
                  if (i % 3 == 0) returnValue += "fizz";
                  if (i % 5 == 0) returnValue += "buzz";
                  if (i % 3 != 0 && i % 5 != 0) returnValue += String.valueOf(i);
            }
            return returnValue;          
      }
      private String fizzbuzzRecursive(int limit) {
            if (limit == 1) return doFizzBuzz(1);
            return fizzbuzzRecursive(limit -1) + doFizzBuzz(limit);
      }
      private String doFizzBuzz(int i) {
            if (i % (15) == 0) return "fizzbuzz";
            if (i % 3 == 0) return "fizz";
            if (i % 5 == 0) return "buzz";
            return String.valueOf(i);    
      }
//    private String doFizzBuzz(int i) {
//          String returnValue = "";
//          if (i % 3 == 0) returnValue += "fizz";
//          if (i % 5 == 0) returnValue += "buzz";
//          if (i % 3 != 0 && i % 5 != 0) returnValue += String.valueOf(i);
//          return returnValue;          
//    }
}