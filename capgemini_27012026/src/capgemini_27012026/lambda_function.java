package capgemini_27012026;

// Anonymous object: object without a name, created at the time of method call

// Lambda function: a function without a name, used to implement functional interface
// what is a functional interface?
// functional interface: an interface with only one abstract method
// example of functional interface: Runnable, Callable, Comparator, etc.
// syntax of lambda function: (parameters) -> {body}
// example of lambda function: (int a, int b) -> { return a + b; }

// why use lambda function?
// 1. to reduce code size
// 2. to improve readability
// 3. to enable functional programming

// what is lambda expression?
// lambda expression: a block of code that can be passed as an argument to a method

// what is optional and what is mandatory in lambda expression?
// 1. parameters: mandatory
// 2. arrow operator (->): mandatory
// 3. body: mandatory

// example of lambda expression: (int a, int b) -> { return a + b; }
// if body has only one statement, we can omit curly braces and return keyword

// example: (int a, int b) -> a + b;
// if there is only one parameter, we can omit parentheses
// example: a -> a * a;

// optional: type declaration, parentheses
// mandatory: arrow operator, body
// functional interface
//
//import capgemini_27012026.lambda_expression;
//import java.util.Comparator;
//import java.util.function.BiPredicate;
//import java.util.Arrays;
//import java.util.List;
//import java.util.Collections;
import java.util.Scanner;

public class lambda_function {

    public static void main(String[] args) {

        /*
         * Lambda Function:
         * A lambda is an anonymous function used to implement a functional interface.
         * Syntax:
         * (parameters) -> { body }
         */

        /*
         * Runnable is a built-in functional interface
         * It has exactly one abstract method: run()
         */
        Runnable obj = () -> {
            System.out.println("Hello, World!");
        };

        // Invoking the lambda via interface reference
        System.out.println("Invoking Runnable lambda:");
        obj.run();
        
        System.out.println("--------------------------------------------------");

        /*
         * Implementing our custom functional interface using lambda
         * IMPORTANT:
         * A lambda can implement ONLY the single abstract method (SAM)
         * of a functional interface.
         *
         * In lambda_expression, reverse(int) is the SAM.
         * All other methods are default methods.
         */
        lambda_expression obj2 = (a) -> {
            // Dummy implementation just to satisfy reverse(int)
            return a;
        };

        /*
         * Calling default methods
         * These are inherited automatically by implementing classes / lambdas
         */
        obj2.show();
        System.out.println(obj2.process("Aguueroooooooooo"));
        System.out.println(obj2.calculate(5, 10));
        System.out.println(obj2.test(5));
        
        System.out.println("--------------------------------------------------");

        /*
         * Lambda bound to reverse(int)
         * This lambda matches the method signature:
         * int reverse(int a)
         *
         * Parameter list and return type MUST match the SAM exactly.
         */
        lambda_expression obj1 = (a) -> {
            int rev = 0;
            while (a != 0) {
                int digit = a % 10;
                rev = rev * 10 + digit;
                a /= 10;
            }
            return rev;
        };

        // Using lambda-implemented method
        System.out.println(obj1.reverse(1234)); // 4321
        
        System.out.println("--------------------------------------------------");
        
        // Comparator Lambda Example
        // explaining the comparator lambda
        // Comparator is a functional interface in java.util package
        // Comparator Lambda is used to compare two objects, typically for sorting
        // syntax: (obj1, obj2) -> { comparison logic }
        // output: -1 if obj1 < obj2, 0 if obj1 == obj2, 1 if obj1 > obj2
        
        java.util.Comparator<Integer> comparator = (a, b) -> {
			return a.compareTo(b);
		};
		
		System.out.println("Comparison of 5 and 10: " + comparator.compare(5, 10)); // -1

		// equality check
		System.out.println("Comparison of 5 and 5: " + comparator.compare(5, 5)); // 0

		// greater than check
		System.out.println("Comparison of 10 and 5: " + comparator.compare(10, 5)); // 1
		
		System.out.println("--------------------------------------------------");
		
		// equalsIgnoreCase Lambda Example
		// explaining the equalsIgnoreCase lambda
		// equalsIgnoreCase is a functional interface in java.util package
		// equalsIgnoreCase Lambda is used to compare two strings ignoring case differences
		// syntax: (str1, str2) -> { comparison logic }
		// output: true if str1 equals str2 ignoring case, false otherwise
		
		java.util.function.BiPredicate<String, String> equalsIgnoreCase = (str1, str2) -> {
			return str1.equalsIgnoreCase(str2);
			};
		
		System.out.println("Are 'hello' and 'HELLO' equal ignoring case? " + equalsIgnoreCase.test("hello", "HELLO")); // true
		System.out.println("Are 'hello' and 'world' equal ignoring case? " + equalsIgnoreCase.test("hello", "world")); // false
		
		System.out.println("--------------------------------------------------");
		
		// Collections Lambda Example
		// explaining the Collections lambda
		// Collections is a functional interface in java.util package
		java.util.List<String> names = java.util.Arrays.asList("Messi", "Ronaldo", "Neymar", "Mbappe", "Salah");
		
		// sorting names in ascending order using lambda
		names.sort((name1, name2) -> name1.compareTo(name2));
		System.out.println("Names sorted in ascending order: " + names);
		
		// sorting names in descending order using lambda
		names.sort((name1, name2) -> name2.compareTo(name1));
		System.out.println("Names sorted in descending order: " + names);
		
		System.out.println("--------------------------------------------------");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a formula 1 driver name: ");
		String driver = sc.nextLine();
		
		System.out.print("Enter the team name: ");
		String team = sc.nextLine();
		
		System.out.println("Enter another formula 1 driver name: ");
		String driver2 = sc.nextLine();
		
		System.out.print("Enter another team name: ");
		String team2 = sc.nextLine();
		
		// searching for driver using lambda
		java.util.function.BiPredicate<String, String> searchDriver = (d, t) -> {
			return (d.equalsIgnoreCase("Lewis Hamilton") && t.equalsIgnoreCase("Mercedes")) ||
				   (d.equalsIgnoreCase("Max Verstappen") && t.equalsIgnoreCase("Red Bull")) ||
				   (d.equalsIgnoreCase("Charles Leclerc") && t.equalsIgnoreCase("Ferrari")) ||
				   (d.equalsIgnoreCase("Lando Norris") && t.equalsIgnoreCase("McLaren")) ||
				   (d.equalsIgnoreCase("George Russell") && t.equalsIgnoreCase("Mercedes"));
		};
		
		System.out.println("Is " + driver + " driving for " + team + "? " + searchDriver.test(driver, team));
		
		System.out.println("Is " + driver2 + " driving for " + team2 + "? " + searchDriver.test(driver2, team2));
		
		System.out.println("--------------------------------------------------");
		
		// comparing both input names using lambda and equalsIgnoreCase
		java.util.function.BiPredicate<String, String> compareDrivers = (d1, d2) -> {
			return d1.equalsIgnoreCase(d2);
		};
		System.out.println("Are " + driver + " and " + driver2 + " the same driver? " + compareDrivers.test(driver, driver2));
		
		sc.close();
		System.out.println("--------------------------------------------------");
    
    }
    
}
