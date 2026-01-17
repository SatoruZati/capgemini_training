package package02;

public class sample03 {

	static String vs = "Diddy vs Epstein";
	static int lol;
	static int gg;

	public static void localblock() {
		System.out.println("Local variable outside main in a seperate function \nbut under same class");
		String name = "Jeffrey Epstein";
		char ch = 'M';
		System.out.println("Examples of local variable: \nName - " + name + ",\n" + "char - " + ch);
	}

	public static void main(String[] args) {
		// LOCAL VARIABLE
		// variable which can be accessed only within the current or parent class
		String name2 = "P. Diddy";
		System.out.println("Local variable inside main() : " + name2);
		int lmao = 10;
		System.out.println("int local var: " + lmao);

		System.out.println();
		localblock();

		// GLOBAL VARIABLE
		// variables which can be accessed even from other classes outside parent class
		System.out.println();
		System.out.println("Global Variable: " + vs);
		System.out.println();

		// garbage value test
		// we initialize and store value
		int a = 10;
		int b;
		b = 17;
		System.out.println("a: " + a);
		System.out.println("b: " + b);
		System.out.println();

		// initialize but no value
		// int c;
		// System.out.println("local variable declared but not iniitialized");
		// System.out.println("c: " + c);
		/*
		 * error: Exception in thread "main" java.lang.Error: Unresolved compilation
		 * problem: The local variable c may not have been initialized at
		 * package02.sample03.main(sample03.java:44)
		 */

		System.out.println("global variable declared but not iniitialized");
		System.out.println("lol: " + lol);
		System.out.println();

		gg = 69;
		System.out
				.println("global variable declared but not iniitialized \nbut later initialised inside local function");
		System.out.println("gg: " + gg);
	}

	public static int sysout() {
		// TODO Auto-generated method stub
		System.out.println("\nGlobal variable called from glocal block: ");
		System.out.println("gg: " + gg);
		System.out.println();
		return gg;
		
		// System.out.println() is a method and 
		// a method can be called only inside another method not under a class
	}

	static int func = sysout();

}
