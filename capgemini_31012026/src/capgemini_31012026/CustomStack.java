package capgemini_31012026;

public class CustomStack {

    /*
     * ============================================================
     * INNER CLASS: Stack
     * ============================================================
     *
     * This is a CUSTOM implementation of a Stack Data Structure
     * using a simple integer array.
     *
     * STACK follows:
     * LIFO Principle = Last In First Out
     *
     * That means:
     * The last element inserted will be the first element removed.
     *
     * Example:
     * push(17)
     * push(9)
     * push(10)
     *
     * Stack becomes:
     * TOP -> 10
     *        9
     *        17
     *
     * pop() will remove 10 first.
     *
     * IMPORTANT NOTE:
     * This Stack class is a NON-STATIC inner class,
     * so we must create an object of CustomStack first
     * before creating Stack.
     */
    public class Stack {

        /*
         * maxSize stores the maximum number of elements
         * this stack can hold.
         *
         * Since we are using an array, this size is FIXED.
         */
        private int maxSize;

        /*
         * stackArray is the actual array where stack elements
         * are stored.
         *
         * Example:
         * stackArray = [17, 9, 10, 12, 84]
         */
        private int[] stackArray;

        /*
         * top represents the index of the current top element.
         *
         * Initially:
         * top = -1 means stack is EMPTY.
         *
         * Example:
         * stackArray = [17, 9, 10]
         * top = 2 (because 10 is at index 2)
         */
        private int top;

        /*
         * ============================================================
         * CONSTRUCTOR: Stack(int size)
         * ============================================================
         *
         * This constructor creates a stack of given size.
         *
         * Example:
         * Stack stack = new Stack(5);
         *
         * This means stack can store maximum 5 integers.
         */
        public Stack(int size) {

            // Save the maximum size
            this.maxSize = size;

            // Create an integer array of that size
            this.stackArray = new int[maxSize];

            // Stack starts empty, so top is set to -1
            this.top = -1;
        }

        /*
         * ============================================================
         * PUSH OPERATION: push(int value)
         * ============================================================
         *
         * push() inserts an element at the TOP of the stack.
         *
         * Example:
         * push(17)
         * push(9)
         *
         * Stack becomes:
         * TOP -> 9
         *        17
         *
         * If stack is full, we get STACK OVERFLOW.
         */
        public void push(int value) {

            /*
             * Condition for Stack Overflow:
             * If top reaches maxSize - 1,
             * the stack is already full.
             *
             * Example:
             * maxSize = 5
             * last index = 4
             *
             * If top == 4 → stack is full
             */
            if (top == maxSize - 1) {

                // Cannot push more elements
                System.out.println("Stack Overflow");

            } else {

                /*
                 * First increment top (++top),
                 * then insert value at that position.
                 *
                 * Example:
                 * top was 2
                 * ++top becomes 3
                 * stackArray[3] = value
                 */
                stackArray[++top] = value;
            }
        }

        /*
         * ============================================================
         * POP OPERATION: pop()
         * ============================================================
         *
         * pop() removes and returns the TOP element of stack.
         *
         * Example:
         * Stack = [17, 9, 10]
         * pop() removes 10
         *
         * Stack becomes:
         * [17, 9]
         *
         * If stack is empty, we get STACK UNDERFLOW.
         */
        public int pop() {

            // If stack is empty, nothing can be removed
            if (isEmpty()) {

                System.out.println("Stack Underflow");

                // Return -1 just to indicate failure
                return -1;

            } else {

                /*
                 * Return the top element,
                 * then decrease top index.
                 *
                 * Example:
                 * top = 4
                 * returns stackArray[4]
                 * then top becomes 3
                 */
                return stackArray[top--];
            }
        }

        /*
         * ============================================================
         * PEEK OPERATION: peek()
         * ============================================================
         *
         * peek() returns the TOP element without removing it.
         *
         * Example:
         * Stack = [17, 9, 10]
         * peek() returns 10
         *
         * Stack remains unchanged.
         */
        public int peek() {

            // If stack is empty, there is no top element
            if (isEmpty()) {

                System.out.println("Stack is empty");
                return -1;

            } else {

                // Return top element without modifying top index
                return stackArray[top];
            }
        }

