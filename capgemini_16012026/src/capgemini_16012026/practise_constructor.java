package capgemini_16012026;

class Bike {
	String brand;
	String model;
	int year;
	String color;
	int engineCapacity;
	int power, weight;
	float price, torque;

	Bike(String brand, String model, int year, String color, int engineCapacity, int power, float torque, int weight, float price) {
		this.brand = brand;
		this.model = model;
		this.year = year;
		this.color = color;
		this.engineCapacity = engineCapacity;
		this.power = power;
		this.torque = torque;
		this.weight = weight;
		this.price = price;
	}

	void displayDetails() {
		System.out.println("Bike Brand: " + brand);
		System.out.println("Bike Model: " + model);
		System.out.println("Bike Year: " + year);
		System.out.println("Bike Color: " + color);
		System.out.println("Engine Capacity: " + engineCapacity + "cc");
		System.out.println("Power: " + power + " HP");
		System.out.println("Torque: " + torque + " Nm");
		System.out.println("Weight: " + weight + " kg");
		System.out.println("Price: Rs. " + price);
	}
}

class Laptop {
	String brand;
	String model;
	String processor;
	int ram; // in GB
	int storage; // in GB
	float price;
	String graphicsCard;
	String operatingSystem;

	Laptop(String brand, String model, String processor, int ram, int storage, float price, String graphicsCard, String operatingSystem) {
		this.brand = brand;
		this.model = model;
		this.processor = processor;
		this.ram = ram;
		this.storage = storage;
		this.price = price;
		this.graphicsCard = graphicsCard;
		this.operatingSystem = operatingSystem;
	}

	void displayDetails() {
		System.out.println("Laptop Brand: " + brand);
		System.out.println("Laptop Model: " + model);
		System.out.println("Processor: " + processor);
		System.out.println("RAM: " + ram + " GB");
		System.out.println("Storage: " + storage + " GB");
		System.out.println("Price: Rs. " + price);
		System.out.println("Graphics Card: " + graphicsCard);
		System.out.println("Operating System: " + operatingSystem);
	}
}

class Student {
	String name;
	int age;
	String studentID;
	String course;
	float gpa;
	String email, phoneNumber, address, bloodGroup;

	Student(String name, int age, String studentID, String course, float gpa, String email, String phoneNumber, String address, String bloodGroup) {
		this.name = name;
		this.age = age;
		this.studentID = studentID;
		this.course = course;
		this.gpa = gpa;
		this.email = email;
		this.phoneNumber = phoneNumber;
		this.address = address;
		this.bloodGroup = bloodGroup;
	}

	void displayDetails() {
		System.out.println("Student Name: " + name);
		System.out.println("Age: " + age);
		System.out.println("Student ID: " + studentID);
		System.out.println("Course: " + course);
		System.out.println("GPA: " + gpa);
		System.out.println("Email: " + email);
		System.out.println("Phone Number: " + phoneNumber);
		System.out.println("Address: " + address);
		System.out.println("Blood Group: " + bloodGroup);
	}
}



public class practise_constructor {

	public static void main(String[] args) {
// 1. create a blueprint class of bike, with 4 properties and create a user logic class to create 3 bike objects and display the bike details.
// 2. create a blueprint class of laptop with 6 properties and create a user logic class to define 5 laptop objects and display the laptop details.
// 3. create a blueprint class of student with 3-5 properties and create a user logic class to define 4 student objects and display the student details.

		Student student1 = new Student("Rodrigo Estevao", 20, "S123", "Computer Science", 3.8f, "jonn.reve@gmail.com", "1234567890", "123 Main St", "A+");
		Student student2 = new Student("Lala Smith", 22, "S124", "Electrical Engineering", 3.6f, "jane.smith@emaile.com", "9876543210", "456 Elm St", "B");
		Student student3 = new Student("Allie Bleh", 21, "S125", "Mechanical Engineering", 3.9f, "allie.johnson@elemaile.com", "5678901234", "789 Oak St", "A");
		Student student4 = new Student("Bob Brown", 23, "S126", "Civil Engineering", 3.5f, "bob.brown@hotmail.com", "6789012345", "321 Pine St", "B+");

		student1.displayDetails();
		student2.displayDetails();
		student3.displayDetails();
		student4.displayDetails();

		Bike bike1 = new Bike("Yamaha", "R5", 2021, "Blue", 505, 88, 14.2f, 142, 1500000);
		Bike bike2 = new Bike("Honda", "CBR600RR", 2020, "Red", 599, 17, 12.5f, 140, 1200000);
		Bike bike3 = new Bike("Ducati", "Diablo", 2022, "Green", 998, 20, 15.0f, 200, 2500000);

		bike1.displayDetails();
		bike2.displayDetails();
		bike3.displayDetails();
		
		Laptop laptop1 = new Laptop("Samsung", "GalaxyBook", "Intel i7", 16, 512, 90000, "Intel Iris Xe", "Windows 11");
		Laptop laptop2 = new Laptop("Apple", "MacBook Pro", "M5", 16, 1024, 250000, "Apple GPU", "macOS Tahoe");
		Laptop laptop3 = new Laptop("HP", "Omen", "AMD Ryzen 7", 32, 2048, 150000, "NVIDIA RTX 5060", "Windows 11");

		laptop1.displayDetails();
		laptop2.displayDetails();
		laptop3.displayDetails();
	}

}
