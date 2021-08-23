package collection;

import java.util.*;
import java.util.Map;

public class HashMapIterate {

	public static void main(String[] args) {
		HashMap<Integer, String> m =new HashMap<>();
		m.put(1, "Ram");
		m.put(2, "Sham");
		m.put(3, "Riya");
		m.put(4, "Diya");
		
		//1. for-each
		m.forEach((k,v) -> System.out.println("Key="+k+"  value="+v));
		System.out.println("----------------------------");
		
		//2. keyset() iterator
        
		for(int k:m.keySet()) {
			System.out.println("key="+k+"  value="+m.get(k));
		}
		System.out.println("----------------------------");
		//3. entrySet() and for loop
		for(Map.Entry<Integer, String> set:m.entrySet()) {
			System.out.println("Key="+set.getKey()+"  values="+set.getValue());
		}
		System.out.println("----------------------------");
		
		//entrySet Java Iterator
		Set<Map.Entry<Integer, String>> s=m.entrySet();
		Iterator<Map.Entry<Integer, String>> i=s.iterator();
		while(i.hasNext())
			{
			 Map.Entry<Integer, String> e=(Map.Entry<Integer, String>)i.next();
			 System.out.println("Key="+e.getKey()+"  values="+e.getValue());
			}
	}

}
