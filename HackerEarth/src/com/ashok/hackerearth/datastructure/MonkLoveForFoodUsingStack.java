/**
 * 
 */
package com.ashok.hackerearth.datastructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


/**
 * @author Ashok Singh 
 * sashoka1@gmail.com
 *
 */
public class MonkLoveForFoodUsingStack {

	static int top=-1;
	public static void main(String[] args) throws NumberFormatException, IOException {
			   
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		    	int n=Integer.parseInt(br.readLine());
		    	int stack[]=new int[n];
		    	for(int i=0;i<n;i++)
		        {
		        	String []b=br.readLine().split(" ");
		            if(Integer.parseInt(b[0])==1){
		            	pop(stack);
		            }else if(Integer.parseInt(b[0])==2){
		            	push(Integer.parseInt(b[1]),n,stack);
		        	}
		        }
			    
			       
	}
	private static void push(Integer n1, Integer n2,int stack[]) {
		
		top=top+1;
		stack[top]=n1;
	}
	private static void pop(int []stack) {
		
		if(top==-1){
			System.out.println("No Food");
		}else{
			System.out.println(stack[top]);
			top=top-1;
		}
	}
	

}
