package DSA;

public class StringBuilder_StringBuffer {

	public static void main(String[] args) {
		// StringBuilder vs StringBuffer
		// StringBuilder is not synchronized, StringBuffer is synchronized
		StringBuilder sb = new StringBuilder("Hello");
		sb.append(" World");
		System.out.println("StringBuilder: " + sb.toString());
		
		// StringBuffer example
		StringBuffer sbf = new StringBuffer("Hello");
		sbf.append(" World");
		System.out.println("StringBuffer: " + sbf.toString());
		// StringBuffer is synchronized, making it thread-safe
		
		// However, this comes at the cost of performance compared to StringBuilder
		
		// Recommended to use StringBuilder in single-threaded environments
		// Use StringBuffer in multi-threaded environments
		
		// Both classes are mutable, meaning their contents can be changed 
		// without creating new objects
		
	}

}
