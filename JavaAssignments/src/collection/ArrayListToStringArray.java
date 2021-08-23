package collection;


import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListToStringArray {

	public static void main(String[] args) {
      
		ArrayList<String> al=new ArrayList<>();
		al.add("Black");
		al.add("Red");
		al.add("Green");
		al.add("White");
		al.add("Purple");
		
		System.out.println("ArrayList:"+al);
		System.out.println("-------------------------------------------------");
		String[] s=al.toArray(new String[al.size()]);
		System.out.println("String Array:"+Arrays.toString(s));
	}

}
