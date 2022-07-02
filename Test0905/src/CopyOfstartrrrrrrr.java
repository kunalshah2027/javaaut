

public class CopyOfstartrrrrrrr {
	
	
	 public static void printTriagle(int n) 
	 {
	for (int i=n; i>0; i--) 
    { 

        // inner loop to handle number spaces 
        // values changing acc. to requirement 
        for (int j=n; j>n-1; j--) 
        { 
            // printing spaces 
            System.out.print(" "); 
            
        } 

        //  inner loop to handle number of columns 
        //  values changing acc. to outer loop 
        for (int j=i; j<0; j++ ) 
        { 
            // printing stars 
            System.out.print("* "); 
            System.out.println("printeds");
        } 

        // ending line after each row 
        System.out.println(); 
    } 
} 
  
// Driver Function 
public static void main(String args[]) 
{ 
    int n = 6; 
    printTriagle(n); 
} 
}

	
