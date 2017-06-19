package com.ashok.basicprogramming;
import java.io.*;
import java.util.*;

/**
 * @author Ashok
 *
 *sashoka1@gmail.com
 */
class IllegibleString{
	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int len=Integer.parseInt(br.readLine().trim());
		String str1[]=br.readLine().split(" ");
	
		evenSumSubArraysCount(str1,len);
	
	}


	private static void evenSumSubArraysCount(String[] str1, int len) {
		// TODO Auto-generated method stub
		
	}


	
}