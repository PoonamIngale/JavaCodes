package StringPgm;
import java.util.Scanner;

public class StringReverse {
	
	public static String reverseString(String s) {
		String rev="";
		char[] ch=s.toCharArray();
		
		for(int i=(ch.length-1);i>=0;i--) {
			rev=rev+ch[i];
		}
		return rev;
	}
	
	public static void main(String[] args) {
		
		System.out.println("Enter the String:");
		
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		 
		System.out.println(reverseString(s));
		sc.close();

	}

}
