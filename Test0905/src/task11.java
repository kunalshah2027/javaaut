

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
//import java.io.LineNumberReader;
import java.util.ArrayList;

public class task11 {//To return row number which contains given string
	
	
	public static int GetRowNumber(String var1, String var4) throws IOException 
	{
		File file= new File(var1);	
		BufferedReader br=new BufferedReader(new FileReader(file));
	    String line=br.readLine();
	    StringBuilder sb = new StringBuilder();
	    //LineNumberReader r=new LineNumberReader(br);
	    System.out.println("Content of file is ");	    
	    ArrayList<String> list=new ArrayList<String>();
	    //ArrayList<String> list1=new ArrayList<String>();
	    //list1.add("kunal");
	    
	    int u=1;
		while (line != null)
		{  
			sb.append(line);//this function only append the data in line to stringbuilder and 
                            //i have used stringbuilder as we have to give return type as string
			
			sb.append(" ");
			
			//System.out.print(line);
			list.add(line);//it stores each time value of line in list and 
			               //then move towards the readline function to read next line
			System.out.println(list);
			
			if (list.contains(var4))
			{
				System.out.println("True");
				System.out.println("Row number in which given string is present is "+u);
				br.close();
				return u;				
			}
			line=br.readLine();
			 u++;
	        }
		 
		 //System.out.println(list);
		 
		 br.close();
		return u;
		
		
			
	    }
			
	    public static void main(String[] args) throws IOException {
		String var1="D:\\Kunal\\myfiles\\task1\\t1.txt";
		String var4="kunal";
		int va9=GetRowNumber(var1,var4);//call to m9
		System.out.println("result of GetRowNumber of given string function m9 is "+va9);//return from m9
	}

}
