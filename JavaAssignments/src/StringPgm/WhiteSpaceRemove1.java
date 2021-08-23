package StringPgm;

import java.util.Scanner;

public class WhiteSpaceRemove1 {

	public static void main(String[] args) {
		 System.out.println("Enter the String:");
		 
		 Scanner sc=new Scanner(System.in);
		 String s=sc.nextLine();
		   
		 char[] word=s.toCharArray();
		 StringBuffer sb=new StringBuffer();
		 
		   for(int i=0;i<word.length;i++) {
			   if(word[i]!=' '&& word[i]!='\t')
				   sb.append(word[i]);
		   }
		   System.out.println(sb);
		   sc.close();
	}

}
