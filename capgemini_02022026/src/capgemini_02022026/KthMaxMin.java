package capgemini_02022026;

public class KthMaxMin {
	
	public static int[] sortArray(int[] arr) {
	    int n = arr.length;
	    for (int i = 0; i < n - 1; i++) {
	        for (int j = 0; j < n - i - 1; j++) {
	            if (arr[j] > arr[j + 1]) {
	                // swap arr[j] and arr[j+1]
	                int temp = arr[j];
	                arr[j] = arr[j + 1];
	                arr[j + 1] = temp;
	            }
	        }
	    }
	    return arr;
	}

	public static void main(String[] args) {
		// Kth maximum and minimum element in an array
		
		int [] arr = {7, 10, 4, 3, 20, 15, 17, 9, 10, 12};
		int k = 3;
		
		// print array
		for (int i : arr) {
			System.out.print(i + " ");
		}
		System.out.println();

		// Sort the array
		int [] arr02 = sortArray(arr);
		
		for (int i : arr02) {
			System.out.print(i + " ");
		}
		
		System.out.println();
		
		System.out.println("The " + k + "th minimum element is: " + arr02[k - 1]);
		System.out.println("The " + k + "th maximum element is: " + arr02[arr02.length - k]);
	}

}
