package capgemini_27012026;

/*
 * A functional interface must contain EXACTLY ONE abstract method.
 * This makes it eligible for lambda expression usage.
 */
@FunctionalInterface
public interface lambda_expression {

    /*
     * Single abstract method (SAM)
     * This is the ONLY method a lambda can implement.
     */
    int reverse(int a);

    /*
     * Default methods are allowed in functional interfaces.
     * They do NOT count as abstract methods.
     */

    default void display() {
        System.out.println("Default display() method");
    }

    default void show() {
        System.out.println("Default show() method");
    }

    default String process(String input) {
        return input.toUpperCase();
    }

    default int calculate(int a, int b) {
        return a + b;
    }

    default boolean test(int a) {
        return a > 0;
    }
}
