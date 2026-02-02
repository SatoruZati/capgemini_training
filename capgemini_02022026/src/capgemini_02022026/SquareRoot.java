package capgemini_02022026;

public class SquareRoot {
	
	public static double calculateSquareRoot(int num) {
		if (num < 0) {
			throw new IllegalArgumentException("Cannot calculate square root of a negative number");
		}
		if (num == 0 || num == 1) {
			return num;
		}
		
		double start = 0;
		double end = num;
		double mid = 0;
		double sqrt = 0;
		double precision = 0.00001; // Define the precision level
		
		// Binary search for integer part
		while (start <= end) {
			mid = (start + end) / 2;
			if (mid * mid == num) {
				return mid;
			} else if (mid * mid < num) {
				start = mid + precision;
				sqrt = mid; // Update sqrt to the last mid value
			} else {
				end = mid - precision;
			}
		}
		
		// Refining the result for decimal part
		double increment = precision;
		for (int i = 0; i < 5; i++) { // Adjust the loop for desired decimal places
			while (sqrt * sqrt <= num) {
				sqrt += increment;
			}
			sqrt -= increment; // Step back to the last valid sqrt
			increment /= 10; // Decrease increment for next decimal place
		}
		
		return sqrt;
	}

	public static void main(String[] args) {
		// Square root of a number without using inbuilt function
		
		int num = 17;
		
		double sqrt = 0;
		
		System.out.println("Calculating square root of: " + num);
		sqrt = calculateSquareRoot(num);
		System.out.printf("Square root of %d is approximately: %.5f\n", num, sqrt);

	}

}
