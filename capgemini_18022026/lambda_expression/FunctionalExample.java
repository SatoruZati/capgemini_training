package capgemini_18022026.lambda_expression;

import java.util.List;
import java.util.function.Supplier;

import java.util.function.Supplier;

interface performAction {
    String func(int a, int b);
}

public class FunctionalExample {
    public static void main(String[] args) {
        performAction action = (a, b) -> {
            int sum = a + b;
            return "The sum of " + a + " and " + b + " is: " + sum;
        };

        String result = action.func(5, 10);
        System.out.println(result);

        Supplier<String> supplier = () -> "Hello";
        System.out.println(supplier.get());

        Supplier<List> listSupplier = () -> {
            return List.of(17, 12, 10, 9, 4, 8, 3);
        };

        // Supplier type should same as the return type of the lambda expression, in this case List<Integer>
        Supplier<List<Integer>> listSupplier2 = () -> {
            return List.of(17, 12, 10, 9, 4, 8, 3);
        };

    }
}
