package com.test;

import java.util.HashMap;
import java.util.Map;

public class LongestString {

	public static void main(String args[]) {
		
		String input="ABDEFGABEF";
		findLongstString(input);

	}

	public static void findLongstString(String input) {
		char in[] = input.toCharArray();
        
		Map<String,Integer> map=new HashMap();
		StringBuilder str=new StringBuilder();
		
		
		for (int i = 0; i < in.length; i++) {
			for (int j = i; j < in.length; j++) {
				if (in[i] != in[j]) {
					str.append(in[j]);
				}
				else
				{
					map.put(str.toString(),j);
					break;
				}
				//str.setLength(0);
				
			}
		}
		
		for(Map.Entry<String, Integer> entry:map.entrySet())
		{
			System.out.println(entry.getKey()+"="+entry.getValue());
		}
	}
}
