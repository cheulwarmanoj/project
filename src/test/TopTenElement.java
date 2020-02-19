package com.test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

public class TopTenElement {

	public static void main(String args[]) {
		Integer input[] = { 12, 13, 1, 10, 34, 1 };
		TopTenElement topTenElement = new TopTenElement();
		topTenElement.getTopElement(input, 3);

	}

	public void topTenElement(int input[], int noOfTopElement) {
		int count = 0;
		int output[] = new int[noOfTopElement];

		Arrays.sort(input);
		
		for (int j = 0; j < input.length; j++) {
			System.out.println(input[j]);

		}
		
		int len=input.length-1;
        
		
		while(len<0) {
			System.out.println("for loop array after sorting"+input[len]);
			if (count < noOfTopElement) {
				output[count] = input[len];
				count++;
			}
			len--;
		}

		for (int j = 0; j < output.length; j++) {
			System.out.println(output[j]);

		}
		// return output;
	}
	
	public void getTopElement(Integer input[],int limit)
	{
		List<Integer> list = Arrays.asList(input);
		list.stream()
		    .sorted(Collections.reverseOrder())
		    .limit(limit)// Method on Stream<Integer>
		    .forEach(System.out::println)
		    .limit(limit);
		Stream<Integer> number=list.stream()..forEach(System.out::println).limit(limit).forEach(System.out::println);
		
		Stream<Integer> lm=;
		
		//System.out.println("sorted element");
		number.forEach(System.out::println); 
		
		
	}
	
	public static Stream<Integer> limiting_func(Stream<Integer> ss, int range){ 
        return ss.limit(range); 
    } 
}
