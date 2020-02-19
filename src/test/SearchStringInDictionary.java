package com.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SearchStringInDictionary {
	
	public static void main(String args[])
	{
		SearchStringInDictionary searchStringInDictionary=new SearchStringInDictionary();
		searchStringInDictionary.findSubStringInDictionary();
	}
	
	public void findSubStringInDictionary() {
		String s = "abcdefabcd";
		Set<String> d = new HashSet<String> (Arrays.asList("a", "cdf", "bcd", "ef"));
		System.out.println(findSubString(s,d));
	}

	public List<String> findSubString(String s, Set<String> dictionary) {
		List<String> retSet = new ArrayList();
		for (int ii = 0; ii < s.length(); ii++) {
			for (int jj = ii; jj <= s.length(); jj++) {
				System.out.println(ii+"="+jj+"=substring="+s.substring(ii,  jj));
				if (dictionary.contains(s.substring(ii,  jj))) {
					System.out.println(ii+"="+jj+"=Found in Dict="+s.substring(ii,  jj));
					retSet.add(s.substring(ii,  jj));
				}
				
			}
			System.out.println(ii+" loop--------------------------------");
		}
		return retSet;
	}

}
