package ArrayOperations;

public class RightRotate {
	 public static void main(String[] args) {
			int arr[]= {1,25,15,16,18,19,147};
			int last=arr[arr.length-1];
	        for(int i=arr.length-1;i>0;i--)
	        {
	        	arr[i]=arr[i-1];
	        }
	       arr[0]=last;
	        for(int i=0;i<arr.length-1;i++)
	        {
	        	System.out.println(arr[i]);
	        }
	 }
}
