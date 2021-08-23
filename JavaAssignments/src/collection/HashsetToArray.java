package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class HashsetToArray {

	public static void main(String[] args) {
		
		HashSet<Integer> h=new HashSet<>();
		h.add(99);
		h.add(11);
		h.add(44);
		h.add(77);
		h.add(66);
		
		System.out.println("Hashset:="+h);
		
		List<Integer> l=new ArrayList<>(h);
		Integer[] a=l.toArray(new Integer[l.size()]);
		
		System.out.println("--------------------------------------");
		System.out.println("Array:="+Arrays.toString(a));
	}

}
