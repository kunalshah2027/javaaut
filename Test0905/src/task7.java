


import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

//import java.io.LineNumberReader;
//import java.util.ArrayList;

public class task7 {
	//read entire text file line by line and return array
	
	public static ArrayList<String> ReadAllTextFileLineByLine(String var1) throws IOException
	{
		//File file=new File(var1);
		Scanner s = new Scanner(new File(var1));
		ArrayList<String> list = new ArrayList<String>();
		while (s.hasNext())
		{
		    list.add(s.next());
		}
		s.close();
		return list;
		
	}

	public static void main(String[] args) throws IOException {
		String var1="D:\\Kunal\\myfiles\\task7\\t7.txt";
		ArrayList<String> va2=ReadAllTextFileLineByLine(var1);
		System.out.println("Required array is " +va2);

	}

}
