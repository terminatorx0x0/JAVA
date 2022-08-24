package MatricesProblem;

public class SparseMAtrix {
public static void main(String[] args) {
	   int a[][]= {{4,0,0},{0,5,0},{0,0,6}};
	   int m=0,n=0;
	   int row=a.length;
	   int col=a[0].length;
	   if(row!=col)
	   {
		   System.out.println("Matrix should be square");
	   }
	   else
	 {
       for(int i=0;i<row;i++)
       {
    	   for(int j=0;j<col;j++) 
    	   {
    		   if(i==j&&a[i][j]!=0)
    		   {
    			  m++; 
    		   }
    		   else
    		   {
    			   n++;
    		   }
    	   }
       }
       if((row+col)/2<n)
       {
    	   System.out.println("yes it is a sparse matrix");
       }
       else {
    	   System.out.println("no It is not a sparse matrix");
       }
    }
}
}