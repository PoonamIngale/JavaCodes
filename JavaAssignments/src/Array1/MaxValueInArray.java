package Array1;


import java.util.Arrays;

public class MaxValueInArray {

	public static void main(String[] args) {
		
		int[] a= {1,7,91,12,57};
		
		Arrays.sort(a);
		System.out.println("MaxValue="+a[a.length-1]);
	}

}
