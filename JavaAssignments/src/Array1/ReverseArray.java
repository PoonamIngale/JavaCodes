package Array1;

import java.util.Arrays;

public class ReverseArray {

	public static void main(String[] args) {
     
		int[] a={3, 8, 5, 7, 4};
		int[] rev=new int[a.length];
		int j=0;
		System.out.println("Array:"+Arrays.toString(a));
		for(int i=a.length-1;i>=0;i--)
		{
			rev[j]=a[i];
			j++;
		}
		System.out.println("-----------------------------------");
		System.out.println("Reverse:"+Arrays.toString(rev));
			
	}

}
