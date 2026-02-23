package capgemini_18022026.functional_interfaces;

public interface SampleClass02 {
    public default void any() {
        System.out.println("This is default method of interface");
        // default method is introduced in java 8, it is used to provide default implementation of method in interface
        // default method can be overridden in child class, but it is not mandatory to override default method in child class
        // default method can be called by using interface reference variable, but it is not mandatory to call default method in child class.
        // default can only be used in interface, it can not be used in class, it can not be used in abstract class, it can only be used in interface.
    }
}

interface AnotherParentClass {
    public default void any() {
        System.out.println("This is default method of another interface");
        // if we have two default methods with same name in two interfaces, then we have to override that method in child class, otherwise it will give compile time error
        // if we have two default methods with same name in two interfaces, then we can call that method by using interface reference variable, but it is not mandatory to call that method in child class.

    }
}

class Child implements SampleClass02, AnotherParentClass {
    // Child Class
    public static void main(String[] args) {
        Child child = new Child(); // we can create object of child class, but we can not create object of interface.
        // why? because interface is a blueprint of class, it is not a class, it is a collection of abstract methods and default methods,
        // it can not be instantiated, it can only be implemented by class.
        // child.any(); // we can call any method of interface by using child class object, but it will give compile time error because there are
        // two default methods with same name in two interfaces,
        // so we have to override that method in child class, otherwise it will give compile time error
        child.any();
    }

    // we have to override any method in child class, otherwise it will give compile time error because there are two default methods
    // with same name in two interfaces, so we have to override that method in child class, otherwise it will give compile time error
    @Override
    public void any() {
        System.out.println("This is overridden method of child class");
        // why use super keyword in child class? because we want to call the default method of interface, we can call that method by using super keyword,
        // but we have to specify the interface name before super keyword,
        // otherwise it will give compile time error because there are two default methods with same name in two interfaces,
        // so we have to specify the interface name before super keyword, otherwise it will give compile time error
        // what is super keyword doing iin this case: it is calling the default method of interface, it is calling the default method of SampleClass02 interface, because we have specified the interface name before super keyword,
        // since it is default method we have to call super keyword to call that method, if it was static method we could have called that method by using interface name, but since it is default method we have to call that method by using super keyword,
        SampleClass02.super.any();
    }
}