        /*
         * ============================================================
         * isEmpty()
         * ============================================================
         *
         * Checks whether stack has zero elements.
         *
         * If top == -1 → stack is empty.
         */
        public boolean isEmpty() {

            return (top == -1);
        }

        /*
         * ============================================================
         * SEARCH OPERATION: search(int value)
         * ============================================================
         *
         * search() checks whether an element exists inside stack.
         *
         * It returns the POSITION from the TOP (1-based).
         *
         * Example:
         * Stack = [17, 9, 10, 12, 84]
         * search(10) returns 3
         *
         * Because from top:
         * 84 → position 1
         * 12 → position 2
         * 10 → position 3
         *
         * If element is not found, it returns -1.
         */
        public int search(int value) {

            // Traverse stack from top to bottom
            for (int i = top; i >= 0; i--) {

                // If value matches, return its position from top
                if (stackArray[i] == value) {

                    /*
                     * Position formula:
                     * top - i gives distance from top
                     * +1 converts it into 1-based position
                     */
                    return top - i + 1;
                }
            }

            // Element not found in stack
            return -1;
        }

        /*
         * ============================================================
         * DISPLAY OPERATION: display()
         * ============================================================
         *
         * This method prints all stack elements from TOP to BOTTOM.
         *
         * Example Output:
         * Stack elements (top to bottom): 84 12 10 9 17
         */
        public void display() {

            // If stack is empty, nothing to display
            if (isEmpty()) {
                System.out.println("Stack is empty");
            } else {

                System.out.print("Stack elements (top to bottom): ");

                // Print elements starting from top index down to 0
                for (int i = top; i >= 0; i--) {
                    System.out.print(stackArray[i] + " ");
                }

                System.out.println(); // Move to next line
            }
        }
    }

    /*
     * ============================================================
     * MAIN METHOD: Execution starts here
     * ============================================================
     *
     * This is the driver code where we test all stack operations.
     */
    public static void main(String[] args) {

        /*
         * Since Stack is a NON-STATIC inner class,
         * we must first create an object of outer class CustomStack.
         */
        CustomStack customStackInstance = new CustomStack();

        /*
         * Now we create Stack object of size 5.
         *
         * This stack can store only 5 integers.
         */
        Stack stack = customStackInstance.new Stack(5);

        // ---------------- PUSH ELEMENTS ----------------
        stack.push(17);
        stack.push(9);
        stack.push(10);
        stack.push(12);
        stack.push(84);

        /*
         * This push will fail because stack is already full.
         * So it will print: Stack Overflow
         */
        stack.push(25);

        // ---------------- DISPLAY STACK ----------------
        stack.display();

        // ---------------- PEEK ELEMENT ----------------
        System.out.println("Top element is: " + stack.peek());

        // ---------------- POP ELEMENT ----------------
        System.out.println("Popped element is: " + stack.pop());

        // ---------------- DISPLAY STACK AFTER POP ----------------
        stack.display();

        // ---------------- CHECK IF STACK EMPTY ----------------
        System.out.println("Is stack empty? " + stack.isEmpty());

        // ---------------- SEARCH ELEMENT PRESENT IN STACK ----------------
        int searchElement = 10;
        int position = stack.search(searchElement);

        if (position != -1) {
            System.out.println("Element " + searchElement +
                    " found at position: " + position + " from the top.");
        } else {
            System.out.println("Element " + searchElement +
                    " not found in the stack.");
        }

        // ---------------- SEARCH ELEMENT NOT PRESENT IN STACK ----------------
        int missingElement = 50;
        int missingPosition = stack.search(missingElement);

        if (missingPosition != -1) {
            System.out.println("Element " + missingElement +
                    " found at position: " + missingPosition + " from the top.");
        } else {
            System.out.println("Element " + missingElement +
                    " not found in the stack.");
        }
        
       // Stack Underflow
       for (int i = 0; i < stack.maxSize; i++) {
		   stack.pop();
	   }
       
    }
}
