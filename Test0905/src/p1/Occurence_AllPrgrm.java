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

public class Occurence_AllPrgrm { 

	public static void main(String[] args) throws IOException {
		//remove all occ of substring
		//remove all occ		
		int arr[]={1, 1 ,1, 2,3,4,7,4,4};		
		String s = "aaaafktk";
		char arr1 [] = s.toCharArray();		
		int len = arr.length;
		System.out.println(arr[4]);
		int len1 = arr1.length;
		int len2 = s.length();
		int counter;
		HashMap <Integer, Integer> hs = new HashMap<Integer, Integer>();
		HashMap<Character, Integer> hs1 = new HashMap<Character, Integer>();
		
		System.out.println("P1 : Occurance Of each char of array -->" + Arrays.toString(arr));		
		System.out.println("Given array is " + Arrays.toString(arr));
		System.out.println("first for loop is to avoid comparing the repeated char agaian and again");
		System.out.println("2nd if Conditon is to compare ele with each other and increment counter");
		System.out.println("3rd if Conditon is to print final output");		
		for (int i = 0 ; i<=len-1; i ++) 
		{
			counter = 0;
			//System.out.println(arr[i]);
			
			for (int j = 0 ; j<=len-1; j ++) {
				if (j < i && arr[i] == arr[j] )
				{
					break;
				}	
				if (arr[i] == arr[j] )
				{
					counter++;					
				}
				if (j == len-1) {
					System.out.println("Occ of "+arr[i] + " is " +counter+" times");
					hs.put(arr[i], counter);
				}
				
			}		
			
		}
		System.out.println("We can put this output in Hashmap as well if we need result for specific char like below");
		System.out.println(hs);
		System.out.println("If we need result for spcific ele from array here for ex for 1");
		System.out.println(hs.get(1));
		
		System.out.println();
		System.out.println("P2 : Occurance Of each char of String -->" + Arrays.toString(arr1));
		System.out.println("Given String is " + Arrays.toString(arr1));
		for (int k = 0 ; k<=len1-1; k++) 
		{
			counter = 0;
			//System.out.println(arr[i]);
			
			for (int l = 0 ; l<=len1-1; l++) {
				if (l < k && arr1[k] == arr1[l] )
				{
					break;
				}	
				if (arr1[k] == arr1[l] )
				{
					counter++;
				}
				if (l == len1-1) {
					System.out.println("Occ of "+arr1[k] + " is " +counter+" times");
					hs1.put(arr1[k], counter);
				}
				
			}		
			  
		}
		System.out.println(hs1);
		System.out.println("If we need result for spcific ele from string here for ex for a");
		System.out.println(hs1.get('a'));	
		
		System.out.println();
		System.out.println("P3 : Occurance Of each char of Array Using Hasmap - no need to convert to any array");
		System.out.println("Given chararray is " + Arrays.toString(arr));
		HashMap<Integer,Integer> hs2 = new HashMap<Integer,Integer>();
		for (int m = 0 ; m<=len-1; m++) 
		{
			counter = 0;
			if (hs2.containsKey(arr[m]))
			{
				counter = hs2.get(arr[m]);
				hs2.put(arr[m], ++counter);
			}
			else
			{
				hs2.put(arr[m], 1);
			}			  
		}			
		System.out.println(hs2);
		
		System.out.println();
		System.out.println("P4 : Occurance Of each char of String Using Hasmap - no need to convert to any array");
		System.out.println("Given String is " + s);
		HashMap<Character,Integer> hs3 = new HashMap<Character,Integer>();
		for (int q = 0 ; q<=len2-1; q++) 
		{
			counter = 0;
			if (hs3.containsKey(s.charAt(q)))
			{
				counter = hs3.get(s.charAt(q));
				hs3.put(s.charAt(q), ++counter);
			}
			else
			{
				hs3.put(s.charAt(q), 1);
			}			  
		}			
		System.out.println(hs3);
		
		System.out.println();		
		System.out.println("P5 : Get non repeated characters from array");
		System.out.println("Given chararray is " + Arrays.toString(arr));
		ArrayList<Integer> arrnonrepeated = new ArrayList <Integer> ();
		for (HashMap.Entry<Integer, Integer> entr : hs.entrySet()) 
		{
			if (entr.getValue() == 1)
			{
				entr.getKey();
				arrnonrepeated.add(entr.getKey());
			}
						
		}
		System.out.println(arrnonrepeated);
		
		System.out.println();
		System.out.println("P6 : Get non repeated characters from String");
		System.out.println("Given String is " + Arrays.toString(arr1));
		ArrayList<String> arrnonrepeated1 = new ArrayList <String> ();
		for (HashMap.Entry<Character, Integer> entr : hs1.entrySet()) 
		{
			if (entr.getValue() == 1)
			{
				entr.getKey();
				arrnonrepeated1.add(entr.getKey().toString());
			}
						
		}
		System.out.println(arrnonrepeated1);
		
		System.out.println();
		System.out.println("P7 : Get First non repeated characters from Array");
		System.out.println("Given chararray is Before Sorting " + Arrays.toString(arr));
		Arrays.sort(arr);
		System.out.println("Given chararray is After Sorting " + Arrays.toString(arr));		
		System.out.println("First it will sort the array and then It will compare each element in array and counter ==1 condition is outside of for 2nd for loop so it will become "
				+ "1 only when their is 1 char in array whic is non repeated after comparing");
		for (int n = 0; n<=len-1;n++)
		{		
			counter = 0;
			
			for (int o = 0; o<=len-1;o++) 
			{
				if (arr[n] == arr[o]) 
				{
					counter++;					
				}				
			}
			if (counter == 1) 
			{
				System.out.println("First non repeated characters is "+arr[n]);
				break;
			}			
						
		}
		
		System.out.println();
		System.out.println("P8 : Get First non repeated characters from String");
		System.out.println("Given String is " + s);
		for (char c : arr1)
		{
			if (s.indexOf(c)==s.lastIndexOf(c))
			{				
				System.out.println(c);
				break;
			}
						
		}	
		
		System.out.println();
		System.out.println("P9 : Find occurance of word in string");		
		String findwordfromstring = "Java is good but python is very good";
		System.out.println("Given string is " +findwordfromstring);	
		String arrwordocc [] = findwordfromstring.split(" ");
		System.out.println(Arrays.toString(arrwordocc));
		counter = 0;
		for (int p = 0 ; p<=arrwordocc.length-1; p++)
		{
			if ("is".equalsIgnoreCase(arrwordocc[p]))
			{
				counter++;
			}			
		}
		System.out.println("Occurance of word in string is " +counter);
		
		System.out.println();
		System.out.println("P10 : Find occurance of word or max occ of word from file");		
		File file = new File("F:\\Aut_Java\\Test0905\\src\\p1\\occ.txt");	
		BufferedReader br = new BufferedReader(new FileReader("F:\\Aut_Java\\Test0905\\src\\p1\\occ.txt"));
		String line;
		while ((line = br.readLine()) != null) {
		   System.out.println("Given content in file is "+line);
		 }
		try {
			Scanner sc = new Scanner(file);				
			counter = 0;
			while (sc.hasNext()) {
				String word=sc.next();										
				if (word.contains("but"))
				{
					counter++;					
				}
				
			}			
			System.out.println("occurance of word is "+counter);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block			
		}				
		
	}

}
