package capgemini_13012026;

public class method_chaining {

	static int count = 0;

	public static void test1() {
		System.out.println("test 1 triggered");
		System.out.println("count: " + count);
		test2();
	}

	public static void test2() {
		System.out.println("test 2 triggered");
		test3();
	}

	public static void test3() {
		System.out.println("test 3 triggered");
		count = count + 1;
		if (count < 3) {
			// recursive call or recursion
			test1();
		}
	}

	public static void main(String[] args) {
		// method chaining
		test1();

	}

}
