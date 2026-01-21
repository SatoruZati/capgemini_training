package capgemini_21012026;

public class singleton_object {
	
	static class sample{
		private static sample obj;
		private sample() {
			// private constructor
			System.out.println("Singleton Object Created");
		}
		// helper method
		public static sample /* class name should be return type */ getInstance() {
			if (obj == null) {
				obj = new sample();
			}
			return obj;
		}
		
		public void display() {
			System.out.println("Hello from Singleton Object");
		}
		
	}

	public static void main(String[] args) {
		// Singleton Object:
		// A singleton object is an object that is instantiated only once
		// and provides a global point of access to that instance.
		sample obj1 = sample.getInstance();
		sample obj2 = sample.getInstance();

		obj1.display();
		obj2.display();

		// Check if both references point to the same instance
		System.out.println("Are both instances equal? " + (obj1 == obj2));
	

	}

}
