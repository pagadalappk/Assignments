import java.util.Comparator;

public class idComparator implements Comparator<Employee>{
	
	public int compare(Employee s1, Employee s2)
	{
		return s1.ID-(s2.ID);
	}

}
