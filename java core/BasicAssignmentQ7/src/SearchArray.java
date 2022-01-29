
public class SearchArray {
	public boolean searchArray(int[] arr,int toCheckValue)
	{
		int temp=0;
		for(int i=0;i<arr.length-1;i++)
		{
			
				for(int j=0;j<arr.length-i-1;j++)
				{
					if(arr[j+1]<arr[j])
					{
						temp=arr[j+1];
						arr[j+1]=arr[j];
						arr[j]=temp;
						
						
					}
				}
			
		}
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==toCheckValue)
			{
				return true;
			}
		}return false;
		
	}

}
