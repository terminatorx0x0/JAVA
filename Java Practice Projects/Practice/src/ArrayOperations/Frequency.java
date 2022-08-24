package ArrayOperations;

public class Frequency {
public static void main(String[] args) {
	int arr[]= {1,2,2,2,5,5,1,5,3,2,3};
	int frr[]= new int[arr.length];
	int i,j;
	int freq=-1;
	for(i=0;i<arr.length;i++)
	{
		int m=1;
		for(j=i+1;j<arr.length;j++)
		{
			if(arr[i]==arr[j])
			{
				m++;
				frr[j]=freq;
			}
		}	
		if(frr[i]!=freq)
		{
			frr[i]=m;
		}
	}
	for(i=0;i<frr.length;i++)
	{
		if(frr[i]!=freq) {
	System.out.println(arr[i]+"="+frr[i]);
}
}
}
}
