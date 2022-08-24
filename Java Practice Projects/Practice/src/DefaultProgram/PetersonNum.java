import java.util.Scanner;

public class PetersonNum {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt(),fact=1,r,i,sum=0,temp=n;
		while(n>0)
		{
			if(n%10!=0)
			{
				r=n%10;
				n=n/10;
				for(i=1;i<=r;i++)
				{
					fact=fact*i;
				}
				sum=sum+fact;
				System.out.print(fact+"+");
				fact=1;
			}
			
		}
		System.out.println("="+sum);
		if(sum==temp)
		{
			System.out.println("yes");
		}
		else
		{
			System.out.println("no");
		}
	}

}
