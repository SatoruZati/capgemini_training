package capgemini_21012026;

public class exception_hierarchy {

	public static void main(String[] args) {
		// Exception Hierarchy in Java
		
		// In Java, all exception classes are derived from the java.lang.Throwable class.
		// The Throwable class has two main subclasses: Exception and Error.
		
		// The Exception class is further divided into two categories:
		// 1. Checked Exceptions: These are exceptions that are checked at compile-time.
		// 2. Unchecked Exceptions: These are exceptions that are not checked at compile-time.
		
		// RuntimeException is a subclass of Exception and is the superclass of all unchecked exceptions.
		// CompileTimeException is a subclass of Exception and is the superclass of all checked exceptions.

		// Here is a simple representation of the exception hierarchy in Java:
		// Throwable
		//    ├── Exception
		//    │     ├── RuntimeException (Unchecked Exceptions)
		//    │     │     ├── NullPointerException
		//    │     │     ├── ArrayIndexOutOfBoundsException
		//    │     │     ├── ArithmeticException
		//    │     │     └── ClassCastException
		//    │     └── CompileTimeException (Checked Exceptions)
		//    │           ├── IOException
		//    │           ├── SQLException
		//    │           └── ClassNotFoundException
		//    └── Error
		//          ├── OutOfMemoryError
		//          └── StackOverflowError
		// This hierarchy helps in understanding how exceptions are categorized and handled in Java.
		
		// Try-catch-finally blocks can be used to handle exceptions based on their hierarchy.
		// You can catch specific exceptions first and then catch more general exceptions later.
		// This allows for more precise error handling.
		
		// Try - Multiple catch blocks
		
		// Example of handling NullPointerException and ArithmeticException
		try {
			String str = null;
			System.out.println(str.length()); // This will throw a NullPointerException
			
			int a = 10;
			int b = 0;
			int c = a / b; // This will throw an ArithmeticException
			System.out.println("Result: " + c);
		} catch (NullPointerException e) {
			System.out.println("Error: Null pointer access is not allowed.");
		} catch (ArithmeticException e) {
			System.out.println("Error: Division by zero is not allowed.");
		} finally {
			System.out.println("Execution completed.");
		}
		
		// Try - Catch - Finally block example with multiple catch blocks
		System.out.println("========================================");
		// Try - Multiple Catch - Finally block example
		try {
			int[] arr = new int[5];
			System.out.println(arr[10]); // This will throw ArrayIndexOutOfBoundsException
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Error: Array index is out of bounds.");
		} catch (Exception e) {
			System.out.println("Error: An unexpected exception occurred.");
			System.out.println(e.getMessage());
		} finally {
			System.out.println("Array access attempt completed.");
		}

		System.out.println("========================================");

		// Finally block is optional but is used to execute important code such as closing resources.

		// Note: When using multiple catch blocks, catch the more specific exceptions first,
		// followed by the more general exceptions to avoid unreachable code errors.

		// throw vs throws:
		// 'throw' is used to explicitly throw an exception from a method or a block of code.
		// 'throws' is used in method signatures to declare that a method may throw one or more exceptions.
		

	}

}
