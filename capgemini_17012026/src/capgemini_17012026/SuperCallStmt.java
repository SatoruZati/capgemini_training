package capgemini_17012026;

/*
 * Demonstration of SUPER CALL STATEMENT in Java
 * ---------------------------------------------
 * Focus:
 * - Inheritance
 * - Method overriding
 * - Use of super keyword
 */
public class SuperCallStmt {

    /*
     * Superclass (Parent Class)
     * -------------------------
     * Animal is a base class that defines common behavior
     */
    static class Animal {

        // Method defined in superclass
        void eat() {
            System.out.println("This animal eats food");
        }

        // Another method defined in superclass
        void drink() {
            System.out.println("This animal drinks water");
        }
    }

    /*
     * Subclass (Child Class)
     * ----------------------
     * Dog inherits from Animal using 'extends'
     */
    static class Dog extends Animal {

        /*
         * Method Overriding
         * -----------------
         * Same method name and signature as in superclass
         */
        @Override
        void eat() {

            /*
             * super.eat()
             * -----------
             * Calls the eat() method of the superclass (Animal)
             * Used when we want to reuse parent class behavior
             */
            super.eat();

            // Child-specific behavior
            System.out.println("This dog eats dog food");
        }
    }

    /*
     * Main method
     * -----------
     * Entry point of the program
     */
    public static void main(String[] args) {

        // Creating object of subclass
        Dog d = new Dog();

        // Calls overridden method (Dog's eat())
        d.eat();

        // Calls inherited method from Animal
        d.drink();
    }
}
