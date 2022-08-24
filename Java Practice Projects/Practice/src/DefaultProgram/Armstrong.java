import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt(),sum=0,r,temp=n;
       //System.out.println(n);
       while(n>0)
       {
    	   r=n%10;
    	   sum=sum+(r*r*r);
    	   n=n/10;
       }
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
