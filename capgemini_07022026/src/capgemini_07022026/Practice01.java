package capgemini_07022026;

import java.util.Stack;

public class Practice01 {
	public static void main(String[] args) {
		String parenthesis = "[{()}]";
		Stack<Character> customStack = new Stack<>();
		boolean isValid = true;
		
		for (char c : parenthesis.toCharArray()) {
			if (c == '(' || c == '{' || c == '[') {
				customStack.push(c);
			} else if (c == ')' || c == '}' || c == ']') {
				if (customStack.isEmpty()) {
					System.out.println("Invalid Parenthesis");
					isValid = false;
					return;
				}
				char top = customStack.pop();
				if ((c == ')' && top != '(') || (c == '}' && top != '{') || (c == ']' && top != '[')) {
					System.out.println("Invalid Parenthesis");
					isValid = false;
					return;
				}
			}
		}
		if (isValid && customStack.isEmpty()) {
			System.out.println("Valid Parenthesis");
		} else {
			System.out.println("Invalid Parenthesis");
		}
	}
}
