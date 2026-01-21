package capgemini_21012026;
import java.io.*;

public class throw_throws_demo {

	    // Method declares that it may throw an exception (throws)
	    public static void checkAge(int age) throws Exception {

	        // Explicitly throwing an exception (throw)
	        if (age < 18) {
	            throw new Exception("Age must be 18 or older.");
	        }

	        System.out.println("Access granted.");
	    }
	    
	    // FileNotFoundException and IOException 
	    public static void processFile() throws Exception {
	        // Simulating file processing that may throw IOException
	    	FileInputStream file = new FileInputStream("non_existent_file.txt");
	    	if (file != null) {
	    		System.out.println("File processed successfully.");
	    	}
	    	file.close();
	    }

	    public static void main(String[] args) throws Exception {

	        try {
	            checkAge(17);  // Method call that may propagate an exception
	            processFile();

	        } catch (Exception e) {
	            // Catching the propagated exception
	            System.out.println("Error: " + e.getMessage());
	        }
	        System.out.println("========================================");
	        
	        try {
	        	processFile();
	        } catch (Exception e) {
	        	System.out.println("Error: " + e.getMessage());
	        }
	    }
	

}
