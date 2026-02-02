/*
 Given n>=0, create an array length n*n with the following pattern, 
 shown here for n=3 : {0, 0, 1,    0, 2, 1,    3, 2, 1} (spaces added to show the 3 groups).
 
 
squareUp(3) → [0, 0, 1, 0, 2, 1, 3, 2, 1]
squareUp(2) → [0, 1, 2, 1]
squareUp(4) → [0, 0, 0, 1, 0, 0, 2, 1, 0, 3, 2, 1, 4, 3, 2, 1]
 
  
 */

package capgemini_02022026;

public class pattern_array {

	public static void main(String[] args) {
		int n = 4;
		squareUp(n);

	}

	public static void squareUp(int n) {
		int[] result = new int[n * n];

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (j >= n - i - 1) {
					result[i*n+j] = n-j;
				}
				else {
					result[i*n+j] = 0;
				}
			}
		}
		
		for (int num: result) {
			System.out.print(num + " ");
		}
	}
}
