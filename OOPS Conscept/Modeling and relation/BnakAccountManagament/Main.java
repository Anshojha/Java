
import java.util.ArrayList;


class Customer {
    String name;
    double balance;

    public Customer(String name, double  balance) {
        this.name = name;
        this.balance = balance;
    }

    void viewBalance () {
        System.out.println(name  + "'s balance: $ " + balance);
    }
    
}

class Bank {
    String bankName;
    ArrayList<Customer> customers = new ArrayList<>();
    
    Bank(String name) {
        this.bankName = name;
    }

    void openAccount(Customer c) {
        customers.add(c);
        System.err.println("Account is opened for " + c.name + " in " + bankName);
    }
    

    void showAllAccounts() {
        System.err.println("Accounts in " + bankName +":");
        for (Customer c : customers) {
            System.err.println("- " + c.name);
        }
    }

}


public  class Main {
    public static void main(String[] args) {
        Bank bank = new Bank("State Bank");
        Customer c1 = new Customer("Abhay", 10000);
        Customer c2 = new Customer("Ansh", 1000000);

        bank.openAccount(c1);
        bank.openAccount(c2);

        c1.viewBalance();
        c2.viewBalance();

        bank.showAllAccounts();
    }
}