import java.util.Scanner;
public class Assignment2Q2 {
	
	public int getSalary(int salary, int no){return 0;}
	

	public static void main(String[] args) {
		
		int salary = 10000, no_labour=0, no_manager=0;
		
		
	    
	    //public int totalEmployeesSalary(ArrayList<Integer> employeeSalaries){}
	    
	    Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no. of labour:");
        no_labour=sc.nextInt();
        System.out.println("Enter the no. of managers:");
        no_manager=sc.nextInt();
	    Manager man=new Manager();
	    Labour lab= new Labour();
	    System.out.println("Total salary of the employees is "+(man.getSalary(salary, no_manager)+lab.getSalary(salary, no_labour)));

	}

}
