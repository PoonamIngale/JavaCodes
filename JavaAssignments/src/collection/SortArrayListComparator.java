package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class SortArrayListComparator {

	public static void main(String[] args) {
      
		ArrayList<Integer> al=new ArrayList<>();
		al.add(10);
		al.add(50);
		al.add(20);
		al.add(40);
		al.add(30);
		
		System.out.println("Before sort: "+al);
		Collections.sort(al, new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				
				return o2.compareTo(o1);
			}
		});
		
		System.out.println("-------------------------------");
		System.out.println("After Sort: "+al);
		
	}

}
