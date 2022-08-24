package ArrayOperations;

public class Copy {

static	int copyArray(int arr1[],int arr2[]) {
	int i;
	for(i=0;i<arr1.length;i++)
	{
		arr2[i]=arr1[i];
	}
	return 0;
	
}
public static void main(String[] args) {
	int arr1[]= {15,16,18,19,17};
	int arr2[] =new int[5];
	int res=copyArray(arr1, arr2);
	for(int i=0;i<arr1.length;i++)
	{
		System.out.println(arr2[i]);
	}
}
}
