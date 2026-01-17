package encapsulation;

public class encapsulationBank02 {

	public static void main(String[] args) {
		// we are using encapsulation with bank account details from encapsulationBank01.java
		encapsulationBank01 bankAccount = new encapsulationBank01();
		
		bankAccount.BankAccount();
		
		// Displaying bank account details
		System.out.println("--- Bank Account Details ---");
		System.out.println("Account Number: " + bankAccount.getAccountNumber());
		System.out.println("Account Holder Name: " + bankAccount.getAccountHolderName());
		System.out.println("Balance: " + bankAccount.getBalance());
		System.out.println("Password: " + bankAccount.getPassword());
		System.out.println("Interest Rate: " + bankAccount.getInterestRate());
		System.out.println("Loan Count: " + bankAccount.getLoan_count());
		System.out.println("Loan Amount: " + bankAccount.getLoan_amount());
		
		// updating bank account details
		bankAccount.setBalance(1751500.75);
		bankAccount.setPassword("NewSecurePassword456");
		bankAccount.setLoan_count(2);
		bankAccount.setLoan_amount(250000.0);
		
		System.out.println("\n--- Updated Bank Account Details ---");
		bankAccount.displayAccountDetails();
		
	}

}
