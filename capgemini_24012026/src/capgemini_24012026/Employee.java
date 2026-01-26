package capgemini_24012026;

import java.util.*;
import java.lang.*;

public class Employee {
		int id;
		String name;
		double salary;
		String department;
		boolean isActive;

	public Employee(int i, String string, int j, String string2, boolean b) {
			// constructor
			super();
			this.id = i;
			this.name = string;
			this.salary = j;
			this.department = string2;
			this.isActive = b;
			
		}
	
	// ComparableEmployee class implementing Comparable interface
	static class ComparableEmployee implements Comparable<ComparableEmployee> {
		int id;
		String name;
		double salary;
		String department;
		boolean isActive;

		public ComparableEmployee(int i, String string, int j, String string2, boolean b) {
			// constructor
			super();
			this.id = i;
			this.name = string;
			this.salary = j;
			this.department = string2;
			this.isActive = b;
		}

		@Override
		public int compareTo(ComparableEmployee other) {
			// Compare based on salary
			return Double.compare(this.salary, other.salary);
		}
	}
	
	public int compareTo(ComparableEmployee other) {
		// Compare based on department, then salary, then name
		int deptCompare = this.department.compareTo(other.department);
		if (deptCompare != 0) {
			return deptCompare;
		}
		int salaryCompare = Double.compare(this.salary, other.salary);
		if (salaryCompare != 0) {
			return salaryCompare;
		}
		return this.name.compareTo(other.name);
	}
	

	public static void main(String[] args) {
		// more on collection framework
		// comparable and comparator interface
		// comparable interface is used to compare the objects of the same class
		// comparator interface is used to compare the objects of different classes
		
		// Comparable is present in java.lang package
		// Comparator is present in java.util package
		
		// Return type of compareTo() method of Comparable interface is int
		// Return type of compare() method of Comparator interface is int
		
		// Comparable interface has only one method compareTo()
		// Comparator interface has two methods compare() and equals()
		
		// One class can implement only one Comparable interface
		// One class can implement multiple Comparator interfaces
		
		// Collection framework classes that implement Comparable interface
		// comparator method example using Employee class
		Employee e1 = new Employee(1001, "Gustavo", 50000, "IT", true);
		Employee e2 = new Employee(1002, "Charlie", 60000, "HR", true);
		Employee e3 = new Employee(1003, "Epstein", 70000, "Finance", true);
		Employee e4 = new Employee(1004, "Sean", 50000, "IT", true);
		Employee e5 = new Employee(1005, "Combs", 80000, "HR", true);
		Employee e6 = new Employee(1006, "Anderson", 90000, "Finance", true);
		Employee e7 = new Employee(1007, "Jeffrey", 100000, "IT", true);
		
		Comparator<Employee> salaryComparator = new Comparator<Employee>() {
			@Override
			public int compare(Employee emp1, Employee emp2) {
				return Double.compare(emp1.salary, emp2.salary);
			}
		};
		
		int result = salaryComparator.compare(e1, e2);
		System.out.println("Employee 1 Salary: " + e1.salary);
		System.out.println("Employee 2 Salary: " + e2.salary);
		System.out.println("Comparison Result based on Salary: " + result);
		
		System.out.println("---------------------------------------------------");

		List<Employee> employees = new ArrayList<>();
		employees.add(e1);
		employees.add(e2);
		employees.add(e3);
		employees.add(e4);
		employees.add(e5);
		employees.add(e6);
		employees.add(e7);
		
		Collections.sort(employees, salaryComparator);
		System.out.println("\nEmployees sorted by Salary:");
		for (Employee emp : employees) {
			System.out.println("ID: " + emp.id + ", Name: " + emp.name + ", Salary: " + emp.salary);
		}
		
		System.out.println("---------------------------------------------------");
		
		Comparator<Employee> nameComparator = new Comparator<Employee>() {
			@Override
			public int compare(Employee emp1, Employee emp2) {
				return emp1.name.compareTo(emp2.name);
			}
		};
		
		Collections.sort(employees, nameComparator);
		System.out.println("\nEmployees sorted by Name:");
		for (Employee emp : employees) {
			System.out.println("ID: " + emp.id + ", Name: " + emp.name + ", Salary: " + emp.salary);
		}
		
		// Comparator chaining example
		System.out.println("---------------------------------------------------");
		Comparator<Employee> departmentComparator = new Comparator<Employee>() {
			@Override
			public int compare(Employee emp1, Employee emp2) {
				return emp1.department.compareTo(emp2.department);
			}
		};
		Comparator<Employee> salaryThenNameComparator = departmentComparator.thenComparing(salaryComparator).thenComparing(nameComparator);
		Collections.sort(employees, salaryThenNameComparator);
		System.out.println("\nEmployees sorted by Department, then Salary, then Name:");
		for (Employee emp : employees) {
			System.out.println("ID: " + emp.id + ", Name: " + emp.name + ", Department: " + emp.department + ", Salary: " + emp.salary);
		}
		
		System.out.println("---------------------------------------------------");
		
		// Comparable interface example
		ComparableEmployee ce1 = new ComparableEmployee(2001, "Masikato", 55000, "IT", true);
		ComparableEmployee ce2 = new ComparableEmployee(2002, "Fushikawa", 65000, "HR", true);
		ComparableEmployee ce3 = new ComparableEmployee(2003, "Takahashi", 75000, "Finance", true);
		ComparableEmployee ce4 = new ComparableEmployee(2004, "Yamamoto", 55000, "IT", true);
		
		List<ComparableEmployee> comparableEmployees = new ArrayList<>();
		comparableEmployees.add(ce1);
		comparableEmployees.add(ce2);
		comparableEmployees.add(ce3);
		comparableEmployees.add(ce4);
		Collections.sort(comparableEmployees);
		
		System.out.println("\nComparable Employees sorted by Salary:");
		for (ComparableEmployee cemp : comparableEmployees) {
			System.out.println("ID: " + cemp.id + ", Name: " + cemp.name + ", Salary: " + cemp.salary);
		}
		
		System.out.println("---------------------------------------------------");
		
		// Compare compares one property at a time
		// Comparable compares multiple properties in a single method
		
		

	}

}
