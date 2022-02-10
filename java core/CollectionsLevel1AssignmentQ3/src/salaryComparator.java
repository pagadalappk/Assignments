import java.util.Comparator;

public class salaryComparator implements Comparator<Employee>
{
	public int compare(Employee s1, Employee s2)
	{
		return s1.salary-(s2.salary);
	}
}