package com.test;

import java.util.Arrays;

class Solution {
	public int solution(int[] A) {

		Arrays.sort(A);
		int tempAdd = 1;
		

		for (int i = 0; i < A.length; i++) {
			if(A[i]<=0)
				return 1;
			for (int k = i + 1; k < A.length; i++) {
				int temp = A[i];
				tempAdd = temp + 1;

				if (tempAdd != A[k]) {
					break;
				}
			}
		}

		System.out.println("temp="+tempAdd);
		if(tempAdd <=0)
		{
			tempAdd = 1;
		}
		
		return tempAdd;
	}
	
	public int[] sumZero(int n) {
        int[] result = new int[n];
        if (n == 1) {
            result[0] = 0;
            return result;
        }
        int x = n / 2;
        if (n % 2 == 0) {
            int i = 0;
            while (i < n) {
                result[i] = x;
                result[i + 1] = -x;
                i += 2;
                x--;
            }
        } else {
            result[0] = 0;
            int i = 1;
            while (i < n) {
                result[i] = x;
                result[i + 1] = -x;
                i += 2;
                x--;
            }
        }
        return result;
    }

	public static void main(String args[]) {
		Solution solution = new Solution();
		int[] A = { 1, 3, 6, 4, 1, 2};
		System.out.println(solution.solution(A));
	}
}
