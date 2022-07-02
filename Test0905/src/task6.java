

import java.io.BufferedReader;
import java.io.File;
//import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;

public class task6 {
	//find total number of rows in given text file 
	
	public static int GetTotalRowCount(String var1) throws IOException
	{
		File file=new File(var1);
		BufferedReader br=new BufferedReader(new FileReader(file));
		LineNumberReader r=new LineNumberReader(new FileReader(file));
		
		try {
	        StringBuilder sb = new StringBuilder();
	        //LineBuilder rb=new LineBuilder();
	        String line = br.readLine();
	        int c=r.getLineNumber();

	        while (line !=null)
	        {
	            sb.append(c);
	            sb.append("\n");
	            line = br.readLine();
	            sb.append(line);
	            sb.append("\n");
	            c = r.getLineNumber();   
	           
	        }
	       return c;
	}
		finally {
	        br.close();
	        r.close();
		}
		
	}
		/*r.skip(Long.MAX_VALUE);
		//int c=r.getLineNumber()+1;
		//System.out.println(c);///Add 1 because line index starts at 0
		//r.close();
		//return c;	*/
	

	public static void main(String[] args) throws IOException {
		String var1="D:\\Kunal\\myfiles\\task6\\t6.txt";
		   int va2=GetTotalRowCount(var1);
		   System.out.println("Total number of rows in text file are  " +va2);

	}

}
