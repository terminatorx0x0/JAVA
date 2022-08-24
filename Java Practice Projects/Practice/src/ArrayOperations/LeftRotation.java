package ArrayOperations;

public class LeftRotation {
	public static void main(String[] args) {
		int arr[] = { 89,98,15, 16, 12, 26, 3,67 };
		int i, j,first = arr[0];
		for(i=0;i<arr.length-1;i++) 
		{
			arr[i]=arr[i+1];
		}
		arr[arr.length-1]=first; 
		for (i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}
