
public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int i,a=-1,b=1,c;
        for(i=0;i<=10;i++)
        {
        	c=a+b;
        	a=b;
        	b=c;
        	System.out.println(c);
        }
	}

}
