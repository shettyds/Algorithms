package com.test.algorithms.sort;

public class MergeSort {
	public void mergeSort(int a[])
	{
		if(a.length<2)
			return;
		int mid = a.length/2;
		int left[] = new int[mid];
		int right[] = new int[a.length-mid];
		for(int i=0;i<mid;i++)
		{
			left[i] = a[i];
		}
		for(int i=mid;i<a.length;i++)
		{
			right[i-mid] = a[i];
		}
		
		mergeSort(left);
		mergeSort(right);
		merge(a,left,right);
		
	}

	
	public void merge(int[] a,int[] left, int[] right)
	{
		int i=0,j=0,k=0;
		while(i<left.length && j<right.length )
		{
			if(left[i]<=right[j])
				a[k++] = left[i++];
			else
				a[k++] = right[j++];
		}
		while(i<left.length)
		{
			a[k++] = left[i++];
		}
		while(j<right.length)
		{
			a[k++] = right[j++];
		}
	}
		public static void main(String[] args) {
			int [] a = {1,33,22,12,34,22,98,59,79};
			MergeSort mergeSort = new MergeSort();
			mergeSort.mergeSort(a);
			for(int i =0;i<a.length;i++)
			{
				System.out.println(a[i]);
			}
		}
}
