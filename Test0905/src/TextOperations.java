


import java.io.BufferedReader;
//import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
//import java.io.FileWriter;
import java.io.IOException;
import java.io.LineNumberReader;
import java.io.PrintWriter;
import java.util.ArrayList;
//import java.util.Scanner;
//import java.nio.file.Files;
//import java.nio.file.Path;
//import java.nio.file.Paths;
//import java.util.ArrayList;




public class TextOperations {//To check whether the given file is present or not
///////////// m1
	public static  boolean FileExists(String var1)
	{
	   File file=new File(var1);	
	   if (file.exists())
	   {
		 //BufferedReader bufferedReader=new BufferedReader(new FileReader("D:\\Kunal\\myfiles\\task1\\t1.txt"));
	   	 System.out.println("File is present");
	   	return true;
	   }
	  	else 
	   {
		   System.out.println("File is not present");
		   return false;
	   }
	}	
	
//////////////  m2
	public static  boolean CreateTextFile(String var1) throws IOException
	{
	   	File file=new File(var1);
	   if ( ! file.exists())
	   {
		   
		   	file.createNewFile();
		    System.out.println("As file was not present new File is created with required name");
	   	    return true;
	   }
	  	else 
	   {
		   System.out.println("File is already present");
		   return false;
	   }
	}
/////////////// m3
	/*public static boolean CreateTextFile(String var1, String var2) throws IOException
	{*
		File file= new File(var1);
		
		if (! file.exists())
		{
			file.createNewFile();
			System.out.println("new File is created successfully at " + var1);
			FileWriter fw=new FileWriter(file.getAbsoluteFile());//use of it?
			BufferedWriter bw=new BufferedWriter(fw);
			bw.write(var2);
			bw.close();
			System.out.println(var2+ " is added to the file successfully");
			return true;
		}
		else 
		{
			System.out.println("File is already present");
			FileWriter fw=new FileWriter(file.getAbsoluteFile());//use of it?
			BufferedWriter bw=new BufferedWriter(fw);
			bw.write(var2);
			bw.close();
			System.out.println("but content "+var2+ " is added to the file successfully");
			return false;
		}
		
	}*/
//////////// m4
	/*public static boolean AppendTextFile(String var1, String var3) throws IOException
	{
		File file= new File(var1);
		if (file.exists())
		{
			@SuppressWarnings("resource")
			BufferedReader bufferedReader=new BufferedReader(new FileReader(file));
			String data=bufferedReader.readLine();
			if(data!= null)
			{
				System.out.println("File has data " +data+ " in it");
				FileWriter fw=new FileWriter(file.getAbsoluteFile(),true);//use of it?//u cn write new FileWriter(file.getAbsoluteFile(),true) if u want to keep 1st data also in text file
				BufferedWriter bw=new BufferedWriter(fw);
				bw.write(var3);
				bw.close();
				System.out.println(var3+ " is appended over old data successfully in given file ");
				return true;
			}
		}
		return false;
	}*/
/////////////// m5 read all text file 
	public static String ReadAllTextFile(String var1) throws IOException 
	{
		File file= new File(var1);	
		BufferedReader br=new BufferedReader(new FileReader(file));
	    String line=br.readLine();
	    StringBuilder sb = new StringBuilder();
	    System.out.println("Content of file is ");
		while (line != null)
		{  
			sb.append(line);//this function only append the data in line to stringbuilder and 
            //i have used stringbuilder as we have to give return type as string
			
			sb.append(" ");
			System.out.print(line);
			
	        line=br.readLine();	       
	        }
		 br.close();
		return sb.toString();
			
	    }
///////////////////////// m6 find total rows present in the given text file
	public static int GetTotalRowCount(String var1) throws IOException
	{
		File file=new File(var1);
		BufferedReader br=new BufferedReader(new FileReader(file));
		LineNumberReader r=new LineNumberReader(br);
		int c=0;
		while (r.readLine() !=null)
		{
			c++;
		}
		r.close();
		System.out.println("Total numbers of rows are "+c);///Add 1 because line index starts at 0
		return c;			
	}
/////////////////////////	m7 read all text file line by line and return it in array
	public static ArrayList<String> ReadAllTextFileLineByLine(String var1) throws IOException
	{
		{
			File file= new File(var1);	
			BufferedReader br=new BufferedReader(new FileReader(file));
		    String line=br.readLine();
		    StringBuilder sb = new StringBuilder();
		    System.out.println("Content of file is ");
		    ArrayList<String> list=new ArrayList<String>();
			while (line != null)
			{  
				sb.append(line);//this function only append the data in line to stringbuilder and 
	                            //i have used stringbuilder as we have to give return type as string
				
				sb.append(" ");
				
				System.out.print(line);
				list.add(line);//it stores each time value of line in list and 
				               //then move towards the readline function to read next line
				
		        line=br.readLine();	       
		        }
			 br.close();
			return list;
				
		    }
}
	      /*while (line != null)
	        {
	            sb.append(line);
	            //sb.append("\n");
	            line = br.readLine();
	            sb.toString();
	            list.add(sb.toString());
	            
	        }*/
	  
////////////////////////////////m8 read row value of given row number
	public static String GetRowValue (String var1,int rn) throws IOException
	{
		File file= new File(var1);	
		BufferedReader br=new BufferedReader(new FileReader(file));
		for(int i = 0; i <rn-1; ++i)//(rn-1) is for skipping the all line before 3
	    br.readLine();
	    String lineIWant = br.readLine();
	    
	    br.close();
	    return lineIWant;		
	}
//////////////////m9 give row number which contains given string
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
			
