package StringsProblem;

public class DivisionInNParts {
public static void main(String[] args) {
	String a="aasdcabbbccccbbbcccaaaaa";
	char[] s1=a.toCharArray();
	int n=3,temp=0;
	int m=s1.length/n;
	String[] b=new String[n];
	if(s1.length%n!=0)
	{
		System.out.println("String is not divisible");
	}
	else {
		for(int i=0;i<s1.length;i=i+m)
		{
			String part=a.substring(i, i+m);
			b[temp]=part;
			temp++;
		}
		for(int i=0;i<b.length;i++)
		{
			System.out.println(b[i]);
		}
	}
}
}
