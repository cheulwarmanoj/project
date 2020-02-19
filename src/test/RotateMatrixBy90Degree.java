package com.test;

public class RotateMatrixBy90Degree {

    // An In place function to rotate a N rows N matrix 
    // by 90 degrees in anti-clockwise direction 
    static void rotateMatrix(int N, int matrix[][]) 
    { 
        // Consider all squares one by one 
        for (int rows = 0; rows < N / 2; rows++) 
        { 
            // Consider elements in group of 4 in  
            // current square 
            for (int column = rows; column < N-rows-1; column++) 
            { 
                // store current cell in temp variable 
                int temp = matrix[rows][column]; 
       
                // move values from right to top 
                matrix[rows][column] = matrix[column][N-1-rows]; 
       
                // move values from bottom to right 
                matrix[column][N-1-rows] = matrix[N-1-rows][N-1-column]; 
       
                // move values from left to bottom 
                matrix[N-1-rows][N-1-column] = matrix[N-1-column][rows]; 
       
                // assign temp to left 
                matrix[N-1-column][rows] = temp; 
            } 
        } 
    } 
  
    // Function to print the matrix 
    static void printMatrix(int N, int matrix[][]) 
    { 
        for (int i = 0; i < N; i++) 
        { 
            for (int j = 0; j < N; j++) 
                System.out.print(" " + matrix[i][j]); 
       
            System.out.print("\n"); 
        } 
        System.out.print("\n"); 
    } 
       
    /* Driver program to test above functions */
    public static void main (String[] args)  
    { 
        int N = 4; 
          
        // Test Case 1 
        int matrix[][] = 
        { 
            {1, 2, 3, 4}, 
            {5, 6, 7, 8}, 
            {9, 10, 11, 12}, 
            {13, 14, 15, 16} 
        }; 
       
       
        
        rotateMatrix(N,matrix); 
       
        // Print rotated matrix 
        printMatrix(N,matrix); 
    } 
} 
  