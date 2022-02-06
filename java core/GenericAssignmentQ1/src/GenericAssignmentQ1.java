import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
//import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;



public class GenericAssignmentQ1
{
	public static void main(String args[])
	{
		
		Scanner sc= new Scanner(System.in);
		Map<String, ArrayList<String>> multiValueMap = new HashMap<String, ArrayList<String>>();
		System.out.println("Enter the number of Employees: ");
		int n=sc.nextInt();
		sc.nextLine();
		for(int i=0;i<n;i++)
		{																		
			System.out.println("Enter the employee name: ");
			String name=sc.nextLine();
			System.out.println("Enter employee id: ");
			multiValueMap.put(name, new ArrayList<String>());
			String id=sc.nextLine();
			multiValueMap.get(name).add(id);
			System.out.println("Enter salary of the employee: ");
			String salary=sc.nextLine();
			multiValueMap.get(name).add(salary);
			System.out.println("Enter department of the employee: ");
			String dept=sc.nextLine();
			multiValueMap.get(name).add(dept);
		}
		System.out.println(multiValueMap);
		
	}
}