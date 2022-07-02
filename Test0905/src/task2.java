

import java.io.File;
import java.io.IOException;

public class task2 {//Create text file on the given filepath and is already present return false

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
	
	
	//----------------------------------
	public static void main(String[] args) throws IOException{
		/*File file =new File("D:\\Kunal\\myfiles\\task2\\t2.txt");
		String absolutePath = file.getAbsolutePath();
		String filepath=CreateTextFile(absolutePath);
		System.out.println(file);*/
		//above deleted  is what i have written if direct file location is given
		String var1="D:\\Kunal\\myfiles\\task2\\t2.txt";
		boolean va1=CreateTextFile(var1);
		System.out.println("Value of va1 is "+va1);

	}

}
