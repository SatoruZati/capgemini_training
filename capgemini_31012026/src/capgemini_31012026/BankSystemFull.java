package capgemini_31012026;

/*
 # Secure Banking Transaction Engine
 -----------------------------------
 This program demonstrates:
 - Abstraction
 - Encapsulation
 - Runtime Polymorphism
 - Method Overloading
 - Method Overriding
 - Custom Exceptions
 - Exception Propagation
 - Robust Transaction Validation
*/

public class BankSystemFull {

    /*===========================================================
     * 1. INTERFACE = Transaction Rules Template
     *===========================================================
     *
     * Interface is used to define a contract.
     * Any account must support deposit and withdrawal operations.
     */
    interface Transaction {

        void deposit(double amount) throws InvalidAmountException;

        void withdraw(double amount)
                throws InvalidAmountException, InsufficientBalanceException;
    }

    /*===========================================================
     * 2. CUSTOM CHECKED EXCEPTION (Compile-time)
     *===========================================================
     *
     * Checked exception → must be handled using try-catch or throws.
     */
    static class InvalidAmountException extends Exception {

        public InvalidAmountException(String message) {
            super(message);
        }
    }

    /*===========================================================
     * 3. CUSTOM UNCHECKED EXCEPTION (Runtime)
     *===========================================================
     *
     * Unchecked exception → not mandatory to handle.
     */
    static class InsufficientBalanceException extends RuntimeException {

        public InsufficientBalanceException(String message) {
            super(message);
        }
    }

    /*===========================================================
     * 4. ABSTRACT CLASS = Base Bank Account Template
     *===========================================================
     *
     * Abstract class provides:
     * - Common account properties
     * - Shared transaction logic
     * - Mandatory rules for subclasses
     */
    static abstract class BankAccount implements Transaction {

        // Encapsulation Rule: All variables must be private
        private String accountNumber;
        private String accountHolderName;
        private double balance;

        /*-------------------------------------------------------
         * Constructor initializes account safely
         *------------------------------------------------------*/
        public BankAccount(String accNo, String holder, double initialBalance)
                throws InvalidAmountException {

            this.accountNumber = accNo;
            this.accountHolderName = holder;

            // Validation: balance cannot be negative
            if (initialBalance < 0) {
                throw new InvalidAmountException("Initial balance cannot be negative!");
            }

            this.balance = initialBalance;
        }

        /*-------------------------------------------------------
         * Controlled Getter (Balance cannot be directly modified)
         *------------------------------------------------------*/
        public double getBalance() {
            return balance;
        }

        /*-------------------------------------------------------
         * Protected Setter for internal controlled updates
         *------------------------------------------------------*/
        protected void setBalance(double balance) {
            this.balance = balance;
        }

        public String getAccountHolderName() {
            return accountHolderName;
        }

        /*=======================================================
         * METHOD OVERLOADING: Deposit Variations
         *=======================================================
         */

        // Deposit using cash
        @Override
        public void deposit(double amount) throws InvalidAmountException {

            if (amount <= 0) {
                throw new InvalidAmountException("Deposit amount must be greater than zero!");
            }

            setBalance(getBalance() + amount);

            System.out.println("Cash Deposit Successful: ₹" + amount);
        }

        // Overloaded deposit method for online deposit
        public void deposit(double amount, String mode) throws InvalidAmountException {

            if (amount <= 0) {
                throw new InvalidAmountException("Online deposit must be valid!");
            }

            setBalance(getBalance() + amount);

            System.out.println("Online Deposit Successful via " + mode + ": ₹" + amount);
        }

        /*=======================================================
         * METHOD OVERLOADING: Withdraw Variations
         *=======================================================
         */

        // Withdraw without remarks
        @Override
        public void withdraw(double amount)
                throws InvalidAmountException, InsufficientBalanceException {

            withdraw(amount, "No Remarks");
        }

