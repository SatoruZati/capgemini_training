package capgemini_02022026;

public class binary_search {

	public static int binarySearch(int[] arr, int target) {

		// algorithm for binary search: 
		// 1. find the middle element of the array
		// 2. if the middle element is equal to the target, return the index
		// 3. if the middle element is less than the target, search the right half of the array
		// 4. if the middle element is greater than the target, search the left half of the array
		// 5. repeat steps 1-4 until the target is found or the array is exhausted
		
		int left = 0;
		int right = arr.length - 1;

		while (left <= right) {
			int mid = left + (right - left) / 2;

			// Check if target is present at mid
			if (arr[mid] == target) {
				return mid; // Target found
			}

			// If target is greater, ignore left half
			if (arr[mid] < target) {
				left = mid + 1;
			}
			// If target is smaller, ignore right half
			else {
				right = mid - 1;
			}
		}

		// Target was not found in the array
		return -1;
	}

	public static void main(String[] args) {
		// Binary Search Implementation
		// we need a sorted array for binary search
		int[] arr = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100 };
		int target = 70;
		int result = binarySearch(arr, target);
		if (result == -1) {
			System.out.println("Element not found in the array.");
		} else {
			System.out.println("Element found at index: " + result);
		}
	}
}
