import java.lang.Math;

public class ArmstrongNumBetweenRange 
{
	 public int[] armstrongNumbersInRange(int min , int max)
	 {
		 int count=0, arr[];
		 arr=new int[10];
		 for(int i=min;i<=max;i++)
		 {
			int temp=0, last=0, sum=0;
			temp=i;
			
			
			while(temp>0) {
				last=temp%10;
				sum+=Math.pow(last,3);
				temp=temp/10;
				}
			//if(i!=sum) {System.out.println(i);}
			if(i==sum) {arr[count]=i;count++;}
		 }
		 return arr;
	 }
}
