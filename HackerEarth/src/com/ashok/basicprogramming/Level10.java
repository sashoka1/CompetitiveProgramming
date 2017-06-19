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
public class Level10 {


	public static void main(String[] args) throws IOException {
		   
					
					BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
				    int n =Integer.parseInt(br.readLine());
				    countPrime(n);
				   
		
	}

	private static void countPrime(int n) {
		 boolean p=true;
		 int count=0;
		 for(int i=1;i<n;i++)
		 {
			 for(int j=2;j<=Math.sqrt(i);j++)
			 {
				 if(i % j==0){
					 p=false;
					 break;
					 
				 }
				 p=true;
			 }
			 if(p && i>1)
				 count++;
		 }
		 System.out.println(count);
		
	}
	
	
	
}
