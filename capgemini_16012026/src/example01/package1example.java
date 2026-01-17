package example01;

public class package1example {

	public void exampleconstructor() {
		// this is a constructor method in package 01 and we will call it from package 02
		// to demonstrate importing packages and using their methods
		System.out.println("This is a constructor from package 01");
		String name = "Capgemini";
		System.out.println("Company Name: " + name);
	}

	public void examplemethod() {
		// this is a package to be imported in another package
		String message = "Cristiano Ronaldo is a famous footballer";
		System.out.println(message);

	}

	public static void main(String[] args) {
		// this is a package to be imported in another package

		package1example obj = new package1example();
		obj.examplemethod();
		System.out.println("\n");

		String message = "Hello from Package 01";
		System.out.println(message);

	}

}
