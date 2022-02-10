import java.util.Collections;
import java.util.Map.Entry;
import java.util.*;

enum Gender{Male,Female};

class Contact
{
	long phone;
	String name;
	String email;
	Gender g;
	
	public Contact(long phone, String name, String email, Gender g)
	{
		this.phone=phone;
		this.name=name;
		this.email=email;
		this.g=g;
	}
	
	public String toString()
	{return phone+" "+name+" "+email+" "+g;}
	
	public static void main(String args[])
	{
		TreeMap<Long,Contact> yes = new TreeMap<Long, Contact>(Collections.reverseOrder());
		
		Contact c1=new Contact(9700339111L,"Pranav","1@gmail.com",Gender.Male);
		Contact c2=new Contact(9700440822L,"Meher","2@gmail.com",Gender.Male);
		Contact c3=new Contact(9700140033L,"Madhavi","3@gmail.com",Gender.Female);
		Contact c4=new Contact(9610120247L,"Chandu","4@gmail.com",Gender.Female);
		
		yes.put(c1.phone, c1);
		yes.put(c2.phone, c2);
		yes.put(c3.phone, c3);
		yes.put(c4.phone, c4);
		
		Set<Entry<Long,Contact>> set = yes.entrySet();
		
		for(Entry<Long,Contact> e:set)
		{
			System.out.println(e.getKey());
			
			System.out.println(e.getValue());
		}
		
		
	}
}


