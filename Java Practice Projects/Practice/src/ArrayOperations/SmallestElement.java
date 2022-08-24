package ArrayOperations;

public class SmallestElement {
	 public static void main(String[] args) {
			int arr[]= {1,25,15,16,18,19,147};
			int min=arr[0];
	        for(int i=0;i<arr.length;i++)
	        {
	        	if(arr[i]<min)
	        	{
	        		min=arr[i];
	        	}
	        }
	        System.out.println(min);
		}
}