        // Withdraw with remarks (Overloaded)
        public void withdraw(double amount, String remarks)
                throws InvalidAmountException, InsufficientBalanceException {

            if (amount <= 0) {
                throw new InvalidAmountException("Withdrawal amount must be positive!");
            }

            if (amount > getBalance()) {
                throw new InsufficientBalanceException("Withdrawal denied: Insufficient Balance!");
            }

            setBalance(getBalance() - amount);

            System.out.println("Withdrawal Successful: ₹" + amount +
                    " | Remarks: " + remarks);
        }

        /*=======================================================
         * ABSTRACT METHOD → Subclasses MUST Override
         *=======================================================
         *
         * Runtime polymorphism happens here.
         */
        public abstract void accountTypeInfo();

        /*-------------------------------------------------------
         * Display Account Summary
         *------------------------------------------------------*/
        public void showAccountDetails() {

            System.out.println("\n--- Account Summary ---");
            System.out.println("Account Holder: " + accountHolderName);
            System.out.println("Balance: ₹" + getBalance());
        }
    }

    /*===========================================================
     * 5. SAVINGS ACCOUNT (Runtime Polymorphism)
     *===========================================================
     *
     * Savings account may enforce minimum balance rule.
     */
    static class SavingsAccount extends BankAccount {

        private static final double MIN_BALANCE = 500;

        public SavingsAccount(String accNo, String holder, double balance)
                throws InvalidAmountException {
            super(accNo, holder, balance);
        }

        // Overriding behavior for savings withdrawal rule
        @Override
        public void withdraw(double amount)
                throws InvalidAmountException, InsufficientBalanceException {

            if (getBalance() - amount < MIN_BALANCE) {
                throw new InsufficientBalanceException(
                        "Savings Account must maintain minimum balance ₹" + MIN_BALANCE);
            }

            super.withdraw(amount);
        }

        @Override
        public void accountTypeInfo() {
            System.out.println("Account Type: Savings Account");
        }
    }

    /*===========================================================
     * 6. CURRENT ACCOUNT (Runtime Polymorphism)
     *===========================================================
     *
     * Current account allows overdraft facility.
     */
    static class CurrentAccount extends BankAccount {

        private static final double OVERDRAFT_LIMIT = 2000;

        public CurrentAccount(String accNo, String holder, double balance)
                throws InvalidAmountException {
            super(accNo, holder, balance);
        }

        // Overriding withdrawal behavior (allows overdraft)
        @Override
        public void withdraw(double amount)
                throws InvalidAmountException, InsufficientBalanceException {

            if (amount > getBalance() + OVERDRAFT_LIMIT) {
                throw new InsufficientBalanceException(
                        "Current Account overdraft limit exceeded!");
            }

            setBalance(getBalance() - amount);

            System.out.println("Withdrawal Allowed with Overdraft: ₹" + amount);
        }

        @Override
        public void accountTypeInfo() {
            System.out.println("Account Type: Current Account");
        }
    }

    /*===========================================================
     * 7. MAIN METHOD (Simulation + Exception Handling)
     *===========================================================*/
    public static void main(String[] args) {

        System.out.println("===== Secure Banking Transaction Engine =====");

        try {
            // Runtime Polymorphism:
            // BankAccount reference can hold Savings or Current objects
            BankAccount acc1 = new SavingsAccount("S101", "Amit Sharma", 5000);
            BankAccount acc2 = new CurrentAccount("C202", "Neha Verma", 3000);

            // Display account type info (Overridden methods)
            acc1.accountTypeInfo();
            acc2.accountTypeInfo();

            // Deposit Overloading
            acc1.deposit(1000);
            acc2.deposit(2000, "UPI");

            // Withdrawal Overloading
            acc1.withdraw(2000, "Rent Payment");

            // Exception Propagation Demo
            acc1.withdraw(4000); // Will trigger minimum balance exception

        }

        // Checked exception must be caught
        catch (InvalidAmountException e) {
            System.out.println("Checked Exception Caught: " + e.getMessage());
        }

        // Unchecked exception optional catch, but handled here
        catch (InsufficientBalanceException e) {
            System.out.println("Runtime Exception Caught: " + e.getMessage());
        }

        // Finally always executes
        finally {
            System.out.println("\nTransaction Session Ended Safely.");
        }
    }
}
