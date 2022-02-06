import java.util.HashMap;
import java.util.Scanner;

public class GenericAssignmentQ2 {
	
	public static void main(String args[])
	{
		HashMap<Integer, Double> q3 = new HashMap<Integer, Double>();
		
		
		int n=0;
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter the number of key value pairs: ");
		n=sc.nextInt();
		
		for(int i=0;i<n;i++)
		{
			Integer key=0;
			Double value=0.0;
			System.out.println("Enter key "+ (i+1));
			key=sc.nextInt();
			System.out.println("Enter value "+ (i+1));
			value=sc.nextDouble();
			q3.put(key, value);
		}
		System.out.println("The size of map is: "+q3.size());
		
		System.out.println(q3);
		
		
	}
	
}
