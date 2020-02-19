package com.test;

import java.util.Arrays;
import java.util.Collections;

// Java program to find number 
//of bins required using 
//next fit algorithm. 
class BinInSertionProblem { 

 // Returns number of bins required 
 // using next fit online algorithm 
 static int nextFit(int weight[], int n, int c) 
 { 

     // Initialize result (Count of bins) and remaining 
     // capacity in current bin. 
     int res = 0, bin_rem = c; 

     // Place items one by one 
     for (int i = 0; i < n; i++) { 
         // If this item can't fit in current bin 
         if (weight[i] > bin_rem) { 
             res++; // Use a new bin
            
             bin_rem = c - weight[i];
             System.out.println(" in if res="+res+"bin_rem="+bin_rem+"weight[i]="+weight[i]);
         } 
         else
             bin_rem -= weight[i]; 
           System.out.println("in else res="+res+"bin_rem="+bin_rem+"weight[i]="+weight[i]);
     } 
     return res; 
 } 

 // Driver program 
 public static void main(String[] args) 
 { 
     //int weight[] = { 2, 5, 4, 7, 1, 3, 8 };
     int weight[] = { 1,2,3,4,5,7,8 };
     // Collections.sort(Arrays.asList(weight));
     int c = 10; 
     int n = weight.length; 
     System.out.println("Number of bins required in Next Fit : " + nextFit(weight, n, c)); 
 } 
} 