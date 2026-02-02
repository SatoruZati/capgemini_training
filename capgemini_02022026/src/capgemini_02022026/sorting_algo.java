package capgemini_02022026;

// algorithm: Bubble Sort
// mechanism: 
// 1. Repeatedly steps through the list
// 2. Compares adjacent elements
// 3. Swaps them if they are in the wrong order
// 4. The pass through the list is repeated until the list is sorted
// time complexity: O(n^2) in worst and average case, O(n) in best case
// space complexity: O(1) (in-place sorting) 

// pseudo code:
/*
 
procedure bubbleSort(A : list of sortable items)
	n := length(A)
	repeat
		swapped := false
		for i := 1 to n-1 inclusive do
			if A[i-1] > A[i] then
				swap(A[i-1], A[i])
				swapped := true
			end if
		end for
	until not swapped
	
 */

public class sorting_algo {
	
	static void bubbleSort(int[] arr) {
		int n = arr.length;
		for (int i = 0; i < n-1; i++) {
			for (int j = 0; j < n-i-1; j++) {
				if (arr[j] > arr[j+1]) {
					// swap arr[j] and arr[j+1]
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
	}
	
	static void printArray(int[] arr) {
		int n = arr.length;
		for (int i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		int[] arr = {64, 34, 25, 12, 22, 11, 90};
		
		System.out.println("Original array:");
		printArray(arr);
		
		bubbleSort(arr);
		
		System.out.println("Sorted array:");
		printArray(arr);

	}

}
