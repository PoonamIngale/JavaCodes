package Array1;

import java.util.Arrays;

public class SecondLargeNumArray {

	public static void main(String[] args) {
		int[] a= {11,45,23,77,100,23};
         int n=a.length;
		 Arrays.sort(a);
		 System.out.println(a[n-2]);
	}

}
