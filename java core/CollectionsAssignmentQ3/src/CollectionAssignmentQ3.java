import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CollectionAssignmentQ3 {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<String>();
		String str="A quick brown fox jumps over the lazy dog";
		String n[]=str.split(" ");
		list=Arrays.asList(n);
		
		for(String s:list)
			System.out.println(s);
		
			
	}

}
