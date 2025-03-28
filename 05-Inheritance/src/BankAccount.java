import java.lang.*;
import java.util.*;
class BankAccount
{
    private String accountNumber;
    private double balance;
    public BankAccount(String accountNumber,double balance)
    {
        this.accountNumber=accountNumber;
        this.balance=balance;
    }
    public void display()
    {
        System.out.println("Account number:"+ accountNumber);
        System.out.println("Balance:" + balance);
    }
}
class SavingsAccount extends BankAccount
{
    private int interestRate;
    private String accountType;
    public SavingsAccount(String accountNumber,double balance,int interestRate)
    {
        super(accountNumber, balance);
        this.interestRate=interestRate;
    }
    public void displayAccountType()
    {
        super.display();
        System.out.println("Account Type: Savings Account");
        System.out.println("Interest Rate:" + interestRate + "%");
    }
}
class CheckingAccount extends BankAccount {
    private double withdrawalLimit;

    public CheckingAccount(String accountNumber, double balance, double withdrawalLimit) {
        super(accountNumber, balance);
        this.withdrawalLimit = withdrawalLimit;
    }

    public void displayAccountType() {
        super.display();
        System.out.println("Account Type: Checking Account");
        System.out.println("Withdrawal Limit:" + withdrawalLimit);
    }
}
class FixedDepositAccount extends BankAccount {
    private int maturityPeriod;

    public FixedDepositAccount(String accountNumber, double balance, int maturityPeriod) {
        super(accountNumber, balance);
        this.maturityPeriod = maturityPeriod;
    }

    public void displayAccountType() {
        super.display();
        System.out.println("Account Type: Fixed Deposit Account");
        System.out.println("Maturity Period: " + maturityPeriod + " months");
    }
}
class Main
{
    public static void main(String[] args) {
        SavingsAccount savings = new SavingsAccount("AA12345", 50000, 3);
        savings.displayAccountType();
        CheckingAccount checking = new CheckingAccount("AA9876342", 20000, 10000);
        checking.displayAccountType();
        FixedDepositAccount fixed = new FixedDepositAccount("AA54321", 100000, 12);
        fixed.displayAccountType();
    }
}