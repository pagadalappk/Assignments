package Assignments;

public class StringAssignment {
	
	public static void main(String args[])
	{
		String str="Hello World";
		
		System.out.println("Length of string str is "+str.length());
		System.out.println(" ");
		
		String str1="Hello, ";
		String str2="How are you?";
		
		String str3=str1.concat(str2);
		System.out.println(str3);
		System.out.println(" ");
		
		String str4="Java String pool refers to collection of Strings which are stored in heap memory";
		
		String str5=str4.toUpperCase();
		System.out.println(str5);
		System.out.println(" ");
		
		String str6=str4.toLowerCase();
		System.out.println(str6);
		System.out.println(" ");
		
		
		
		String str7=str4.replace("a","$");
		System.out.println(str7);
		System.out.println(" ");
		
		if(str4.contains("collection"))
			System.out.println("The string contains the word collection");
		System.out.println(" ");
		
		String str8="java string pool refers to collection of Strings which are stored in heap memory";
		
		if(str8.equals(str4))
			System.out.println("Both string match each other");
		else
			System.out.println("Both strings do not match");
		
		if(str8.compareTo(str4)==0)
			System.out.println("Strings match");
			
		else
			System.out.println("Strings do not match ");
		
		
	}

}
