import java.util.Scanner;
public class Assignment1Q4 
{
	public static void main(String[] args) 
	{
		ResultDeclaration rd = new ResultDeclaration();
		
		Scanner sc = new Scanner(System.in);
		
		double subject1Marks, subject2Marks, subject3Marks;
		
		System.out.println("Enter the marks scored in first subject:");
		subject1Marks=sc.nextDouble();
		System.out.println("Enter the marks scored in second subject:");
		subject2Marks=sc.nextDouble();
		System.out.println("Enter the marks scored in third subject:");
		subject3Marks=sc.nextDouble();
		
		System.out.println(rd.declareResults(subject1Marks, subject2Marks, subject3Marks));
		
		
	}
}
