package com.test;


public class SwapNumberWithoutTemp {
	 public static void main(String args[]) { 
		int number1 = 56;
		int number2 = 70;
		swapNumber(70, 56);
	}

	private static void swapNumber(int number1, int number2)
	{
		//number1=number1
				
				if(number1>number2)
				{
				     number1=number1%number2;
				     number2=number2+number1;
				     number1=number2+number1
				     System.out.println(number1 +" "+number2); 		 
				}
		
	}

}
