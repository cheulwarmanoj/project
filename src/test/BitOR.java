package com.test;

public class BitOR {

	public static void main(String args[]) {
		int num1 = 5;
		int num2 = 8;

		BitOR bitor = new BitOR();
		System.out.println(bitor.sol(num1, num2));

		// System.out.println((num1^num2));
		System.out.println((5^6));
		// System.out.println((num1^num2));

	}

	public int sol(int M, int N) {
		int result = 0;
		for (int i = M; i <= N; i++) {
			result ^= i;
		}

		return result;
	}

}
