package com.test;

public class SelectionSort {
	
	
	private static void selection(int arr[])
	{
		int arrLength=arr.length;
		
		for(int i=0;i<arrLength-1;i++)
		{
			int min_idx=i;
			for(int j=i+1;j<arrLength;j++)
			{
				if(arr[i] < arr[j])
				{
					min_idx=j;
				}
				
				
			}
			int temp=arr[min_idx];
			arr[min_idx]=arr[i];
			arr[i]=temp;
		}
		
	}
	
	private static void printArray(int arr[])
	{
		for(int k=0;k<arr.length;k++)
		{
			System.out.println(arr[k]);
		}
	}

	public static void main(String args[])
	{
		int arr[]= {10,3,5,7,9};
		selection(arr);
		printArray(arr);
	}
}
