package p1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class RemoveOcc_Duplicates_AllPrgrm { 

	public static void main(String[] args) throws IOException {
		//remove all occ of substring
		//remove all occ		
		int arr[]={1, 1 ,1, 2 , 3 , 4 , 5 , 6 , 7 , 8,2 , 7 , 4 , 4};		
		String s = "aaaaaffkendfnfndfb";
		String sub = "kunfjkvjvkunsk";			
		int len = arr.length;		
		int len2 = s.length();
		
		
		System.out.println("P1 : Remove all Occurance Of each char of array /Remove duplicates -->" + Arrays.toString(arr));		
		System.out.println("Given array is " + Arrays.toString(arr));
		System.out.println("For removing occ we first need to sort thr array");
		Arrays.sort(arr);
		System.out.println("After sort"+Arrays.toString(arr));		
		System.out.println("With a[i] ! = a[i+1] we are comparing only 2 consecutive numbers as array is sorted and "
				+ "if they are not equeal then only we are storing it in array back.");
		System.out.println("Now we compared loop till len -1 as i+1 condition will fail if we compare till "
				+ "last char so now we will assign that last ele to a[j]");				
		System.out.println("Now out array is ready with non repeated char, will print it with loop");
		int j = 0;
		for (int i = 0 ; i<len-1; i ++) 
		{
			if (arr[i] != arr[i+1]) 
			{
				arr[j] = arr[i];
				j++;
			}
		}
		arr[j] = arr[len-1];
		for (int k = 0 ; k<=j; k ++) 
		{
			System.out.print(arr[k]);
		}
		System.out.println();
		
		System.out.println();
		System.out.println("P2 : Remove all Occurance Of each char of String /Remove duplicates -->" + s);
		System.out.println("Given String is " + s);
		System.out.println("In this we are taking one blank screen then if char is already present in new string "
				+ "then it will return its index and if its not present it will return -1 so with this "
				+ "condition will get non repeated char and then we can print it.");
		String newstr = "";
		for (int k = 0 ; k<len2; k++) 
		{
			char dup = s.charAt(k);
			if (newstr.indexOf(dup) == -1) 
			{
				newstr = newstr + dup;
			}			  
		}
		System.out.println(newstr);		
		System.out.println();		
		
		System.out.println("P3 : Remove all Occurance Of substring of String /Remove duplicates -->" + sub);
		System.out.println("Given chararray is " + sub);
		String substring = "kun";
		int lenofword = substring.length();
		while (true)
		{
			int ind = sub.indexOf(substring);
			if (sub.indexOf(substring) > -1) 
			{
				sub = sub.substring(0,ind) + sub.substring(ind + lenofword);
			}
			else {
				break;
			}
		}				
		System.out.println(sub);
		
		System.out.println();
		
	}

}
