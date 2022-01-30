import java.util.Scanner;

public class Assignment1Q3 {
	public static void main(String args[])
	{
		double principal,interest;
		int time;
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the principal amount:");
		principal=sc.nextDouble();
		System.out.println("Enter the time:");
		time=sc.nextInt();
		System.out.println("Enter the interestRate:");
		interest=sc.nextDouble();
		//System.out.println(principalAmount+time+interestRate);
		
		SiCi sici= new SiCi();
		
		System.out.println(sici.simpleInterest(principal,time,interest));
		
		System.out.println(sici.compoundInterest(principal,time,interest));
		
	}

}