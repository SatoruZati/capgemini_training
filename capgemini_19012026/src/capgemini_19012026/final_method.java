package capgemini_19012026;

final class FINAL{
		final void display() {
		System.out.println("This is a final method in the FINAL class.");
	}
		int mathematics() {
			return 69;
		}
}

public class final_method {
	
	final static String company_name = "Capgemini";
	static int i = 179;
	
	{
		// instance initializer block
		System.out.println("Instance Initializer Block executed. Company: " + company_name);
	}
	

	public static void main(String[] args) {
		// static, final methods
		System.out.println("Final Method Example:");
		FINAL finalObj = new FINAL();
		finalObj.display();
		System.out.println("Mathematics value: " + finalObj.mathematics());
		// display static variable
		System.out.println("Static variable i: " + i);
		// display final variable
		System.out.println("Final variable company_name: " + company_name);
	}

}
