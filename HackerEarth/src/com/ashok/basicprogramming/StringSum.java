package com.ashok.basicprogramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * @author Ashok
 *
 *sashoka1@gmail.com
 */
public class StringSum {


	public static void main(String[] args) throws IOException {
		   
					int sum=0;
					BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
				    String str=br.readLine();
				    for(int i=0;i<str.length();i++)
				    	sum+=(int)str.charAt(i)-96;
				    System.out.println(sum);
				    
	    	  
	}
	
	
	
}
