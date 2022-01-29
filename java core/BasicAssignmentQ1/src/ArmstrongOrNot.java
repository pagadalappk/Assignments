import java.util.Scanner;
import java.lang.Math;
	

class ArmstrongOrNot {
	public boolean armstrongCheck(int num) {
		
		int temp, sum=0, last=0, digits=0;
		
		temp= num;
		
		while(temp>0) {
			
			temp=temp/10;
			digits++;
		}
		temp= num;
		
		while(temp>0) {
			
			last=temp%10;
			sum+= (Math.pow(last, digits));
			
			temp=temp/10;
		}
		
		if(num == sum) {
			return true;
		}
		else {
			return false;
		}
	}

}

/*public class Assignment1Q1 {
    public static void main(String[] args) {
    	int num;
    	Scanner sc = new Scanner(System.in);
    	System.out.println("Enter the number:");
    	num=sc.nextInt();
    	
    	ArmstrongOrNot arm= new ArmstrongOrNot();
    	
    	if(arm.armstrongCheck(num)) {
    		System.out.println("The inputted number is a Armstrong number");
    	}
    	else {
    		System.out.println("The inputted number is not a Armstrong number");
    	}
    }
}
*/