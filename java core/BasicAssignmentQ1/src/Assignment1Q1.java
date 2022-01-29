import java.util.Scanner;

public class Assignment1Q1 {
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
