package NumberPgm;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
    
		System.out.println("Enter the Num:");
		 Scanner sc=new Scanner(System.in);
		   
		   int num=sc.nextInt();
		   
		   factorial(num);
		   sc.close();
	}

	public static void factorial(int num) {
		int fact=1;
		
		for(int i=1;i<=num;i++) 
		fact=fact*i;	
		
		
		System.out.println("Factorial="+fact);
	}

}
