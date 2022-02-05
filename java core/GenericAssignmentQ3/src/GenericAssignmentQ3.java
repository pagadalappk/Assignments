import java.util.Arrays;

public  class GenericAssignmentQ3 {
	
	public static <T> void swap(T  k[], int i, int j)
	{
		T t=k[i];
		k[i]=k[j];
		k[j]=t;
	}
	
	public static void main(String args[])
	{
		String k[]= {"Hello","Hi","Seeyou","Goodbye"};
		System.out.println("Array before swapping : "+ Arrays.toString(k));
		swap(k,1,2);
		System.out.println("Array after swapping elements 1 and 2 : "+ Arrays.toString(k));
	}
	
}
