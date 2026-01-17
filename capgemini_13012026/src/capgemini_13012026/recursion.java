package capgemini_13012026;

public class recursion {

	public static void main(String[] args) {
		// stack overflow error
		recursion01(17);

		stack_overflow();

		infinite_loop();

		valid_recursion(9);
		// call

		// stack overflow vs infinite loop
		// stack overflow occurs when there are too many nested method calls
		// infinite loop occurs when a loop never terminates

		factorial_using_recursion(5);

	}
	
	public static void recursion01(int num) {
		if (num>1) {
			System.out.println(num);
			recursion01(9);

			// this will lead to: infinite recursion 
			// which will eventually causee a stack overflow error
			// java.lang.StackOverflowError


			// error : stack overflow
			// because the value of num is not changing in each recursive call
			// so the base condition is never reached
			// hence the function keeps calling itself indefinitely until the stack memory is exhausted
			// to fix this, we need to change the value of num in each recursive call
			// for example, we can decrement num by 1 in each call
			// recursion01(num - 1);
			// this way, the base condition will eventually be reached when num becomes 1
			// and the recursion will stop
		}
		
	}

	public static void stack_overflow() {
		// infinite recursion
		stack_overflow();
		// this will also lead to stack overflow error
		// java runtime will throw a StackOverflowError
		// java.lang.StackOverflowError: stack size 1024KB
		// at capgemini_13012026.recursion.stack_overflow(recursion.java:18)
	}

	// stack overflow vs infinite loop
	// stack overflow occurs when there are too many nested method calls
	// infinite loop occurs when a loop never terminates
	// do both lead to same error?
	// no, stack overflow leads to StackOverflowError, infinite loop leads to high CPU usage
	//  and unresponsiveness. 
	// they are different issues, but both can cause a program to crash or become unresponsive.

	public static void valid_recursion(int num) {
		// base condition: num <= 1
		if (num>1) {
			System.out.println(num);
			valid_recursion(num - 1);
			// this is a valid recursion
			// because the value of num is changing in each recursive call
			// so the base condition will eventually be reached
			// hence the function will stop calling itself
		}
	}

	public static void infinite_loop() {
		// infinite loop
		while (true) {
			System.out.println("This is an infinite loop");
		}
		// this will lead to high CPU usage and unresponsiveness
		// but it will not lead to stack overflow error
	}

	public static int factorial_using_recursion(int n) {
		// base condition
		if (n == 0) {
			return 1;
		} else {
			// recursive call 
			// n! = n * (n-1)!
			return n * factorial_using_recursion(n - 1);
		}
	}
}
