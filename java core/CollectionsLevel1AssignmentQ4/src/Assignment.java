import java.time.LocalDate;
import java.util.LinkedList;
import java.util.List;
public class Assignment {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		
		List<LocalDate> date = new LinkedList<LocalDate>();
		
		date.add(LocalDate.of(1985,8,6));
		date.add(LocalDate.of(1920,12,11));
		date.add(LocalDate.of(2000,9,6));
		date.add(LocalDate.of(1960,1,24));
		date.add(LocalDate.of(1957,5,26));
		
		/*for(LocalDate d1:date)
		{
			int d=d1.getYear();
			System.out.print(d1);
			if( ((d % 4 == 0) && (d % 100 != 0)) || (d % 400 == 0))
				{System.out.print(", it is a Leap Year");
			     System.out.println();}
			else
				System.out.println(", it is not a leap year");
		}*/
		
		for(LocalDate d1:date) {
			if(d1.isLeapYear())
				System.out.println(d1+" , is a leap year");
			else
				System.out.println(d1+" , is not a leap year");
		}
		
		

	}

}
