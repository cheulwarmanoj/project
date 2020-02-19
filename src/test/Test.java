package com.test;

import java.util.Arrays;

public class Test {
	
	public static void main(String args[])
	{
		Test t=new Test();
		t.sum();
		
	}
	
	public void sum()
	{
		int sum=Arrays.stream(new int[] {1,2,3}).filter(i->i>=1).map(i->i*3).sum();
		System.out.println("sum"+sum);
	}

}

