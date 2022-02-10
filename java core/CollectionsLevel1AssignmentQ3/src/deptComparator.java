import java.util.Comparator;

class deptComparator implements Comparator<Employee>
{
	public int compare(Employee s1, Employee s2)
	{
		return s1.Department.compareTo(s2.Department);
	}
}