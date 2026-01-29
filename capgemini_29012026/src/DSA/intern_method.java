package DSA;

public class intern_method {

	public static void main(String[] args) {
		// Intern Method in Java
		// The intern() method in Java is used to optimize memory usage by storing only one copy of each distinct string value
		// When a string is interned, it is added to a pool of strings, and any subsequent calls to intern() with the same string value will return a reference to the pooled instance, rather than creating a new object.
		// This can help reduce memory consumption, especially when dealing with a large number of identical string values.
		// The intern() method is particularly useful in scenarios where many identical strings are created, such as in loops or when processing large datasets.
		// This uses the String Constant Pool (SCP) in Java
		// Example of intern() method
		
		String str1 = new String("Lionel Messi");
		String str2 = str1.intern();
		String str3 = "Lionel Messi";
		String str4 = "Lionel Messi".intern();
		
		System.out.println("str1 == str2: " + (str1 == str2)); // false, different references
		System.out.println("str2 == str3: " + (str2 == str3)); // true, same reference from SCP
		
		System.out.println("str1.equals(str2): " + str1.equals(str2)); // true, same content
		System.out.println("str2.equals(str3): " + str2.equals(str3)); // true, same content
		
		System.out.println("str1 == str3: " + (str1 == str3)); // false, different references
		System.out.println("str3 == str4: " + (str3 == str4)); // true, same reference from SCP
		
		System.out.println("str1.equals(str3): " + str1.equals(str3)); // true, same content
		System.out.println("str2.equals(str4): " + str2.equals(str4)); // true, same content
		System.out.println("str2 == str4: " + (str2 == str4)); // true, same reference from SCP
		// In this example, str1 is created using the new keyword, so it resides in the heap memory.
		
		// Interning strings can be beneficial in terms of memory usage and performance
		// However, it is important to use it judiciously, as excessive interning can lead to memory overhead
		
		// How much memory is in String Constant Pool (SCP)?
		// The size of the String Constant Pool (SCP) in Java is not fixed and can vary 
		// depending on the Java Virtual Machine (JVM) implementation and configuration.
		// 
		// How much memory is there in Stack and Heap?
		// The size of the stack and heap memory in Java can vary depending on the JVM implementation and configuration.
		// For example, if I have 8 GB RAM, how much memory is allocated to Stack and Heap?
		// Stack memory: Typically, the stack size is much smaller than the heap size. 
		// It can range from a few megabytes to several megabytes, depending on the JVM settings. 
		// For example, it might be set to 1 MB or 2 MB by default.
		// Heap memory: The heap size can be much larger and is often configurable.
		// For a system with 8 GB of RAM, the heap size might be set to a few gigabytes, 
		// such as 2 GB or 4 GB, depending on the application's requirements and JVM settings.

		// Conclusion
		// In summary, the memory allocation for stack and heap in Java is influenced by various factors, including the JVM implementation, configuration, and the specific needs of the application.
		// Understanding these memory areas and their characteristics is essential for optimizing Java applications and managing resources effectively.
	}

}
