Types of Interfaces:
1. Marker Interface: An interface with no methods, used to indicate that a class belongs to a particular category or has a specific property. Example: Serializable, Cloneable.
2. Functional Interface: An interface with exactly one abstract method, used for lambda expressions and method references.
3. SAM (Single Abstract Method) Interface: Similar to functional interfaces, but can have default and static methods in addition to the single abstract method.
4. Normal Interface: An interface that can have multiple abstract methods, and is not limited to being used with lambda expressions. Example: Runnable, Comparable.

Notes:
Static Method from Parent Class:
- Static methods in Java are not inherited by subclasses. They belong to the class in which they are defined and cannot be overridden. 
- However, they can be hidden by defining a static method with the same signature in the subclass. When you call a static method, it is resolved at compile time based
on the reference type, not the object type. 
- Therefore, if you have a reference of the parent class type pointing to an object of the child class, calling a static method will invoke the method defined in the parent class, not the child class. \
This is because static methods are associated with the class rather than the instance.

Static Method from Interface:
- Static methods in interfaces are not inherited by implementing classes. They belong to the interface and can only be called using the interface name. 
- Implementing classes cannot override static methods from the interface, but they can define their own static methods with the same name. 
- To call a static method from an interface, you must use the interface name followed by the method name, like this:
```
javaInterfaceName.staticMethodName();
```     
- Static methods in interfaces are useful for providing utility methods that are related to the interface, but do not require an instance of the implementing class to be called.
- In summary, static methods in Java are not inherited by subclasses or implementing classes, and they must be called using the class or interface name rather than an instance.

While using Multiple Inheritance with Interfaces:
- If a class implements multiple interfaces that have static methods with the same signature, there is no conflict because static methods are not inherited. Each interface's static method can be called using the interface name, and there is no ambiguity. For example:
```
interface InterfaceA {
    static void staticMethod() {
        System.out.println("Static method in InterfaceA");
    }
}   
interface InterfaceB {
    static void staticMethod() {
        System.out.println("Static method in InterfaceB");
    }
}
class MyClass implements InterfaceA, InterfaceB {
    // No conflict because static methods are not inherited
    
    public static void main(String[] args) {
        InterfaceA.staticMethod(); // Calls static method from InterfaceA
        InterfaceB.staticMethod(); // Calls static method from InterfaceB
    }
```
- In this example, both InterfaceA and InterfaceB have a static method with the same name, but there is no conflict because they are called using the interface name. The implementing class MyClass does not inherit these static methods, so it does not cause any ambiguity.
- In summary, when a class implements multiple interfaces with static methods that have the same signature, there is no conflict because static methods are not inherited. Each interface's static method can be called using the interface name without any ambiguity.


How we can call static method inside Interface:
- Static methods in interfaces can be called using the interface name followed by the method name. 
- For example, if you have an interface named MyInterface with a static method called myStaticMethod, 
- you can call it like this:
```
interface MyInterface {
    static void myStaticMethod() {
        System.out.println("This is a static method in MyInterface");
    }
}
public class Main {
    public static void main(String[] args) {
        MyInterface.myStaticMethod(); // Calling the static method from the interface
    }
```
- In this example, we define a static method myStaticMethod inside the MyInterface interface. To call this static method, we use the interface name MyInterface followed by the method name myStaticMethod.
- Static methods in interfaces are not inherited by implementing classes, so they cannot be called using an instance of the implementing class. They must be called using the interface name, as shown in the example above.

Can we make object of Interface? 
- No, we cannot create an object of an interface in Java. An interface is a reference type that defines a contract for classes to implement, but it does not provide any implementation itself.
- However, we can create an object of a class that implements the interface. When we create an object of a class that implements an interface, we can use that object to call the methods defined in the interface. For example:
```interface MyInterface {
    void myMethod();
}
class MyClass implements MyInterface {
    @Override
    public void myMethod() {
        System.out.println("Implementation of myMethod in MyClass");    
    }
}
public class Main {
    public static void main(String[] args) {
        MyInterface myObject = new MyClass(); // Creating an object of MyClass that implements  
        myObject.myMethod(); // Calling the method defined in the interface
    }
```
- In this example, we have an interface MyInterface with a method myMethod. We then have a class MyClass that implements MyInterface and provides an implementation for the myMethod. 
In the main method, we create an object of MyClass and assign it to a reference of type MyInterface. We can then call the myMethod using the myObject reference, 
which is of type MyInterface. This is possible because MyClass implements MyInterface, allowing us to use the interface reference 
to call the method defined in the interface. 
- However, we cannot create an object of MyInterface directly, as it is an interface and does not have a concrete implementation.