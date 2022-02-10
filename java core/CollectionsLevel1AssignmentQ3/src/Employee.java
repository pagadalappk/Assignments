import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.Scanner;
public class Employee {
	
	int ID;
	String Name;
	String Department;
	int salary;
	
	
	public Employee(int ID, String Name, String Department, int salary)
	{
		this.ID=ID;
		this.Name=Name;
		this.Department=Department;
		this.salary=salary;
	}
	
	    public static void main(String[] args) {

		//TreeSet<Employee> tree= new TreeSet<Employee>();
		List<Employee> list1 = new ArrayList<Employee>();
	    Scanner sc = new Scanner(System.in);
		Employee e1 = new Employee(1,"Ram","cse",10);
		Employee e2 = new Employee(2,"Shyam","ece",100);
		Employee e3 = new Employee(3,"Meera","eee",120);
		Employee e4 = new Employee(4,"SID","mec",45);
		Employee e5 = new Employee(5,"Tom","civil",65);
		Employee e6 = new Employee(6,"Rick","bba",85);
		Employee e7 = new Employee(7,"Gill","mba",95);
		Employee e8 = new Employee(8,"Sai","ca",96);
		Employee e9 = new Employee(9,"Mohit","pharma",69);
		Employee e10 = new Employee(10,"Tharun","mbbs",58);
		
		list1.add(e1);
		list1.add(e2);
		list1.add(e3);
		list1.add(e4);
		list1.add(e5);
		list1.add(e6);
		list1.add(e7);
		list1.add(e8);
		list1.add(e9);
		list1.add(e10);
		//list1.add(e1);
		System.out.println("Enter 1 for to sort using ID");
		System.out.println("Enter 2 for to sort using Name ");
		System.out.println("Enter 3 for to sort using Department");
		System.out.println("Enter 4 for to sort using Salary");		
		int t=sc.nextInt();
		if(t==1)
		{
			
			Set<Employee> set=new TreeSet<Employee>(new idComparator());
			set.addAll(list1);
			for(Employee ele: set)
		    {
		        System.out.print(ele.ID+" "+ele.Name+" "+ele.Department+" "+ele.salary);
		        System.out.println();
		    }
		}
		else if(t==2)
		{
			TreeSet<Employee> set=new TreeSet<Employee>(new nameComparator());
			set.addAll(list1);
			for(Employee ele: set)
		    {
		        System.out.print(ele.ID+" "+ele.Name+" "+ele.Department+" "+ele.salary);
		        System.out.println();
		    }
			
		}
		else if(t==3)
		{
			TreeSet<Employee> set=new TreeSet<Employee>(new deptComparator());
			set.addAll(list1);
			for(Employee ele: set)
		    {
		        System.out.print(ele.ID+" "+ele.Name+" "+ele.Department+" "+ele.salary);
		        System.out.println();
		    }
		}
		else if(t==4)
		{
			TreeSet<Employee> set=new TreeSet<Employee>(new salaryComparator());
			set.addAll(list1);
			for(Employee ele: set)
		    {
		        System.out.print(ele.ID+" "+ele.Name+" "+ele.Department+" "+ele.salary);
		        System.out.println();
		    }
		}
		else
		{
			System.out.println("The inputted choice is invalid, please check and input a number among 1  2  3  4 ");
			
		}
		//set.addAll(list1);
	
		

	}

}
