package datastructures;

public class BubbleSort {
		
	public static void main (String[] args) {
		int[] values = {2,24,6,7,5,3,9,11,32,4};
		for (int currPos = 0; currPos < values.length; currPos++) {
			boolean sorted = bubbleIt(currPos, values);
			if (sorted) {break;}
		}
		for (int i = 0; i < values.length; i++) {
			System.out.println(values[i]);
		}
	}

	private static boolean bubbleIt(int startPos, int[] values) {
		boolean sorted = true;
		for (int currPos = values.length -1; currPos > startPos; currPos--) {
			if (values[currPos] < values[currPos - 1]) {
				int temp = values[currPos];
				values[currPos] = values[currPos - 1];
				values[currPos - 1] = temp;
				sorted = false;
			}
		}
		return sorted;
	}

}
