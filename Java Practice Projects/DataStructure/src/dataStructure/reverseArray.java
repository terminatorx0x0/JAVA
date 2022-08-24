package dataStructure;

public class reverseArray {
  
	public static void main(String[] args) {
	int arr[];
	arr=new int[6];
	arr[0]=11;
	arr[1]=12;
	arr[2]=13;
	arr[3]=14;
	arr[4]=15;
	arr[5]=16;
	

	//reverse form
	for(int i=arr.length-1;i>=0;i--)
	{
		System.out.print(arr[i] +" ");
	}
}
}
