package capgemini_14012026;

import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;

public class practice_arrays {

	static void reverseArrayExample() {
		// Question 1: Reverse an array wihtout using another array
		int[] arr01 = { 17, 10, 9, 12, 33, 25, 4, 8, 3 };

		int i = 0, j = arr01.length-1;
		
		System.out.println("Original Array: ");
		
		for (int a = 0; a<arr01.length;a++) {
			System.out.println("Array01 element " + a + " = " + arr01[a]);
		}
		
		for (int a = 0; a<arr01.length;a++) {
			System.out.print(arr01[a] + " ");
		}
		
		
		System.out.println("\n");
		while (i < j) {
			int temp = arr01[i];
			int temp2 = arr01[j];

			arr01[i] = temp2;
			arr01[j] = temp;

			i = i + 1;
			j = j - 1;
			
		}

		System.out.println("Reversed Array: ");
		for (int a = 0; a<arr01.length;a++) {
			System.out.println("Array01 element " + a + " = " + arr01[a]);
		}
		
		for (int a = 0; a<arr01.length;a++) {
			System.out.print(arr01[a] + " ");
		}

		// reverse array code with built-in function
		System.out.println("\n");
		System.out.println("Print array using Arrays.reverse() function: ");
		Integer[] arr02 = { 17, 10, 9, 12, 33, 25, 4, 8, 3 };	

		Collections.reverse(Arrays.asList(arr02));
		System.out.println("Reversed array using Collections.reverse(): " + Arrays.toString(arr02));

	}

	static void copyArray(){
		// Question 2: Copy array
		int[] sourceArr = { 10, 17, 9, 12, 4, 8, 3 };
		int[] destArr = new int[sourceArr.length];

		// copying elements from sourceArr to destArr
		for (int i = 0; i < sourceArr.length; i++) {
			destArr[i] = sourceArr[i];
		}

		System.out.println("Source Array: " + Arrays.toString(sourceArr));
		System.out.println("Destination Array after copying: " + Arrays.toString(destArr));

		// using built-in function to copy array
		int[] destArr2 = Arrays.copyOf(sourceArr, sourceArr.length);
		System.out.println("Destination Array after copying using Arrays.copyOf(): " + Arrays.toString(destArr2));

	}

	static void reverseArrayWithArray(){
		// Question 3: Reverse array using another array
		int[] arr = { 17, 10, 9, 12, 33, 25, 4, 8, 3 };
		int[] reversedArr = new int[arr.length];

		int i = 0;
		int j = arr.length - 1;

		while (i < arr.length) {
			reversedArr[j] = arr[i];
			i++;
			j--;
		}

		System.out.println("Original Array: " + Arrays.toString(arr));
		System.out.println("Reversed Array using another array: " + Arrays.toString(reversedArr));
	}

