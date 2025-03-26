import java.lang.*;
import java.util.*;
class BankAccount
{
    static String bankName;
    static String accountHolderName;
    final double accountNumber;
    private static int totalAccounts=0;
    public BankAccount(String bankName,String accountHolderName,double accountNumber, int totalAccounts)
    {
        this.bankName=bankName;
        this.accountHolderName=accountHolderName;
        this.accountNumber=accountNumber;
        totalAccounts++;
    }
    static void setTotalAccount(int n)   {
        totalAccounts+=n;
        System.out.println("The total accounts are "+ totalAccounts);
    }
    static int getTotalAccounts()
    {
        return totalAccounts;
    }
    public void display()
    {
        System.out.println("The bank name is "+ bankName);
        System.out.println("The account holder name is "+ accountHolderName);
        System.out.println("The account number is "+ accountNumber);
        System.out.println("The total accounts in the bank are "+ totalAccounts);
    }
        public static void main(String[] args) {
            System.out.println("The bank details are:");
            BankAccount ba=new BankAccount("SBI","Madhu",1234567890,2);
     setTotalAccount(5);
            if(ba instanceof BankAccount)
            {
                System.out.println("It is an instance");
            }
            else{
                System.out.println("It is not");
            }
            ba.display();
        }
    }