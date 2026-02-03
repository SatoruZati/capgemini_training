// suppose we have 3 students where each student has name, roll no, age and address
// using compareTo() method sort the students based on their roll no in ascending order
// using Comparable interface sort the students in Lexographic order based on their names

package capgemini_03022026;

public class Student implements Comparable<Student> {

	private String name;
	private int rollNo;
	private int age;
	private String address;

	public Student(String name, int rollNo, int age, String address) {
		this.name = name;
		this.rollNo = rollNo;
		this.age = age;
		this.address = address;
	}
	
	// why use wrapper class Integer instead of int? 
	// Ans: because Integer class has compare method which can be used to compare two integers
	
	@Override
	public int compareTo(Student other) {
		// Compare based on roll number
		return Integer.compare(this.rollNo, other.rollNo);
	}
		
	// Additional method to compare based on name
	public int compareByName(Student other) {
		return this.name.compareTo(other.name);
	}
	
	// why override toString() method?
	// because toString() method is used to return string representation of an object
	// and by default it returns the class name followed by the hash code of the object
	// directly printing the object will call the toString() method
	// resulting in an unreadable format like capgemini_03022026.Student@15db9742
	
	@Override
	public String toString() {
		return "Student name = " + name + ", rollNo = " + rollNo + ", age = " + age + ", address = " + address + "";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 = new Student("Lamine Yamal", 10, 18, "Spain");
		Student s2 = new Student("Vinicius Jr", 7, 19, "Brazil");
		Student s3 = new Student("Joao Neves", 8, 20, "Portugal");
		
		System.out.println("Comparing by roll number:");
		System.out.println(s1.toString() + " vs " + s2.toString());
		System.out.println(s1.compareTo(s2)); // positive value because 10 > 7
		System.out.println(s1.toString() + " vs " + s3.toString());
		System.out.println(s2.compareTo(s3)); // negative value because 7 < 8
		
		System.out.println("Comparing by name:");
		System.out.println(s1 + " vs " + s2);
		System.out.println(s1.compareByName(s2)); // negative value because "Lamine Yamal" < "Vinicius Jr"
		System.out.println(s1 + " vs " + s3);
		System.out.println(s2.compareByName(s3)); // positive value because "Vinicius Jr" > "Joao Neves"
		
		// multiple compareTo methods
		
		

	}

}
