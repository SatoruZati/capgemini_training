package capgemini_19012026;

public class atm_bank_interface {
	
	private class SBI implements trial_interface {
		private double balance;
		
		public SBI() {
			this.balance = 0.0;
		}
		
		@Override
		public void withdraw(int amount) {
			if(amount <= balance) {
				balance -= amount;
				System.out.println("Withdrawn: " + amount);
			} else {
				System.out.println("Insufficient balance.");
			}
		}
		
		@Override
		public void deposit(int amount) {
			balance += amount;
			System.out.println("Deposited: " + amount);
		}
		
		@Override
		public void check_balance() {
			System.out.println("Current Balance: " + balance);
		}
		
		@Override
		public void statement() {
			System.out.println("Statement: Balance is " + balance);
			System.out.println("---------------------------");
			System.out.println("Thank you for using SBI ATM services.");
			
		}
		
		@Override
		public void welcome_message() {
			System.out.println("Welcome to " + trial_interface.bank_name);
		}
		
		@Override
		public String toString() {
			return "SBI Account with balance: " + balance;
		}
		
		@Override
		public int hashCode() {
			return Double.valueOf(balance).hashCode();
		}
		
		@Override
		public boolean equals(Object obj) {
			if(this == obj) return true;
			if(obj == null || getClass() != obj.getClass()) return false;
			SBI other = (SBI) obj;
			return Double.compare(other.balance, balance) == 0;
		}
	}

	public static void main(String[] args) {
		// implements ATM interface from trial_interface.java
		System.out.println("ATM Bank Interface Example:");
		atm_bank_interface atmInterface = new atm_bank_interface();
		SBI sbiAccount = atmInterface.new SBI();
		sbiAccount.welcome_message();
		sbiAccount.deposit(10000);
		sbiAccount.check_balance();
		sbiAccount.withdraw(5000);
		sbiAccount.statement();
		trial_interface.display_bank_name();
		sbiAccount.deposit(2000);
		sbiAccount.hashCode();
		System.out.println(sbiAccount.toString());
		System.out.println("Hash Code: " + sbiAccount.hashCode());
		System.out.println("Equals itself: " + sbiAccount.equals(sbiAccount));
		System.out.println("Equals new object with same balance: " + sbiAccount.equals(atmInterface.new SBI()));
		System.out.println("Equals new object with different balance: " + sbiAccount.equals(atmInterface.new SBI()));
	}

}
