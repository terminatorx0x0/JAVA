package ArrayOperations;

public class LargestElement {
	 public static void main(String[] args) {
			int arr[]= {1,25,15,16,18,19,147};
			int max=arr[0];
	        for(int i=0;i<arr.length;i++)
	        {
	        	if(arr[i]>max)
	        	{
	        		max=arr[i];
	        	}
	        }
	        System.out.println(max);
		}

	}