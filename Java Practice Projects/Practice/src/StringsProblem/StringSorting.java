package StringsProblem;

public class StringSorting {
public static void main(String[] args) {
	String s="geeksforgeeks";
	char arr[]=s.toCharArray();
	char temp;
	for(int i=0;i<arr.length;i++)
	{
		for(int j=0;j<arr.length;j++)
		{
		  if(arr[i]<arr[j])
		 {
			temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
		 }
		}
	}
	System.out.println(arr);
}
}
