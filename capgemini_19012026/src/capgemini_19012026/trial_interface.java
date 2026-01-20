package capgemini_19012026;

public interface trial_interface {
	// ATM interface in Java
	void withdraw(int amount);
	void deposit(int amount);
	void check_balance();
	void statement();
	String bank_name = "SBI Bank"; // public, static, final by default
	void welcome_message(); // public abstract by default
	// Interface can have static methods
	static void display_bank_name() {
		System.out.println("Welcome to " + bank_name);
	}
}

// An interface in Java is a reference type that defines a contract of methods that implementing classes must provide.
