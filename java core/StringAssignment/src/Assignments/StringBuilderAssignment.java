package Assignments;

public class StringBuilderAssignment {

	public static void main(String[] args) {

		StringBuilder sb= new StringBuilder("StringBuffer ");
		System.out.println(sb);
		
		sb.append("is a peer class of String ");
		
		System.out.println(sb);
		sb.append("that provides much of");
		System.out.println(sb);
		sb.append(" the functionality of strings");
		
		System.out.println(sb);
		System.out.println(" ");
		
		StringBuilder sb1=new StringBuilder("It is used to   at the specified index position");
		
		sb1.insert(15, "insert text");
		
		System.out.println(sb1);
		System.out.println(" ");
		
		StringBuilder sb2=new StringBuilder("This method returns the reversed object on which it was called");
		
		System.out.println(sb2.reverse());

	}

}
