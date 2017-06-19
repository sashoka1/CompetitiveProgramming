package com.ashok.code;
import java.util.ArrayList; 
import java.util.HashMap; 
import java.util.Map; 

import java.util.List; 

public class AdderPair { 
public static void main(String[] args) { 

	
		int[] inputArr = {1, 2, 3,4}; 
		List<Map<String, Integer>> output = addPairs(inputArr, 4); 
		for(Map<String, Integer> eachMap : output) { 
		System.out.println(eachMap.get("val1") + " and "+ eachMap.get("val2")); 
		} 
} 

private static List<Map<String, Integer>> addPairs(int[] inputArr, int addition) { 
	int i = 0; 
	int j = inputArr.length-1; 
	List<Map<String, Integer>> output = new ArrayList<Map<String, Integer>>(); 
	for(; i<j; ) { 
		Map<String, Integer> outputMap = new HashMap<String, Integer>(); 
		int sum = inputArr[i]+inputArr[j]; 
		if(sum== addition) { 
			outputMap.put("val1", inputArr[i]); 
			outputMap.put("val2", inputArr[j]); 
			i++; 
			j--; 
		} else if(sum < addition) { 
			i++; 
			continue; 
		} else { 
			j--; 
			continue; 
		} 
		output.add(outputMap); 
		} 
	return output; 
	} 
}