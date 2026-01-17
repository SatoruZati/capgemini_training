package capgemini_17012026;

// inheritance

// A class can inherit the properties and methods of another class using the "extends" keyword.
// The class which inherits the properties of another class is called the subclass (or derived class,
// child class) and the class whose properties are inherited is called the superclass 
// (or base class, parent class).

// Example:
// class Car {
//     void display() {
//         System.out.println("This is a car");
//     }
//     void engine() {
//         System.out.println("Car engine is running");
//    }
// }
// class BMW extends Car {
//     void show() {    
//         System.out.println("This is a BMW car");
//     }
//    public static void main(String[] args) {
//         BMW b = new BMW();
//         b.show();
//         b.engine();
//         b.display();
// }

// Output:
// This is a BMW car
// Car engine is running
// This is a car

// explanation: In the above example, the class BMW is inheriting the properties and 
// methods of the class Car using the "extends" keyword.

// Association vs Inheritance:
// Association is a relationship between two separate classes which establishes a connection
// between them. Inheritance is a mechanism where a new class inherits the properties and
// behaviors (methods) of an existing class. 

// Inheritance is an IS-A relationship, whereas association is a HAS-A relationship.
// For example, a Dog IS-A Animal (inheritance), but a Car HAS-A Engine (association).

// structure of inheritance in Java:
// class Superclass {
//     // properties and methods
// }
// class Subclass extends Superclass {
//     // additional properties and methods
// }
//

// Parent Child connection: 
// Superclass (Parent Class) --> Subclass (Child Class)

// extends keyword is used to inherit the properties of a class.
// implements keyword is used to inherit the properties of an interface.

// Types of Inheritance in Java:
// 1. Single Inheritance: A class inherits from one superclass.
// 2. Multilevel Inheritance: A class inherits from a subclass, which in turn inherits from another superclass.
// 3. Hierarchical Inheritance: Multiple classes inherit from a single superclass.

// Java does not support multiple inheritance (a class inheriting from more than one class) directly to 
// avoid complexity and ambiguity.
// However, multiple inheritance can be achieved using interfaces.

// Note: Constructors are not inherited in Java. 
// However, the constructor of the superclass can be called from the subclass
// using the super() keyword.

// whenever we are doing inheritance the JVM creates an object of the parent class first
// and then it creates the object of the child class.
// we need to create a child class object to access the properties of the parent class.

// Inheritance and static - non static situation:
// In inheritance, static members (variables and methods) of the superclass are inherited by the subclass.
// However, static members belong to the class itself rather than to any specific instance.
// Therefore, they can be accessed using the class name without creating an instance of the subclass.
// Non-static members (instance variables and methods) are inherited by the subclass and 
// can be accessed through instances of the subclass.

// Therefore in a line, No, a static class cannot be inherited in Java because static classes are not allowed
// at the top level. Only nested static classes are permitted, and they can be inherited by subclasses.

// Non static members can be inherited and accessed through subclass instances. 

// method hiding in inheritance:
// In Java, method hiding occurs when a subclass defines a static method with the same signature
// as a static method in its superclass. When this happens, the method in the subclass hides
// the method in the superclass rather than overriding it.
// This means that the version of the static method that gets called is determined by the
// reference type, not the object type.

// SUPER CALL STATEMENT
// The super keyword in Java is a reference variable that is used to refer to the immediate
// parent class object. It can be used to access superclass methods, variables, and constructors.
// It is commonly used in inheritance to call superclass methods or constructors from the subclass.
// Example:
// class Animal {
//     void eat() {
//         System.out.println("This animal eats food");
//     }
// }
// class Dog extends Animal {
//     void eat() {
//         super.eat(); // calling superclass method
//         System.out.println("This dog eats dog food");
//     }
//     public static void main(String[] args) {
//         Dog d = new Dog();
//         d.eat();
//     }
// Output:
// This animal eats food
// This dog eats dog food

// INTERFACE 
// An interface in Java is a reference type that defines a contract of methods that a class must implement.
// It is a way to achieve abstraction and multiple inheritance in Java.
// An interface can contain method signatures (without implementation), constants, default methods,
// static methods, and private methods (from Java 9 onwards).
// Example:
// interface Animal {
//     void eat(); // abstract method
//     void sleep(); // abstract method
// }
// class Dog implements Animal {
//     public void eat() {
//         System.out.println("Dog eats dog food");
//     }
//     public void sleep() {
//         System.out.println("Dog sleeps for 8 hours");
//     }
//     public static void main(String[] args) {
//         Dog d = new Dog();
//         d.eat();
//         d.sleep();
//     }
// Output:
// Dog eats dog food
// Dog sleeps for 8 hours
// In the above example, the interface Animal defines two abstract methods: eat() and sleep().
// The class Dog implements the Animal interface and provides concrete implementations
// for both methods. The Dog class must implement all methods defined in the Animal interface;
// otherwise, it must be declared as an abstract class.
