package capgemini_31012026;

import java.util.Stack;

public class ValidParenthesis {
	
	public static boolean isValid(String s) {
		Stack<Character> stack = new Stack<>();
		char[] chararr = s.toCharArray();
		for (char c : chararr) {
			if (c == '(' || c == '{' || c == '[') {
				stack.push(c);
			} else {
				if (stack.isEmpty()) {
					return false;
				}
				char top = stack.pop();
				if ((c == ')' && top != '(') ||
				    (c == '}' && top != '{') ||
				    (c == ']' && top != '[')) {
					return false;
				}
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		String s = "{[(())]}";
		System.out.println("Is the parenthesis valid? " + isValid(s));
	}
}
