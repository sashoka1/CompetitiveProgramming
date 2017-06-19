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
public class PalindromicCiphersUsingJuliusCipher {


	public static void main(String[] args) throws IOException {
		   
					BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
				    int n=Integer.parseInt(br.readLine());
				    for(int i=0;i<n;i++){
				    	String str=br.readLine();
					    StringBuffer strBuffer=new StringBuffer(str);
					    StringBuffer string=strBuffer.reverse();
					    String str1=new String(string);
					    if(str1.equals(str)){
					    	System.out.println("Palindrome");
					    }else{
					    	long prod=1;
					    	 for(int j=0;j<str.length();j++)
					    		 prod*=(int)str.charAt(j)-96;
							    System.out.println(prod);
					    }
				    }
					
					
				    
	    	  
	}
	
	
	
}
