package StringPgm;

import java.util.LinkedHashMap;
import java.util.Scanner;

public class CharOcurranceInString {

	public static void main(String[] args) {
       System.out.println("Enter the String:");
		
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		 
		characterOccurance(s);
		sc.close();

	}

	public static void characterOccurance(String s) {
		char[] c=s.toCharArray();
		LinkedHashMap<Character, Integer> l=new LinkedHashMap<>();

		
		for(int i=0;i<c.length-1;i++) {
			if(l.containsKey(c[i])) {
				int count=l.get(c[i]);
				count++;
				l.put(c[i],count);
			}
			else
				l.put(c[i], 1);
		}
		
		System.out.println(l);
		
	}

}
