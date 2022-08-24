package dataStructure;

public class BinarySearchIteration {

	static int findIndexByBinarySearch(int arr[],int findElement) {
		int elementAtIndex=-1;
		int l=0,r=arr.length-1;
		while(l<=r)
		{
			int m=l+(r-l)/2;
			if(arr[m]==findElement)
			{
				return m;
			}
			if(arr[m]<findElement)
			{
				l=m+1;
			}
			else
			{
				r=m-1;
			}
		}
		return elementAtIndex;
		
	}
	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5};
		int findElement=5;
		int elementAtIndex=findIndexByBinarySearch(arr, findElement);
		System.out.println(elementAtIndex);
	}
}
