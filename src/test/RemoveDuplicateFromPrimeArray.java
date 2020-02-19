package com.test;

import java.util.ArrayList;
import java.util.List;

public class RemoveDuplicateFromPrimeArray {
	
	
	static int[] removeDups(int[] vect) 
    { 
        int res_ind = 1; 
  
        // Loop invariant : Elements from vect[0] 
        // to vect[res_ind-1] are unique. 
        for (int i = 1; i < vect.length; i++)  
        { 
            int j; 
            for (j = 0; j < i; j++) 
                if (vect[i] == vect[j]) 
                    break; 
            if (j == i) 
                vect[res_ind++] = vect[i]; 
        } 
  
        // Removes elements from vect[res_ind]  
        // to vect[end] 
        int[] new_arr = new int[res_ind]; 
        for (int i = 0; i < res_ind; i++) 
            new_arr[i] = vect[i]; 
  
        return new_arr; 
       // return vect;
    } 
  
    // Driver Code 
    public static void main(String[] args)  
    { 
        int[] vect = { 3,3, 5, 7, 2, 2, 5, 7, 7 }; 
        vect = removeDups(vect); 
  
        for (int i = 0; i < vect.length; i++) 
            System.out.print(vect[i] + " "); 
        System.out.println(); 
    } 

}
