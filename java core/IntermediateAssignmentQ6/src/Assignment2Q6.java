
public class Assignment2Q6 {
	
	public static void main(String args[])
	{
		Persistence persist=new DatabasePersistence();
		
		Persistence persist1=new FilePersistence();
		
		System.out.println(persist.persist());
	}

}
