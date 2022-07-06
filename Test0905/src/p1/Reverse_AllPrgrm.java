package p1;

import java.util.ArrayList;
import java.util.Arrays;

public class Reverse_AllPrgrm {

	public static void main(String[] args) {
		
		String s = "I am kunal";
		//I ma lanuak
	    String[] s1 = s.split(" ");
	    char [] c = s.toCharArray();	    
	    String s3 = "";
	    //System.out.print(s1);
	    System.out.println("Given String is "+ s );
	    System.out.println("P1: Reverse the entire String and its words also");
	    System.out.println("Expected String is lanuk ma I");
	    for (int k = s.length()-1 ; k>=0;k--)
	    {
	    	System.out.print(s.charAt(k));
	    	s3  = s3 + s.charAt(k);
	    }	    
	    System.out.println();	    
	    System.out.println("Storing the Reversed entire String and its words also in s3");
	    System.out.println(s3);	    
	    System.out.println();
	    System.out.println("P2: Using Char array Reversed entire String and its words also");
	    System.out.println("Expected String is lanuk ma I");
	    for (int j =c.length-1 ; j>=0;j--)
	    {
	    	System.out.print(c[j]);
	    	
	    } 
	    System.out.println();	   
	    System.out.println();
	    System.out.println("P3: Reversed entire String but not words");
	    System.out.println("Expected String is kunal am I");
	    for (int i = s1.length-1 ; i>=0;i--)
	    {
	    	System.out.print(s1[i]);    	
	    	
	    }
	    System.out.println();	    
	    System.out.println();
	    System.out.println("P4: Do not Reverse entire String but Reverse words at same place");
	    System.out.println("Expected String is I ma lanuk");
	    String[] s2 = s3.split(" "); 
	    for (int e = s2.length-1 ; e>=0;e--)
	    {
	    	System.out.print(s2[e]+" ");    	
	    	
	    }
	    System.out.println();	    
	    System.out.println();
	    char [] c2 = s.toCharArray();
	    char [] c3 = new char [s.length()];
	    System.out.println("P5: Reverse the entire String and its words also with keeping space intact");
	    System.out.println("Expected String is l an ukmaI");
	    for (int f =0 ; f<=c2.length-1 ; f++)
	    {
	    	if (c2[f] == ' ')
	    	{
	    		c3[f] = ' ';
	    	}
	    }	    
	    int j = c3.length - 1;
	    for (int i = 0; i < c2.length; i++) {
	    	 
            // Ignore spaces in input string
            if (c2[i] != ' ') {
 
                // ignore spaces in result.
                if (c3[j] == ' ') {
                    j--;
                }
                c3[j] = c2[i];
                j--;
            }
        }
	    System.out.println("Given String is "+ s );
	    System.out.println(String.valueOf(c3));  
	    System.out.println();
	    
	    int arr[]={ 1 , 2 , 3 , 4 , 5 , 6 , 7 , 8  };
	    int arr1[];
	    System.out.println("Given Array is "+ Arrays.toString(arr));
	    System.out.println("P6: Reverse elements of array");
	    System.out.println("Expected array is 8 7 6 5 4 3 2 1 ");
	    for (int g = arr.length-1 ; g>=0;g--)
	    {
	    	System.out.print(arr[g]+" ");
	    
	    	
	    }
	    System.out.println();
	    System.out.println();
	    
	    
	    String k = "python is easy";
	    System.out.println(k.length());
	    String ups = k.toLowerCase();	    
	    char [] ch = ups.toCharArray() ;
	    System.out.println(ch.length);
	    System.out.println("P7: Replace Alternate Character to Uppercase");
	    System.out.println("Expected PyThOn iS EaSy");
	    for (int i = 0; i<=ups.length()-1; i= i+2) 
	    {
	    	ch[i] = Character.toUpperCase(ch[i]);
	    }
	    System.out.println(new String(ch));
	    System.out.println();
	    
	    
	    System.out.println("P8: Replace First Character to Uppercase");
	    System.out.println("Expected Python Is Easy");
	    String [] part = k.split(" ");
	    System.out.println(part.length);
	    for (int i = 0; i<=part.length-1; i++) 
	    {
	    	char [] ch1 = part[i].toCharArray();
	    	for (int j1 = 0;j1<=ch1.length-1;j1++) 
	    	{
	    		ch1[0] = Character.toUpperCase(ch1[0]);
	    		System.out.print(ch1[j1]);
	    	}
	    	System.out.print(" ");
	    }
	    System.out.println();
	    System.out.println();
	    
	    System.out.println("P9: Replace First Character to Uppercase For single word string");
	    System.out.println("Expected Python ");
	    String k1 = "python";
	    char [] ch3 = k1.toCharArray();
	    for (int j1 = 0;j1<=ch3.length-1;j1++) 
    	{
    		ch3[0] = Character.toUpperCase(ch3[0]);
    		System.out.print(ch3[j1]);
    	}
	    System.out.print(" ");
	    System.out.println();
	    System.out.println();
	    
	    System.out.println("P10: remove space ,reverse str and print odd position char");
	    System.out.println("Expected lnkai");
	    String k11 = "I am kunal";
	    String s11 = k11.replaceAll(" ", "");
	    String s12 ="";
	    for (int h=s11.length()-1;h>=0;h--) 
	    {
	    	s12 = s12 + s11.charAt(h);
	    }
	    System.out.println(s12);
	    char[] chh = s12.toCharArray();
	    for (int l = 0; l<=chh.length-1; l = l+2)
	    {
	    	System.out.print(chh[l]);
	    }	    
	    System.out.println();
	    System.out.println();
	    
	    System.out.println("P11: Check how many char nd letters are in string");
	    System.out.println("Expected 5 and 4");
	    String jjj = "kunal2027";
	    int c1 = 0;
	    int c21 = 0;
	    char [] ch9 = jjj.toCharArray();
	    for (int y = 0; y<=ch9.length-1; y++)
	    {
	    	if ((ch9[y] >='a' && ch9[y]<='z') || (ch9[y] >='a' && ch9[y]<='z'))
	    	{
	    		c1++;
	    	}
	    	else if (Character.isDigit(jjj.charAt(y)))
	    	{
	    		c21++;
	    	}
	    }
	    System.out.println(c1 );
	    System.out.println(c21 );
	    System.out.println();
	    System.out.println();
	    
	    System.out.println("P12: swap two strings");
	    System.out.println("Expected shah kunal");
	    String a = "kunal";
	    String b = "shah";
	    System.out.println(a);
	    System.out.println(b);
	    a = a+b;
	    b = a.substring(0, a.length()-b.length());
	    a = a.substring(b.length());
	    System.out.println("++++++++");
	    System.out.println(a);
	    System.out.println(b);
	    System.out.println();
	    System.out.println();
	    
	    System.out.println("P13: Find no of vowels in string");
	    System.out.println("Expected --> 5");
	    String ff = "life is good";
	    char[] ch10 = ff.toCharArray();
	    int cnvowel = 0;
	    for (char c10 : ch10)
	    {
	    	switch(c10)
	    	{
	    	case 'a':
	    	case 'e':	
	    	case 'i':
	    	case 'o':
	    	case 'u':
	    		cnvowel++;
	    		break;
	    		default:
	    	}   	
	    	
	    }
	    System.out.println(cnvowel);
	    
	    
	    
	}

}
