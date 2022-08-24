package ArrayOperations;

public class AscendingOrderSorting {
public static void main(String[] args) {
	int arr[]= {1,56,25,49,89,2,5,987};
	int i,j,temp=0;
	for(i=0;i<arr.length;i++)
	{
		for(j=i+1;j<arr.length;j++)
		{
		    if(arr[i]>arr[j])
		  {
			temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
		  }
		}
	}
	for(i=0;i<arr.length;i++)
	{
		System.out.println(arr[i]);
	}
}
}
