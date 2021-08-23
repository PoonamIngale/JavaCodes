package collection;

import java.util.*;

public class LinkedListToArrayList {

	public static void main(String[] args) {

		LinkedList<String> ll=new  LinkedList<>();
		ll.add("Black");
		ll.add("Red");
		ll.add("Green");
		ll.add("White");
		ll.add("Purple");
		
		ArrayList< String> al=new ArrayList<>(ll);
		System.out.println("Linked List:"+ll);
		System.out.println("-----------------------------------------------");
		System.out.println("ArrayList:"+al);
	}

}
