package collection;
import java.util.*;

public class HashMapSort {

	 public static Map<Integer, Character> sortHashMapByValues(HashMap<Integer, Character> hm)
	 {
	  List<Map.Entry<Integer, Character>> l=new LinkedList<Map.Entry<Integer,Character>>(hm.entrySet());
      
	  Collections.sort(l,new Comparator<Map.Entry<Integer, Character>>() {
    	   @Override
    	public int compare(Map.Entry<Integer, Character> o1, Map.Entry<Integer, Character> o2) {
    		
    		return (o1.getValue()).compareTo(o2.getValue());
    	}
	  });
		
	  LinkedHashMap<Integer,Character> lm=new LinkedHashMap<>();
	  for(Map.Entry<Integer, Character> e:l)
		  lm.put(e.getKey(), e.getValue());
	  
	  return lm;
		 
	 }
	 
	 
	 public static void main(String[] args) {
		HashMap<Integer, Character> m=new HashMap<>();
		m.put(33, 'Z');
		m.put(99, 'I');
		m.put(22, 'A');
		m.put(55, 'B');
		m.put(88, 'X');
		m.put(44, 'M');
		
		System.out.println("Before Sort");
		m.forEach((k,v)->System.out.println("Keys="+k+"  Values="+v));
		
		System.out.println("-------------------------");
		System.out.println("Sort by Keys");
		
		TreeMap<Integer, Character> t=new TreeMap<>(m);
		t.forEach((k,v)->System.out.println("Key="+k+"  values="+v));
		
		System.out.println("-------------------------");
		System.out.println("Sort by Values");
		
		Map<Integer, Character> n=sortHashMapByValues(m);
		
		n.forEach((k,v)->System.out.println("Key="+k+"  Values="+v));

	}

}
