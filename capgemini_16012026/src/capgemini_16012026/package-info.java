package capgemini_16012026;

// 'this' keyword is used in non static context or block. 
// 'this' keyword holds the address or reference of current class object.
// the main purpose of this keyword is to refer or call non static members of current class inside static or non static context or block.
// 'this' keyword can be used to call non static members like variables, methods and constructors of current class inside static or non static context or block.
// 'this' keyword can be used to resolve the ambiguity between instance variables and parameters or local

// 'this' keyword can refer static members also but it is not recommended to use 'this' keyword to refer static members.
// 'this' keyword cannot be used in static context or block.
// 'this' keyword can be used to pass current class object as an argument in the methods or constructors.
// 'this' keyword can be used to return current class object from the method.
// 'this' keyword must be the first statement in the constructor when used to call current class constructor.
// 'this' keyword cannot be used in the static method to call non static members of current class.

// Accessing global members from one class to another class 
// using 'this' keyword along with object reference variable.
// Example:
// class A {
//     int x = 10;
//     void display() {
//         System.out.println("Value of x: " + this.x); // Accessing instance
//     }
// }
// class B {
//     void show() {
//         A a = new A();
//         System.out.println("Value of x from class A: " + a.x); // Accessing instance of class A
//     }
// }

// Object Oriented Programming Concept in Java
// Java OOPs Concepts
// 1. Inheritance
// 2. Polymorphism
// 3. Encapsulation
// 4. Abstraction

// BLUEPRINT CLASS
// what is a blueprint class?
// A blueprint class is a template or prototype that defines the structure and behavior of objects in object
// oriented programming (OOP). It serves as a blueprint for creating multiple instances of objects with similar properties
// and methods. A blueprint class typically includes attributes (data members) and methods (functions)

// Example of Blueprint Class
// class Car {
//     // Attributes (data members)
//     String color;
//    String model;
//    int year;
//    //    // Methods (functions)
//    void start() {
//        System.out.println("Car started");
//    }
//    void stop() {
//        System.out.println("Car stopped");
//    }
// }

// How is this a blueprint class?
// The Car class serves as a blueprint for creating multiple car objects with similar properties 
// (color, model, year)
// and behaviors (start, stop). Each car object created from this blueprint class will have its 
// own set of attributes and can perform the defined methods.
// 