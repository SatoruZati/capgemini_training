package capgemini_21012026;
import java.util.Scanner;

public class exceptions_only {

	public static void main(String[] args) {
		// Exceptions in Java example
		
		// Example of handling ArithmeticException using try-catch-finally block
		int a = 10;
		int b = 0;
		try {
			int c = a / b; // This will throw an ArithmeticException
			System.out.println("Result: " + c);
		} catch (ArithmeticException e) {
			System.out.println("Error: Division by zero is not allowed.");
		} finally {
			System.out.println("Execution completed.");
		}
		System.out.println("========================================");
		
		// Example of ArrayIndexOutOfBoundsException
		String[] arr = {"Apple", "Samsung", "Vivo", "Xiaomi", "OnePlus"};
		try {
			System.out.println(arr[5]); // This will throw an ArrayIndexOutOfBoundsException
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Error: Array index is out of bounds.");
		} finally {
			System.out.println("Array access attempt completed.");
		}
		
		// Example of handling NullPointerException
		String str = null;
		try {
			System.out.println(str.length()); // This will throw a NullPointerException
		} catch (NullPointerException e) {
			System.out.println("Error: Null pointer access is not allowed.");
		} finally {
			System.out.println("Null pointer access attempt completed.");
		}
		System.out.println("========================================");
		
		// OR 
		//	String str2;
		//	try {
		//		System.out.println(str2.length()); // This will throw a NullPointerException
		//	} catch (NullPointerException e) {
		//		System.out.println("Error: Null pointer access is not allowed.");
		//	} finally {
		//		System.out.println("Null pointer access attempt completed.");
		//		}
		// Error as well since variable str2 is not initialized.
		
		// e.getMessage() method can also be used to get the error message.
		// Example:
		try {
			int c = a / b; // This will throw an ArithmeticException
			System.out.println("Result: " + c);
		} catch (ArithmeticException e) {
			System.out.println("Error Message: " + e.getMessage());
		} finally {
			System.out.println("Execution completed.");
		}
		System.out.println("========================================");
		// Output: Error Message: / by zero
		

	}

}
