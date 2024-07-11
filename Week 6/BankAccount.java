public class BankAccount {
    public String accountNumber;
    public String accountHolderName;
    public double balance;

    // Constructor
    public BankAccount(String accountNumber, String accountHolderName, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    // Method to deposit money
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited " + amount + ". New balance is " + balance + ".");
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    // Method to withdraw money
    public void withdraw(double amount) {
        if (amount > 0) {
            if (balance >= amount) {
                balance -= amount;
                System.out.println("Withdrew " + amount + ". New balance is " + balance + ".");
            } else {
                System.out.println("Insufficient balance.");
            }
        } else {
            System.out.println("Withdrawal amount must be positive.");
        }
    }

    // Method to check balance
    public void checkBalance() {
        System.out.println("The current balance is " + balance + ".");
    }

    // Main method to test the BankAccount class
    public static void main(String[] args) {
        // Creating a new bank account
        BankAccount account = new BankAccount("123456789", "Shikha Kumari", 1000.0);

        // Checking initial balance
        account.checkBalance();

        // Depositing money
        account.deposit(500.0);
        
        // Withdrawing money
        account.withdraw(200.0);
        
        // Attempting to withdraw more money than the balance
        account.withdraw(1500.0);

        // Checking final balance
        account.checkBalance();
    }
}
