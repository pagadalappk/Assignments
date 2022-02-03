package Assignments;

public class StringBufferAssignment {
	
	public static void main(String args[])
	{
		StringBuffer sb= new StringBuffer("StringBuffer ");
		System.out.println(sb);
		
		sb.append("is a peer class of String ");
		
		System.out.println(sb);
		sb.append("that provides much of");
		System.out.println(sb);
		sb.append(" the functionality of strings");
		
		System.out.println(sb);
		System.out.println(" ");
		
		StringBuffer sb1=new StringBuffer("It is used to   at the specified index position");
		
		sb1.insert(15, "insert text");
		
		System.out.println(sb1);
		System.out.println(" ");
		
		StringBuffer sb2=new StringBuffer("This method returns the reversed object on which it was called");
		
		System.out.println(sb2.reverse());
	}
	
}
