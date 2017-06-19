package com.ashok.basicprogramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Stack;
import java.util.TreeSet;

/**
 * @author Ashok
 *
 *sashoka1@gmail.com
 */
public class RoysLifeCycle {


	public static void main(String[] args) throws IOException {
						long maxStrekDaily=0;
						long maxStrekTotal=0;
						BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
				    	long N=Long.parseLong(br.readLine());
				    	StringBuffer sb=new StringBuffer();
				    	for(long i=0;i<N;i++){
				    		String str=br.readLine();
				    		long maxStrekDailyLocal=findMaximumDailyCodeingStreck(str);
				    		if(maxStrekDaily<maxStrekDailyLocal){
				    			maxStrekDaily=maxStrekDailyLocal;
				    		}
				    		sb.append(str);
				    		
				    	}	
				    	String str1=new String(sb);
				    	maxStrekTotal=findMaximumDailyCodeingStreck(str1);
				    	System.out.println(maxStrekDaily+" "+maxStrekTotal);
				    	br.close();
				    	
				    	
}

	private static long findMaximumDailyCodeingStreck(String str) {
		long count=0;
		long maxCountt=0;
		long rMax=0;
		/*String pattern = "([a-zA-Z])\\1*";
		if(str.matches(pattern)){
			return str.length();
		}*/
		for(int i=0;i<str.length()-1;i++){
				
			if(str.charAt(i)=='C' && str.charAt(i+1)=='C'){
				count++;
				//maxCountt=count+1;
				
			}else{
				if(count>rMax){
					rMax=count+1;
				}
				
			    count=0;
			}	
			if(count>rMax){
				rMax=count+1;
			}
			
		}
		return rMax;
		
	}

	

	
	
	
	
}
