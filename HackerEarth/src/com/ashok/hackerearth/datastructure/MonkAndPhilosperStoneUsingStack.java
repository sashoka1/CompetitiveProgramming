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
public class MonkAndPhilosperStoneUsingStack {

	static int top=-1;
	public static void main(String[] args) throws NumberFormatException, IOException {
			   
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		    	int n=Integer.parseInt(br.readLine());
		    	
		    	String []b=br.readLine().split(" ");
		    	String []b1=br.readLine().split(" ");
		    	int stack[]=new int[Integer.parseInt(b1[0])];
		    	int k=0;
		    	for(int i=0;i<Integer.parseInt(b1[0]);i++)
		        {
		    		String abc=br.readLine();
		        	if(abc.equals("Remove")){
		            	pop(stack);
		        	}else if(abc.equals("Harry")){
		            	push(stack,Integer.parseInt(b[k++]));
		            }
		        }
		    	
		    	br.close();
		    	if(sum(stack)==Integer.parseInt(b1[1])){
		    		System.out.println(top+1);
		    	}else{
		    		System.out.println("-1");
		    	}
		    	System.out.println("Matchin : " + b1[1]);
			    
			       
	}
	
	private static int sum(int[] stack) {
		int sum=0;
	 for(int i=0;i<top+1;i++){
		 sum+=stack[i];
	 }
	 System.out.println("Sum : "+sum);
	 return sum;
	}
	private static void push(int[] stack, int b) {
		
		top=top+1;
		stack[top]=b;
	
		System.out.println("Pused Element : "+stack[top]);
		
	}
	
	private static void pop(int[] stack) {
		
		if(top==-1){
		
		}else{
			
			System.out.println("Poped Element : "+stack[top]);
			top=top-1;
			
		
		}
	}
	

}
