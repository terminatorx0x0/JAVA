import java.util.Scanner;

public class MaximumNum {
	public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter the three number:");
     int a=sc.nextInt();
     int b=sc.nextInt();
     int c=sc.nextInt();
     if(a>b)
     {
    	 if(a>c) 
    	 {
    		 System.out.println(a);
    	 }
    	 else
    	 {
    		 System.out.println(c);
    	 }
     }
     else
     {
    	 System.out.println(b);
     }
	}

}
