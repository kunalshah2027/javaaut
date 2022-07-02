
public class StringRecurion {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		
		String str="JAVA";
		String Reverse=reverser(str);
		System.out.println(Reverse);
		
		
	}
	public static String reverser(String str)
	{
		if (str.length()==0)
		
			return str;
				
		return reverser(str.substring(1)+str.charAt(0));
	}

}
