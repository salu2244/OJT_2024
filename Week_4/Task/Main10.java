class BankAccount {
    private String accountNumber;
    private String accountHolderName;
    private double balance;

    // Getter for accountNumber
    public String getAccountNumber() {
        return accountNumber;
    }

    // Setter for accountNumber
    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    // Getter for accountHolderName
    public String getAccountHolderName() {
        return accountHolderName;
    }

    // Setter for accountHolderName
    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    // Getter for balance
    public double getBalance() {
        return balance;
    }

    // Setter for balance with validation
    public void setBalance(double balance) {
        if (balance >= 0) {
            this.balance = balance;
        } else {
            System.out.println("Invalid balance, balance cannot be negative");
        }
    }

    // Method to deposit amount
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        } else {
            System.out.println("Invalid deposit amount, check that the amount is positive");
        }
    }

    // Method to withdraw amount
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        } else if (amount <= 0) {
            System.out.println("Invalid withdraw amount, check that the amount is positive");
        } else {
            System.out.println("Insufficient balance for the withdrawal");
        }
    }

    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        account.setAccountNumber("12345678");
        account.setAccountHolderName("Shikha");
        account.setBalance(500.0);

        System.out.println("Account number: " + account.getAccountNumber());
        System.out.println("Account Holder: " + account.getAccountHolderName());
        System.out.println("Balance: " + account.getBalance());

        account.deposit(200.0);
        System.out.println("Balance after deposit: " + account.getBalance());

        account.withdraw(100.0);
        System.out.println("Balance after withdrawal: " + account.getBalance());

        account.setBalance(-50.0); // This should print an error message
        account.deposit(-20); // This should print an error message
        account.withdraw(700.0); // This should print an error message
    }
}
