package collection;

import java.util.HashMap;

public class RemoveKeyHashmap {

	public static void main(String[] args) {
		HashMap<Integer, String> h=new HashMap<>();
		h.put(101, "Poonam");
		h.put(102, "Tushar");
		h.put(103, "Akshay");
		h.put(104, "Jiya");
		h.put(105, "Sham");
		
		h.forEach((k,v)->System.out.println("Keys="+k+"    values="+v));
		
		System.out.println("----Remove Key 103--------");
		h.remove(103);
		
		h.forEach((k,v)->System.out.println("Keys="+k+"    values="+v));
	}

}
