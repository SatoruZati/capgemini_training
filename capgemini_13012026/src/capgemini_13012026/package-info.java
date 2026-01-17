package capgemini_13012026;

// CLASS NOTES	

// default values of class members
/**
 * Primitive data types have default values when declared as class members (global members).
 * 1. byte, short, int, long : 0
 * 2. float, double : 0.0
 * 3. char : '\u0000' (null character)
 * 4. boolean : false   
 * 5. Object references (like String, Arrays, etc.) : null
 * 
 * Non-primitive data types (like Arrays, Classes, Interfaces) have a default value of null.
 * 
 * Any user-defined objects also have a default value of null.
 * 
 * Note: Local variables do not have default values and must be initialized before use.
 * 
 * Global members are initialized with default values by the Java runtime 
 * when an instance of the class is created.
 * 
 * Example:
 * public class Example {
 *    int intValue;          // default value 0
 *   double doubleValue;    // default value 0.0
 *   boolean boolValue;     // default value false
 *   String strValue;       // default value null
 * }
 * 
 * Output:
 * intValue: 0
 * doubleValue: 0.0 
 * boolValue: false
 * strValue: null
 * 
 * Global Members: any variable declared inside a class but outside any method, constructor or block.
 * Any global member declared with static keyword is called static member.
 * static members are shared among all instances of the class.
 * static global members are also called class members.
 * 
 * now within the static global variables, we have constant members, which are declared using final keyword.
 * 
 * Constant Members: global members declared with final keyword.
 * any variable declared with final keyword cannot be modified once initialized.
 * 
 * any global variable can or cannot be declared as static.
 * 
 * to access static members, we do not need to create an object of the class. but we need 
 * a main method to run the program.
 * 
 * we can acess by two ways:
 * 1. using class name
 * 2. directly within the static method of the class
 * 3. using object of the class (not recommended)
 * 
 * example way 1:
 * package ClassName;
 * ClassName.staticMemberName
 * System.out.println(ClassName.staticMemberName);
 * 
 * example way 2:
 * public static void staticMethod() {
 *    staticMemberName = value;
 * }
 * public static void main(String[] args) {
 *   staticMethod();
 * }
 * 
 * example way 3:
 * ClassName obj = new ClassName();
 * obj.staticMemberName = value;
 * System.out.println(obj.staticMemberName);
 * 
 * but this is not recommended because static members are shared among all instances of the class.
 * 
 * Non-static global variables are also called instance variables.
 * 
 * Example:
 * public class Example {
 *   // global variables
 *   int instanceVar;        // instance variable
 *   static int staticVar;    // static variable
 *   final int CONSTANT_VAR = 50; // constant variable
 * }
 * 
 * 
 * //////////////////////////////////////////////////////////////////////////////////////////////////////
 * 
 * Local Members: any variable declared inside a method, constructor or block.
 * 
 * //////////////////////////////////////////////////////////////////////////////////////////////////////
 * 
 *                          OBJECT CREATION AND MEMORY ALLOCATION
 * 
 * In Java, objects are created using the 'new' keyword followed by a constructor call.
 * For example:
 * ClassName obj = new ClassName();
 * 
 * Any member declared without static keyword is called instance member. To access instance members,
 * we need to create an object of the class.
 * 
 * When an object is created, memory is allocated for the instance members of the class.
 * Each object has its own copy of instance members.
 * 
 * Example:
 * public class Example {
 *   int instanceVar = 69; // instance variable
 *   static int staticVar = 96; // static variable
 * }
 * 
 * public static void main(String[] args) {
 *   Example obj1 = new Example();
 *   Example obj2 = new Example();
 *   obj1.instanceVar = 10;
 *   obj2.instanceVar = 20;
 *   System.out.println("obj1 instanceVar: " + obj1.instanceVar); // Output: 10
 *   System.out.println("obj2 instanceVar: " + obj2.instanceVar); // Output: 20
 * }
 * 
 * In the above example, each object of the Example class will have its own copy of instanceVar,
 * so modifying instanceVar in one object does not affect the other object.
 * 
 * //////////////////////////////////////////////////////////////////////////////////////////////////////
 */