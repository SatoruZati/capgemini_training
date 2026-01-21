package capgemini_21012026;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;

public class throw_throws {

	/*
	 * METHOD m1: Demonstrates unchecked exception propagation
	 */
	public static void m1() {
		// ArithmeticException is an unchecked exception
		// This will propagate automatically
		int result = 10 / 0; // Exception occurs here
	}

	/*
	 * METHOD m2: Calls m1() and allows the exception to propagate further
	 */
	public static void m2() {
		m1(); // Exception propagates from m1() to m2()
	}

	/*
	 * METHOD m3: Catches the propagated unchecked exception
	 */
	public static void m3() {
		try {
			m2(); // Exception propagates from m2() to m3()
		} catch (ArithmeticException e) {
			System.out.println("Unchecked Exception handled in m3(): " + e);
			e.printStackTrace(); // Print stack trace for debugging
			System.out.println("===========================================");
		}
	}

	/*
	 * METHOD readFile: Demonstrates checked exception propagation using 'throws'
	 */
	public static void readFile() throws IOException {
		// FileReader constructor throws IOException (checked exception)
		FileReader fr = new FileReader("data.txt"); // Checked exception occurs here
	}

	public static void writeFile() throws IOException {
		// FileWriter constructor throws IOException (checked exception)
		java.io.FileWriter fw = new java.io.FileWriter("output.txt"); // Checked exception occurs here
	}

	public static void fileHandler() throws Exception {
		try {
			FileInputStream fis = new FileInputStream("input.txt");		
		} catch (IOException e) {
			System.out.println("Checked Exception handled in fileHandler(): " + e);
			e.printStackTrace(); // Print stack trace for debugging
			System.out.println("===========================================");
		}
    }

	/*
	 * METHOD processFile: Declares IOException using throws to propagate it
	 */
	public static void processFile() throws IOException {
		readFile(); // Checked exception propagates to caller
	}

	/*
	 * METHOD checkAge: Demonstrates the use of 'throw' keyword
	 */
	public static void checkAge(int age) throws Exception {

		// If age is less than 18, explicitly throw an exception
		if (age < 18) {
			throw new Exception("Age must be 18 or older.");
		}

		System.out.println("Access granted.");
		System.out.println("===========================================");
	}

	public static void main(String[] args) throws Exception {

		// ------------------------------------------------
		// THROW and THROWS in Java
		// ------------------------------------------------

		/*
		 * 'throw' keyword: - Used to explicitly throw an exception object - Used inside
		 * a method or a block
		 */

		/*
		 * 'throws' keyword: - Used in method signature - Declares that a method may
		 * throw exceptions - Used for checked exception propagation
		 */

		// ------------------------------------------------
		// Example 1: Using throw keyword
		// ------------------------------------------------

		try {
			checkAge(15); // Explicitly throws Exception
		} catch (Exception e) {
			System.out.println("===========================================");
			System.out.println("Exception caught in main(): " + e.getMessage());
			e.printStackTrace(); // Print stack trace for debugging
			System.out.println("===========================================");
		}

		// ------------------------------------------------
		// Example 2: Unchecked Exception Propagation
		// ------------------------------------------------

		m3(); // ArithmeticException propagates and is handled

		// ------------------------------------------------
		// Example 3: Checked Exception Propagation using throws
		// ------------------------------------------------

		try {
			processFile(); // IOException propagates to main()
		} catch (IOException e) {
			System.out.println("===========================================");
			System.out.println("Checked Exception handled in main(): " + e);
			e.printStackTrace(); // Print stack trace for debugging
			System.out.println("===========================================");
		}

		// ------------------------------------------------
		// Exception Object Propagation - Summary
		// ------------------------------------------------

		/*
		 * Exception Object Propagation: When an exception is thrown using the throw
		 * keyword, the exception object is passed up the call stack until:
		 *
		 * 1. It is caught by a matching catch block OR 2. It reaches the top-level
		 * method (main) and terminates the program
		 */

		/*
		 * Rules: - Unchecked exceptions propagate automatically - Checked exceptions
		 * must be caught or declared using throws
		 */
		
		fileHandler();
	}

}
