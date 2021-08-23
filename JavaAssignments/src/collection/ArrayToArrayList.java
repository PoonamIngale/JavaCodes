package collection;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayToArrayList {

	public static void main(String[] args) {
		
		String[] s= {"Black", "Red", "Green", "White", "Purple"};
		
		System.out.println("String Array:"+Arrays.toString(s));
		
		ArrayList<String> l=new ArrayList<>(Arrays.asList(s));
		
		System.out.println("--------------------------------------");
		System.out.println("ArrayList:"+l);
		
		
	}

}
