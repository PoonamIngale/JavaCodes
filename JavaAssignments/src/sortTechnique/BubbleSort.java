package sortTechnique;

public class BubbleSort {

	public static void main(String[] args) {
		int [] a= {64,25,12,22,11};
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				if(a[i]<a[j])
				{
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
				
			}
		}
		
		for(int i=0;i<a.length;i++)
			System.out.print(a[i]+" ");

	}

}
