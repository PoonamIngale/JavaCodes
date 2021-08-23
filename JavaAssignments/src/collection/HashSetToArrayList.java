package collection;

import java.util.ArrayList;
import java.util.HashSet;

public class HashSetToArrayList {

	public static void main(String[] args) {
		
		HashSet<Integer> h=new HashSet<>();
		h.add(99);
		h.add(11);
		h.add(44);
		h.add(77);
		h.add(66);
		System.out.println("HashMap:"+h);
		ArrayList<Integer> a=new ArrayList<>(h);
		System.out.println("-------------------------------------");
		System.out.println("ArrayList:"+a);
		
	}

}
