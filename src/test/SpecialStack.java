package com.test;

import java.util.Stack;

public class SpecialStack extends Stack<Integer> {

	
	Stack<Integer> min = new Stack<>();
	
	public void push(int x)
	{
		if(isEmpty())
		{
			super.push(x);
			min.push(x);
		}
		else
		{
			super.push(x);
			int y=min.pop();
			min.push(y);
			if(x<y)
				min.push(x);
			else
				min.push(y);
		}
	}
	
	public Integer pop()
	{
		int x=super.pop();
		min.pop();
		return x;
	}
	
	public Integer getMin()
	{
		int x= min.pop();
		min.push(x);
		return x;
	}
	
	public static void main(String args[])
	{
		SpecialStack stack=new SpecialStack();
		stack.push(10);
		stack.push(20);
		stack.push(30);
		
		System.out.println(stack.getMin());
		
		stack.push(6);
		
		System.out.println(stack.getMin());
		
	}
}
