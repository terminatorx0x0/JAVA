package MatricesProblem;

public class IdentityMatrix {
public static void main(String[] args) {
	int a[][]= {{1,0,0},{0,1,0},{0,0,1}};
	boolean flag=true;
	for(int i=0;i<3;i++)
	{
		for(int j=0;j<3;j++)
		{
		   if(i==j&&a[i][j]!=1)
		  {
			flag=false;
			break;
		  }
		   if(i!=j&&a[i][j]!=0)
		  {
			flag=false;
			break;
		  }
		}
	}
	if(flag)
	{
		System.out.println("yes");
	}
	else {
		System.out.println("no");
	}
}
}
