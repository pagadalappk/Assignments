
public class Labour extends Assignment2Q2{
	
	public int getSalary(int salary, int no) {
        int overtime = 500;
        int total_salary=no*(overtime+salary);
        return total_salary;
        
        
    }

}
