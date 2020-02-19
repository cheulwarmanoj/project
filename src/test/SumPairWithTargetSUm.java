package com.test;

//Java implementation of simple method to find count of 
//pairs with given sum. 
public class SumPairWithTargetSUm 
{ 
	
 public static void main(String args[]) 
 { 
     int[] arr = { 1, 5, 7, -1, 5 }; 
     int sum = 6; 
     getPairSum(arr, sum); 
 } 

 // Prints number of pairs in arr[0..n-1] with sum equal 
 // to 'sum' 
public static void getPairSum(int arr[],int sum)
 {
	 int counter=0;
	 for(int i=0;i<arr.length;i++)
	 {
		 for(int j=i+1;j<arr.length;j++)
		 {
			 if(sum==(arr[i]+arr[j]))
			 {
				counter++; 
			 }
		 }
	 }
	 
	 System.out.println("total pair of sum="+counter);
 }
} 
