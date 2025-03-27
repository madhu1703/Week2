import java.lang.*;
import java.util.*;
class Account {
    private static int idCounter = 1;
    private int number;
    private double balance;

    public Account(double balance, Bank bank) {
        this.number = idCounter++;
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public int getAccountNumber() {
        return number;
    }
}
class Customer {
    private String custName;
    private int accountCount;
    private Account[] accounts;

    public Customer(String custName) {
        this.custName = custName;
        this.accounts = new Account[10];
        this.accountCount = 0;
    }

    public String getName() {
        return custName;
    }

    public void addAccount(Account account) {
        if (accountCount < accounts.length) {
            accounts[accountCount++] = account;
        } else {
            System.out.println("Limit exceeded for accounts of " + custName);
        }
    }

    public void viewBalance() {
        System.out.println("Balances for " + custName + ":");
        for (int i = 0; i < accountCount; i++) {
            Account acc = accounts[i];
            System.out.println("  Account Number: " + acc.getAccountNumber() + " | Balance: $" + acc.getBalance());
        }
    }
}
class Bank {
    private String bankName;
    private Customer[] customers;
    private int customerCount;

    public Bank(String bankName) {
        this.bankName = bankName;
        this.customers = new Customer[10];
        this.customerCount = 0;
    }

    public String getName() {
        return bankName;
    }

    public void openAccount(Customer customer, double initialDeposit) {
        Account account = new Account(initialDeposit, this);
        customer.addAccount(account);

        if (!isCustomerAlreadyAdded(customer)) {
            if (customerCount < customers.length) {
                customers[customerCount++] = customer;
            } else {
                System.out.println("Cannot add more customers to " + bankName);
            }
        }

        System.out.println("Account opened for " + customer.getName() +
                " at " + bankName + " with $" + initialDeposit);
    }

    private boolean isCustomerAlreadyAdded(Customer customer) {
        for (int i = 0; i < customerCount; i++) {
            if (customers[i] == customer) {
                return true;
            }
        }
        return false;
    }

    public void listCustomers() {
        System.out.println("Customers of " + bankName + ":");
        for (int i = 0; i < customerCount; i++) {
            System.out.println("  - " + customers[i].getName());
        }
    }
}
class Main {
    public static void main(String[] args) {
        Bank bank1 = new Bank("Unity Bank");
        Bank bank2 = new Bank("Bright Bank");

        Customer cust1 = new Customer("Maya");
        Customer cust2 = new Customer("Ravi");

        bank1.openAccount(cust1, 1500.0);
        bank1.openAccount(cust2, 1000.0);
        bank2.openAccount(cust1, 3000.0);

        cust1.viewBalance();
        cust2.viewBalance();

        bank1.listCustomers();
        bank2.listCustomers();
    }
}
