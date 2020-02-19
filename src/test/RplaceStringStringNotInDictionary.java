package com.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RplaceStringStringNotInDictionary {

	public static void main(String args[]) {
		RplaceStringStringNotInDictionary searchStringInDictionary = new RplaceStringStringNotInDictionary();
		 searchStringInDictionary.findSubStringInDictionary();
		//searchStringInDictionary.searchString();
	}

	public void findSubStringInDictionary() {
		String s = "a";
		Set<String> d = new HashSet<String>(Arrays.asList("a", "cdf", "bcd", "ef"));
		System.out.println(findSubString(s, d));
	}

	public List<String> findSubString(String s, Set<String> dictionary) {
		List<String> retSet = new ArrayList();
		for (int ii = 0; ii < s.length(); ii++) {
			for (int jj = ii; jj <= s.length(); jj++) {
				System.out.println(ii + "=" + jj + "=substring=" + s.substring(ii, jj));
				if (!dictionary.contains(s.substring(ii, jj))) {
					System.out.println(ii + "=" + jj + "=Found in Dict=" + s.substring(ii, jj));
					retSet.add(s);
				}
				else
				{
					retSet.add(s.substring(ii, jj));
				}

			}
			//System.out.println(ii + " loop--------------------------------");
		}
		return retSet;
	}

	public void searchString() {
		String input = "aa";

		Set<String> d = new HashSet<String>(Arrays.asList("a", "cdf", "bcd", "ef"));

		Set<String> d1 = new HashSet<String>();
		
		StringBuilder builder = new StringBuilder();

		char[] ch = stringIntoSearch.toCharArray();

		for (int i = 0; i < ch.length; i++) {
			//for (int j = 0; j < ch.length; j++) {
				if (stringIntoSearch.charAt(i) > 0) {
					builder.append(input);
				} else {
					builder.append(stringIntoSearch.charAt(i));
				}
			}
		}

		System.out.println("output" + builder.toString());
	}

}
