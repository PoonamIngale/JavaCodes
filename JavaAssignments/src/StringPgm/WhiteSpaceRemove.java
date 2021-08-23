package StringPgm;

import java.util.Scanner;

public class WhiteSpaceRemove {

	public static void main(String[] args) {
		
		 System.out.println("Enter the String:");
		   Scanner sc=new Scanner(System.in);
		   
		   String s=sc.nextLine();
		  
		    s= s.replaceAll("\\s", "");
		   
		   
		   System.out.println(s);
		   sc.close();
	}

}
