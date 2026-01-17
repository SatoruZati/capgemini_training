package encapsulation;

public class encapsulation_02 {

	public static void main(String[] args) {
		// accessing encapsulated class and stuff from encapsulation_01.java
		encapsulation_01 obj = new encapsulation_01();
		System.out.println("Data: " + obj.getData());
		System.out.println("Name: " + obj.getName());
		System.out.println("Course: " + obj.getCourse());
		System.out.println("Fees: " + obj.getFees());

	}

}
