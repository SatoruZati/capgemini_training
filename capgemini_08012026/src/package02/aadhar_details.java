package package02;
import java.util.*;
//write a java program to print aadhar details

public class aadhar_details {
	static String Aadhar_number;
	static String Name;
	static String Phone_number;
	static int Age;
	static String DateOfBirth;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter aadhar number: ");
		Aadhar_number = sc.nextLine();
		
		System.out.println("Enter Name: ");
		Name = sc.nextLine();
		
		System.out.println("Enter Phone number: ");
		Phone_number = sc.nextLine();
		
		System.out.println("Enter Age (only year): ");
		Age = sc.nextInt();
		String Date, Month, Year;
		
		System.out.println("Enter date of birth: ");
		System.out.println("Date:");
		Date = sc.nextLine();
		
		System.out.println("Month:");
		Month = sc.nextLine();

		System.out.println("Year: ");
		Year = sc.nextLine();
		
		DateOfBirth = Date + "/" + Month + "/" + Year;

		System.out.println("Aadhar number: " + Aadhar_number);
		System.out.println("Name: " + Name);
		System.out.println("Phone number: " + Phone_number);
		System.out.println("Age: " + Age);
		System.out.println("Date of birth: " + DateOfBirth);
		
		sc.close();
	}

}
