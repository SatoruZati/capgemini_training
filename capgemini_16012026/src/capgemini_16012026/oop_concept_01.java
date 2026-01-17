package capgemini_16012026;

// Concept in this file: 'this' keyword, Blueprint class, Object Oriented Programming(OOP) concept

class employee{
	int id;
	String name;
	float salary;
	// we should not make any of this static so that 
	// each object will have its own copy of these instance variables
	// and can maintain its own state. 
	
	// this is how we can store and use multiple employee details using a single object reference variable.
	// we can create multiple employee objects and store their details separately.

	// method to set employee details
	void setEmployeeDetails(int id, String name, float salary) {
		this.id = id; // resolving ambiguity using 'this' keyword
		this.name = name;
		this.salary = salary;
	}

	// method to display employee details
	void displayEmployeeDetails() {
		System.out.println("Employee ID: " + this.id);
		System.out.println("Employee Name: " + this.name);
		System.out.println("Employee Salary: " + this.salary);
		System.out.println("---------------------------");
	}


}

public class oop_concept_01 {

	// any object should be dynamic in nature and not static
	// whenever we create a class, we are actually creating a blueprint for an object
	// but the object is created only when we instantiate the class using the new keyword
	// once the object is created, we can access the members of the class using the
	// object reference variable

	public static void main(String[] args) {
		employee emp = new employee();
		emp.setEmployeeDetails(101, "Dele Ali", 75000.0f);
		emp.displayEmployeeDetails();

		emp.setEmployeeDetails(102, "James Maddison", 85000.0f);
		emp.displayEmployeeDetails();

		emp.salary = 90000.0f; // Directly accessing the instance variable
		System.out.println("Updated Salary: " + emp.salary);

		emp.displayEmployeeDetails();
		
		employee emp1 = new employee();
		emp1.setEmployeeDetails(103, "Alvaro Carreras", 65000.0f);
		emp1.displayEmployeeDetails();

		employee emp2 = new employee();
		emp2.setEmployeeDetails(104, "Jamie Vardy", 50000.0f);
		emp2.displayEmployeeDetails();
		
		// can we create objects inside loop?
		for(int i=1; i<=5; i++) {
			employee empLoop = new employee();
			empLoop.setEmployeeDetails(200+i, "Employee"+i, 40000.0f + (i * 5000));
			empLoop.displayEmployeeDetails();
		}
		
		// constructor can also be used to initialize the instance variables
		employee emp3 = new employee();
		emp3.setEmployeeDetails(105, "Harry Kane", 95000.0f);
		emp3.displayEmployeeDetails();
		// constructor is a special method which is used to initialize the instance variables
		// why constructor?
		// 1. to initialize the instance variables
		// 2. to allocate memory to the object
		// 3. to perform any other initialization tasks
		// if we do not define a constructor, Java provides a default constructor
		// which initializes the instance variables to their default values

		// no argument constructor
		// automatically provided by Java if no constructor is defined
		// employee emp4 = new employee(); // default constructor
		// emp4.displayEmployeeDetails(); // will display default values (0, null, 0.0)
		
		// we can also define our own constructor
		// employee emp5 = new employee(106, "Son Heung Min", 105000.0f);
		// emp5.displayEmployeeDetails();

		// which one is parameterized constructor?
		// employee emp6 = new employee(107, "Cristiano Ronaldo", 120000.0f);
		// emp6.displayEmployeeDetails();

		// 2 important points about constructor:
		// 1. constructor name must be same as class name
		// 2. constructor does not have any return type
		// 3. constructor is called automatically when object is created using new keyword
		
		// Main work of constructor is to initialize the instance variables and non static global members

		// super-call statement: it is used to call parent class constructor or super class constructor
		// this-call statement: it is used to call current class constructor
		// this() - to call current class constructor
		// super() - to call parent class constructor
		// both must be the first statement in the constructor
		// only one super-call statement is allowed in a constructor
		
	}

}
