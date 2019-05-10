package com.test.algorithms.sort;
/**
 * 
 * @author disha
 *	Similar to playing card, putting the array elements are their right position. 
 *	Left sorted
 */
public class InsertionSort {
	public void insertionSortIncreasing(int a[],int n)
	{
	for(int i=1;i<a.length;i++)
	{
		int j = i-1;
		int temp = a[i];
		while(j>=0 && temp<=a[j])
		{
			a[j+1] = a[j];
			j--;
		}
		a[j+1] = temp;
	}
	
	
	}
	
	public void insertionSortDecreasing(int a[], int n)
	{
		for(int i=1;i<n;i++)
		{
			int j = i-1;
			int temp = a[i];
			while(j>=0 && a[j]<=temp)
			{
				
				a[j+1] = a[j];
				j--;
			}
			a[j+1] = temp;
		}
	}

		public static void main(String[] args) {
			int [] a = {1,22,33,12,34,22,98,59,79};
			InsertionSort insertionSort = new InsertionSort();
			insertionSort.insertionSortIncreasing(a,a.length);
			for(int i =0;i<a.length;i++)
			{
				System.out.println(a[i]);
			}
			System.out.println("***************************8");
			insertionSort.insertionSortDecreasing(a,a.length);
			for(int i =0;i<a.length;i++)
			{
				System.out.println(a[i]);
			}
		}

	

}
