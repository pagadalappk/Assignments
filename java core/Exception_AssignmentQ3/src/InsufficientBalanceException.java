
public class InsufficientBalanceException extends RuntimeException {
	
	String str1;
	
	public InsufficientBalanceException()
	{
		super();
		
	}
	
	public InsufficientBalanceException(double n)
	{
		System.out.println("Insufficient balance, "+n);
	}
}
