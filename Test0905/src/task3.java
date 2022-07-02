

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class task3 {
	//Create new text file and add given content in it 
	//and if file is already present then return false else return true
	
	public static boolean CreateTextFile(String var1, String var2) throws IOException
	{
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
			return false;
		}
		
	
	}

	public static void main(String[] args) throws IOException {
		 String var1="D:\\Kunal\\myfiles\\task3\\t3.txt";
		 String var2="I am Learning Autoomation Testing";
		 boolean va1=CreateTextFile(var1,var2);
		 System.out.println("value of va1 is " +va1);

	}

}
