
public class SingleInheritanceCheck {
	
	private static SingleInheritanceCheck Singleton= null;
	
	
	public String s;
	
	private SingleInheritanceCheck() {
		
		s="This is a string from the Singleton class";
	}
	
	public static SingleInheritanceCheck getInstance() {
		if(Singleton == null) {
			Singleton= new SingleInheritanceCheck();
		}
		return Singleton;
	}
}
