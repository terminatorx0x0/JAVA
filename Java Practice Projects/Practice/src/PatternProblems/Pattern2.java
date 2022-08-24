package PatternProblems;

public class Pattern2 {

	public static void patternPrint(int n)
	{
		for(int i=n;i>=0;i--)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		patternPrint(5);
	}
}
