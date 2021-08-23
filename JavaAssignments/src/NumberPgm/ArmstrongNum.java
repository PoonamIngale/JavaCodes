package NumberPgm;

import java.util.Scanner;

public class ArmstrongNum {

	public static void main(String[] args) {
		System.out.println("Enter the Num:");
		 Scanner sc=new Scanner(System.in);
		   
		   int num=sc.nextInt();
		   
		   boolean res=isArmstrongNum(num);
		   if(res)
			   System.out.println("Armstrong Number");
		   else
			   System.out.println(" NOT Armstrong Number");
		   sc.close();

	}

	public static boolean isArmstrongNum(int num) {

		int backup=num;
		int result=0;
		
		while(num!=0) {
			result+=(num%10)*(num%10)*(num%10);
			num=num/10;
		}
		
		if(backup==result)
			return true;
		else
			return false;
	}

}
