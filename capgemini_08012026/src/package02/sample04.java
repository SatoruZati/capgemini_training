package package02;

public class sample04 {

	public static void main(String[] args) {
		// Re-initialization no error
		int a = 17;
		a = 9;
		System.out.println("Reinitialisation of a variable from 17 to 9. Now, a: " + a);

		// Compile Time Error for using two data types of one variable name
		// int z = 33;
		// double z = 33.25d;
		System.out.println();

		// Type casting or conversion
		// Primitive type casting

		// Two types: Implicit (Auto Widening) and Explicit (Narrowing)

		byte b = 1;
		short s = b; // auto widening (the easy way) (this happens after JDK 1.5)

		short sh = (short) b; // type casting (internal)

		System.out.println("byte b: " + b);
		System.out.println("short s: " + s);
		System.out.println("short internal casting sh: " + sh);

		int i = s;
		long lg = (long) i;

		System.out.println("int i: " + i);
		System.out.println("long lg: " + lg);
		System.out.println();

		char ch = 'S';
		int in = ch;
		float fl = in;
		double d = ch;
		System.out.println("char ch: " + ch);
		System.out.println("double d: " + d);
		System.out.println("int in: " + in);
		System.out.println("float fl: " + fl);

		// boolean to anything and vice versa is not possible

		// Explicit Narrowing
		short sht = 128;
		System.out.println("\nShort sht: " + sht);
		// byte byt = sht; // this will throw CTE
		byte byt = (byte) sht;
		System.out.println("Short 128 to byte output: " + byt);
		
		sht = 135;
		System.out.println("\nShort sht: " + sht);
		// byte byt = sht; // this will throw CTE
		byt = (byte) sht;
		System.out.println("Short 135 to byte output: " + byt);
		
		int intg= 33135;
		System.out.println("\nInt intg: " + intg);
		// byte byt = sht; // this will throw CTE
		short shrt = (short) intg;
		System.out.println("Integer 33135 to short output: " + shrt);
	}

}
