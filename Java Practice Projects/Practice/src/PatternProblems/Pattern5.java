package PatternProblems;

public class Pattern5 {

	public static void patternPrint(int n) {
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=(n*2)-1;j++)
			{
				if(j>=n+1-i&&j<=n-1+i)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
patternPrint(5);
	}

}
