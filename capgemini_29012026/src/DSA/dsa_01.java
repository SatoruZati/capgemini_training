package DSA;

import java.util.ArrayList;

public class dsa_01 {

	public static void main(String[] args) {
		// Integer [] arr = {13, 26, 43, 56, 72}
		// output [] = {2, 6, 3, 6, 3}
		
		ArrayList<Integer> testArr = new ArrayList<>();
		testArr.add(13);
		testArr.add(26);
		testArr.add(43);
		testArr.add(56);
		testArr.add(72);
		
		System.out.println("Input Array: " + testArr);
		
		ArrayList<Integer> resultArr = new ArrayList<>();
		
		for (int n : testArr) {
			int last_digit = n % 10;
			resultArr.add(last_digit);
		}
		
		System.out.println("Output Array: " + resultArr);
		
		// required output: [2, 6, 3, 6, 3] i.e. reverse of testArr
		
		for (int i = resultArr.size() - 1; i >= 0; i--) {
			System.out.print(resultArr.get(i) + " ");
		}
		
		// alternate way to reverse an ArrayList
		System.out.println();
		ArrayList<Integer> reversedArr = new ArrayList<>();
		for (int i = resultArr.size() - 1; i >= 0; i--) {
			reversedArr.add(resultArr.get(i));
		}
		System.out.println("Reversed Output Array: " + reversedArr);
	
		// does .reverse() method exist in ArrayList?
		java.util.Collections.reverse(resultArr);
		System.out.println("Reversed using Collections.reverse(): " + resultArr);
	
		
	}

}
