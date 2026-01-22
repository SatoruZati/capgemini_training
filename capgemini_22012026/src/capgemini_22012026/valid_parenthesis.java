package capgemini_22012026;
import java.util.Stack;

public class valid_parenthesis {

	public static void main(String[] args) {
		// Valid Parrenthesis 
		
		Stack<Character> stack = new Stack<>();
		String s = "{[()]}";
		
		for (char c : s.toCharArray()) {
			if (c == '(' || c == '{' || c == '[') {
				stack.push(c);
			} else {
				if (stack.isEmpty()) {
					System.out.println("Invalid Parenthesis");
					return;
				}
				char top = stack.pop();
				if ((c == ')' && top != '(') ||
					(c == '}' && top != '{') ||
					(c == ']' && top != '[')) {
					System.out.println("Invalid Parenthesis");
					return;
				}
			}
		}
		
		if (stack.isEmpty()) {
			System.out.println("Valid Parenthesis");
		} else {
			System.out.println("Invalid Parenthesis");
		}

	}

}
