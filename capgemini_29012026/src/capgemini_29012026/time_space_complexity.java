package capgemini_29012026;

public class time_space_complexity {

	public static void main(String[] args) {
		/*
		 * Time Complexity and Space Complexity:
		 * 
		 * Time Complexity: Measure of the amount of time an algorithm takes to complete
		 * as a function of the length of the input.
		 * 
		 * Space Complexity: Measure of the amount of memory an algorithm uses as a
		 * function of the length of the input.
		 */
		// Time Complexity:
		// Time complexity is the measure of the amount of time an algorithm takes to
		// complete as a function of the length of the input.
		// It is usually expressed using Big O notation.
		// Example:
		
		int n = 1000;
		// O(1) - Constant Time Complexity
		
		// O(n) - Linear Time Complexity
		int a = 10;
		for (int i = 0; i < n; i++) {
			System.out.println(i);
		}
		
		// O(n^2) - Quadratic Time Complexity
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.println(i + " " + j);
			}
		}
				
		// Space Complexity:
		// Space complexity is the measure of the amount of memory an algorithm uses as
		// a function of the length of the input.
		// It is usually expressed using Big O notation.
		// Example:
		
		// O(1) - Constant Space Complexity
		int b = 20;
		
		// O(n) - Linear Space Complexity
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = i;
		}
		
		// O(n^2) - Quadratic Space Complexity
		int[][] matrix = new int[n][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				matrix[i][j] = i + j;
			}
		}

	}
	


}
