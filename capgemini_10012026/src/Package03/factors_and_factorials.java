package Package03;

public class factors_and_factorials {

	public static void factorial(int num) {
		// factorial function
		int fact = 1;
		for (int i = 1; i <= num; i++) {
			fact = fact * i;
		}
		System.out.println("Factorial of " + num + " is " + fact);
	}

	public static void factors(int num) {
		// factors function
		System.out.print("Factors of " + num + " are ");
		for (int i = 1; i <= num; i++) {
			if (num % i == 0) {
				System.out.print(i + " ");
			}
		}
	}

	public static void sum_of_factors(int num) {
		// sum of factors function
		int sum = 0;
		for (int i = 1; i <= num; i++) {
			if (num % i == 0) {
				sum = sum + i;
			}
		}
		System.out.println("Sum of factors of " + num + " is " + sum);
	}

	public static void check_prime(int num) {
		// check prime function
		int count = 0;
		for (int i = 1; i <= num; i++) {
			if (num % i == 0) {
				count++;
			}
		}
		if (count == 2) {
			System.out.println(num + " is a prime number");
		} else {
			System.out.println(num + " is not a prime number");
		}
	}

	public static void swap_two_nums_without_third_variable(int num) {
		// swap two numbers without third variable function
		int a = 10;
		int b = 20;
		System.out.println("Before swapping: a = " + a + " b = " + b);
		a = a + b;
		b = a - b;
		a = a - b;
		System.out.println("After swapping: a = " + a + " b = " + b);
	}

	public static void swap_two_nums_with_third_variable(int num) {
		// swap two numbers with third variable function
		int a = 10;
		int b = 20;
		int c;
		System.out.println("Before swapping: a = " + a + " b = " + b);
		c = a;
		a = b;
		b = c;
		System.out.println("After swapping: a = " + a + " b = " + b);
	}


	public static void main(String[] args) {
		// main func
		int num = 10;
		factorial(num);
		factors(num);
		sum_of_factors(num);
		check_prime(num);

		swap_two_nums_without_third_variable(num);
		swap_two_nums_with_third_variable(num);

	}
}
