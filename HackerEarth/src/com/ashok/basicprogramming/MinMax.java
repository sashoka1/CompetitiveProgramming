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
public class MinMax {


	public static void main(String[] args) throws IOException {
		   
						BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
				    	int N=Integer.parseInt(br.readLine());
				    	String []b1=br.readLine().split(" ");
				    	Arrays.sort(b1);
						int min=Integer.parseInt(b1[0]);
						int max=Integer.parseInt(b1[b1.length-1]);
						int count =0;
						int expectedCount=max-min-1;		
				    		for(int j=min+1;j<max;j++){
				    			
				    			for(int i=0;i<N;i++)
						        {
				    				int temp=Integer.parseInt(b1[i]);
				    				
				    				if(temp==j)
				    				{
				    					
				    					count++;
				    					break;
				    				}
				    		}
				    		
				        }
				    	if(count==expectedCount){
				    		System.out.println("YES");
				    	}else{
				    		System.out.println("NO");
				    	}
				    	
}

	
	
	
	
}
