package capgemini_16012026;

public class constructor_example {
	
	String name;
	int id;
	String email;
	String phone_num;

	// constructor to initialize instance variables
	public constructor_example(String name, int id, String email, String phone_num) {
		this.name = name;
		this.id = id;
		this.email = email;
		this.phone_num = phone_num;
	}

	public static void main(String[] args) {
		// constructor example program
		constructor_example emp1 = new constructor_example("Dele Ali", 101, "dele.ali@example.com", "1234567890");
		constructor_example emp2 = new constructor_example("James Maddison", 102, "james.maddison@example.com", "9876543210");

		// displaying employee details
		System.out.println("Employee 1 Details:");
		System.out.println("Name: " + emp1.name);
		System.out.println("ID: " + emp1.id);
		System.out.println("Email: " + emp1.email);
		System.out.println("Phone Number: " + emp1.phone_num);
		System.out.println("\n---------------------------");

		System.out.println("\nEmployee 2 Details:");
		System.out.println("Name: " + emp2.name);
		System.out.println("ID: " + emp2.id);
		System.out.println("Email: " + emp2.email);
		System.out.println("Phone Number: " + emp2.phone_num);
	}


}

