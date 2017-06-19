package com.ashok.code;
/* IMPORTANT: class must not be public. */


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;




class IndiaHack2 {
    public static void main(String args[] ) throws Exception {
       
    	
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
        	Integer stair=sc.nextInt();
        	Integer ways=(int) fib(stair+1);
        	System.out.println(ways);
        }
    }

	    	
   static Integer fib(Integer n)
   {
	   if (n <= 1)
		      return n;
		   return fib(n-1) + fib(n-2);
	   
   }
		
	 
       
}
