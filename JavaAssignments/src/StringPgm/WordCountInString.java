package StringPgm;

import java.util.Scanner;

public class WordCountInString {
	
	public static void countWord(String s) {
		int count=1;
		for(int i=0;i<s.length()-1;i++) {
			if(s.charAt(i)==' '&&s.charAt(i+1)!=' ')
				count++;
		}
		System.out.println("word count="+count);
	}

	public static void main(String[] args) {
		System.out.println("Enter the String:");
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		
		String[] arr=s.split(" ");
		
		System.out.println("Word Count="+arr.length);
		countWord(s);
		sc.close();
	}

}
