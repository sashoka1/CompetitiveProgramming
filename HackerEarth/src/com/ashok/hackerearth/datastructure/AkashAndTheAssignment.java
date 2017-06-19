/**
 * 
 */
package com.ashok.hackerearth.datastructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;


/**
 * @author Ashok Singh 
 * sashoka1@gmail.com
 *
 */
public class AkashAndTheAssignment {


	public static void main(String[] args) throws NumberFormatException, IOException {
			   
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		    	
				String []inputs=br.readLine().split(" ");
				int n=Integer.parseInt(inputs[0]);
		    	int Q=Integer.parseInt(inputs[1]);
		    	
		    	String str=br.readLine();
		    	for(int i=0;i<Q;i++)
		        
		    	{
		    		String []b=br.readLine().split(" ");
			    	kthSmallestChar(b,str,n,Q);
		        }
		    	
		    	br.close();
		    	
			    
			       
	}
	
	private static void kthSmallestChar(String[] b, String str, int n, int q) {
		try{
		String subStr=str.substring(Integer.parseInt(b[0])-1, Integer.parseInt(b[1]));
		char arr[]=subStr.toCharArray();
		Arrays.sort(arr);
		System.out.println(arr[Integer.parseInt(b[2])-1]);
		
		}catch(Exception e){
			System.out.println("Out of range");
		}
		
		}


}
