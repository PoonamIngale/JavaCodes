package collection;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListIterate {

	public static void main(String[] args) {
     
		ArrayList<String> al=new ArrayList<>();
		al.add("Black");
		al.add("Red");
		al.add("Green");
		al.add("White");
		al.add("Purple");
		
		//1. for-loop
		for(int i=0;i<al.size();i++)
			System.out.println(al.get(i));
		System.out.println("-----------------------------");
		//2.for-each
		for(String s:al)
			System.out.println(s);
		System.out.println("-----------------------------");
	    //3. Collection's stream() util 
		al.forEach(n->System.out.println(n));
		System.out.println("-----------------------------");
		//4 while loop
		int i=0;
		while(i<al.size())
		{
			System.out.println(al.get(i));
			i++;
		}
		System.out.println("-----------------------------");
		//5. Iterator
		Iterator<String> itr=al.iterator();
		while(itr.hasNext())
			System.out.println(itr.next());
		
	}

}
