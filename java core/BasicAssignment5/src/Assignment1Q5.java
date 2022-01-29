import java.util.Scanner;

public class Assignment1Q5 
{
	public static void main(String args[]) 
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the CTC amount:");
		
		int CTC;
		
		CTC=sc.nextInt();
		TaxAmount tax = new TaxAmount();
		
		System.out.println("The tax amount levied would be "+tax.calculateTaxAmount(CTC));
		
		
	}
}
