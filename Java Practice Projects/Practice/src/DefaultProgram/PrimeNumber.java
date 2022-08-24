import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number: ");
	int a=sc.nextInt();
    int i,count=0;
	for(i=1;i<=a/2;i++)
	{
		if(a%i==0)
		{
			count++;
		}
	}
	if(count==1)
	{
		System.out.println("prime num");
	}
	else {
		System.out.println("non prime");
	}
}
}