	static void largestAndSecondLargest() {
		int[] arr = { 17, 10, 9, 12, 33, 25, 4, 8, 3 };

		int largest = 0;
		int secondLargest = 0;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > largest) {
				largest = arr[i];
			}
		}

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > secondLargest && arr[i] < largest) {
				secondLargest = arr[i];
			}
		}

		System.out.println("Array: " + Arrays.toString(arr));
		System.out.println("Largest element: " + largest);
		System.out.println("Second largest element: " + secondLargest);
	}

	static void frequencyOfElement() {
		// Question 4: Frequency of an element in an array
		int[] arr = { 17, 10, 9, 12, 33, 25, 4, 8, 3, 10, 12, 10 };
		int elementToFind = 10;
		int frequency = 0;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == elementToFind) {
				frequency++;
			}
		}

		System.out.println("Array: " + Arrays.toString(arr));
		System.out.println("Element to find: " + elementToFind);
		System.out.println("Frequency of element " + elementToFind + ": " + frequency);
	}

	static void findDuplicateElements() {
		// Question 5: Find repeated or duplicate elements in an array
		int[] arr = { 17, 10, 9, 12, 33, 25, 4, 8, 3, 10, 12, 10, 4, 8 };
		System.out.println("Array: " + Arrays.toString(arr));
		System.out.println("Duplicate elements in the array:");

		boolean[] visited = new boolean[arr.length];

		for (int i = 0; i < arr.length; i++) {
			if (visited[i] == true) {
				continue;
			}
			int count = 1;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					visited[j] = true;
					count++;
				}
			}
			if (count > 1) {
				System.out.println("Element " + arr[i] + " occurs " + count + " times.");
			}
		}
	}

	static void removeDuplicateElements() {
		String arrString[] = {"Porsche", "BMW", "Audi", "Porsche", "Mercedes", "BMW", "Toyota", "Honda", "Audi"};
		
		System.out.println("Original Array: " + Arrays.toString(arrString));
		
		// without using hashset
		int n = arrString.length;
		String[] temp = new String[n];
		int j = 0;
		for (int i = 0; i < n; i++) {
			boolean isDuplicate = false;
			for (int k = 0; k < j; k++) {
				if (arrString[i].equals(temp[k])) {
					isDuplicate = true;
					break;
				}
			}
			if (!isDuplicate) {
				temp[j++] = arrString[i];
			}
		}
	}

	static void uniqueElements() {
		// Question 7: Unique elements from an array
		int[] arr = { 17, 10, 9, 12, 33, 25, 4, 8, 3, 10, 12, 10 };
		System.out.println("Array: " + Arrays.toString(arr));
		System.out.println("Unique elements in the array:");

		for (int i = 0; i < arr.length; i++) {
			boolean isUnique = true;
			for (int j = 0; j < arr.length; j++) {
				if (i != j && arr[i] == arr[j]) {
					isUnique = false;
					break;
				}
			}
			if (isUnique) {
				System.out.println(arr[i]);
			}
		}
	}	

	static void fibonacci() {
		// Question 8: Fibonacci series using arrays
		int n = 10; // number of terms in Fibonacci series
		int[] fib = new int[n];

		fib[0] = 0;
		fib[1] = 1;

		for (int i = 2; i < n; i++) {
			fib[i] = fib[i - 1] + fib[i - 2];
		}

		System.out.println("Fibonacci series up to " + n + " terms:");
		for (int i = 0; i < n; i++) {
			System.out.print(fib[i] + " ");
		}
		System.out.println();
	}

	static boolean isPrime(int num) {
		if (num <= 1) {
			return false;
		}

		// without using Math function 
		for (int i = 2; i*i <= num; i++) {
			if (num % i == 0) {
				return false;
			}
		}

		return true;
	}

	static void primeNumbersInArray() {
		// Question 9: All prime numbers in a given array
		int[] arr = { 17, 10, 9, 12, 33, 25, 4, 8, 3, 11, 13, 29 };
		System.out.println("Array: " + Arrays.toString(arr));
		System.out.println("Prime numbers in the array:");

		for (int i = 0; i < arr.length; i++) {
			if (isPrime(arr[i])) {
				System.out.print(arr[i] + " ");
			}
		}
		System.out.println();
	}

	static void insertElementAtPosition() {
		// Question 10: Insert elements in array at specific position
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of elements in the array:");
		int n = sc.nextInt();

		int[] arr = new int[n + 1];
		System.out.println("Enter " + n + " elements:");

		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		System.out.println("Enter element to insert:");
		int element = sc.nextInt();

		System.out.println("Enter position to insert the element (0 to " + n + "):");
		int position = sc.nextInt();

		sc.close();

		if (position < 0 || position > n) {
			System.out.println("Invalid position!");
			return;
		}

		// Shift elements to the right
		for (int i = n; i > position; i--) {
			arr[i] = arr[i - 1];
		}

		// Insert the element
		arr[position] = element;

		System.out.println("Array after inserting " + element + " at position " + position + ":");
		for (int i = 0; i <= n; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

	static void deleteElementAtPosition() {
		// Question 11: Delete elements from array at specific position
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of elements in the array:");
		int n = sc.nextInt();

		int[] arr = new int[n];
		System.out.println("Enter " + n + " elements:");

		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		sc.close();

		System.out.println("Enter position to delete the element (0 to " + (n - 1) + "):");
		int position = sc.nextInt();

		if (position < 0 || position >= n) {
			System.out.println("Invalid position!");
			return;
		}


		// Shift elements to the left
		for (int i = position; i < n - 1; i++) {
			arr[i] = arr[i + 1];
		}

		System.out.println("Array after deleting element at position " + position + ":");
		for (int i = 0; i < n - 1; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		// Reverse an array without using another array
		reverseArrayExample();

		// Copy array
		copyArray();

		// Reverse array using another array
		reverseArrayWithArray();

		// largest and second largest element in an array
		largestAndSecondLargest();

		// frequency of an element in an array
		frequencyOfElement();

		// find repeated or duplicate elements in an array
		findDuplicateElements();

		// remove duplicate elements from an array
		removeDuplicateElements();

		// unique elements from an array
		uniqueElements();

		// fibonacci series using arrays
		fibonacci();

		// all prime numbers in a given array
		primeNumbersInArray();

		// insert elements in array at specific position
		insertElementAtPosition();

		// delete elements from array at specific position
		deleteElementAtPosition();
	}

}
