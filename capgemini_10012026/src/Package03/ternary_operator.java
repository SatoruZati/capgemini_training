package Package03;

public class ternary_operator {

	public static void main(String[] args) {
		// Ternary Operator to find highest between 3 numbers
		int num1 = 10, num2 = 20, num3 = 30;
		int highest = (num1 > num2) ? (num1 > num3 ? num1 : num3) : (num2 > num3 ? num2 : num3);
		System.out.println("Highest number is: " + highest);
		
		// Ternary Operator to find lowest between 3 numbers
		int lowest = (num1 < num2) ? (num1 < num3 ? num1 : num3) : (num2 < num3 ? num2 : num3);
		System.out.println("Lowest number is: " + lowest);

		// Ternary Operator to find even or odd number
		int number = 10;
		String result = (number % 2 == 0) ? "Even" : "Odd";
		System.out.println(number + " is " + result);

		// Ternary Operator to find positive or negative number
		int number1 = -10;
		String result1 = (number1 >= 0) ? "Positive" : "Negative";
		System.out.println(number1 + " is " + result1);
	}

}
