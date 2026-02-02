/*
 Merge Sort:  
 1. Divide the unsorted list into n sublists, each containing one element.
 2. Repeatedly merge sublists to produce new sorted sublists until there is only one sublist remaining.
  time complexity: O(n log n) in worst, average, and best case
  space complexity: O(n) (not in-place sorting)
  
  how it works:
  pseudo code:
  procedure mergeSort(A : list of sortable items)
  
  	if length(A) > 1 then
  		mid := length(A) / 2
  		left := A[0..mid-1]
  		right := A[mid..length(A)-1]
  		
  		mergeSort(left)
  		mergeSort(right)
  		
  		i := 0; j := 0; k := 0
  		
  		while i < length(left) and j < length(right) do
  			if left[i] <= right[j] then
  				A[k] := left[i]
  				i := i + 1
  			else
  				A[k] := right[j]
  				j := j + 1
  			end if
  			k := k + 1
  		end while
  		
  		while i < length(left) do
  			A[k] := left[i]
  			i := i + 1
  			k := k + 1
  		end while
  		
  		while j < length(right) do
  			A[k] := right[j]
  			j := j + 1
  			k := k + 1
  		end while
  	end if
  
 */

package capgemini_02022026;

public class merge_sort {
	
	public static void printArray(int[] arr) {
		int n = arr.length;
		for (int i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
	
	public static void mergeSort(int[] arr) {
		
		// algo: divide and conquer
		// breakdown: 
		// 1. divide the array into two halves
		// 2. recursively sort both halves
		// 3. merge the sorted halves
		// 4. print the sorted array
		
		if (arr.length > 1) {
			int mid = arr.length / 2;
			
			// split left part
			int[] left = new int[mid];
			// arraycopy(source array, source position, destination array, destination position, length)
			System.arraycopy(arr, 0, left, 0, mid);
			
			// split right part
			int[] right = new int[arr.length - mid];
			System.arraycopy(arr, mid, right, 0, arr.length - mid);
			
			mergeSort(left);
			mergeSort(right);
			
			// merge left and right arrays
			int i = 0, j = 0, k = 0;
			
			while (i < left.length && j < right.length) {
				if (left[i] <= right[j]) {
					arr[k++] = left[i++];
				} else {
					arr[k++] = right[j++];
				}
			}
			
			while (i < left.length) {
				arr[k++] = left[i++];
			}
			
			while (j < right.length) {
				arr[k++] = right[j++];
			}
		}
		
		System.out.println("Sorted array:");
		printArray(arr);
	}

	public static void main(String[] args) {
		// merge sort implementation
		
		int arr[] = {38, 27, 43, 3, 9, 82, 10};
		
		System.out.println("Original array:");
		printArray(arr);
		
		mergeSort(arr);
		System.out.println();
		System.out.println("After calling mergeSort in main, array is:");
		printArray(arr);

	}

}
