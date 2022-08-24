package dataStructure;

public class updatedArray {

	public static void main(String[] args) {
		
		int arr[];
		arr=new int[6];
		arr[0]=11;
		arr[1]=12;
		arr[2]=13;
		arr[3]=14;
		arr[4]=15;
		arr[5]=16;
		
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=arr[i]+2;
			System.out.print(arr[i] +" ");
		}
	}
}
