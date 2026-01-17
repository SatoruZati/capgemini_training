package Package03;

public class check_nums {
	
	public static void fibonacci_series(int num) {
		// fibonacci series function
		int a = 0;
		int b = 1;
		int c;
		System.out.print("Fibonacci series of " + num + " is ");
		for (int i = 1; i <= num; i++) {
			System.out.print(a + " ");
			c = a + b;
			a = b;
			b = c;
		}
	}

	public static void spy_number(int num) {
		// spy number function
		int sum = 0;
		int product = 1;
		int temp = num;
		while (num > 0) {
			int rem = num % 10;
			sum = sum + rem;
			product = product * rem;
			num = num / 10;
		}
		if (sum == product) {
			System.out.println(temp + " is a spy number");
		} else {
			System.out.println(temp + " is not a spy number");
		}
	}

	public static void armstrong_number(int num) {
		// armstrong number function
		int sum = 0;
		int temp = num;
		while (num > 0) {
			int rem = num % 10;
			sum = sum + rem * rem * rem;
			num = num / 10;
		}
		if (sum == temp) {
			System.out.println(temp + " is an armstrong number");
		} else {
			System.out.println(temp + " is not an armstrong number");
		}
	}

	public static void palindrome_number(int num) {
		// palindrome number function
		int sum = 0;
		int temp = num;
		while (num > 0) {
			int rem = num % 10;
			sum = sum * 10 + rem;
			num = num / 10;
		}
		if (sum == temp) {
			System.out.println(temp + " is a palindrome number");
		} else {
			System.out.println(temp + " is not a palindrome number");
		}
	}

	public static void perfect_number(int num) {
		// perfect number function
		int sum = 0;
		for (int i = 1; i < num; i++) {
			if (num % i == 0) {
				sum = sum + i;
			}
		}
		if (sum == num) {
			System.out.println(num + " is a perfect number");
		} else {
			System.out.println(num + " is not a perfect number");
		}
	}

	public static void neon_number(int num) {
		// neon number function
		int sum = 0;
		int square = num * num;
		while (square > 0) {
			int rem = square % 10;
			sum = sum + rem;
			square = square / 10;
		}
		if (sum == num) {
			System.out.println(num + " is a neon number");
		} else {
			System.out.println(num + " is not a neon number");
		}
	}	

	public static void strong_number(int num) {
		// strong number function
		int sum = 0;
		int temp = num;
		while (num > 0) {
			int rem = num % 10;
			int fact = 1;
			for (int i = 1; i <= rem; i++) {
				fact = fact * i;
			}
			sum = sum + fact;
			num = num / 10;
		}
		if (sum == temp) {
			System.out.println(temp + " is a strong number");
		} else {
			System.out.println(temp + " is not a strong number");
		}
	}

	public static void happy_number(int num) {
		// happy number function
		int sum = 0;	
		int temp = num;
		while (num > 0) {
			int rem = num % 10;
			sum = sum + rem * rem;
			num = num / 10;
		}
		if (sum == 1) {
			System.out.println(temp + " is a happy number");
		} else {
			System.out.println(temp + " is not a happy number");
		}
	}

	public static void xylem_or_pholem_number(int num) {
		// xylem or pholem number function
		int sum1 = 0;
		int sum2 = 0;
		int temp = num;
		int temp1 = num;
		int actual_num = num;
		// sum of extreme digits
		int extreme_digit1 = num % 10;
		int extreme_digit2 = 0;
		while (temp>0) {
			extreme_digit2 = temp % 10;
			temp = temp / 10;
		}
		sum1 = extreme_digit1 + extreme_digit2;

		// sum of inner digits
		while (temp1>0) {
			int rem = temp1 % 10;
			sum2 = sum2 + rem;
			temp1 = temp1 / 10;
		}

		int final_sum = sum2 - sum1;

		if (final_sum == sum1) {
			System.out.println(actual_num + " is a xylem number");
		} else {
			System.out.println(actual_num + " is a pholem number");
		}
	}

	public static void reverse_num(int num) {
		// reverse of a number function
		int rev = 0;
		int temp = num;
		while (num > 0) {
			int rem = num % 10;
			rev = rev * 10 + rem;
			num = num / 10;
		}
		System.out.println("Reverse of " + temp + " is " + rev);
	}	

	public static void desarium_number(int num) {
		// desarium number function
		int sum = 0;		
		int temp = num;
		int count = 0;
		while (num > 0) {
			count++;
			num = num / 10;
		}
		num = temp;
		while (num > 0) {
			int rem = num % 10;
			sum = sum + (int) Math.pow(rem, count);
			num = num / 10;
			count--;
		}
		if (sum == temp) {
			System.out.println(temp + " is a desarium number");
		} else {
			System.out.println(temp + " is not a desarium number");
		}
	}	

	public static void main(String[] args) {
		// count the digits of a given number
		int num=17;
		
		// check neon number 
		// logic: if square of a number is equal to the sum of digits of the number, then it is a neon number 
		// eg: 9 = 9^2 = 81. Then, 8 + 1 = 9. Thus, 9 is a neon number
		neon_number(num);
		
		// fibonacci series
		fibonacci_series(num);
		
		// spy number
		// logic: if sum of digits is equal to the product of digits, then it is a spy number 
		// else not a spy number
		// eg: 123 = 1 + 2 + 3 = 6 and 1 * 2 * 3 = 6
		spy_number(num);

		// strong number
		// logic: if sum of factorial of digits is equal to the number, then it is a strong number 
		// else not a strong number
		// eg: 145 = 1! + 4! + 5! = 1 + 24 + 120 = 145
		strong_number(num);
		
		// armstrong number
		// logic: if sum of digits raised to the power of number of digits is equal to the number, 
		// then it is an armstrong number else not an armstrong number
		// eg: 153 = 1^3 + 5^3 + 3^3 = 1 + 125 + 27 = 153
		armstrong_number(num);
		
		// palindrome number
		palindrome_number(num);
		
		// perfect number
		// logic: if sum of factors is equal to the number, then it is a perfect number 
		// else not a perfect number
		// eg: 6 = 1 + 2 + 3 = 6. Thus, 6 is a perfect number
		// not a perfect number eg: 10 = 1 + 2 + 5 = 8. Thus, 10 is not a perfect number
		perfect_number(num);
		
		// reverse of a given number
		reverse_num(num);
		
		// happy number or not
		// logic: if sum of digits raised to the power of their respective digits is equal to 1, 
		// then it is a happy number else not a happy number
		// eg: 130 = 1^2 + 3^2 + 0^2 = 1 + 9 + 0 = 10. Then, 10 = 1^2 + 0^2 = 1 + 0 = 1. 
		// Thus, 130 is a happy number
		happy_number(num);
		
		// xylem or pholem number
		// logic: if sum of extreme digits is equal to the sum of inner digits, then it is a xylem number 
		// else pholem number
		// eg: 1234 = 1 + 4 = 5 and 2 + 3 = 5. Thus, 1234 is a xylem number
		// eg: 12345 = 1 + 5 = 6 and 2 + 3 + 4 = 9. Thus, 12345 is a pholem number
		xylem_or_pholem_number(num);		

		// desarium number
		// logic: if sum of digits raised to the power of their respective positions is equal to the number, 
		// then it is a desarium number
		// else not a desarium number
		// eg: 135 = 1^1 + 3^2 + 5^3 = 1 + 9 + 125 = 135
		desarium_number(num);
	}


}
