package collection;

import java.util.TreeMap;

public class IterateTreemap {

	public static void main(String[] args) {
		TreeMap<String, Integer> t=new TreeMap<>();
		t.put("Ram", 87);
		t.put("Vijay", 85);
		t.put("Pavan", 77);
		t.put("Ashish", 65);
		t.put("Riya", 73);
		
		t.forEach((k,v)->System.out.println("Student="+k+"  Marks="+v));
	}

}
