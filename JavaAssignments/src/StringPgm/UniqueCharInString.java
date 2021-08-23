package StringPgm;

import java.util.Scanner;


public class UniqueCharInString {

	public static void main(String[] args) {
	   System.out.println("Enter the String:");
	   Scanner sc=new Scanner(System.in);
	   
	   String s=sc.nextLine();
	   System.out.println("Is Unique String:"+IsUniqueCharacterInString(s));
	   sc.close();

	}

	public static boolean  IsUniqueCharacterInString(String s) {
		char[] ch=s.toCharArray();
		char c=ch[0];
		int flag=0;
		for(int i=1;i<ch.length-1;i++)
		{
			if(c==ch[i])
			{
				flag=1;
				break;
			}
			else
			{
				c=ch[i];
			}
		}
		
		if(flag==0)
			return true;
		else
			return false;
	  }
	

}
