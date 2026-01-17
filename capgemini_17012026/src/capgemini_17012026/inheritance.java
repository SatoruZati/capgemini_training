package capgemini_17012026;

public class inheritance {

	// blueprint
	// one static method, one non static method
	// one static variable, one non static variable

	// we need to create 2 classes A and B to demonstrate inheritance with one static
	// and one non static method and one static and one non static variable

	// same variable and same method name should not be there in any classes. Use different names. 
	// create members of subclass and superclass with different names.
	// Access all members of each classes in the main method.

	public static class A {
		static int staticVarA = 10;
		int nonStaticVarA = 20;

		static void staticMethodA() {
			System.out.println("This is static method of class A");
		}

		void nonStaticMethodA() {
			System.out.println("This is non-static method of class A");
		}
	}

	public static class B{
		static int staticVarB = 30;
		int nonStaticVarB = 40;

		static void staticMethodB() {
			System.out.println("This is static method of class B");
		}

		void nonStaticMethodB() {
			System.out.println("This is non-static method of class B");
		}
	}
	
	public static class inherit01 extends A {
		// inherits from class A
		void display() {
			System.out.println("This is class inherit01 extending class A");
		}
	}

	public static class inherit02 extends B {
		// inherits from class B
		void show() {
			System.out.println("This is class inherit02 extending class B");
		}
	}

	public static void main(String[] args) {
		// accessing everything from class A
		System.out.println("Accessing members of class A:");
		System.out.println("Static Variable A: " + A.staticVarA);
		A.staticMethodA();
		A a = new A();	
		System.out.println("Non-Static Variable A: " + a.nonStaticVarA);
		a.nonStaticMethodA();

		// accessing everything from class B
		System.out.println("\nAccessing members of class B:");
		System.out.println("Static Variable B: " + B.staticVarB);
		B.staticMethodB();
		B b = new B();
		System.out.println("Non-Static Variable B: " + b.nonStaticVarB);
		b.nonStaticMethodB();

		// accessing inherited members in inherit01
		System.out.println("\nAccessing inherited members in inherit01:");
		inherit01 obj1 = new inherit01();
		obj1.display();
		System.out.println("Inherited Static Variable A in inherit01: " + inherit01.staticVarA);
		inherit01.staticMethodA();
		System.out.println("Inherited Non-Static Variable A in inherit01: " + obj1.nonStaticVarA);
		obj1.nonStaticMethodA();

		// accessing inherited members in inherit02
		System.out.println("\nAccessing inherited members in inherit02:");
		inherit02 obj2 = new inherit02();
		obj2.show();
		System.out.println("Inherited Static Variable B in inherit02: " + inherit02.staticVarB);
		inherit02.staticMethodB();
		System.out.println("Inherited Non-Static Variable B in inherit02: " + obj2.nonStaticVarB);
		obj2.nonStaticMethodB();

	}

}
