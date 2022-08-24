package ArrayOperations;

public class DuplicateArrayRemoval {
public static void main(String[] args) {
	
	int arr[]= {15,18,13,13,15,18,21};
	int fr[]=new int[7];
	int i,j,visited=-1;
	for(i=0;i<arr.length;i++)
	{
		int m=1;
		for(j=i+1;j<arr.length;j++)
		{
			if(arr[i]==arr[j])
			{
				m++;
				fr[j]=visited;
			}
		}
		if(fr[i]!=visited)
		{
			fr[i]=m;
		}
	}
	for(i=0;i<fr.length;i++)
	{
		if(fr[i]!=visited)
		{
			System.out.println(arr[i]);
		}
	}
}
}