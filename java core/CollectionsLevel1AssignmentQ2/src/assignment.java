import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.Scanner;

public class assignment {

	public static void main(String[] args) {

		
		Set<Integer> n = new HashSet<Integer>();
		ArrayList<Integer> a = new ArrayList<Integer>();
		
		Scanner sc = new Scanner(System.in);
		
		int k=0;
		System.out.println("Enter ten integers:");
		for(int i=0;i<10;i++)
		{
			k=sc.nextInt();
			a.add(k);
		}
		n.addAll(a);
		n.add(15);
		System.out.println(n);
	}

}
