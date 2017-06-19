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
public class TheFootBallFestUsingStack {

	static int top=-1;
	public static void main(String[] args) throws NumberFormatException, IOException {
			   
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		    	int n=Integer.parseInt(br.readLine());	
		    	
		    	for(int j=0;j<n;j++){
		    		
		    		String []b=br.readLine().split(" ");
			    	int stack[]=new int[Integer.parseInt(b[0])];
			    	int lastElement=0;
			    	for(int i=1;i<=Integer.parseInt(b[0]);i++)
			        {
			    		String []b1=br.readLine().split(" ");
			        	if(b1[0].equals("P")){
			        		lastElement=Integer.parseInt(b1[1]);
			            	push(stack,Integer.parseInt(b1[1]));
			            
			        	}else if(b1[0].equals("B")){
			            	pop(stack);
			            }
			        	
			        }
			    	System.out.println("Player "+ lastElement);
			    	top=-1;
		    	}
		    
			    
			       
	}
	
	
	private static void push(int[] stack, int b) {
		
		top=top+1;
		stack[top]=b;
	
		//System.out.println("Pused Element : "+stack[top]);
		
	}
	
	private static void pop(int[] stack) {
		
		if(top==-1){
		
		}else{
			
	//	System.out.println("Poped Element : "+stack[top]);
			top=top-1;
			
		
		}
	}
	

}
