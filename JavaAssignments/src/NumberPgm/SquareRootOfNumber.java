package NumberPgm;

import java.util.Scanner;

public class SquareRootOfNumber {

	public static void main(String[] args) {
		System.out.println("Enter the numbers:");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
	
		System.out.println("Square Root is:"+Math.sqrt(num));
		sc.close();
	}
}
