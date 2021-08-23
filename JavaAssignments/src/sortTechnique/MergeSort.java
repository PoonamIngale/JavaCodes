package sortTechnique;

import java.util.Arrays;

public class MergeSort {

	 void sort(int[] a, int l, int r) {
		 if(l<r) {
			 int mid=(l+r)/2;
			 sort(a,l,mid);
			 sort(a,mid+1,r);
			 merge(a,l,mid,r);
		 }
		 
	 }
	public void merge(int[] a, int l, int mid, int r) {
		int n1=mid-l-1;
		int n2=r-mid;
		
		int[] left=new int[n1];
		int[] right=new int[n2];
		
		for(int i=0;i<n1;++i)
			left[i]=a[l+i];
		
		for(int i=0;i<n2;++i)
			right[i]=a[mid+1+i];
		
		int i=0,j=0,k=l;
		while(i<n1 && j<n2) {
			if(left[i]<=right[j]) {
				a[k]=left[i];
				i++;
			}
			else
			{
				a[k]=right[j];
				j++;
			}
			k++;
		}
		
		while(i<n1) 
		{
			a[k]=left[i];
			i++;
			k++;
		}
		
		while(j<n2) {
			a[k]=right[j];
			j++;
			k++;
		}
	}

	public static void main(String[] args) {

		int[] a= {64,25,12,22,11};
		int r=a.length - 1;
		
		MergeSort ms=new MergeSort();
		ms.sort(a,0,r);
		
		
	    System.out.println(Arrays.toString(a));
	
	    
	}
	
}
