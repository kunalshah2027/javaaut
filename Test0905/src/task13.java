

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class task13 { 

	public static ArrayList<String>  ReplaceLineInTextFile(String var1, String var4,String var5) throws IOException 
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
			//it stores each time value of line in list and 
			               //then move towards the readline function to read next line
			
			if (line.contains(var4))
			{
				System.out.println("True");
				System.out.println("Row number in which given string is present is "+u);
				System.out.println("Row in which given string is present is "+line);
				
				list.add(line.replace(line, var5));
				line=br.readLine();
				u++;
				
			}	
			else
			{
			list.add(line);
			line=br.readLine();
			 u++;
	        }		 
		 //System.out.println(list);
		}
		    br.close();
			return list;		
	    }
			
	    public static void main(String[] args) throws IOException {
		String var1="D:\\Kunal\\myfiles\\task1\\t1.txt";
		String var4="kunal";
		String var5="jonty";
		ArrayList<String>va9=ReplaceLineInTextFile(var1,var4,var5);//call to m9
		System.out.println("result of ReplaceLineInTextFile of given string function m9 is "+va9);//return from m9
	}

}