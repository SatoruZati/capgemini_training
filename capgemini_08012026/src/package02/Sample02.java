package package02;

public class Sample02 {

	public static void main(String[] args) {
		// Datatype VariableName;
		int a;
		float b;
		boolean c;
		char ch;
		// variableName = data/value;
		a = 17;
		b = 17.10f;
		c = true;
		ch = 'a';

		System.out.println("Datatypes:");
		System.out.println("a: " + a);
		System.out.println("b: " + b);
		System.out.println("c: " + c);
		System.out.println("ch: " + ch);
		System.out.println();

		// direct declaration and initialization
		int x = 9;
		float y = 12.09f;
		double z = 17.1012d;
		boolean alpha = false;
		char c1 = 'A';

		System.out.println("Datatypes:");
		System.out.println("x: " + x);
		System.out.println("y: " + y);
		System.out.println("z: " + z);
		System.out.println("alpha: " + alpha);
		System.out.println("c1: " + c1);
		System.out.println();
		
		// primitive variable
		int num = 1710912;
		System.out.println("num: " + num);
		float fl = 2004.2024f;
		char ch2 = 'G';
		System.out.println("float fl: "+ fl);
		System.out.println("char ch2: "+ ch2);
		System.out.println();
		
		
		// non primitive variable
		String name = "Name";
		System.out.println("name: "+ name);
		String str = "String str value";
		System.out.println("Non primitive datatype: String str = "+ str);
		
	}

}
