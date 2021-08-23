package collection;

import java.util.ArrayList;
import java.util.Collections;

public class ReverseArrayList {

	public static void main(String[] args) {
     
	//	[Apple, Amazon, Facebook, Google, IBM,
		// Tesla]
				 
		ArrayList<String> l=new ArrayList<String>();
		l.add("Apple");
		l.add("Amazon");
		l.add("Facebook");
		l.add("Google");
		l.add("IBM");
		l.add("Tesla");
		
		System.out.println("List:"+l);
        System.out.println("----------------------------------------------------------");
		Collections.reverse(l);
        System.out.println("After Reverse:"+l);
	}

}
