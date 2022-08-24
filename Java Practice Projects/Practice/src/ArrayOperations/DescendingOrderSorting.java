package ArrayOperations;

public class DescendingOrderSorting {
public static void main(String[] args) {
	int arr[]= {45,15,26,9,5,0,369,48,32};
	int i,j,temp;
	for(i=0;i<arr.length;i++)
	{
		for(j=i+1;j<arr.length;j++)
		{
			if(arr[i]<arr[j])
				
			{
				temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
		}
	}
	for(i=0;i<=arr.length-1;i++)
	{
		System.out.println(arr[i]);
	}
}
}
