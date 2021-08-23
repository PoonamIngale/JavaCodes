package NumberPgm;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		 System.out.println("Enter the Num:");
		 Scanner sc=new Scanner(System.in);
		   
		   int num=sc.nextInt();
		   int n1=0;
		   int n2=1;
		   System.out.print(n1+" "+n2);
		   int fibo=0;
		   for(int i=2;i<=num;i++) {
			  fibo=n1+n2;
			   n1=n2;
			   n2=fibo;
            System.out.print(" "+fibo);
			   }
		sc.close();   
	}

}
