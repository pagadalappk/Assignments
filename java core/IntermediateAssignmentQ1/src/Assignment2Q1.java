
public class Assignment2Q1 {

	public static void main(String[] args) {
		SingleInheritanceCheck x=SingleInheritanceCheck.getInstance();
		SingleInheritanceCheck y=SingleInheritanceCheck.getInstance();
		SingleInheritanceCheck z=SingleInheritanceCheck.getInstance();
	
		System.out.println("Hashcode of x is " + x.hashCode());
		System.out.println("Hashcode of y is " + y.hashCode());
		System.out.println("Hashcode of z is " + z.hashCode());
		
		if(x == y && y == z)
		System.out.println("Three objects point to the same memory location in the heap");
		
		else
		System.out.println("Three objects are not pointing to the same memory location in the heap");
			
	}

}
