package collection;

import java.util.Arrays;
import java.util.List;
import java.util.TreeSet;

public class ArrayToTreeset {

	public static void main(String[] args) {
		
		Integer[] a= {33,22,55,11,44};
		
		System.out.println("Array:"+Arrays.toString(a));
		List<Integer> l=Arrays.asList(a);
		
		System.out.println("------------------------------------");
		
		TreeSet<Integer> t=new TreeSet<>(l);
		
		System.out.println("TreeSet:"+t);
	}

}
