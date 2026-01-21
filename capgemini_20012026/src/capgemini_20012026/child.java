package capgemini_20012026;

// child class inheriting father and mother interfaces

public class child implements father, mother {
	
	// implementing unimplemented methods of father interface
	public void feed() {
		System.out.println("Child is being fed by parents");
	}
	
	// implementing unimplemented methods of mother interface
	public void outing() {
		System.out.println("Child is going for outing with mother");
	}
	
	// implementing unimplemented methods of father interface
	public void study() {
		System.out.println("Child is studying");
	}
	
	// implementing main method

	public static void main(String[] args) {
		// adding unimplemented methods
		child c = new child();
		c.feed();
		c.outing();
		// calling static methods of interfaces
		father.play();
		mother.teach();
		c.study();
		// using father interface reference to child class object
		father f = new child();
		f.feed();
		f.study();
		// using mother interface reference to child class object
		mother m = new child();
		m.feed();
		m.outing();
	}

}
