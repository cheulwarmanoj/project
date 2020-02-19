package com.test;

import java.util.HashMap;
import java.util.Map;

public class SingleOccuranceNumber {
	

    static final int INT_SIZE = 32; 
      
    // Method to find the element that occur only once 
    static int getSingle(int arr[], int n) 
    { 
        int result = 0; 
        int x, sum; 
          
        // Iterate through every bit 
        for(int i=0; i<INT_SIZE; i++) 
        { 
            // Find sum of set bits at ith position in all  
            // array elements 
            sum = 0; 
            x = (1 << i); 
            for(int j=0; j<n; j++) 
            { 
                if((arr[j] & x) == 0) 
                sum++; 
            } 
            // The bits with sum not multiple of 3, are the 
            // bits of element with single occurrence. 
            if ((sum % 3) == 0) 
            result |= x; 
        } 
        return result; 
    } 
      
    // Driver method 
    public static void main(String args[]) 
    { 
        int arr[] = {12, 1, 12, 3, 12, 1, 1, 2, 3, 2, 2, 3, 7,7,9}; 
        int n = arr.length; 
        //System.out.println("The element with single occurrence is " + getSingle(arr, n)); 
         occurance(arr, n); 
    }
    
    public static void occurance(int arr[], int n)
    {
    	int count=0;
    	
    	Map<Integer,Integer> map=new HashMap();
    	for(int i:arr)
    	{
    		if(map.containsKey(i))
    		{
    			map.put(i, map.get(i)+1);
    		}
    		else
    		{
    			map.put(i, 1);
    		}
    	}
    	
    	for(Map.Entry<Integer,Integer> entry:map.entrySet())
    	{
    		
    		if(entry.getValue()==1)
    		{
    			System.out.println("Single occurance item is "+entry.getKey());
    		}
    	}
    }

}
