package StringPgm;

import java.util.Scanner;

public class LowerToUpperCase {

	public static void main(String[] args) {
		System.out.println("Enter the String:");
		
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		
		String lowerCase=s.toLowerCase();
		System.out.println("LowerCase String:"+lowerCase);
		
		String upperCase=s.toUpperCase();
		System.out.println("UpperCase String:"+upperCase);
		
		sc.close();
	}

}
