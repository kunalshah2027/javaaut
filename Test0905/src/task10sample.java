
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;

public class task10sample {

	public static void main(String[] args) throws IOException {
		File file= new File("D:\\Kunal\\myfiles\\task1\\t1.txt");	
		BufferedReader br=new BufferedReader(new FileReader(file));
		LineNumberReader r=new LineNumberReader(new FileReader(file));
		int z=r.getLineNumber()+1;
	    System.out.println("1 "+br.readLine());
	    System.out.println("z "+z);
		int mk=getMaxOccurrence("kunal");
		System.out.println(mk);
		
		
	    br.close();
	    r.close();

	}

	private static int getMaxOccurrence(String string) {
		// TODO Auto-generated method stub
		return 2;
	}

}
