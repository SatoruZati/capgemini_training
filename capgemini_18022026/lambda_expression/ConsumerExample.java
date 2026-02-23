package capgemini_18022026.lambda_expression;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class ConsumerExample {
    public static void main(String[] args) {
        // Using Consumer functional interface to implement a lambda expression
        Consumer<String> consumer = message -> System.out.println("Consumer received: " + message);

        // Calling the accept method of the Consumer interface
        consumer.accept("Hello, this is a message for the Consumer!");

        // Using Supplier functional interface to implement a lambda expression
        Supplier<Integer> supplier = () -> 42;
        System.out.println("Supplier provided: " + supplier.get());

        Supplier<List> supplier01 = () -> new ArrayList<>();

        Consumer<String> consumer02 = a -> System.out.println("Consumer received: " + a);

        consumer02.accept("Hello, this is a message for the Consumer02!");

    }
}
