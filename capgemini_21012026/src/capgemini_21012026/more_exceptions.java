package capgemini_21012026;

public class more_exceptions {

	public static void main(String[] args) {
		// StringIndexOutOfBoundsException example
		String str = "Capgemini";
		try {
			char ch = str.charAt(20); // This will throw a StringIndexOutOfBoundsException
			System.out.println("Character at index 20: " + ch);
		} catch (StringIndexOutOfBoundsException e) {
			System.out.println("Error: String index is out of bounds.");
			System.out.println("Stack Trace: ");
			e.printStackTrace();
			System.out.println("Error Message: " + e.getMessage());
		} finally {
			System.out.println("String index access attempt completed.");
		}
		
		System.out.println("========================================");
		
		// ClassCastException example
		Object obj = new String("Son Heung Min");
		try {
			Integer num = (Integer) obj; // This will throw a ClassCastException
			System.out.println("Casted number: " + num);
		} catch (ClassCastException e) {
			System.out.println("Error: Invalid type casting.");
			System.out.println("Stack Trace: ");
			e.printStackTrace();
			System.out.println("Error Message: " + e.getMessage());
		} finally {
			System.out.println("Type casting attempt completed.");
		}
		
		System.out.println("========================================");
		
		// ClassNotFoundException example
		try {
			Class.forName("com.nonexistent.ClassName"); // This will throw a ClassNotFoundException
		} catch (ClassNotFoundException e) {
			System.out.println("Error: Class not found.");
			System.out.println("Stack Trace: ");
			e.printStackTrace();
			System.out.println("Error Message: " + e.getMessage());
		} finally {
			System.out.println("Class loading attempt completed.");
		}
		
		// NegativeArraySizeException 
		int arrayyy [] = new int [-5]; // This will throw NegativeArraySizeException
		try {
			int arrayyy2 [] = new int [-5]; // This will throw NegativeArraySizeException
		} catch (NegativeArraySizeException e) {
			System.out.println("Error: Negative array size.");
			System.out.println("Stack Trace: ");
			e.printStackTrace();
			System.out.println("Error Message: " + e.getMessage());
		} finally {
			System.out.println("Array creation attempt completed.");
		}
		
		System.out.println("========================================");
		
		
	}

}
