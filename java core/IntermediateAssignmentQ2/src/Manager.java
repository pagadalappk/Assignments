
public class Manager extends Assignment2Q2 {
	
	public int getSalary(int salary, int no) {
        int incentive = 5000;
        
        
        int total_salary=no*(salary+incentive);
        
        return total_salary;
    }

}
