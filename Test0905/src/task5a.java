

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;


public class task5a {

	//read entire text file stored the content in string 
	//only file path is given from manager(main)
		
		
		public static String ReadAllTextFile(String var1) throws IOException 
		{
			File file= new File(var1);	
			BufferedReader br=new BufferedReader(new FileReader(file));
			try {
		        StringBuilder sb = new StringBuilder();
		        String line = br.readLine();

		        while (line != null)
		        {
		            sb.append(line);
		            sb.append("\n");
		            line = br.readLine();
		        }
		        return sb.toString();
		}
			finally {
		        br.close();
			}
		}

		public static void main(String[] args) throws IOException {
		   String var1="D:\\Kunal\\myfiles\\task5\\t5.txt";
		   String va2=ReadAllTextFile(var1);
		   System.out.println("All the content of given file is stored in string va2 is " +va2);

		}

	}
