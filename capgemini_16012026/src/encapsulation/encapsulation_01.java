package encapsulation;

public class encapsulation_01 {

	private int data = 40;
	private String name = "Ronaldinho";
	private String course = "Football";
	private double fees = 500000.0;
	
	public int getData() {
		return data;
	}
	
	public String getName() {
		return name;
	}
	
	public String getCourse() {
		return course;
	}
	
	public double getFees() {
		return fees;
	}

	public static void main(String[] args) {
		// encapsulated class and stuff in this file and access from encapsulation_02.java
		encapsulation_01 obj = new encapsulation_01();
//		System.out.println("Data: " + obj.getData());
//		System.out.println("Name: " + obj.getName());
//		System.out.println("Course: " + obj.getCourse());
//		System.out.println("Fees: " + obj.getFees());
		
		

	}

}
