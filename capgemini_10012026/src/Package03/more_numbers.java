package Package03;

public class more_numbers {

	public static void prime_number(int n, int m) {
		// prime number from 1-100 in this case n to m
		for (int i = n; i <= m; i++) {
			int count = 0;
			for (int j = 1; j <= i; j++) {
				if (i % j == 0) {
					count++;
				}
			}
			if (count == 2) {
				System.out.println(i);
			}
		}
	}
	
	public static void strong_number(int a, int b) {
		// strong number from 1-1000 in this case a to b
		for (int i = a; i <= b; i++) {
			int sum = 0;
			int temp = i;
			while (temp != 0) {
				int r = temp % 10;
				int fact = 1;
				for (int j = 1; j <= r; j++) {
					fact = fact * j;
				}
				sum = sum + fact;
				temp = temp / 10;
				if (sum == i) {
					System.out.println(i);
				}
			}
		}
	}
	
	public static void armstrong_num(int n,int m) {
		// armstrong number from 1-1000 in this case n to m
		for (int i = n; i <= m; i++) {
			int sum = 0;
			int temp = i;
			while (temp != 0) {
				int r = temp % 10;
				sum = sum + r * r * r;
				temp = temp / 10;
				if (sum == i) {
					System.out.println(i);
				}
			}
		}	
	}
	
	public static void nth_prime_num() {
		// N-th prime number
		int n = 10;
		int count = 0;
		int i = 2;
		while (count < n) {
			int flag = 0;
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					flag = 1;
					break;
				}
			}
			if (flag == 0) {
				count++;
			}
			i++;
		}
		System.out.println(i - 1);

	}
	
	public static void nth_armstrong() {
		// N-th armstrong number
		int n = 10;
		int count = 0;
		int i = 1;
		while (count < n) {
			int sum = 0;
			int temp = i;
			while (temp != 0) {
				int r = temp % 10;
				sum = sum + r * r * r;
				temp = temp / 10;
			}
			if (sum == i) {
				count++;
			}
			i++;
		}
		System.out.println(i - 1);	
	}

	public static void nth_prime_num(int n) {
		// N-th prime number
		int count = 0;
		int i = 2;
		while (count < n) {
			int flag = 0;
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					flag = 1;
					break;
				}
			}
			if (flag == 0) {
				count++;
			}
			i++;
		}
		System.out.println(i - 1);
	}

	public static void nth_armstrong(int n) {
		// N-th armstrong number
		int count = 0;
		int i = 1;
		while (count < n) {
			int sum = 0;
			int temp = i;
			while (temp != 0) {
				int r = temp % 10;
				sum = sum + r * r * r;
				temp = temp / 10;
			}
			if (sum == i) {
				count++;
			}
			i++;
			
		}
		System.out.println(i - 1);
	}	

	public static void prime_strong(int n) {
		// prime number is strong number or not
		int count = 0;
		for (int i = 2; i < n; i++) {
			if (n % i == 0) {
				count++;
			}
		}
		if (count == 0) {
			int sum = 0;
			int temp = n;
			while (temp != 0) {
				int r = temp % 10;
				int fact = 1;
				for (int j = 1; j <= r; j++) {
					fact = fact * j;
				}
				sum = sum + fact;
				temp = temp / 10;
			}
			if (sum == n) {
				System.out.println("prime number is strong number");
			} else {
				System.out.println("prime number is not strong number");
			}
			
		} else {
			System.out.println("not a prime number");
		}
	}

	public static void form_number(int n) {
		// form a number of prime digits of a given number
		int temp = n;
		int sum = 0;
		while (temp != 0) {
			int r = temp % 10;
			int count = 0;
			for (int i = 2; i < r; i++) {
				if (r % i == 0) {
					count++;
				}
			}
			if (count == 0) {
				sum = sum * 10 + r;
			}
			temp = temp / 10;
		}
		System.out.println(sum);
	}	
	public static void main(String[] args) {
		// main func.
		int n = 9;
		int m = 17;	
		int a = 10;
		int b = 12101709;
		
		// range problems
		// prime number from 0-100
		prime_number(0, 100);
		// strong number from 1-1000
		strong_number(1,1000);
		// armstrong from 1-1000
		armstrong_num(1,1000);
		// N-th prime number
		nth_prime_num(m);
		// N-th armstrong number
		nth_armstrong(n);
		// N-th prime number is strong number or not.
		prime_strong(a);
		// form a number of prime digits of a given number
		form_number(b);
		
	}

}
