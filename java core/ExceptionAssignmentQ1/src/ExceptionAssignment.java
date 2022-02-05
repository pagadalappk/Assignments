import java.util.Scanner;
public class ExceptionAssignment {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		int a=0,b=0,c=0;;
		
		System.out.println("Enter the value of dividend");
		a=sc.nextInt();
		System.out.println("Enter the value of divisor");
		b=sc.nextInt();
		
		try {
			c=a/b;
			
			System.out.println("Quotient is "+c);
			
		}
		catch(ArithmeticException ae) {
			
			System.out.println("Division by zero not possible");
			ae.printStackTrace();
			
		}

		
		
		

	}

}
