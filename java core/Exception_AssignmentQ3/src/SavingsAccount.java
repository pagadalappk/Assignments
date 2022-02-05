import java.util.Scanner;

public class SavingsAccount
{
	
	SavingsAccount sa=new SavingsAccount();	
	
	static double balance = 93850;
	public static void withdraw(double amount) 
	{
		double j=0;	
		if(amount>balance || balance==0)
			{throw new InsufficientBalanceException(balance);}
		if(amount<0)
		{throw new IllegalBankTransactionException();}
		j=balance-amount;
		System.out.println("Update balance in your account is INR "+j);
		System.out.println("Thank you for visiting Java Bank ");
		System.out.println("Please visit again ");
		
		
		
	}
	public static double deposit(double amount) 
	{
		
		double j=0;
		if(amount<0)
		{throw new IllegalBankTransactionException();}
		j=amount+balance;
		System.out.println("Update balance in your account is INR "+j);
		System.out.println("Thank you for visiting Java Bank ");
		System.out.println("Please visit again ");
		return j;
	}
	
	public static void main(String args[])
	{
		System.out.println("Welcome to JavaBank");
		System.out.println("Press 1 to withdraw money ");
		System.out.println("Press 2 to deposit money ");
		
		Scanner sc = new Scanner(System.in);
		
		int o=0;
		
		o=sc.nextInt();
		
		if(o==1)
		{
			double l=0;
			System.out.println("Enter the amount to be withdrawed");
			l=sc.nextInt();
			withdraw(l);
		}
		else if(o==2)
		{
			double l=0;
			System.out.println("Enter the amount to be deposited");
			l=sc.nextInt();
			deposit(l);
		}
		else
		{
			System.out.println("Please try again selecting the right option");
		}
		
	}
}
