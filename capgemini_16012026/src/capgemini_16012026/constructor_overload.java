package capgemini_16012026;

/*
 * Demonstration of CONSTRUCTOR OVERLOADING in Java
 * ------------------------------------------------
 * Key idea:
 * - Multiple constructors in the same class
 * - Differentiated by number and/or type of parameters
 * - Resolved at compile time (compile-time polymorphism)
 */

public class constructor_overload {

    public static void main(String[] args) {

        /*
         * Since football_player is declared as a STATIC nested class,
         * it can be instantiated directly from the static main() method.
         */

        football_player player1 = new football_player("Lionel Messi");
        football_player player2 = new football_player("Cristiano Ronaldo", 41);
        football_player player3 = new football_player("Neymar Jr", 33, "LW");
        

        /*
         * Output will depend on which constructor is invoked
         * based on the argument list used during object creation.
         */
    }

    /*
     * STATIC nested class
     * -------------------
     * Why static?
     * - main() is static
     * - static nested classes do NOT require an enclosing instance
     * - avoids the "No enclosing instance" compiler error
     */
    static class football_player {

        // Instance variables (fields)
        String name;
        int age;
        String position;

        /*
         * Constructor 1
         * -------------
         * Accepts only name
         * Used when minimal information is available
         */
        public football_player(String name) {
            this.name = name;   // this.variable refers to the current object's field
            System.out.println("Player Name: " + name);
        }

        /*
         * Constructor 2
         * -------------
         * Accepts name and age
         * Demonstrates constructor chaining using this()
         */
        public football_player(String name, int age) {

            /*
             * this(name) calls Constructor 1
             * Rules:
             * - this() must be the FIRST statement in the constructor
             * - Used to avoid code duplication
             */
            this(name);

            this.age = age;
            System.out.println("Age: " + age);
        }

        /*
         * Constructor 3
         * -------------
         * Accepts name, age, and position
         * Chains to Constructor 2
         */
        public football_player(String name, int age, String position) {

            /*
             * Calls Constructor 2
             * Constructor call chain:
             * Constructor 3 → Constructor 2 → Constructor 1
             */
            this(name, age);

            this.position = position;
            System.out.println("Position: " + position);
        }

        /*
         * IMPORTANT NOTES
         * ----------------------------------------
         * 1. Constructors have NO return type (not even void)
         * 2. Constructor name must match class name exactly
         * 3. Constructor overloading depends on:
         *    - Number of parameters
         *    - Type of parameters
         * 4. Constructors cannot be overridden
         * 5. this() and super() cannot appear together
         * 6. If no constructor is defined, compiler adds a default constructor
         */
    }
}
