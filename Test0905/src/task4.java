

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class task4 {
	//Append the given content for given text file and return true if file contains some data to override 
	//append and then appended it  successfully and false if file no any data is present in file to append
	
	public static boolean CreateTextFile(String var1, String var2) throws IOException
	{
		File file= new File(var1);
		if (file.exists())
		{
			@SuppressWarnings("resource")
			BufferedReader bufferedReader=new BufferedReader(new FileReader(file));
			String data=bufferedReader.readLine();
			if(data!= null)
			{
				System.out.println("File has  " +data+ "  to append");
				FileWriter fw=new FileWriter(file.getAbsoluteFile());//use of it?
				BufferedWriter bw=new BufferedWriter(fw);
				bw.write(var2);
				bw.close();
				System.out.println(var2+ " is appended successfully in given file ");
				return true;
			}
		}
		return false;
	}

	public static void main(String[] args) throws IOException {
		 String var1="D:\\Kunal\\myfiles\\task4\\t4.txt";
		 String var2="I am Learning Autoomation Testing";//Data to append to given text file 
		 boolean va1=CreateTextFile(var1,var2);
		 System.out.println("value of va1 is " +va1);
	}

}
