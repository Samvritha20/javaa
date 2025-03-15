// A bank provides different types of accounts: Savings Account and Current Account.  
// Create a base class BankAccount with attributes accountNumber, balance, and 
// methods like deposit() and withdraw(). 
// Create SavingsAccount and CurrentAccount as subclasses: 
// SavingsAccount: Allows a withdrawal only if the balance remains above ₹500. 
// CurrentAccount: Allows unlimited withdrawals but charges ₹50 if balance falls below ₹1000. 
// Use methods to handle deposits and withdrawals.
import java.util.Scanner;
class bankaccount
{
    Scanner s1 = new Scanner(System.in);
    System.out.println("Enter you account number : ");
    int account= s1.nextInt();

    Scanner s2 = new Scanner(System.in);
    System.out.println("Enter you account balance : ");
    int balance = s2.nextInt();

   public void deposit()
   {
    System.out.println("Depost");
   }
   public void withdraw()
   {
    System.out.println("Withdrawal details");
   }
}
class savings extends bankaccount 
{
    public void swith()
    {
        System.out.println("Saving Acoount: Cash be withdrawed if you have a minimum balance of 500 ");
    }
}
class current extends bankaccount 
{
public void cwith()
    {
        System.out.println("Current Account: Cash can be withdrawed  but charges 50 if balance falls below 1000");
    }
}
public class randdd
{
    public static void main(String[] args)
    {
        Scanner s1 = new Scanner(System.in);
        System.out.println("Enter you account number : ");
        int account= s1.nextInt();
        savings mysavings = new savings();
        current mycurrent = new current();
        mysavings.withdraw();
        mysavings.swith();
        mycurrent.withdraw();
        mycurrent.cwith();
    }
}

