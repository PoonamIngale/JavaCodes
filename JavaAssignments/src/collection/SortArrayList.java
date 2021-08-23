package collection;

import java.util.ArrayList;
import java.util.Collections;

public class SortArrayList {

	public static void main(String[] args) {

		ArrayList<String> al=new ArrayList<>();
		al.add("Black");
		al.add("Red");
		al.add("Green");
		al.add("White");
		al.add("Purple");
		
		System.out.println("Before Sort:");
		al.forEach(n->System.out.println(n));
		System.out.println("--------------------------");
		
		Collections.sort(al);
		System.out.println("After Sort:");
		al.forEach(n->System.out.println(n));
	}

}
