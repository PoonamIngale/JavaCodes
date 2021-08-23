package NumberPgm;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {

		 System.out.println("Enter the Num:");
		 Scanner sc=new Scanner(System.in);
		   
		   int num=sc.nextInt();
		   
		   int result=isPrimeNum(num);
		   if(result==1)
		   System.out.println("Not Prime Number");
		   else
			  System.out.println("Prime Number");

		    sc.close();
	}

	private static int isPrimeNum(int num) {
		int flag=0;
		for(int i=2;i<=(num/2);i++) {
			if(num%i==0)
			{
				flag=1;
				break;
			}
		}
		return flag;
	}

}
