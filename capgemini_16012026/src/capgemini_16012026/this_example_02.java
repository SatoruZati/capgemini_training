package capgemini_16012026;

public class this_example_02 {

	static int var = 25;
	static String country = "Spain";
	int age = 34;
	String name = "Cristiano Ronaldo";

	public static void displayStatic() {
		// 'this' keyword cannot be used in static context or block.
		// System.out.println("Static variable value using this keyword: " + this.var); // Compile time error
		System.out.println("Static global variable value: " + var);
		System.out.println("Static global variable country: " + country);
	}

	public void task(){
		// 'this' keyword can be used to refer non static members like variables inside non static context or block.
		System.out.println("Non static variable age using this keyword: " + this.age);
		System.out.println("Non static variable name using this keyword: " + this.name);
		System.err.println("Non static variable name without this keyword: " + name);
		System.out.println("Non static variable age without this keyword: " + age);
		
	}

	public static void main(String[] args) {
		
		// 'this' keyword cannot be used in static context or block.
		// System.out.println("Static variable value using this keyword: " + this.var); // Compile time error

		// Calling static method
		displayStatic();

		// Creating object of current class to call non static method
		this_example_02 obj = new this_example_02();
		obj.task();
	}

}
