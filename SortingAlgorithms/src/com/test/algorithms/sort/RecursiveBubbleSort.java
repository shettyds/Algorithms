package com.test.algorithms.sort;

public class RecursiveBubbleSort {


	public void recursiveBubbleSort(int a[],int n)
	{
		if(n==1)
		return;
		
		for(int i=0;i<n-1;i++)
		{
			if(a[i]>a[i+1])
			{
				int temp = a[i];
				a[i] = a[i+1];
				a[i+1] = temp;
			}
		}
		recursiveBubbleSort( a,n-1);
	}

		public static void main(String[] args) {
			int [] a = {1,33,22,12,34,22,98,59,79};
			RecursiveBubbleSort recursiveBubbleSort = new RecursiveBubbleSort();
			recursiveBubbleSort.recursiveBubbleSort(a,a.length);
			for(int i =0;i<a.length;i++)
			{
				System.out.println(a[i]);
			}
		}

	}
