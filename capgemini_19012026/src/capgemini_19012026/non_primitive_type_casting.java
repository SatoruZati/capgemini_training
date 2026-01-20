package capgemini_19012026;

class P {
    String goat_string() {
        return "GOAT String from Parent = MESSI";
    }
    
    int multiply(int a, int b) {
        return a * b;
    }
    
    static void display() {
        System.out.println("Static method in Parent class");
    }
}

class C extends P {
    @Override
    String goat_string() {
        return "GOAT String from Child = RONALDO";
    }
}

public class non_primitive_type_casting {
	

	public static void main(String[] args) {
		/*
		// Non-primitive type casting in Java

		// Upcasting (Implicit)
		Parent parentRef = new Child(); // Child object referenced by Parent type
		System.out.println("Upcasting:");
		System.out.println(parentRef.goat_string()); // Calls Child's overridden method

		// Downcasting (Explicit)
		Child childRef = (Child) parentRef; // Explicitly casting back to Child
		System.out.println("Downcasting:");
		System.out.println(childRef.goat_string()); // Calls Child's overridden method

		// Invalid Downcasting Example (Uncommenting will cause ClassCastException)
		// Parent anotherParentRef = new Parent();
		// Child invalidChildRef = (Child) anotherParentRef; // This will throw an exception
	*/

		// What is Upcasting:
		// Upcasting is the process of converting a subclass reference into a superclass reference.
		// It is done implicitly and allows us to call overridden methods in the subclass.
		// Example: Parent parentRef = new Child();

		// Auto Upcasting: Parent parentRef = new Child();
		// Implicitly done by Java compiler without explicit cast syntax.
		// 

		// What is Downcasting:
		// Downcasting is the process of converting a superclass reference back into a subclass reference.
		// It must be done explicitly and can lead to a ClassCastException if the object is not of the correct type.
		// Example: Child childRef = (Child) parentRef;
		
		// Compiler Binding happens on reference type during compile time
		// Runtime Binding happens on object type during runtime
		// In this example, goat_string() is overridden, so runtime binding occurs.
		// Compiler binding in this case is not applicable for overridden methods. 
		// But for non overridden methods, compiler binding happens.
		// For example, if multiply() method is called on parentRef, 
		// compiler binding will call Parent's multiply() method.
		
		// Demonstration of Upcasting and Downcasting
		P pRef = new C(); // Upcasting
		System.out.println("Upcasting:");
		System.out.println(pRef.goat_string()); // Calls Child's overridden method
		
		C cRef = (C) pRef; // Downcasting
		System.out.println("Downcasting:");
		System.out.println(cRef.goat_string()); // Calls Child's overridden method
		
		// invalid 
		// P anotherPRef = new P();
		// C invalidCRef = (C) anotherPRef; // This will throw an exception 
		// Uncommenting the above line will cause ClassCastException at runtime
		
		// Direct Downcasting without Upcasting
		// C directCRef = (C) new P(); 
		// This will also throw ClassCastException at runtime
		// Uncommenting the above line will cause ClassCastException at runtime
		
		// So before Downcasting, always ensure that the 
		// object is of the correct subclass type. Before downcasting,
		// we need to do Upcasting first.
		// First: Upcasting -> Then: Downcasting
		P pRef2 = new C(); // Upcasting
		C cRef2 = (C) pRef2; // Downcasting
		System.out.println("Downcasting:");
		System.out.println(cRef2.goat_string()); // Calls Child's overridden method
		
		// what is ClassCastException?
		// ClassCastException is a runtime exception that occurs when
		// we try to cast an object to a subclass of which it
		// is not an instance. It indicates an invalid type conversion.
		
		// To achieve generalization and specialization in OOP, 
		// Upcasting and Downcasting are essential concepts.
	}

}
