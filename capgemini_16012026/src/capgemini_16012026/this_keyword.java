package capgemini_16012026;

public class this_keyword {

	public int var = 9;

	public void footballClub(String clubName) {
		System.out.println("Football Club: " + clubName);
	}

	public static int StaticMethod(){
		int var = 17;
		return var;

	}

	public void display() {
		int var = 10;
		// Here output is 10. Because var below is referring to the local variable inside display() method
		// explanation of below statement: here var means local variable of display() method
		System.out.println("Local variable value: " + var);
		// explanation of below statement: here this.var means instance variable of current class
		// this.var returns the instance variable value of current class
		// How it works?
		// this.var refers to instance variable of current class and
		// returns its value which is 9 in this case. 
		// output is not 10 because local variable var is shadowed by instance variable var.
		// 10 is the local variable and this.var is referencing the global instance of the variable
		System.out.println("Instance variable value using this keyword: " + this.var);

		//////////////////////////////////////////////////////////////////////////////////////////////
		/// Usage of this keyword to call non static method inside non static method
		//////////////////////////////////////////////////////////////////////////////////////////////
		String str = "Real Madrid";

		// this keyword is used to call non static method
		// explanation of below statement: here this.footballClub() means non static method of current class
		
		// How it works? 
		// this.footballClub(str) calls the method footballClub() of current class and 
		// passes the argument str to it.	
		this.footballClub(str);
	}

	public static void main(String[] args) {
		// this keyword usage
		this_keyword obj = new this_keyword();

		System.out.println("Static method returned value: " + StaticMethod());
		obj.display();

		

	}

}
