import java.util.Scanner;

public class GCD {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first num:");
		int a=sc.nextInt();
		System.out.println("Enter second num:");
		int b=sc.nextInt();
		int i,hcf =1;
		for(i=1;i<=b;i++)
		{
			if(a%i==0&&b%i==0)
			{
				hcf=i;
			}
		}
      System.out.println("HCF is:"+hcf);
	}

}
