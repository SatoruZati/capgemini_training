package capgemini_13012026;

public class polymorphism {
	
	public static void login(String email,String password) {
		System.out.println("login successful with email-pass");
	}
	
	public static void login(long phone_num,String password) {
		System.out.println("login successful with phone_num-pass");
	}
	
	public static void login(String email,int otp) {
		System.out.println("login successful with email-otp");
	}
	
	public static void login(long phone_num,int otp) {
		System.out.println("login successful with phone_num-otp");
	}

	public static void main(String[] args) {
		// method overloading
		String email = "abc@gmail.com";
		String password = "abc123";
		long phone_num = 1234567890;
		int otp = 987654;
		
		int temp = 1;
		
		// method overloading works on compile time binding
		
		if (temp==1) {
			login(email,password);			
		}
		
		if (temp==2) {
			login(phone_num,password);
		}
		
		if (temp==3) {
			login(email, otp);
		}
		
		if (temp==4) {
			login(phone_num, otp);
		}
		
		// what is compile time binding?
		// suppose we have main method psvm(){
		//	WE HAVE METHOD OVERLOADING INSIDE 
		// compiler makes the connection internally and binds the login function with
		// the two variable given and their types and triggers 
		// the appropriate login method
		// this is an example of Compile Time Binding where in the compiler auto binds 
		// method with variables to trigger the desired existing method
		//}
		
		
		// method overriding
		

	}

}
