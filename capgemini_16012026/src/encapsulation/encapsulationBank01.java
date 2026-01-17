package encapsulation;

public class encapsulationBank01 {

	private String accountNumber;
	private String accountHolderName;
	private double balance;
	private String password;
	private double interestRate;
	private int loan_count;
	private double loan_amount;
	
	public void BankAccount() {
		this.accountNumber = "9784653120";
		this.accountHolderName = "Gojo Satoru";
		this.balance = 1098460.0;
		this.password = "password@123";
		this.interestRate = 6.5;
		this.loan_count = 1;
		this.loan_amount = 150000.0;
	}
	
	public String getAccountNumber() {
		return accountNumber;
	}
	
	public String getAccountHolderName() {
		return accountHolderName;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public String getPassword() {
		return password;
	}
	
	public double getInterestRate() {
		return interestRate;
	}
	
	public int getLoan_count() {
		return loan_count;
	}
	
	public double getLoan_amount() {
		return loan_amount;
	}
	
	// setter methods added here to update the private variables if needed
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	
	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}
	
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}
	
	public void setLoan_count(int loan_count) {
		this.loan_count = loan_count;
	}
	
	public void setLoan_amount(double loan_amount) {
		this.loan_amount = loan_amount;
	}
	
	public void displayAccountDetails() {
		System.out.println("Account Number: " + accountNumber);
		System.out.println("Account Holder Name: " + accountHolderName);
		System.out.println("Balance: " + balance);
		System.out.println("Password: " + password);
		System.out.println("Interest Rate: " + interestRate);
		System.out.println("Loan Count: " + loan_count);
		System.out.println("Loan Amount: " + loan_amount);
	}
	
	

	public static void main(String[] args) {
		// trying encapsulation with bank account details
		encapsulationBank01 bankAccount = new encapsulationBank01();
		bankAccount.BankAccount();
		
		// getter methods to access private variables
		// System.out.println("Account Number: " + bankAccount.getAccountNumber());
		
		// setter methods to update private variables
		// bankAccount.setBalance(1200000.0);

	}

}
