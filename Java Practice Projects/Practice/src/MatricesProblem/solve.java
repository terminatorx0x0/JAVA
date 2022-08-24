package MatricesProblem;

public class solve {
	static long solving(int A,int B) {
	long count[][]=new long[A][A];

	for (int i=0;i<A;i++)
	count[i][0]=1;
	for (int j=0;j<A;j++)
	count[0][j]=1;
	for(int i=1;i<A;i++) 
	{
    for(int j=1;j<A;j++) 
       {
		count[i][j]=count [i-1][j]+count[i][j-1];
		count[(A-1)/2] [(A-1)/2]=0;
       }
     }
	return count[A-1] [A-1];
}
	public static void main(String[] args) {
		System.out.println(solving(5,0));
	}
}