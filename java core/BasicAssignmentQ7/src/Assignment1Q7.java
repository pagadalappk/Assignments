
public class Assignment1Q7 {
	public static void main(String[] args) 
	{
        int arr[] = {5,12,14,6,78,19,1,23,26,35,37,7,52,86,47};
        int valueToCheck = 19;
        
        SearchArray sa= new SearchArray();
        
        if(sa.searchArray(arr, valueToCheck))
        {System.out.println("The value is present in the array");}
        else
        {System.out.println("The value is not present in the array");}
        
	}

}
