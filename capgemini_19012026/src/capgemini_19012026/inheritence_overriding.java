package capgemini_19012026;

/*
 * ===========================
 * PARENT CLASS
 * ===========================
 * Contains:
 * 1. Static methods  → belong to the class
 * 2. Instance method → can be overridden
 */
class Parent {

    /*
     * Static method
     * -------------
     * - Belongs to the Parent class, not to objects
     * - Can be inherited by Child
     * - Cannot be overridden (only hidden)
     */
    static void eat() {
        System.out.println("Static method in Parent class");
    }

    /*
     * Static method with parameters
     * - Demonstrates class-level behavior
     * - Accessed using class name
     */
    static int add(int a, int b) {
        return a + b;
    }
    
    /*
     * Instance method
     * ---------------
     * - Belongs to object instances
     * - Can be overridden in child class
     * - Demonstrates runtime polymorphism
     */
    String goat_string() {
        return "GOAT String from Parent = MESSI";
    }
    
    int maths(int x, int y) {
    	return x*y;
    }
}

/*
 * ===========================
 * CHILD CLASS
 * ===========================
 * - Uses 'extends' keyword to inherit Parent
 * - Inherits static and non-static members
 */
class Child extends Parent {

    /*
     * Method Overriding
     * -----------------
     * - Same method name
     * - Same return type
     * - Same parameter list
     * - Runtime method dispatch
     */
    @Override
    String goat_string() {
        return "GOAT String from Child = RONALDO and MESSI";
    }
    
    @Override
    int maths(int x, int y) {
    	return x+y;
    }
    
    /*
     * NOTE:
     * -----
     * Static methods (like eat()) cannot be overridden.
     * If redefined in Child, it would be method HIDING, not overriding.
     */
}

/*
 * ===========================
 * MAIN CLASS
 * ===========================
 * Entry point of program execution
 */
public class inheritence_overriding {

    public static void main(String[] args) {

        /*
         * Static method calls
         * -------------------
         * - Recommended way: use class name
         * - Binding happens at compile time
         */
        Parent.eat();   // Preferred
        Child.eat();    // Allowed but still refers to Parent.eat()

        /*
         * Static method invocation
         * Demonstrates class-level behavior
         */
        int sum = Parent.add(10, 20);
        System.out.println("Sum: " + sum);
        
        /*
         * Runtime Polymorphism
         * --------------------
         * Method call resolved at runtime based on object type
         */
        Child c = new Child();
        System.out.println(c.goat_string());   // Calls Child version
        
        Parent p = new Parent();
        System.out.println(p.goat_string());   // Calls Parent version
        
        // Method Overriding: 
        // What is it?
        // Defining a method in Child with same signature as in Parent
        // but with different implementation. 
        // Scope and visibility of child class method should be
        // same or more than parent class method.
        
        // Example Overriding Syntax:
        System.out.println("Child Overriding Maths");
        int math = c.maths(17, 9);
        System.out.println(math);
        System.out.println("Parent Maths Method");
        int math2 = p.maths(17, 9);
        System.out.println(math2);
        

        
    }
}