			if (line.contains(var4))
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
 //////////////////////m10 to return row which contains given string
	public static String GetRowValue (String var1, String var4) throws IOException 
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
			
			if (line.contains(var4))
			{
				System.out.println("True");
				System.out.println("Row number in which given string is present is "+u);
				System.out.println("Row in which given string is present is "+line);
				
				br.close();
				return line;				
			} 
			line=br.readLine();
			  u++;
	        }
		 
		 //System.out.println(list);
		 
		 br.close();
		return line;
	}	
////////////////m11 to delete file if present
	/*public static boolean DeleteTextFile(String var1) throws IOException
	{
		File file=new File(var1);
		Path kunal=Paths.get(var1);
		if (file.exists())
		{
			Files.delete(kunal);
			System.out.println("File is deleted successfully");
			return true;
		}
		else
		{
			return false;
		}
		}*/
/////////////////////m12 to modify/replace row which contains given string 
	public static ArrayList<String>  ReplaceLineInTextFile(String var1, String var4,String var5) throws IOException 
	{
		File file= new File(var1);	
		BufferedReader br=new BufferedReader(new FileReader(file));
	    String line=br.readLine();
	    StringBuilder sb = new StringBuilder();
	    System.out.println("Content of file is ");	    
	    ArrayList<String> list=new ArrayList<String>();
	    int u=1;
		while (line != null)
		{  
			sb.append(line);//this function only append the data in line to stringbuilder and 
                            //i have used stringbuilder as we have to give return type as string
			
			sb.append(" ");//System.out.print(line); //it stores each time value of line in list and 
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
				}
		    br.close();
			return list;		
	    }
