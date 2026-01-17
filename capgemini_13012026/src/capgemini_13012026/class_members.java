package capgemini_13012026;

public class class_members {
    // two types of class members: local members and global members
    // local members: declared inside a method, accessible only within that method
    // global members: declared inside a class but outside any method, accessible by all methods of the class

    // example of local member
    public void localMemberExample() {
        // local variable: inside the local block, if we declare a variable, it is local to that block and 
        // the variable is called local variable
        int localVar = 10; // local variable
        System.out.println("Local Variable: " + localVar);
    }

    
    // types of global members: instance members and static members
    int instanceVar; // instance variable   
    // non-static global members are also called instance members
    // because they are tied to a specific instance of the class
    // each object of the class has its own copy of instance members
    // whereas static members are shared among all instances of the class

    static int staticVar; // static variable
    // static global members are also called class members
    // because they are tied to the class itself, not to any specific instance
    // there is only one copy of static members shared among all instances of the class
    // they can be accessed using the class name
    // constant members: final keyword is used to declare constant members
    final int CONSTANT_VAR = 50; // constant variable

    // only final keyword can be used with local variables to make them constant
    // static keyword cannot be used with local variables
    // final int LOCAL_CONSTANT = 100;
    // static int STATIC_LOCAL = 200; // this will give a compile-time error
    // error: illegal start of expression

    // example of global members
    public void accessGlobalMembers() {
        instanceVar = 20;
        staticVar = 30;
        System.out.println("Instance Variable: " + instanceVar);
        System.out.println("Static Variable: " + staticVar);
    }

    public static void main(String[] args) {
        class_members obj = new class_members();
        obj.localMemberExample();
        obj.accessGlobalMembers();
        obj.accessConstantMember();
        obj.showPrivateVar();
        accessStaticMember();
    }

    // accessing static member without creating object
    public static void accessStaticMember() {
        staticVar = 40;
        System.out.println("Static Variable accessed without object: " + staticVar);
    }

    // accessing constant member
    public void accessConstantMember() {
        System.out.println("Constant Variable: " + CONSTANT_VAR);
    }

    // access modifiers allowed for class members
    private int privateVar; // accessible only within the class
    protected int protectedVar; // accessible within the package and subclasses
    public int publicVar; // accessible from anywhere
    int defaultVar; // accessible within the package (default access)
    final int finalVar = 60; // constant member

    // use of private variable
    public void setPrivateVar(int value) {
        privateVar = value;
    }
    public int getPrivateVar() {
        return privateVar;
    }
    public void showPrivateVar() {
        setPrivateVar(1709);
        System.out.println("Private Variable: " + getPrivateVar());
    }

    // we cannot create objects inside static methods and we cannot create objects of private classes

}
