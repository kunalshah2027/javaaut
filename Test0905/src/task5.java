

//import java.io.BufferedReader;
//import java.io.File;
//import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class task5 {
	//read entire text file stored the content in string 
	//only file path is given from manager(main)
	
	
	public static String ReadAllTextFile(String var1) throws IOException 
	{
		//File file= new File(var1);	
		 String var3 = new String(Files.readAllBytes(Paths.get(var1)));
		/*@SuppressWarnings("resource")
		BufferedReader bufferedReader=new BufferedReader(new FileReader(file));
		String var2=bufferedReader.readLine();
		return var2;*/
		 return var3;
	}

	public static void main(String[] args) throws IOException {
	   String var1="D:\\Kunal\\myfiles\\task5\\t5.txt";
	   String va2=ReadAllTextFile(var1);
	   System.out.println("All the content of given file is stored in string va2 which is " +va2);

	}

}
