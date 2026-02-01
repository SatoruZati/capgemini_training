package capgemini_31012026;

import java.util.ArrayList;
import java.util.Stack;

public class StackDS {

	public static void main(String[] args) {
		// Stack implementation in Java
		
		Stack<Integer> stack = new Stack<>();
				
		//////////////////////////////////////////////////////////////////
		// Using Stack Class Methods, i.e. push(), pop(), peek(), isEmpty(), search()
		// Should I use ArrayList instead of Stack class? 
		// Yes, ArrayList can be used to implement stack operations.
		// However, Stack class is more suitable for stack operations as it provides built-in methods.

		// Since stack is a Legacy class, it is recommended to use Deque interface and its implementations like ArrayDeque for stack operations in modern Java applications.
		// stack data input
		// using push() method
		stack.push(17);
		stack.push(25);
		stack.push(9);
		stack.push(12);
		stack.push(10);
		stack.push(7);
		stack.push(33);
		System.out.println("Stack: " + stack);
		System.out.println("------------------------");
		
		// pop operation
		int poppedElement = stack.pop();
		// output is the removed top element
		System.out.println("Popped Element: " + poppedElement);
		System.out.println("Stack after pop: " + stack);		
		System.out.println("------------------------");
		
		// peek operation
		int topElement = stack.peek();
		// output the top element without removing it
		System.out.println("Top Element (peek): " + topElement);
		System.out.println("Stack after peek: " + stack);
		System.out.println("------------------------");
		
		// isEmpty operation
		boolean isEmpty = stack.isEmpty();
		// output true if stack is empty, false otherwise
		System.out.println("Is Stack Empty? " + isEmpty);
		System.out.println("------------------------");
		
		// search operation

		// position is 1-based index from the top of the stack
		// output is -1 if element not found
		// output is 1 if element is at the top of the stack
		
		// search returns the position of the element from the top of the stack
		// if the returned position is -1, the element is not found in the stack
		// else, the position indicates how far the element is from the top
		
		int searchElement = 12;
		int secondSearchElement = 100;
		int position = stack.search(searchElement);
		int secondPosition = stack.search(secondSearchElement);
		if (position != -1) {
			System.out.println("Element " + searchElement + " found at position: " + position);
		} else {
			System.out.println("Element " + searchElement + " not found in the stack.");
		}
		if (secondPosition != -1) {
			System.out.println("Element " + secondSearchElement + " found at position: " + secondPosition);
		} else {
			System.out.println("Element " + secondSearchElement + " not found in the stack.");
		}
		System.out.println("------------------------");
		
		// is this dynamic in size?
		// yes, stack is dynamic in size
		
		// Custom Stack implementation using ArrayList
		//////////////////////////////////////////////////////////////////
		System.out.println("Custom Stack Implementation using ArrayList:");
		
		ArrayList<Integer> stackList = new ArrayList<>();
		
		// push operation
		stackList.add(17);
		stackList.add(25);
		stackList.add(9);
		stackList.add(12);
		stackList.add(10);
		stackList.add(7);
		stackList.add(33);
		stackList.add(4);
		stackList.add(8);
		stackList.add(99);
		
		System.out.println("Custom Stack (ArrayList): " + stackList);
		System.out.println("------------------------");
		
		// pop operation
		// mechanism: remove the last element from the ArrayList, which is the top element of the stack
		// how? get the size of the ArrayList and remove the element at size - 1 index
		
		int customPoppedElement = stackList.remove(stackList.size() - 1);
		
		System.out.println("Popped Element from Custom Stack: " + customPoppedElement);
		System.out.println("Custom Stack after pop: " + stackList);
		System.out.println("------------------------");
		
		// peek operation
		// mechanism: get the last element from the ArrayList without removing it
		// how? get the size of the ArrayList and access the element at size - 1 index
		int customTopElement = stackList.get(stackList.size() - 1);
		
		System.out.println("Top Element (peek) from Custom Stack: " + customTopElement);
		System.out.println("Custom Stack after peek: " + stackList);
		
		System.out.println("------------------------");
		
		// isEmpty operation
		// mechanism: check if the ArrayList size is 0
		// how? use isEmpty() method of ArrayList
		boolean customIsEmpty = stackList.isEmpty();
		System.out.println("Is Custom Stack Empty? " + customIsEmpty);
		System.out.println("------------------------");
		
		// search operation
		int customSearchElement = 10;
		int customPosition = -1;
		// mechanism: iterate through the ArrayList from the end to the beginning
		// how? use a for loop to traverse the ArrayList in reverse order
		// if found, calculate the position from the top of the stack
		// position is 1-based index from the top of the stack
		
		// what is role of customPosition variable?
		// it stores the position of the searched element from the top of the stack
		
		for (int i = stackList.size() - 1; i >= 0; i--) {
			if (stackList.get(i) == customSearchElement) {
				customPosition = stackList.size() - i;
				break;
			}
		}
		
		if (customPosition != -1) {
			System.out.println("Element " + customSearchElement + " found at position: " + customPosition);
		} else {
			System.out.println("Element " + customSearchElement + " not found in the custom stack.");
		}
		
		System.out.println("------------------------");
		
		// is this dynamic in size?
		// yes, ArrayList is dynamic in size
		
	}

}
