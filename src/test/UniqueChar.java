package com.test;

import java.util.HashMap;
import java.util.Map;

public class UniqueChar {

	public static void main(String args[]) {
		String word = "hello";
		Map<Character,Integer> map = new HashMap();

		//String wordArr = word.lesplit();
		int len = word.length();

		for (int i = 0; i < len; i++) {
			if (map.get(word.charAt(i)) == null) {
				map.put(word.charAt(i), 1);
			} else {
				map.put(word.charAt(i), map.get(word.charAt(i)+1));
			}

		}
		
		//Iterator it=map.i();
		
		for(Map.Entry<Character, Integer> entry:map.entrySet())
		{
		   	
		}
	}

}
