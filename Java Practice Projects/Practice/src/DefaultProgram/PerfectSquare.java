import java.util.Scanner;

public class PerfectSquare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt(),m=1;
        for(int i=1;i<=a;i++)
        {
        	if(i*i==a)
        	{
        		m++;
        	}
        }
        if(m==2)
        {
        	System.out.println("perfect square");
        }
        else {
        	System.out.println("not perfect square");
        }
	}
}
