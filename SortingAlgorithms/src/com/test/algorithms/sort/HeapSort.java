package com.test.algorithms.sort;
/**
 * 
 * @author disha
 *	This implementation of Heap Sort makes use of Max Heap. It evaluates the maximum element
 *	using the tree structure and places it at the root of the tree. This process is done recursively to
 *	sort the elements in the array
 */
public class HeapSort
{	
    public void sort(int arr[])
    {
        int n = arr.length;
         for (int i = n / 2 - 1; i >= 0; i--) {
          heapify(arr, n, i);
        }
            
        for (int i=n-1; i>=0; i--)
        {
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;
 
          	// Heapify root element
            heapify(arr, i, 0);
        }
    }
 
    void heapify(int arr[], int n, int i)
    {
        int largest = i; 
        int l = 2*i + 1; 
        int r = 2*i + 2;  
        if (l < n && arr[l] > arr[largest])
            largest = l;
 
        if (r < n && arr[r] > arr[largest])
            largest = r;
      	// Swap and continue heapifying if root is not largest
        if (largest != i)
        {
            int swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;
 
            heapify(arr, n, largest);
        }
    }
 
    public static void main(String args[])
    {
        int arr[] = {2,10,8};

        HeapSort hs = new HeapSort();
        hs.sort(arr);
 
        System.out.println("Sorted array is");
        for (int i=0; i < arr.length; ++i)
            System.out.print(arr[i]+" ");
    }
}