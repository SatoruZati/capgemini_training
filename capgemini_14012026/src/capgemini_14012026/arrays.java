package capgemini_14012026;

import java.util.Scanner;
import java.util.Arrays;

public class arrays {

	public static void main(String[] args) {
		// array declaration and initialization
		// pre declared values
		int arr[] = {17,9,10,12,2004,5,2024};

		// print length of array
		System.out.println("Length of array: " + arr.length);

		// print elements of array
		System.out.println("Elements of array:");

		for(int i=0; i<arr.length; i++) {
			System.out.println("Element at index " + i + ": " + arr[i]);
		}

		// input values into array using Scanner
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter number of elements you want to add to the array:");
		int n = sc.nextInt();

		int inputArr[] = new int[n];

		System.out.println("Enter " + n + " elements:");
		for(int i=0; i<n; i++) {
			System.out.print("Element " + (i+1) + ": ");
			inputArr[i] = sc.nextInt();
		}

		// print input array elements
		System.out.println("You entered the following elements:");

		for(int i=0; i<inputArr.length; i++) {
			System.out.println("Element at index " + i + ": " + inputArr[i]);
		}

		sc.close();

		// demonstrate usage of Arrays class
		arrayUtilsExample();
	}

	// usage of Arrays class from java.util package

	public static void arrayUtilsExample() {
		int arr[] = {5, 2, 8, 1, 3};

		// sort array
		Arrays.sort(arr);
		System.out.println("Sorted array: " + Arrays.toString(arr));

		// search for an element
		int key = 3;
		int index = Arrays.binarySearch(arr, key);
		if(index >= 0) {
			System.out.println("Element " + key + " found at index: " + index);
		} else {
			System.out.println("Element " + key + " not found in the array.");
		}
	

		// other functions from Arrays are as follows:
		// Arrays.equals(arr1, arr2) - checks if two arrays are equal
		// Arrays.fill(arr, value) - fills the array with the specified value
		// Arrays.copyOf(arr, newLength) - copies the array to a new array
		// Arrays.toString(arr) - returns string representation of the array
		// Arrays.asList(arr) - converts array to a List
		// and many more.
			
	}	


}
