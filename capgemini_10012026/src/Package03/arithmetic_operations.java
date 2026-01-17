package Package03;
// Arithmetic Operations using Methods

public class arithmetic_operations {

	public static int add(int a, int b) {
		return a + b;
	}

	public static int sub(int a, int b) {
		return a - b;
	}

	public static int mul(int a, int b) {
		return a * b;
	}

	public static int div(int a, int b) {
		return a / b;
	}

	public static void main(String[] args) {
		// Main Func.
		System.out.println("Addition: " + add(10, 20));
		System.out.println("Subtraction: " + sub(10, 20));
		System.out.println("Multiplication: " + mul(10, 20));
		System.out.println("Division: " + div(10, 20));

	}

}
