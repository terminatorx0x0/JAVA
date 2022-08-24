package MatricesProblem;

public class SumOfRowColumn {
public static void main(String[] args) {
	
	int a[][]= {{1,2,3},
			    {4,5,6},
			    {7,8,9}};
	int row=a.length;
	int col=a[0].length,i,j;
	for( i=0;i<row;i++)
	{
		int sumrow=0;
		for( j=0;j<col;j++)
		{
		sumrow=sumrow+a[i][j];
		}
		System.out.println("row "+ (i+1)+"="+sumrow);
	}
	for( i=0;i<row;i++)
	{
		int sumcol=0;
		for( j=0;j<col;j++)
		{
		sumcol=sumcol+a[j][i];
		}
		System.out.println("col "+(i+1)+"="+sumcol);
	}
}
}