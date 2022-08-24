import java.util.Scanner;

public class SunnyNum {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int x=n+1;
	double y=Math.sqrt(x);
	if(y==(int)y)
	{
		System.out.println("yes");
	}
	else {
		System.out.println("no");
	}
}
}
