package PatternProblems;

public class Pattern7 {
public static void patternPrint(int n) {
	for(int i=1;i<=n;i++)
	{
		for(int j=1;j<=2*n-1;j++)
		{
			if(j<=n+1-i||j>=n-1+i)
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
	patternPrint(5);
}
}
