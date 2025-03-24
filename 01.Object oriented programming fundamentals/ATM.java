import java.lang.*;
import java.util.*;
class ATM {
    private String accountHolder;
    private double accountNumber;
    private double balance;
    public ATM(String accountHolder,double accountNumber,double balance)
    {
        this.accountHolder=accountHolder;
        this.accountNumber=accountNumber;
        this.balance=balance;
    }
    public void deposit(double amount)
    {
        if(amount>0)
        {
            balance+=amount;
            System.out.println("Deposited money: "+ amount);
        }
        else {
            System.out.println("Invalid deposit amount.");
        }
    }
    public void withDraw(double amount)
    {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient balance or invalid amount.");
        }
    }
    public void display() {
        System.out.println("Account holder name: " + accountHolder);
        System.out.println("Account number: " + accountNumber);
        System.out.println("Current Balance: " + balance);
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Name");
        String name=sc.nextLine();
        System.out.println("account number");
        double acc=sc.nextDouble();
        System.out.println("Balance");
        double balance=sc.nextDouble();
        ATM a=new ATM(name,acc,balance);
        while (true) {
            System.out.println("\nATM Menu:");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Display Balance");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter amount to deposit: ");
                    double depositAmount = sc.nextDouble();
                    a.deposit(depositAmount);
                    break;
                case 2:
                    System.out.print("Enter amount to withdraw: ");
                    double withdrawAmount = sc.nextDouble();
                    a.withDraw(withdrawAmount);
                    break;
                case 3:
                    a.display();
                    break;
                case 4:
                    System.out.println("Exiting ATM. Thank you!");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
