package PatternProblems;

public class Pattern1 {
	
	public static  void patternPrint(int n)
	{
		for(int i=0;i<n;i++)
        {
        	for(int j=0;j<=i;j++)
        	{
        		System.out.print("*");
        	}
        	System.out.println();
        }
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        patternPrint(5);
	}

}
