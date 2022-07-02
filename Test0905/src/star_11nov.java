

public class star_11nov {
	
	
	 public static void printTriagle(int n) 
	 {
	for (int i=1; i<=n; i++) 
    { 

        // inner loop to handle number spaces 
        // values changing acc. to requirement 
        for (int j=1; j<=n-i; j++) 
        { 
            // printing spaces 
            System.out.print(" "); 
        } 

        //  inner loop to handle number of columns 
        //  values changing acc. to outer loop 
        for (int k=1; k<=2*i-1; k++ ) 
        { 
            // printing stars 
            System.out.print("*"); 
        } 

        // ending line after each row 
        System.out.println(); 
    } 
	for (int i=n-1;i>0;i--)
	{
		for (int j=1; j<=n-i; j++) 
        { 
            // printing spaces 
            System.out.print(" "); 
        } 

        //  inner loop to handle number of columns 
        //  values changing acc. to outer loop 
        for (int k=1; k<=2*i-1; k++ ) 
        { 
            // printing stars 
            System.out.print("*"); 
        } 
        System.out.println();    
	}
} 
  
// Driver Function 
public static void main(String args[]) 
{ 
    int n = 5; 
    printTriagle(n); 
} 
}

	
