package DSA;

// creating an immutable class

public final class Immutable_Class {
	
	// why private 
	// making fields private so that they cannot be accessed directly from outside the class
	// why private in this case?
	// To ensure that the fields cannot be modified directly, maintaining the immutability of the class.
	
	private String name = "";
	private int id = 0;
	
	// constructor
	// making the constructor private to prevent instantiation from outside the class
	private Immutable_Class(String name, int id) {
		this.name = name;
		this.id = id;
	}
	
	// can we make constructor public?
	// Yes, we can make the constructor public to allow object creation from outside the class
	// but we need to ensure that the fields cannot be modified after object creation
	// by not providing any setter methods
	
	// no setter methods are provided
	
	// getter methods
	public String getName() {
		return name;
	}
	public int getId() {
		return id;
	}

	public static void main(String[] args) {
		
		Immutable_Class obj = new Immutable_Class("Ramba Ho", 101);
		System.out.println("Name: " + obj.getName());
		System.out.println("ID: " + obj.getId());
		
		// why is it immutable?
		// obj.name = "New Name"; // error: cannot assign a value to final variable name
		// Since there are no setter methods, the fields cannot be modified after object creation
		// there are only getter methods to access the fields
		// this is the key characteristic of an immutable class
		
		// For String class, whenever we try to modify a string, 
		// a new string object is created
		// But the original string remains unchanged, since strings are immutable in Java
	}

}
