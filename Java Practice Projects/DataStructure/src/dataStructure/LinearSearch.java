package dataStructure;

public class LinearSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int arr[]= {10,11,12,13,14,15};
        int findElement=15;
        int elementAtIndex=findIndexByLinearSearch(arr, findElement);
        System.out.println(elementAtIndex);
	}
	
static int	findIndexByLinearSearch(int arr[],int findElement) {
	int elementAtIndex=-1;
	for(int i=0;i<arr.length;i++)
    {
    	if(findElement==arr[i])
    	{
    		elementAtIndex=i;
    		break;
    	}
    	
    }
	return elementAtIndex ;
	
}
}
