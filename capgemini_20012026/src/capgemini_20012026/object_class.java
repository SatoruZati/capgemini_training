package capgemini_20012026;

public class object_class {

	@Override
		public String toString() {
			return "This is an overridden toString() method.";
		}

	@Override
		public int hashCode() {
			return super.hashCode();
		}
	
	public int hashCode(int a) {
			return a;
		}
	
	@Override
		public boolean equals(Object obj) {
			return super.equals(obj);
		}
	
	public boolean equals(int a) {
			return this.hashCode() == a;
		}
	
//	@Override
//		public Class<?> getClass() {
//			return super.getClass();
//		}
	// getClass() is a final method in Object class
	// Cannot override the final method from Object
	
	
	// Note: equals() vs == operator
	// equals() method is used to compare the content of two objects.
	// == operator is used to compare the reference of two objects.
	// For example:
	// String str1 = new String("Hello");
	// String str2 = new String("Hello");
	// str1.equals(str2) // true
	// str1 == str2 // false
	// because str1 and str2 are two different objects in memory.

	public static void main(String[] args) {
		// Object Classes in Java
		// java.lang.Object is the superclass of all classes in Java.
		// Every class in Java implicitly extends the Object class if no other superclass is specified.

		// toString() method, hashCode() method, equals() method, etc. are all present in the Object class.
		// public String toString() : returns a string representation of the object.
		// the internal code:
		// public String toString(){
		//		return "[ID@hashcode]";	
		// }

		// Object Classes in Java.
		// Different object classes in Java:
		// String, StringBuilder, StringBuffer, Wrapper Classes (Integer, Double, Character, etc.), 
		// Date, Calendar, ArrayList, LinkedList, HashMap, HashSet, etc.

		// What are object classes in Java: 
		// Object classes are classes that are used to create objects in Java.
		// They provide a blueprint for creating objects and define the properties and 
		// behaviors of those objects
		// Object classes in Java are used to encapsulate data and provide methods to manipulate that data.
		// They are the foundation of object-oriented programming in Java.
		// 
		// getClass() method:
		// The getClass() method is used to get the runtime class of an object.
		// getName() method:
		// The getName() method is used to get the name of the class of an object.
		
		// toString() method example:
		object_class obj = new object_class();
		System.out.println("toString() method output: " + obj.toString());
		// what is "getClass().getName() + '@' + Integer.toHexString(hashCode())"
		// it is the default implementation of toString() method in Object class.
		System.out.println("getClass() method output: " + obj.getClass());

		// hashCode() method example:
		System.out.println("hashCode() method output: " + obj.hashCode());
		
		object_class obj2 = new object_class();
		//hashCode() method example:
		System.out.println("hashCode() method output of obj2: " + obj2.hashCode());

		// hashCode(int a) method example:
		System.out.println("hashCode(int a) method output: " + obj.hashCode(10));
		
		// equals() method example:
		System.out.println("equals() method output: " + obj.equals(obj2)); // false
		// equals(int a) method example:
		System.out.println("equals(int a) method output: " + obj.equals(10)); // false
		// why false? 
		// because obj.hashCode() != 10
		
		// == operator example:
		System.out.println("== operator output: " + (obj == obj2)); // false
		
		// getClass() method example:
		System.out.println("getClass() method output of obj2: " + obj2.getClass());
		
		
		
	}

}
