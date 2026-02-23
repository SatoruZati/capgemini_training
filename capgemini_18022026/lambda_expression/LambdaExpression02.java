package capgemini_18022026.lambda_expression;

public interface LambdaExpression02 {
    void add(int a, int b);
    void sub(int a, int b);
    void mul(int a, int b);
    void div(int a, int b);
}

interface lambdaWithArgs {
    void performAction(String message);
    void performAction(int a, int b);
}

class LambdaSample02 {
    public static void main(String[] args) {
        // Using lambda expression to implement the interface
        LambdaExpression02 lambda = new LambdaExpression02() {
            @Override
            public void add(int a, int b) {
                System.out.println("Addition: " + (a + b));
            }

            @Override
            public void sub(int a, int b) {
                System.out.println("Subtraction: " + (a - b));
            }

            @Override
            public void mul(int a, int b) {
                System.out.println("Multiplication: " + (a * b));
            }

            @Override
            public void div(int a, int b) {
                if (b != 0) {
                    System.out.println("Division: " + (a / b));
                } else {
                    System.out.println("Division by zero is not allowed.");
                }
            }
        };

        // Calling the methods
        lambda.add(10, 5);
        lambda.sub(10, 5);
        lambda.mul(10, 5);
        lambda.div(10, 5);

        // Using lambda expression with arguments
        lambdaWithArgs lambdaArgs = new lambdaWithArgs() {
            @Override
            public void performAction(String message) {
                System.out.println("Message: " + message);
                System.out.println("This is a lambda expression with a string argument.");
            }

            @Override
            public void performAction(int a, int b) {
                System.out.println("This is a lambda expression with a int argument.");
                // lambda expression with multiple parameters
                System.out.println("The sum of " + a + " and " + b + " is: " + (a + b));
            }
        };
    }
}
