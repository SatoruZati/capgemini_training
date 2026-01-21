package capgemini_20012026;

public class wrapper_class {

	public static void main(String[] args) {
		// Wrapper Classes in Java
		// Wrapper classes are used to convert primitive data types into objects.
		// Each primitive data type has a corresponding wrapper class:
		// Primitive Data Type	|	Wrapper Class
		// byte					|	Byte
		// short				|	Short
		// int					|	Integer
		// long					|	Long
		// float				|	Float
		// double				|	Double
		// char					|	Character
		// boolean				|	Boolean
		// String				|	String
		// Note: String is not a primitive data type, but it is often included in discussions about wrapper classes
		// Wrapper classes provide several useful methods for converting between 
		// types, parsing strings, and manipulating values.
		// They help to convert primitive data types into objects so that they 
		// can be used in collections like ArrayList, HashMap, etc.
		
		// Example:
		// Converting int to Integer
		// int a = 10;
		// Integer intObj = Integer.valueOf(a); // Boxing
		// int b = intObj.intValue(); // Unboxing
		
		// What is Boxing and Unboxing in Java:
		// Boxing is the process of converting a primitive data type into its corresponding wrapper class object.
		// Unboxing is the process of converting a wrapper class object back into its corresponding primitive data type.
	
		// how does wrapper class work in java?
		// Wrapper classes work by providing a way to treat primitive data types as objects.
		// They provide methods for converting between types, parsing strings, and manipulating values.
		// Wrapper classes also provide constants for the minimum and maximum values of each primitive data type.
		// Additionally, they implement the Comparable interface, allowing objects of wrapper classes to be compared.
		
		int i = 1709;
		Integer intObj = Integer.valueOf(i); // Boxing
		System.out.println("Integer Object: " + intObj);
		
		Integer intObj2 = 2004; // Auto Boxing
		System.out.println("Integer Object 2: " + intObj2);
		
		char ch = 'A';
		Character charObj = Character.valueOf(ch); // Boxing
		System.out.println("Character Object: " + charObj);
		
		Character charObj2 = 'B'; // Auto Boxing
		System.out.println("Character Object 2: " + charObj2);
		
		double d = 99.99;
		Double doubleObj = Double.valueOf(d); // Boxing
		System.out.println("Double Object: " + doubleObj);
		
		double d2 = 69.69;
		Double doubleObj2 = d2; // Auto Boxing
		System.out.println("Double Object 2: " + doubleObj2);
		
		String str = "Siuuuuuuuu";
		String strObj = str; // String is already an object
	}

}
