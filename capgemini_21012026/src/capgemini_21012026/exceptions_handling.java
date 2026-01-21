package capgemini_21012026;
import java.util.Scanner;

public class exceptions_handling {

	public static void main(String[] args) {
		// Exceptions in Java example
		int a = 17;
		int b = 0;
		// e.printStackTrace() method can also be used to print the stack trace of the exception.
		try {
			int c = a / b; // This will throw an ArithmeticException
			System.out.println("Result: " + c);
		} catch (ArithmeticException e) {
			System.out.println("Stack Trace: ");
			e.printStackTrace();
		} finally {
			System.out.println("Execution completed.");
		}
		// Output: Stack Trace:
		// java.lang.ArithmeticException: / by zero
		
		// Scanner can also be used to take input from the user and handle exceptions accordingly.
		// Example:
		System.out.println("========================================");
		java.util.Scanner scanner = new java.util.Scanner(System.in);
		
		System.out.print("Enter a football team name: ");
		String teamName = scanner.nextLine();
		try {
			if (teamName.equals(" ")) {
				throw new IllegalArgumentException("Team name cannot be empty.");
			} else {
				System.out.println("You entered: " + teamName);
			}
		} catch (IllegalArgumentException e) {
			System.out.println("Error: " + e.getMessage());
		} finally {
			System.out.println("Input attempt completed.");
			scanner.close();
		}
		
		System.out.println("========================================");

		// NumberFormatException example
		String numberStr = "1709Ag";
		try {
			int number = Integer.parseInt(numberStr); // This will throw a NumberFormatException
			System.out.println("Parsed number: " + number);
		} catch (NumberFormatException e) {
			System.out.println("Error: Invalid number format.");
			System.out.println("Stack Trace: ");
			e.printStackTrace();
			System.out.println("Error Message: " + e.getMessage());

		} finally {
			System.out.println("Number parsing attempt completed.");
		}
		
		// InputMismatchException example
		System.out.println("========================================");
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a City name: ");
		try {
			String city = sc.nextLine();
			System.out.println("You entered: " + city);
		} catch (java.util.InputMismatchException e) {
			System.out.println("Error: Input mismatch.");
			System.out.println("Stack Trace: ");
			e.printStackTrace();
			System.out.println("Error Message: " + e.getMessage());
		} finally {
			System.out.println("City input attempt completed.");
			sc.close();
		}

		// ClassCastException example
		System.out.println("========================================");
		// we get ClassCastException when we try to cast an object to a subclass of which it is not an instance.
		// when we try to do downcasting without upcasting.
		Object obj = new Integer(1709);
		try {
			String str = (String) obj; // This will throw a ClassCastException
			System.out.println("Casted string: " + str);
		} catch (ClassCastException e) {
			System.out.println("Error: Invalid class cast.");
			System.out.println("Stack Trace: ");
			e.printStackTrace();
			System.out.println("Error Message: " + e.getMessage());
		} finally {
			System.out.println("Class cast attempt completed.");
		}
		

	}

}
