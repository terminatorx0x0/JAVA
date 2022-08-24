package StringsProblem;

public class AnagramChecker {
public static void main(String[] args) {
	String s1="Lookout";
	String s2="Outlook";
	s1=s1.toLowerCase();
	s2=s2.toLowerCase();
	char a[]=s1.toCharArray();
	char b[]=s2.toCharArray();
	int m=0;
	if(a.length==b.length)
	{
	for(int i=0;i<a.length;i++)
	{
		for(int j=0;j<b.length;j++)
		{
		if(a[i]==b[j])
		{
			m++;
		}
	    }
	}
	if(m==a.length)
	{
		System.out.println("Yes a Anagram");
	}
	else {
		System.out.println("Not A Anagram");
	}
	}
	else {
		System.out.println("Not a Anagram");
	}
}
}