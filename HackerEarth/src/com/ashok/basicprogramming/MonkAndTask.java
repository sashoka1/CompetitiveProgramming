package com.ashok.basicprogramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * @author Ashok
 *
 *sashoka1@gmail.com
 */
public class MonkAndTask {


	public static void main(String[] args) throws IOException {
		   
						BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
				    	int T=Integer.parseInt(br.readLine());
				    	for(int i=0;i<T;i++){
				    		int N=Integer.parseInt(br.readLine());
				    		String str[]=br.readLine().split(" ");
				    		taskToPerform(str,N);
				    	}
				   }

	private static void taskToPerform(String[] str, int n) {
	
		for(int i=0;i<n;i++){
			int c=0;
			String binary=Integer.toBinaryString(Integer.parseInt(str[i]));
			for(int k=0;k<binary.length();k++)
	   		{
	   			if(binary.charAt(i)=='1')
	   			{
	   		    	c++;
	   				
	   			}
	   			
	   		}
			HashMap<Integer, Integer> hmap = new HashMap<Integer, Integer>();
			//if()
		}
		
		
	}

	
	
	
	
}
