package p1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.TreeSet;

public class NormalPrgrm {

	public static void main(String[] args) throws IOException {
		
		
	    int arr[]={1, 2,3,4,5,6};
	    int len = arr.length;
	    for (int i = 0 ; i<=len-1;i++)
	    {
	    	if (arr[i]%2 == 0)
	    	{
	    		System.out.println("even");
	    		System.out.println(arr[i]);
	    	}
	    	else 
	    	{
	    		System.out.println("odd");
	    		System.out.println(arr[i]);
	    	}
	    	
	    }
	    System.out.println("++++++++++++++");
	    System.out.println();
	    
	    int fact =1;
	    //int n = 5;
	    int arr1[]={1,2,3,4,5,6};
	    int len1 = arr1.length;
	    for (int i = 0 ; i<=len1-1;i++)
	    {
	    	int n = arr[i];
	    	//System.out.println(n);	
	    	for (int j = 1;j<=n;j++)
		    {
		    	fact = fact*j;		    	
		    }	
	    	System.out.println(fact);
	    	fact =1;
	    }
	    
	    System.out.println("++++++++++++++");
	    int first =0;
	    int second =1;
	    int next ; 
	    int n = 5;
	   	
    	for (int j = 1;j<=n;j++)
	    {
    		System.out.println(first); 
    		next = first + second;
    		first = second;
    		second = next;
   	    }	
    	
    	System.out.println("Greater no on array");
	    int[] arr22 = {7,8,1,4,6,10};
	    int temp = arr22[0];	   	
    	for (int j = 0;j<=arr22.length-1;j++)
	    {
    		if (temp <arr22[j]) 
    		{
    			temp = arr22[j];
    		}
   	    }	    
    	System.out.println(temp);
    	
    	System.out.println("2 Max no in array");
	    int[] arr23 = {7,8,1,4,6,10};
	    int t1 = arr23[0];	
	    int t2 = arr23[1];
	    int tempo;
	    if (t2>t1)
	    {
	    	tempo = t1;
	    	t1 = t2;
	    	t2 = tempo;
	    }
    	for (int j = 2;j<=arr23.length-1;j++)
	    {
    		if (arr23[j]>t1) 
    		{
    			t2 = t1;
    			t1 = arr23[j];
    		}
    		else if (arr23[j]>t2 && arr23[j]!= t1)
    		{
    			t2 = arr23[j];
    		}
   	    }	    
    	System.out.println(t1);
    	System.out.println(t2);
    	
    	System.out.println("Common ele from array");
	    int[] a = {4,7,3,9,2};
	    int[] b = {3,2,12,5,9,40,43};	   
    	for (int j = 0;j<=a.length-1;j++)
	    {
    		for (int k = 0;k<=b.length-1;k++)
    		{
    			if (a[j]==b[k])
    			{
    				System.out.println(a[j]);
    			}
    		}
   	    }	   
    	
    	System.out.println("Sort array in asc/dsc order");
	    int[] k = {4,7,3,9,2};
	    int temp0 = 0;	   
    	for (int i = 0;i<=k.length-1;i++)
	    {
    		for (int j = i+1;j<=k.length-1;j++)
    		{
    			if (k[i]>k[j])
    			{
    				temp0 = k[i];
    				k[i] = k[j];
    				k[j] = temp0;
    			}
    		}
   	    }
    	for (int i = 0;i<=k.length-1;i++)
    	{
    		System.out.println(k[i]);
    	}
    	
    	System.out.println("Sort arraylist without using collection");
	    ArrayList <String> al = new ArrayList <String> ();
	    al.add("c");
	    al.add("b");
	    al.add("a");
	    al.add("e");
	    
	    TreeSet <String> ts = new TreeSet <String> ();
	    ts.addAll(al);
	    System.out.println(ts);
	    
	    System.out.println("Sort Integer arraylist without using collection");
	    ArrayList <Integer> al1 = new ArrayList <Integer> ();
	    al1.add(10);
	    al1.add(7);
	    al1.add(11);
	    al1.add(5);
	    Object [] intarr = al1.toArray();
	    Arrays.sort(intarr);
	    for (int i = 0;i<=intarr.length-1;i++)
	    {
	    	System.out.println(intarr[i]);
	    }
	    for (int i = intarr.length-1;i>=0;i--)
	    {
	    	System.out.println(intarr[i]);
	    }
	    System.out.println();
	    
	    System.out.println("TextRead");
	    File file= new File("F:\\Aut_Java\\Test0905\\src\\p1\\occ.txt");	
		BufferedReader br=new BufferedReader(new FileReader(file));
	    String line=br.readLine();
	    StringBuilder sb = new StringBuilder();
	    ArrayList<String> l=new ArrayList<String>();
	    System.out.println("Content of file is ");
		while (line != null)
		{  
			sb.append(line);//this function only append the data in line to stringbuilder and 
            //i have used stringbuilder as we have to give return type as string
			
			sb.append(" ");
			//System.out.print(line);
			l.add(line);	
	        line=br.readLine();	       
	    }
		 br.close();
		 System.out.println(sb.toString());
		 System.out.println(l);
	}
	    
}
