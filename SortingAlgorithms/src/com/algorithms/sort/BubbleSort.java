package com.algorithms.sort;
/**
 * 
 * @author disha
 *	Right Sorted Algorithm
 *	Swap adjacent elements repeatedly based on whether the element 
 *	on the right is less than the element on the left
 *	Time Complexity - O(n*n)
 */
public class BubbleSort {

	public void bubbleSort(int a[])
	{
		for(int i =0;i<a.length;i++)
		{
			boolean flag = false;
			for(int j=0;j<a.length-i-1;j++)
			{
				if(a[j]>a[j+1])
				{
					int temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
					flag = true;
				}
			}
			if(!flag)
				break;
		}
		
	}
	public static void main(String[] args) {
		int [] a = {1,33,22,12,34,22,98,59,79};
		BubbleSort bubbleSort = new BubbleSort();
		bubbleSort.bubbleSort(a);
		for(int i =0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
	}
}
