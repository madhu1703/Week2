import java.lang.*;
import java.util.*;
interface Loanable {
    void applyForLoan(double amount);
    double calculateLoanEligibility();
}
abstract class BankAccount {
    private String accountNumber;
    private String holderName;
    private double balance;

    public BankAccount(String accountNumber, String holderName, double balance) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
    }
    public String getAccountNumber() {
        return accountNumber;
    }

    public String getHolderName() {
        return holderName;
    }

    public double getBalance() {
        return balance;
    }

    protected void setBalance(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited ₹" + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawn ₹" + amount);
        } else {
            System.out.println("Insufficient balance or invalid amount.");
        }
    }

    public void showAccountDetails() {
        System.out.println("Account No: " + accountNumber);
        System.out.println("Holder Name: " + holderName);
        System.out.println("Balance: ₹" + balance);
    }

    public abstract double calculateInterest();
}
class SavingsAccount extends BankAccount implements Loanable {
    public SavingsAccount(String accountNumber, String holderName, double balance) {
        super(accountNumber, holderName, balance);
    }

    @Override
    public double calculateInterest() {
        return getBalance() * 0.04;
    }

    @Override
    public void applyForLoan(double amount) {
        System.out.println("Savings Account Loan Requested: ₹" + amount);
    }

    @Override
    public double calculateLoanEligibility() {
        return getBalance() * 2;
    }
}
class CurrentAccount extends BankAccount implements Loanable {
    public CurrentAccount(String accountNumber, String holderName, double balance) {
        super(accountNumber, holderName, balance);
    }

    @Override
    public double calculateInterest() {
        return getBalance() * 0.02;
    }

    @Override
    public void applyForLoan(double amount) {
        System.out.println("Current Account Loan Requested: ₹" + amount);
    }

    @Override
    public double calculateLoanEligibility() {
        return getBalance() * 1.5;
    }
}
public class BankingSystem {
    public static void processAccount(BankAccount account) {
        account.showAccountDetails();
        double interest = account.calculateInterest();
        System.out.println("Calculated Interest: ₹" + interest);

        if (account instanceof Loanable) {
            Loanable loanAccount = (Loanable) account;
            loanAccount.applyForLoan(10000);
            System.out.println("Loan Eligibility: ₹" + loanAccount.calculateLoanEligibility());
        }
    }

    public static void main(String[] args) {
        BankAccount acc1 = new SavingsAccount("SA101", "Neha Verma", 20000);
        BankAccount acc2 = new CurrentAccount("CA202", "Ravi Kumar", 35000);

        acc1.deposit(5000);
        acc2.withdraw(8000);

        BankAccount[] accounts = {acc1, acc2};

        System.out.println("\nBanking System Summary:\n");
        for (BankAccount acc : accounts) {
            processAccount(acc);
        }
    }
}

