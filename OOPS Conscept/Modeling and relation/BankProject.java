 class BankAccount {
    // Attributes
    private String accountNumber;
    private String accountHolder;
    private double balance;

    // Constructor
    public BankAccount(String accountNumber, String accountHolder, double initialBalance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = initialBalance;
    }

      // Method to deposit money
      public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println(amount + " deposited. New balance: " + balance);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    // Method to withdraw money
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println(amount + " withdrawn. New balance: " + balance);
        } else {
            System.out.println("Insufficient funds or invalid withdrawal amount.");
        }
    }

    
    // Method to get current balance
    public double getBalance() {
        return balance;
    }

     // Method to display account details
     public void displayAccountInfo() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Current Balance: " + balance);
    }

}


public class BankProject {
    public static void main(String[] args) {
        // Creating objects of BankAccount
        BankAccount johnsAccount = new BankAccount("123456789", "John Doe", 1000.00);
        BankAccount janesAccount = new BankAccount("987654321", "Jane Smith", 1500.00);

        // Using the objects
        johnsAccount.deposit(500);            // John deposits $500
        johnsAccount.withdraw(200);           // John withdraws $200
        System.out.println("John's balance: " + johnsAccount.getBalance()); // Check John's balance

        janesAccount.withdraw(2000);          // Attempt to withdraw more than the balance
        janesAccount.deposit(300);             // Jane deposits $300
        janesAccount.displayAccountInfo();     // Display Jane's account details
    }
}
