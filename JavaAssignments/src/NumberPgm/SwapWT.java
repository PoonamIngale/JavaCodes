package NumberPgm;

import java.util.Scanner;

public class SwapWT {

	public static void swapWithoutVariable(int n1, int n2) {
		
		n1=n1+n2;
		n2=n1-n2;
		n1=n1-n2;
		
		System.out.println("Swapped Numbers:"+n1+"    "+n2);
		
	}
	public static void main(String[] args) {
      
		System.out.println("Enter two numbers:");
		Scanner sc=new Scanner(System.in);
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		
		swapWithoutVariable(num1,num2);
		sc.close();
	}

}
