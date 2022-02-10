import java.util.Comparator;

public class nameComparator implements Comparator<Employee>
{
	public int compare(Employee s1, Employee s2)
	{
		return s1.Name.compareTo(s2.Name);
	}
}