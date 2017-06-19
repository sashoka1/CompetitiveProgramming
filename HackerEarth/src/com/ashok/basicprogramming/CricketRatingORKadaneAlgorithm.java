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
public class CricketRatingORKadaneAlgorithm {


	public static void main(String[] args) throws IOException {
		   
						BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
				    	long N=Integer.parseInt(br.readLine());
				    	if(N>1){
				    		String []str=br.readLine().trim().split(" ");
				    		System.out.println(""+maxSubArraySum(str));	
				    	}else if(N==0){
				    		System.out.println("0");
				    	}
				    	
				    			    	
				    	
}
	static int maxSubArraySum(String a[])
    {
        int size = a.length;
        int max_so_far = Integer.MIN_VALUE, max_ending_here = 0;
 
        for (int i = 0; i < size; i++)
	        {
        	if(!(a[i].equals(""))){
        		//System.out.println(a[i] + " "+ a[i].valueOf(arg0));
	            max_ending_here = max_ending_here + Integer.parseInt(a[i].trim());
	            if (max_so_far < max_ending_here)
	                max_so_far = max_ending_here;
	            if (max_ending_here < 0)
	                max_ending_here = 0;
	        }
        }
        return max_so_far;
    }
	
	
	
	
}
