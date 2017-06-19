package com.ashok.code;
/* IMPORTANT: class must not be public. */


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;



class BigP {
    public static void main(String args[] ) throws Exception {
       
    	Scanner sc=new Scanner(System.in);
    	int max = 0,min = 0;
    	String a=sc.next();
    	String b=sc.next();
    	System.out.println(a);
    	System.out.println(b);
    	if(a.contains("5") &&  b.contains("5"))
    	{
    	  	min=Integer.parseInt(a) + Integer.parseInt(b);
    	  	max=min+2;
    	}
        if((!(a.contains("5")) && b.contains("5") )|| ((a.contains("5") && !( b.contains("5")))))
        {
        	min=Integer.parseInt(a) + Integer.parseInt(b);
    	  	max=min+1;
   
        }
        if(a.contains("6") &&  b.contains("6"))
    	{
    	  	max=Integer.parseInt(a) + Integer.parseInt(b);
    	  	max=min-2;
    	}
        if((!(a.contains("6")) && b.contains("6") )|| ((a.contains("6") && !( b.contains("6")))))
        {
        	max=Integer.parseInt(a) + Integer.parseInt(b);
    	  	max=min-1;
   
        }

    
        System.out.println(min+" "+max);
    }
}