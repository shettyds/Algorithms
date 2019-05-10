package com.algorithms.sort;

public class SelectionSort {


	public static void main(String[] args) {
		int []  a= {3,22,1,23,44,76,12};
		SelectionSort.sort(a);
		for(int i =0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
	}

	public static void sort(int[] a) {
		for(int i=0;i<a.length-1;i++)
		{
			int minIndex= i ;
			for(int j=i;j<a.length;j++)
			{
				if(a[j]<a[minIndex])
					minIndex = j;
			}
			int temp = a[minIndex];
			a[minIndex] = a[i];
			a[i] = temp;
		}
	}
}
