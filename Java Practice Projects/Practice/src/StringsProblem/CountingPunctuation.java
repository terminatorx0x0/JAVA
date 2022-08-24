package StringsProblem;

public class CountingPunctuation {

	public static void main(String[] args) {
	   String a="He said, 'The mailman loves you.' I heard it with my own ears.";
	   int count=0;
       for(int i=0;i<a.length();i++)
       {
    	   if(a.charAt(i)=='.'||a.charAt(i)=='?'||a.charAt(i)==',')
    	   {
    		   count++;
    	   }
       }
       System.out.println(count);
	}

}
