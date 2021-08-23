package StringPgm;

import java.util.Scanner;

public class StringAnagram {

	public static void main(String[] args) {
		System.out.println("Enter Two String:");
		 
		 Scanner sc=new Scanner(System.in);
		 String s1=sc.nextLine();
		 String s2=sc.nextLine();
		 
		System.out.println("IS Anagram: "+IsAnagram(s1,s2)); 
		sc.close();
	}

	public static boolean IsAnagram(String s1, String s2) {
		 s1=s1.replaceAll("\\s", "");
		 s2=s2.replaceAll("\\s", "");
		  int count=0;
		if(s1.length()==s2.length()) 
		 {  
			for(int i=0;i<s1.length();i++)
			{    
				for(int j=0;j<s2.length();j++)
				{
					if(s1.charAt(i)==s2.charAt(j))
					{
					   count++;
					   break;
					}
				}
			 }
			if(count==s1.length())
				return true;
			else
				return false;
		 }
		else
     		return false;
		}

}
