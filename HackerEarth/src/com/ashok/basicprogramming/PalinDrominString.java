package com.ashok.basicprogramming;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Date;

class PalinDrominString {

	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringBuilder str1=new StringBuilder(br.readLine());
		String str=new String(str1);
		if(str.equals(str1.reverse())){
			System.out.println("YES");
		}else{
			System.out.println("NO");
		}
	    br.close();
	
	}

	
	

}