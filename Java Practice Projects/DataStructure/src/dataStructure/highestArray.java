package dataStructure;

public class highestArray {
 
	public static void main(String[] args) {
		
		int arr[];
		arr=new int[6];
		/*
		 * Scanner sc=new Scanner(System.in); int a=sc.nextInt(); for(int i=0;i<6;i++) {
		 * arr[i]=sc.nextInt(); }
		 */

		 arr[0]=11; arr[1]=22; arr[2]=13; arr[3]=18; arr[4]=15; arr[5]=16;
		
		int max=arr[0];
		int max2=0,max3=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>max)
			{
				max2=max;
				max=arr[i];
			}
			else if(arr[i]>max2)
			{
				max2=arr[i];
			}
			else if(arr[i]>max3)
			{
				max3=arr[i];
			}
		}
		//System.out.println("greatest"+max);
		//System.out.println("second greatest"+max2);
		System.out.println("third greatest="+max3);
	}
}
