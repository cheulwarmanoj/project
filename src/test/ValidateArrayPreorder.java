package com.test;

//Java program for an efficient solution to check if 
//a given array can represent Preorder traversal of 
//a Binary Search Tree 
import java.util.Stack; 

class ValidateArrayPreorder { 

 boolean checkPreOrderOrNot(int pre[], int n) { 
     // Create an empty stack 
     Stack<Integer> s = new Stack<Integer>(); 

     // Initialize current root as minimum possible 
     // value 
     int root = Integer.MIN_VALUE; 
     System.out.println("root"+root);

     // Traverse given array 
     for (int i = 0; i < n; i++) { 
         // If we find a node who is on right side 
         // and smaller than root, return false 
    	 System.out.println(pre[i]);
         if (pre[i] < root) { 
             return false; 
         } 

         // If pre[i] is in right subtree of stack top, 
         // Keep removing items smaller than pre[i] 
         // and make the last removed item as new 
         // root. 
         while (!s.empty() && s.peek() < pre[i]) { 
             root = s.peek(); 
             s.pop(); 
         } 

         // At this point either stack is empty or 
         // pre[i] is smaller than root, push pre[i] 
         s.push(pre[i]); 
     } 
     return true; 
 }
 
 private boolean ValidatePreOrderOfBst(int arr[], int arrLength)
 {
	 Stack<Integer> stack= new Stack<Integer>();
	 
	 int rootElement=Integer.MIN_VALUE;
	 
	 for(int i=0;i<arrLength;i++)
	 {
		 if(arr[i]<rootElement)
		 {
			 return false;
		 }
		 
		 while(!stack.empty() && stack.peek() < arr[i])
		 {
			 rootElement=stack.peek();
			 stack.pop();
		 }
		 
		 stack.push(arr[i]);
	 }
	 
	 return true;
 }
 
 public static void main(String args[]) { 
	 ValidateArrayPreorder bst = new ValidateArrayPreorder(); 
     int[] pre1 = new int[]{40, 30, 35, 80, 100}; 
     int n = pre1.length; 
     if (bst.checkPreOrderOrNot(pre1, n) == true) { 
         System.out.println("true"); 
     } else { 
         System.out.println("false"); 
     } 
     int[] pre2 = new int[]{40, 30, 35, 20, 80, 100}; 
     int n1 = pre2.length; 
     if (bst.checkPreOrderOrNot(pre2, n) == true) { 
         System.out.println("true"); 
     } else { 
         System.out.println("false"); 
     } 
 } 
} 
