package dataStructure;

import java.lang.reflect.Array;

public class maintainArray {

	public static void main(String [] arg) {
		int arr[];
		arr = new int[6];
		arr[0]=9;
		arr[1]=10;
		arr[2]=11;
		arr[3]=12;
		arr[4]=13;
		arr[5]=14;
		
		//System.out.println(arr[5]);
		
		for(int i=0;i<Array.getLength(arr);i++)
		{
			System.out.println(arr[i]);
		}
		for(int i=0;i<Array.getLength(arr);i++)
		{
		   arr[i]=i;
		}
		for(int i=0;i<Array.getLength(arr);i++)
		{
			System.out.println(arr[i]);
		}
	}
}
