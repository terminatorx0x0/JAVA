import java.util.Scanner;

public class Pallindorme {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc=new Scanner(System.in);
       int a =sc.nextInt(),sum=0,r,temp=a;
       while(a>0)
       {
    	   r=a%10;
    	   sum=(sum*10)+r;
    	   a=a/10;
       }
       if(sum==temp)
       {
    	   System.out.println("Pallindrome");
       }
       else {
    	   System.out.println("not Pallindrome");
       }
	}

}
