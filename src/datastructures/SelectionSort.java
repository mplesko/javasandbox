package datastructures;

public class SelectionSort {
		
	public static void main (String[] args) {
		int[] values = {2,24,6,7,5,3,9,11,32,4};
		for (int currPos = 0; currPos < values.length; currPos++) {
			int lowestValuePos = findLowestPos(currPos, values);
			if (lowestValuePos == currPos) {continue;}
			int temp = values[currPos];
			values[currPos] = values[lowestValuePos];
			values[lowestValuePos] = temp;
		}
		for (int i = 0; i < values.length; i++) {
			System.out.println(values[i]);
		}
	}

	private static int findLowestPos(int startPos, int[] values) {
		int lowestValuePos = startPos;
		for (int currPos = startPos + 1; currPos < values.length; currPos++) {
			if (values[currPos] < values[lowestValuePos]) {
				lowestValuePos = currPos;
			}
		}
		return lowestValuePos;
	}

}
