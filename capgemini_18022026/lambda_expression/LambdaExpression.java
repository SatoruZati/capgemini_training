package capgemini_18022026.lambda_expression;

public interface LambdaExpression {
    // if we have one abstract method in the interface, then we can use lambda expression to implement it.
    // if we have more than one abstract method in the interface, then we cannot use lambda expression to implement it.
    void performAction();
    // void performAnotherAction();
}

class childClass implements LambdaExpression {
    @Override
    public void performAction() {
        System.out.println("Performing action in child class.");
    }

//    @Override
//    public void performAnotherAction() {
//        System.out.println("Performing another action in child class.");
//        System.out.println("This is overridden method of child class.");
//    }
}

class Main {
    public static void main(String[] args) {
        // Using lambda expression to implement the interface
        // syntax breakdown:
        // LambdaExpression: This is the functional interface we are implementing.
        // lambda: This is the variable name that will hold the lambda expression.
        // (): This indicates that the lambda expression takes no parameters.
        // ->: This is the lambda operator that separates the parameters from the body of the lambda expression.
        // System.out.println("Performing action using lambda expression."): This is the body of the lambda expression, which will be executed when the performAction() method is called.
        LambdaExpression lambda = () -> System.out.println("Performing action using lambda expression.");

        // Calling the method
        lambda.performAction();
        // does this work without creating an object of the child class?
        // Yes, it does work without creating an object of the child class because we are using a lambda expression to implement the interface directly.
        // The lambda expression provides an implementation for the performAction() method, allowing us to call it without needing an instance of the child class.
        // output: Performing action using lambda expression.

        // Using the child class implementation
        // Here we are creating an instance of the child class and calling the performAction method to demonstrate that it works as well.
        // output: Performing action in child class.
        LambdaExpression child = new childClass();
        child.performAction();

        LambdaSample lambdaSample = new LambdaSample();
        lambdaSample.main(args);

        MultiLineLambda multiLineLambda = new MultiLineLambda();
        multiLineLambda.main(args);
    }
}

class LambdaSample {
    public static void main(String[] args) {
        // Using lambda expression to implement the interface
        // for single line lambda expression, we can omit the curly braces and the return statement if the body contains only one statement.
        LambdaExpression lambda = () -> System.out.println("Performing action using lambda expression in LambdaSample class.");
        lambda.performAction();
        // output: Performing action using lambda expression in LambdaSample class.
    }
}

class MultiLineLambda {
    public static void main(String[] args) {
        // Using a multi-line lambda expression
        LambdaExpression multiLineLambda = () -> {
            int x = 10;
            int y = 20;
            System.out.println(x + " + " + y + " = " + (x + y));
            System.out.println("This is a multi-line lambda expression.");
            System.out.println("It can contain multiple statements.");
        };
        multiLineLambda.performAction();
        // output:
        // This is a multi-line lambda expression.
        // It can contain multiple statements.
    }
}