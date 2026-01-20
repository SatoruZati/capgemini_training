package capgemini_19012026;

// Method Hiding
// What is that?
// When a subclass defines a static method with the same signature as a static method in the superclass, it is known as method hiding.
// Example:
// Parent.eat() is hidden by Child.eat()
// It is not overriding because static methods are resolved at compile time based on the reference type, not the object type.
// Hence, calling Child.eat() still refers to Parent.eat().
// ========================================================================

// Polymorphism
// What is it?
// Polymorphism allows methods to do different things based on the object that it is acting upon, even though they share the same name.\
// It is mainly achieved through method overriding in inheritance.
// Example:
// Child c = new Child();
// c.goat_string() calls Child's version
// Parent p = new Parent();
// p.goat_string() calls Parent's version
// This is determined at runtime based on the actual object type.

// Compile Time vs Runtime Polymorphism
// ====================================================================
// Compile Time Polymorphism (Static Binding):
// Achieved through method overloading.
// The method to be called is determined at compile time based on the reference type and method signature.
// Example: Parent.add(10, 20) calls Parent's add method.

// Runtime Polymorphism (Dynamic Binding):
// Achieved through method overriding.
// The method to be called is determined at runtime based on the actual object type.
// Example: c.goat_string() calls Child's version, p.goat_string() calls Parent's version.

// ======================================================================
// STATIC VS FINAL METHODS
// Static methods belong to the class and can be called without creating an instance. They can be hidden but not overridden.
// Final methods cannot be overridden by subclasses. They are used to prevent modification of method behavior in inheritance.

// final can be used with classes, methods, and variables, both local and global. 
// A final class cannot be subclassed, a final method cannot be overridden, 
// and a final variable's value cannot be changed once assigned.

// Does final class mean we cannot inherit it?
// Yes, a final class cannot be extended or inherited by any other class.
// Example: If Parent class is declared as final, then class Child cannot extend Parent.

// instance initializer block
// An instance initializer block is used to initialize instance variables of a class.
// It is executed when an instance of the class is created, before the constructor is called.


