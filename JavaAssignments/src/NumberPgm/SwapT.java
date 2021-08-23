package NumberPgm;

import java.util.Scanner;

public class SwapT {

	public static void swap(int n1,int n2) {
		int temp;
		temp=n1;
		n1=n2;
		n2=temp;
		
		System.out.println("Swapped Numbers:"+n1+"  "+n2);
	}
	public static void main(String[] args) {
		
      System.out.println("Enter Two Num:");
      Scanner sc=new Scanner(System.in);
      int num1=sc.nextInt();
      int num2=sc.nextInt();
      
      swap(num1,num2);
      sc.close();

	}

}
