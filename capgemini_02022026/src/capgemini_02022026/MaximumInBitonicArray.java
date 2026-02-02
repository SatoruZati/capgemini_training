package capgemini_02022026;

public class MaximumInBitonicArray {

	public static int findMaximumInBitonicArray(int[] arr) {
		int left = 0;
		int right = arr.length - 1;

		while (left < right) {
			int mid = left + (right - left) / 2;

			// Check if mid is in the increasing part of the array
			if (arr[mid] < arr[mid + 1]) {
				left = mid + 1; // Move to the right half
			} else {
				right = mid; // Move to the left half
			}
		}

		// At the end of the loop, left == right pointing to the maximum element
		return left;
		
	}

	public static void main(String[] args) {
		// Bitonic Array: An array which is first increasing and then decreasing
		// Example: {1, 3, 8, 12, 4, 2}
		
		int[] bitonicArray = { 1, 3, 8, 12, 4, 2 };
		
		int res = findMaximumInBitonicArray(bitonicArray);
		System.out.println("The maximum element is at index: " + res + " with value: " + bitonicArray[res]);
	}

}
