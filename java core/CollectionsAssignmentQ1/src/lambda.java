import java.lang.FunctionalInterface;
import java.util.Scanner;


interface forLambda
{
	double simpleInterest(int p, int t, double r);
}

public class lambda {
	
	public static void main(String args[])
	{
		forLambda ref=(int p, int t, double r)->
		{
			System.out.println("The simple interest amounted on the principal is "+((p*t*r)/100));
			return 0.0;
		};
		int P, T;
		double R;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter principal");
		P=sc.nextInt();
		System.out.println("Enter time");
		T=sc.nextInt();
		System.out.println("Enter rate");
		R=sc.nextDouble();
		ref.simpleInterest(P,T,R);
		
	}

}
