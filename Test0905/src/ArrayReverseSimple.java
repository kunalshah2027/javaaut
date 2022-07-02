
import java.util.Scanner;

public class ArrayReverseSimple {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter no of elements");
		int num =sc.nextInt();
		int a[]=new int[num];
		System.out.println("Enter elements of array");
		for (int i=0;i<num;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("reverse elements of array are : ");
		for (int i=a.length-1;i>=0;i--)
		{
			System.out.println(a[i]);
		}

	}

}
