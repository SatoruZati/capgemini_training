package capgemini_13012026;

class demo {
	float salary;
	String name;
	long empId;
	char gender;
	demo(float salary, String name, long empId, char gender) {
		this.salary = salary;
		this.name = name;
		this.empId = empId;
		this.gender = gender;
	}

	// Additional methods can be added here if needed
	// For example, a method to display employee details
	// public void displayDetails() {
	//     System.out.println("Name: " + this.name);
	//	 System.out.println("Salary: " + this.salary);
	//	 System.out.println("Employee ID: " + this.empId);
	//	 System.out.println("Gender: " + this.gender);
	// }

}

public class this_keyword {

	public static void main(String[] args) {
		
		demo d1 = new demo(45000.50f, "Santos", 1709L, 'M');
		System.out.println("Employee Details:");
		System.out.println("Name: " + d1.name);
		System.out.println("Salary: " + d1.salary);
		System.out.println("Employee ID: " + d1.empId);
		System.out.println("Gender: " + d1.gender);

	}
	
	

}
