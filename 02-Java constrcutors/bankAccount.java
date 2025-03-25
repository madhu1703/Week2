import java.lang.*;
import java.util.*;
class BankAccount {
   public String accountNumber;
   protected String accountHolder;
   private double balance;
   public BankAccount(String accountNumber, String accountHolder, double balance) {
       this.accountNumber = accountNumber;
       this.accountHolder = accountHolder;
       this.balance = balance;
   }
   public double getBalance() {
       return balance;
   }
   public void deposit(double amount) {
       if (amount > 0) {
           balance += amount;
           System.out.println("Deposited: " + amount);
       } else {
           System.out.println("Invalid deposit amount.");
       }
   }
   public void withdraw(double amount) {
       if (amount > 0 && amount <= balance) {
           balance -= amount;
           System.out.println("Withdrawn: " + amount);
       } else {
           System.out.println("Insufficient amount.");
       }
   }
}
class SavingsAccount extends BankAccount {
   private double interestRate;


   public SavingsAccount(String accountNumber, String accountHolder, double balance, double interestRate) {
       super(accountNumber, accountHolder, balance);
       this.interestRate = interestRate;
   }
   public void displayAccountDetails() {
       System.out.println("Account Number: " + accountNumber);
       System.out.println("Account Holder: " + accountHolder);
       System.out.println("Balance: " + getBalance());
       System.out.println("Interest Rate: " + interestRate + "%");
   }
}
class bank
{
   public static void main(String[] args)
   {
       SavingsAccount s=new SavingsAccount("0101010","Myself",1000,3.5);
       s.displayAccountDetails();
       s.deposit(500);
       s.withdraw(200);
       s.displayAccountDetails();
   }
}
