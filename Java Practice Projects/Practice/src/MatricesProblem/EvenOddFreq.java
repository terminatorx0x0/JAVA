package MatricesProblem;

public class EvenOddFreq {
public static void main(String[] args) {
	int a[][]= {{1,2,3},{4,5,6},{7,8,9}};
	int m=0,n=0;
	for(int i=0;i<3;i++)
	{
		for(int j=0;j<3;j++)
		{
			if(a[i][j]%2==0)
			{
				m++;
			}
			else {
				n++;
			}
		}
	}
	System.out.println("even freq="+m);
	System.out.println("odd freq="+n);
}
}
