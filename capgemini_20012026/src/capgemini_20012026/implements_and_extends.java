package capgemini_20012026;

// Hierarchical Inheritance with respect to Interface
// when multiple classes are derived from a single class
// Example:
// Class A, B and C are derived from class Parent 

class Parent {
	void show() {
		System.out.println("Parent class method");
	}
}
class A extends Parent {
	void display() {
		System.out.println("Class A method");
	}
}
class B extends Parent {
	void display() {
		System.out.println("Class B method");
	}
}
class C extends Parent {
	void display() {
		System.out.println("Class C method");
	}
}

// implementing from interface and extending from class

class D extends Parent implements interfaceA {
	void display() {
		System.out.println("Class D method");
	}
	public void methodA() {
		System.out.println("Method A from interfaceA");
	}
	public void commonMethod() {
		System.out.println("Common method from interfaceA");
	}
}

// using extended interfaceB 

class E extends Parent implements interfaceB {
	void display() {
		System.out.println("Class E method");
	}
	public void methodA() {
		System.out.println("Method A from interfaceA");
	}
	public void methodB() {
		System.out.println("Method B from interfaceB");
	}
	public void commonMethod() {
		System.out.println("Common method from interfaceB");
	}
}

public class implements_and_extends {
	public static void main(String[] args) {
		A a = new A();
		a.show();
		a.display();
		System.out.println("-------------------");
		B b = new B();
		b.show();
		b.display();
		System.out.println("-------------------");
		C c = new C();
		c.show();
		c.display();
		System.out.println("-------------------");
		
		D d = new D();
		d.show();
		d.display();
		d.methodA();
		d.commonMethod();
		interfaceA.methodStaticA();
		d.defaultMethodA();
		System.out.println("Constant from interfaceA: " + interfaceA.CONSTANT_A);
		System.out.println("-------------------");
		
		E e = new E();
		e.show();
		e.display();
		e.methodA();
		e.methodB();
		e.commonMethod();
		interfaceB.methodStaticB();
		e.defaultMethodB();
		System.out.println("Constant from interfaceB: " + interfaceB.CONSTANT_B);
		System.out.println("-------------------");	
	}
}
