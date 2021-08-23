package Array1;

public class CommonElementInArray {

	public static void main(String[] args) {
      
		int[] a1= {1,4,7,9,2};
		int[] a2= {1,7,3,4,5};
		
		
		for(int i=0;i<a1.length;i++)
		{
			for(int j=0;j<a2.length;j++) {
				if(a1[i]==a2[j])
					System.out.println(a1[i]);
			}
		}
	
		
 
	}

}
