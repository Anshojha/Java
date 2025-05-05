
import java.util.Scanner;



class BankAccount {
    private static String bankName = "ABC Bank";
    private static int  totalAccounts = 0;
    private String accountHolderName;
    private final int accountNumber;

    BankAccount(String accountHolderName, int accountNumber) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        ++totalAccounts; // Increment total accounts and assign account number
    }

    static void getTotalAccounts() {
        System.out.println("Total Accounts: " + totalAccounts);
    }

    void displayAccountInfo() {
        if(this instanceof BankAccount) {
            System.out.println("Account Holder: " + accountHolderName);
            System.out.println("Account Number: " + accountNumber);
            System.out.println("Bank Name: " + bankName);
        } else {
            System.out.println("Invalid Account");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Account Holder Name: ");
        String name = scanner.nextLine();
        System.out.print("Enter Account Number: ");
        int accountNumber = scanner.nextInt();
        BankAccount account1 = new BankAccount(name , accountNumber);
        account1.displayAccountInfo(); // Display account information
        BankAccount account2 = new BankAccount(name , accountNumber);
        account2.displayAccountInfo(); // Display account information
        BankAccount account3 = new BankAccount(name , accountNumber);
        account3.displayAccountInfo(); // Display account information
        BankAccount.getTotalAccounts(); // Display total accounts`
    }
}


