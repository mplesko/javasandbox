
public class averageAndSum {

	public static void main(String[] args) {

		int[] numbers = {1,2,3,4,5,6,7,8,9,10};
//		int[] numbers = {1,2,3,4,5,10};

		System.out.println("average = " + getAverage(numbers));
		cumulativeSum(numbers);		
	}

	static int getAverage(int[] numbers) {
		int theSum = 0;
		int index = 0;
		while (index < numbers.length) {
			theSum += numbers[index];
			index += 1;
		}
		return theSum / numbers.length;
	}

	static void cumulativeSum(int[] numbers) {
		int theSum = 0;
//		int index = 0;
//		while (index < numbers.length) {
//			theSum += numbers[index];
//			System.out.println((index + 1) + " " + theSum);
//			index += 1;
//		}
		
		for (int index = 0; index < numbers.length; index++) {
			theSum += numbers[index];
			System.out.println((index + 1) + " " + theSum);
		}
	}
}
