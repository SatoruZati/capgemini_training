package capgemini_02022026;

/*
Say that a "clump" in an array is a series of 2 or more adjacent elements of 
the same value. Return the number of clumps in the given array.
 
countClumps([1, 2, 2, 3, 4, 4]) → 2

countClumps([1, 1, 2, 1, 1]) → 2

countClumps([1, 1, 1, 1, 1]) → 1
  
 */

public class ClumpCheck {

	public static void main(String[] args) {
		int[] arr = { 1, 1, 2, 2, 2, 3, 4, 4 };
		// int [] arr = {1, 1, 1, 1, 1};

		int count = 0;
		int current = -1;

		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] == arr[i + 1] && arr[i] != current) {
				count++;
				current = arr[i];
			} else {
				current = arr[i];
			}
		}

		System.out.println(count);

	}

}