//////////////////////////// m13 to modify /replace row of given row number
	public static ArrayList<String>  ReplaceLineInTextFile(String var1, int rn1,String var5) throws IOException 
	{
		File file= new File(var1);	
		BufferedReader br=new BufferedReader(new FileReader(file));
	    String line=br.readLine();
	    StringBuilder sb = new StringBuilder();
	    System.out.println("Content of file is ");	    
	    ArrayList<String> list=new ArrayList<String>();
	    int u=1;
		while (line != null)
		{  
			sb.append(line);//this function only append the data in line to stringbuilder and 
                            //i have used stringbuilder as we have to give return type as string
			
			sb.append(" ");//System.out.print(line); //it stores each time value of line in list and 
			               //then move towards the readline function to read next line
			if (u==rn1)
			{
				System.out.println("True");
				System.out.println("Row number which we have to replace with our string is "+rn1);
				System.out.println("old row present at "+rn1+" is "+line);
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
				}
		    br.close();
			return list;		
	    }
//////////////////////////////////////////////// m14 to delete row of given row number 
	public static ArrayList<String> DeleteLineInTextFile(String var1, int rn2) throws IOException 
	{
		File file= new File(var1);	
		BufferedReader br=new BufferedReader(new FileReader(file));
	    String line=br.readLine();
	    StringBuilder sb = new StringBuilder();
	    System.out.println("Content of file is ");	    
	    ArrayList<String> list=new ArrayList<String>();
	    int u=1;
	    
		while (line != null)
		{  
			sb.append(line);//this function only append the data in line to stringbuilder and 
                            //i have used stringbuilder as we have to give return type as string
			
			sb.append(" ");//System.out.print(line); //it stores each time value of line in list and 
			               //then move towards the readline function to read next line
			if (u==rn2)
			{
				System.out.println("True");
				System.out.println(" Row number which we have to delete is "+rn2);
				System.out.println("old row present at "+rn2+" is "+line);
				PrintWriter pw = new PrintWriter(new FileWriter(line));
				pw.println(line);
				pw.flush();
				pw.close();
				line=br.readLine();
				u++;
			}	
			else
			{
			list.add(line);
			line=br.readLine();
			 u++;
	        }		 
				}
		    br.close();
			return list;		
	    }
////////////////////////// m15 delete row which contains given string in textfile
	public static ArrayList<String> DeleteLineInTextFile(String var1, String var4) throws IOException 
	{
		File file= new File(var1);	
		BufferedReader br=new BufferedReader(new FileReader(file));
	    String line=br.readLine();
	    StringBuilder sb = new StringBuilder();
	    System.out.println("Content of file is ");	    
	    ArrayList<String> list=new ArrayList<String>();
	    int u=1;
	    
		while (line != null)
		{  
			sb.append(line);//this function only append the data in line to stringbuilder and 
                            //i have used stringbuilder as we have to give return type as string
			
			sb.append(" ");//System.out.print(line); //it stores each time value of line in list and 
			               //then move towards the readline function to read next line
			if (line.contains(var4))
			{
				System.out.println("True");
				System.out.println("Row in which given string is present is "+u);
				System.out.println("row value of row number "+u+ "is "+line);
				PrintWriter pw = new PrintWriter(new FileWriter(line));
				pw.println(line);
				pw.flush();
				pw.close();
				line=br.readLine();
				u++;
			}	
			else
			{
			list.add(line);
			line=br.readLine();
			 u++;
	        }		 
				}
		    br.close();
			return list;		
	    }/*
///////////////////////////////// m17 Remove empty lines from textfile
	public static void RemoveEmptyLines(String var1) throws IOException 
	{
		File file= new File(var1);	
		BufferedReader br=new BufferedReader(new FileReader(file));
		FileWriter fw = new FileWriter(file); 
		String line;

		while((line = br.readLine()) != null)
		{ 
		    line = line.trim(); // remove leading and trailing whitespace
		    if (!line.equals("")) // don't write out blank lines
		    {
		        fw.write(line, 0, line.length());
		    }
		} 
		br.close();
		fw.close();
		
	}*/
////////////////////////////////// m16
	public static void OverWriteTextFile (String var1,ArrayList<String> var6) throws IOException 
	{
		File file= new File(var1);	
		BufferedReader br=new BufferedReader(new FileReader(file));
		FileWriter fw = new FileWriter(file); 
		String line;

		while((line = br.readLine()) != null)
		{ 
		    line = line.trim(); // remove leading and trailing whitespace
		    if (!line.equals("")) // don't write out blank lines
		    {
		        fw.write(line, 0, line.length());
		    }
		} 
		br.close();
		fw.close();
		
	}
		public static void main(String[] args) throws IOException{
		//boolean file =FileExists(new File("D:\\Kunal\\myfiles\\task1\\t1.txt"));
		String var1="D:\\Kunal\\myfiles\\task1\\t1.txt";
		boolean va1=FileExists(var1);//call to 1
		System.out.println("result of fileexist function m1 is "+va1);//return from m1
		boolean va2=CreateTextFile(var1);//call to m2
		System.out.println("result of createfile function m2 is "+va2);//return from m2
		//String var2="I am Learning Autoomation Testing";//content given by user
		//boolean va3=CreateTextFile(var1,var2);//call to m3
		//System.out.println("result of createfile with content m3 function is " +va3);//return from m3
		//String var3="Selinium Testing infbhndhbn seghsdbhseng vvuhsehgshfbvjszbbdfovbzs aeugbuyeguyze gaeurghsehgegnse eihgehg egsoyehg ehhgheghsegyushergiuehrgiue  sieurhgiusegh";//Data to append to given text file //content given by user to append
		//boolean va4=AppendTextFile(var1,var3);//call to m4
		//System.out.println("result of AppendTextFile function m4 is " +va4);//return from m4
		String va5=ReadAllTextFile(var1);//call to m5
		System.out.println("result of ReadAllTextFile function m5 is  " +va5);//return from m5
		int va6=GetTotalRowCount(var1);//call to m6
		System.out.println("result of TotalRowCount function m6 is  " +va6);//return from m6
		ArrayList<String> va7=ReadAllTextFileLineByLine(var1);//call to m7
		System.out.println("result of ReadAllTextFileLineByLine m7 function is " +va7);//return from m7
		int rn=3;//given value of row number for m8
		String va8=GetRowValue(var1,rn);//call to m8
		System.out.println("result of GetRowValue function m8 is "+va8);//return from m8
		String var4="kunal";
		int va9=GetRowNumber(var1,var4);//call to m9
		System.out.println("result of GetRowNumber of given string function m9 is "+va9);//return from m9
		String va10=GetRowValue(var1,var4);//call to m10
		System.out.println("result of GetRowValue function m10 is "+va10);//return from m10
		//boolean va11=DeleteTextFile(var1);//call to m11
		//System.out.println("result of DeleteTextFile function m11 is "+va11);//return from m11
		String var5="jonty cool";
		ArrayList<String> va12=ReplaceLineInTextFile(var1,var4,var5);//call to m12
		System.out.println("result of ReplaceLineInTextFile function m12 is "+va12);//return from m12
		int rn1=3;//given row number for replacing string of m13
		ArrayList<String> va13=ReplaceLineInTextFile(var1,rn1,var5);//call to m13
		System.out.println("result of ReplaceLineInTextFile using given row number function m13 is "+va13);//return from m13
		int rn2=3;//given row number to delete row present at it m14
		ArrayList<String> va14=DeleteLineInTextFile(var1,rn2);//call to m14
		System.out.println("result of DeleteLineInTextFile using given row number function m14 is "+va14);//return from m14
		ArrayList<String> va15=DeleteLineInTextFile(var1,var4);//call to m15
		System.out.println("result of DeleteLineInTextFile which contains given string function m15 is "+va15);//return from m15
		 
		
		
		

		
		
		
		

	}

		

}

		
		

	