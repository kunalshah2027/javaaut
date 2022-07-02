package p1;



public class StarAll {

	public static void main(String[] args) {
		
		
	    System.out.println("star1");
	    int n = 5;
	    for (int i = 1;i<=n;i++) 
	    {
	    	for (int j =1;j<=n-i;j++) 
	    	{
	    		System.out.print(" ");
	    	}
	    	for (int k =1;k<=2*i-1;k++) 
	    	{
	    		System.out.print("*");
	    	}
	    	System.out.println();
	    }
	    
	    System.out.println();
	    System.out.println("start2");
	    for (int i = 0;i<n;i++) 
	    {
	    	for (int j =0;j<=i;j++) 
	    	{
	    		System.out.print(" ");
	    	}
	    	for (int k =0;k<n-i;k++) 
	    	{
	    		System.out.print("* ");
	    	}	    	
	    	System.out.println();
	    }
	    
	    System.out.println();
	    int i, j, k;
	    int r = 7;
	    
	    for(i=r;i>=1;i--)
		{
		for(j=r;j>i;j--)
		{
		System.out.print(" ");
		}
		for(k=1;k<(i*2);k++)
		{
		System.out.print("*");
		}
		System.out.println();
		}
	    
	}

}
