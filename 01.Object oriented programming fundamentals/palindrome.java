import java.lang.*;
import java.util.*;
class palindrome {
    private String str;
    private String reversedStr = " ";

    public palindrome(String str) {

        this.str = str;
        this.reversedStr = reverse(str);
    }

    public String reverse(String str) {
        for (int i = str.length() - 1; i >= 0; i--) {
            reversedStr += str.charAt(i);
        }
        return reversedStr;
    }

    public boolean pal() {
        return str.equals(reversedStr);
    }

    public void display() {
        System.out.println("The original string is " + str);
        System.out.println("The reversed string is " + reversedStr);
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string");
        String str=sc.nextLine();
        palindrome p=new palindrome(str);
        p.display();
        if (p.pal()) {
            System.out.println("It is a palindrome.");
        } else {
            System.out.println("It is not a palindrome.");
        }
    }
}
