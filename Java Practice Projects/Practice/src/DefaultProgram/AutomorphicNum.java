import java.util.Scanner;

public class AutomorphicNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=a*a;
        while(a>0)
        {
        	if(a%10==b%10)
        	{
        		a=a/10;
        		b=b/10;
        		System.out.println("yes");
        		break;
        	}
        	else {
        		System.out.println("no");
        		break;
        	}
        }
	}

}
