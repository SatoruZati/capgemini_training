package capgemini_19012026;

public class abstraction {

    public static void main(String[] args) {

        /*
         * ABSTRACTION:
         * Abstraction is the process of hiding implementation details
         * and exposing only essential features or behavior to the user.
         */

        /*
         * CONCRETE METHOD:
         * A concrete method is a method that has a body (implementation).
         * It can be static or non-static.
         */

        /*
         * CONCRETE CLASS:
         * A concrete class is a class that is NOT declared abstract.
         * It must implement all abstract methods inherited
         * from abstract classes or interfaces.
         *
         * A concrete class can be:
         * - non-static (top-level or inner class)
         * - static ONLY if it is a nested class
         *
         * NOTE:
         * Static top-level classes are NOT allowed in Java.
         */

        /*
         * ABSTRACT METHOD:
         * An abstract method is declared using the 'abstract' keyword.
         * It does NOT have a method body.
         */

        /*
         * ABSTRACT CLASS:
         * An abstract class is declared using the 'abstract' keyword.
         * It may contain:
         * - abstract methods
         * - concrete (implemented) methods
         */

        /*
         * INTERFACE:
         * An interface defines a contract that implementing classes must follow.
         * It supports abstraction and multiple inheritance of type.
         */

        // --------- RULES (Corrected & Verified) ---------

        // Static methods CANNOT be declared abstract
        // Reason:
        // Abstract methods must be overridden,
        // but static methods cannot be overridden (they are method-hidden).

        // Abstract methods CANNOT have a body

        // Concrete methods MUST have a body

        // A concrete (non-abstract) class MUST implement
        // all abstract methods inherited from abstract classes or interfaces

        // An abstract class CAN have both abstract and concrete methods

        // Interfaces:
        // - Before Java 8:
        //   Interfaces could contain ONLY abstract methods
        //
        // - From Java 8 onwards:
        //   Interfaces CAN contain:
        //     • abstract methods
        //     • default methods (with body)
        //     • static methods (with body)
        //
        // - From Java 9 onwards:
        //   Interfaces CAN ALSO contain:
        //     • private methods (with or without body)

        // The 'abstract' keyword CANNOT be used with variables
        // Example (INVALID):
        // abstract int x = 10;  // Compilation error

        // The 'abstract' keyword can be used ONLY with:
        // - classes
        // - methods

        // PURPOSE OF ABSTRACT CLASS:
        // - To achieve abstraction
        // - To provide partial implementation
        // - To act as a base class
        // - To enforce method implementation in subclasses

        // IMPORTANT RULES ABOUT ABSTRACT METHODS:

        // Abstract methods CANNOT be static
        // abstract static void show(); // INVALID

        // Abstract methods can have access modifiers
        // abstract public void display(); // VALID

        // Abstract methods MUST NOT have a body
        // abstract public void display() {} // INVALID

        // Abstract methods can be declared ONLY inside
        // abstract classes or interfaces

        /*
        abstract class Animal {
            abstract void makeSound();
        }

        interface Vehicle {
            void start(); // implicitly public and abstract
        }
        */

        /*
         * abstract class Test {
         *   abstract void demo();           // VALID
         *   static void show() {}           // VALID
         *   abstract static void display(); // INVALID
         *   public static void info() {}    // VALID
         * }
         *
         * NOTE:
         * If a class contains at least one abstract method,
         * the class MUST be declared abstract.
         */

        // ================================================================
        // An abstract class CAN exist without abstract methods
        // BUT an abstract method CANNOT exist without an abstract class
        //
        // Although it is not mandatory for an abstract class to have
        // abstract methods, it is commonly used to enforce method
        // implementation in subclasses.
        //
        // Without abstract methods, an abstract class mainly serves as
        // a base class and cannot be instantiated.
        // ================================================================

        // Since an abstract class is incomplete,
        // we CANNOT create an object of an abstract class directly.
        //
        // We must create a concrete subclass that extends the abstract
        // class and provides implementations for all abstract methods.
        //
        // Example:
        //
        // abstract class Animal {
        //     abstract void makeSound();
        // }
        //
        // class Dog extends Animal {
        //     void makeSound() {
        //         System.out.println("Bark");
        //     }
        // }
        //
        // The Dog class becomes concrete by implementing makeSound().
        //
        // Abstract methods represent incomplete behavior
        // that must be completed by subclasses through overriding.
    	// ==================================================================
    	
    	/*
    	| Feature                       | **Abstract Class**                                    | **Interface**                                          |
		| ----------------------------- | ----------------------------------------------------- | ------------------------------------------------------ |
		| Keyword used                  | `abstract class`                                      | `interface`                                            |
		| Purpose                       | Provides partial abstraction and common base behavior | Defines a contract / capability                        |
		| Abstraction level             | Partial abstraction                                   | Full abstraction (before Java 8)                       |
		| Method types allowed          | Abstract and concrete methods                         | Abstract, default, static (Java 8+), private (Java 9+) |
		| Method body                   | Allowed (for concrete methods)                        | Allowed only for default, static, and private methods  |
		| Variables allowed             | Instance variables                                    | Constants only (`public static final` by default)      |
		| Variable access modifiers     | Any (private, protected, default, public)             | Always `public static final`                           |
		| Constructor allowed           | Yes                                                 	|  No                                                    |
		| Object creation               | Cannot instantiate                                  	|  Cannot instantiate                                    |
		| Inheritance keyword           | `extends`                                             | `implements`                                           |
		| Multiple inheritance          | Not supported (classes)                              	|  Supported                                             |
		| Access modifiers for methods  | Any access level                                      | Methods are `public` by default                        |
		| Static methods                | Allowed                                               | Allowed                                                |
		| Final methods                 | Allowed                                               |  Not allowed                                           |
		| Can extend another class      | Yes (one class)                                     	|  No                                                    |
		| Can extend/implement multiple | No                                                  	|  Yes (multiple interfaces)                             |
		| State (instance data)         | Can maintain state                                    | Cannot maintain state                                  |
		| Use case                      | Base class with shared code                           | Capability / role definition                           |
    	 */
    	
    	// everything about abstraction is covered, user should not get affected
    	// by implementation changes in future. 
    	
    	// Interface
    	// An interface is a reference type in Java, similar to a class, that can contain only constants, method signatures, default methods, 
    	// static methods, and nested types.
    	// Interfaces cannot contain instance fields or constructors.
    	// A class implements an interface, thereby inheriting the abstract methods defined by the interface.
    	// Interfaces are a way to achieve abstraction and multiple inheritance in Java.
    	
    	// ========================================================================================================================================
    	// Abstract Class vs Interface
    	// An abstract class can have both abstract and concrete methods, while an interface can only have abstract methods (until Java 8).
    	// Abstract classes are used when there is a common base with shared code, while interfaces are used to define a contract 
    	// for classes to implement.
    	// A class can extend only one abstract class but can implement multiple interfaces.

    	// Interface is a keyword in java that is a blueprint like a class. It has static constants and abstract methods. 
    	// Since we cannot achieve 100% abstraction using abstract class, we use interface to achieve 100% abstraction.
    	// An interface is a collection of abstract methods. A class implements an interface, thereby inheriting the abstract methods of the interface.
    	// Interface is itself a Parent. In interface we don't have constructor concept.
    	// Properties are by default 'public static final'. 
    	// In interface there are no concrete methods
    	// Interface InterfaceName {}
    	// There are three types of interface: 
    	//    	1. Marker Interface: An interface with no methods or fields. It is used to mark a class for a specific purpose.
    	//    	2. Functional Interface: An interface with a single abstract method. It is used in lambda expressions and functional programming.
    	//    	3. Normal Interface: An interface with multiple abstract methods.
    	//
    	// Relationships between Classes and Interfaces:
    	// Class extends Class
    	// Interface extends Interface
    	// Class implements Interface
    	// Interface cannot implement Class
    	//
    	// ========================================================================================================================================
    	// interface syntax demo:
    	// interface Animal {
    	//     void makeSound(); // abstract method
    	// }
    	// class Dog implements Animal {
    	//     public void makeSound() {
    	//         System.out.println("Bark");
    	//     }
    	// }
    	//
    	
    }
}
