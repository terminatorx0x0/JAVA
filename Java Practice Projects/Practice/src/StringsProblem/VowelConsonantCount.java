package StringsProblem;

public class VowelConsonantCount {
    public static void main(String[] args) {
    	String s = "To count the number of characters present in the string, we will iterate through "
    			+ "the string and count the characters. "
    			+ "In above example, total numbers of characters present in the string are";
    	int m=0,n=0;
    	for(int i=0;i<s.length();i++)
    	{
    		if(s.charAt(i)!=' ')
    		{
    		if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u'||
    		   s.charAt(i)=='A'||s.charAt(i)=='E'||s.charAt(i)=='I'||s.charAt(i)=='O'||s.charAt(i)=='U')
    		{
    			m++;
    		}
    		else {
    			n++;
    		}
    		}
    	}
    	System.out.println("Consonant="+n);
    	System.out.println("Vowel="+m);
}
}
