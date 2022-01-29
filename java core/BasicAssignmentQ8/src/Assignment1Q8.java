
public class Assignment1Q8 {
	
	public static void main(String args[]) 
	{
        int arr[] = {5,12,14,6,78,19,1,23,26,35,37,7,52,86,47};
        
        for(int i=0;i<=arr.length-1;i++)
        {
        	System.out.print(arr[i]+",");
        }
        
        BuubleSort bs= new BuubleSort();
        
        int store[]= bs.bubbleSort(arr);
        System.out.println(" ");
        System.out.println(" ");
        
        for(int i=0;i<store.length;i++) 
        {
        	System.out.print(store[i]+",");
        }
	}
}
