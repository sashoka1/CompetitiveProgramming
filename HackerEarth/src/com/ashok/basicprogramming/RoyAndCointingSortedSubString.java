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
public class RoyAndCointingSortedSubString {


	public static void main(String[] args) throws IOException {
		   
						BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
				    	long N=Integer.parseInt(br.readLine());
				    	for(int i=0;i<N;i++){
				    		int len=Integer.parseInt(br.readLine());
				    		String str=br.readLine();
				    		findCountofSortedSubString(len,str);
				    		
				    	}				    	
				    	br.close();
				    	
				    	
}

	private static void findCountofSortedSubString(int len, String str) {
		//Set<String> set=new TreeSet<String>();
		int count=0;
		for (int i = 0; i < str.length(); i++) { // find all subString of a String
			for (int j = i+1; j <= str.length(); j++){
				String tempStr=str.substring(i,j);
				if(tempStr.length()==1){
					count++;
				}else {
					int tempCount=0;
					for(int k=0;k<tempStr.length();k++){	
						if(k+1<tempStr.length() && (tempStr.charAt(k)<=tempStr.charAt(k+1))){
							tempCount++;
						}else{
							break;
						}
					}
					if((tempStr.length()-1 )==tempCount){
						count++;
					}
				}
				//System.out.println(str.substring(i,j));
				//set.add(str.substring(i,j));
			}
		}
		System.out.println(count);
			
	
	}

	
	
	
	
}
