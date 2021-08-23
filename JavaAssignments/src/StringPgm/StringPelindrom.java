package StringPgm;

import java.util.Scanner;

public class StringPelindrom {

	public static void main(String[] args) {
		System.out.println("Enter the String:");
		
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		 
		System.out.println("IsPelindrom:"+isStringPelindrom(s));
		sc.close();
	}

	private static boolean isStringPelindrom(String s) {
		char[] c=s.toLowerCase().toCharArray();
		int n=c.length;
		int flag=0;
		for(int i=0;i<(n/2);i++)
		{
			if(c[i]!=c[n-1-i])
			{   flag=1;
				break;
			}
			
		}
		
		if(flag==0)
			return true;
		else
			return false;
	}

}
