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
public class TheGreatKian {


	public static void main(String[] args) throws IOException {
		   
						BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
				    	long N=Integer.parseInt(br.readLine());
				    	String []str=br.readLine().split(" ");
				    	long sum1 = 0;
				    	long sum2=0;
				    	long sum3=0;
				    	
				    	for(int i=0;i<N;){
				    		
				    		sum1+=Integer.parseInt(str[i]);
				    		if((i+1)<N){
				    			sum2+=Integer.parseInt(str[i+1]);
				    		}else{
				    			break;
				    		}
				    		if((i+2)<N){
				    			sum3+=Integer.parseInt(str[i+2]);
				    		}else{
				    			break;
				    		}
				    		i=i+3;
				    		
				    	}
				    	System.out.print(sum1+" "+sum2+" "+sum3);
				   
				    	
				    	br.close();
				    	
				    	
}

	
	
	
	
}
