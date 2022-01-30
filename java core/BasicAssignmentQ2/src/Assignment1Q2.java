
public class Assignment1Q2 {
	public static void main (String [] args) {

	       int min = 100;int max = 999;
	       
	       ArmstrongNumBetweenRange arm= new ArmstrongNumBetweenRange();
	       
	       int store[]=arm.armstrongNumbersInRange( min , max);
	       for(int i=0;i<store.length;i++) {System.out.println(store[i]);}
	       
	       

	    }

}
