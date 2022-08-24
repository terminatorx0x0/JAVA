import java.util.Scanner;

public class NthPrimeNum {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt(), i=2,p=1,count;
        while(p<=n)
        {
        	count=0;
        	for(int j=2;j<=i/2;j++)
        	{
        	if(i%j==0)
        	{
        		count++;
        		break;
        	}
        	}
        if(count==0)
        {
        	System.out.println(i);
        	p++;
        	break;
        }
        i++;
        }
	}
	}