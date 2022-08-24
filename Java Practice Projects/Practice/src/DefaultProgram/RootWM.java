import java.util.Scanner;

public class RootWM {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	for(int i=2;i<=n;i++)
	{
		if(i*i==n)
		{
			System.out.println(i);
			break;
		}
	}
}
}
