package capgemini_31012026;

import java.util.Stack;

public class ReversePolishNotation {

    /*
     * ============================================================
     * STEP 1: Evaluate a Postfix (RPN) Expression
     * ============================================================
     *
     * This method works ONLY when input is already in postfix form.
     *
     * Example Postfix:
     * 17 9 + 10 * 12 7 - / 8 4 * +
     */
    public static int evaluateRPN(String[] tokens) {

        Stack<Integer> stack = new Stack<>();

        for (String token : tokens) {

            // If token is an operator
            if (token.equals("+")) {
                int b = stack.pop();
                int a = stack.pop();
                stack.push(a + b);

            } else if (token.equals("-")) {
                int b = stack.pop();
                int a = stack.pop();
                stack.push(a - b);

            } else if (token.equals("*")) {
                int b = stack.pop();
                int a = stack.pop();
                stack.push(a * b);

            } else if (token.equals("/")) {
                int b = stack.pop();
                int a = stack.pop();
                stack.push(a / b);

            }
            // Otherwise token is a number
            else {
                stack.push(Integer.parseInt(token));
            }
        }

        return stack.pop();
    }

    /*
     * ============================================================
     * STEP 2: Convert Infix Expression → Postfix Expression
     * ============================================================
     *
     * Example Infix:
     * ((17 + 9) * 10) / (12 - 7) + (8 * 4)
     *
     * Output Postfix:
     * 17 9 + 10 * 12 7 - / 8 4 * +
     *
     * This uses the Shunting Yard Algorithm.
     */
    public static String[] infixToPostfix(String expression) {

        Stack<String> operators = new Stack<>();
        StringBuilder output = new StringBuilder();

        // Split by space (important!)
        String[] tokens = expression.split(" ");

        for (String token : tokens) {

            // If token is a number → directly output
            if (token.matches("\\d+")) {
                output.append(token).append(" ");
            }

            // If token is "(" → push to operator stack
            else if (token.equals("(")) {
                operators.push(token);
            }

            // If token is ")" → pop until "("
            else if (token.equals(")")) {
                while (!operators.peek().equals("(")) {
                    output.append(operators.pop()).append(" ");
                }
                operators.pop(); // remove "("
            }

            // If token is operator (+ - * /)
            else {
                while (!operators.isEmpty()
                        && precedence(operators.peek()) >= precedence(token)) {
                    output.append(operators.pop()).append(" ");
                }
                operators.push(token);
            }
        }

        // Pop remaining operators
        while (!operators.isEmpty()) {
            output.append(operators.pop()).append(" ");
        }

        // Return postfix tokens array
        return output.toString().trim().split(" ");
    }

    /*
     * Operator precedence:
     * * and / have higher priority than + and -
     */
    public static int precedence(String op) {
        if (op.equals("*") || op.equals("/"))
            return 2;
        if (op.equals("+") || op.equals("-"))
            return 1;
        return 0;
    }

    /*
     * ============================================================
     * MAIN METHOD
     * ============================================================
     */
    public static void main(String[] args) {

        /*
         * Now we take INFIX input directly:
         *
         * IMPORTANT:
         * Expression must be space-separated properly.
         */
        String infixExpression =
                "( ( 17 + 9 ) * 10 ) / ( 12 - 7 ) + ( 8 * 4 )";

        System.out.println("Infix Expression:");
        System.out.println(infixExpression);

        // Step 1: Convert infix → postfix
        String[] postfixTokens = infixToPostfix(infixExpression);

        System.out.println("\nConverted Postfix Expression:");
        for (String t : postfixTokens) {
            System.out.print(t + " ");
        }

        // Step 2: Evaluate postfix
        int result = evaluateRPN(postfixTokens);

        System.out.println("\n\nFinal Result = " + result);
    }
}
