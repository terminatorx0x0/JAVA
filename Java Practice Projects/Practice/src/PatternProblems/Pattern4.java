package PatternProblems;

public class Pattern4 {
 public static void patternPrint(int n) {
	for(int i=1;i<=n;i++)
	{
		for(int j=1;j<=n;j++)
		{
			if(j>=(n+1)-i)
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
   patternPrint(10);
}


}
