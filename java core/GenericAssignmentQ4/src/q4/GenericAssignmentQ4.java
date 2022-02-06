package q4;
import java.util.Date;

import q4generic.generic;

public class GenericAssignmentQ4 {

	public static void main(String[] args) {
		
		generic<String, String> gen= new generic<String,String>("Good","Bye");
		
		System.out.println(gen.getKey()+" "+gen.getValue());
		
		generic<String,Date> gen1 = new generic<String, Date>("Hello",new Date());
		
		System.out.println(gen1.getKey()+" "+gen1.getValue());

	}

}
