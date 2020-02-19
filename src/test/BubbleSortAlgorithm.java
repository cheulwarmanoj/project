package com.test;

public class BubbleSortAlgorithm {
	
	
	private static void bubbleSort(int arr[])
	{
		int arrLen=arr.length;
		
		for(int i=0;i<arrLen;i++)
		{
			for(int j=0;j<arrLen-i-1;j++)
			{
				if(arr[j] < arr[j+1])
				{
				   int temp=arr[j];
				       arr[j]=arr[j+1];
				       arr[j+1]=temp;
				}
			}
		}
	}
	
	public static void printArray(int arr[])
	{
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
	}
	
	public static void main(String args[])
	{
		int arr[]= {3,9,3,1,6};
		bubbleSort(arr);
		printArray(arr);
	}

}
