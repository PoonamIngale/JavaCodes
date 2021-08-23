package StringPgm;


import java.util.Scanner;


public class NonRepeatedChar {

	public static void NonRepeatedCharInString(String s) {

	    for(int i=0;i<s.length();i++) {
	    	boolean unique=true;
	    	for(int j=0;j<s.length();j++)
	    	{
	    		if(i!=j && s.charAt(i)==s.charAt(j) )
	    		{
	    			unique=false;
	    			break;
	    		}
	    	}
	    	if(unique)
	    		{System.out.println("FirstNonRepeatedChar:"+s.charAt(i));
	    		break;
	    		}
	    }
	   
			
	}
	public static void main(String[] args) {
		System.out.println("Enter the String:");
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		
		NonRepeatedCharInString(s);
		sc.close();

	}

}
