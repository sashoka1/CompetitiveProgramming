/**
 * 
 */
package com.ashok.hackerearth.datastructure;

import java.io.IOException;
import java.util.Scanner;


/**
 * @author Ashok Singh 
 * sashoka1@gmail.com
 *
 */
public class ModifySequence {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		   
	
			Scanner sc=new Scanner(System.in);
	    	int numberOfTestCase=sc.nextInt();
	    	long  i,temp,num=0;
	    	
	    	for (i=0;i<numberOfTestCase;i++)
	    	{
		    	 temp=sc.nextLong();
		    	 num+=temp;
		    	 num*=10;
		    	 num=num%11;
		    	 num= num%11;
		    	 num=num%11;
	    	}
	    	if (num%11==0)
	    	
	    	System.out.println("YES");
	    	else
	    	System.out.println("NO");
	    	
	    	sc.close();
	    	
	    
	    	}
	    	
		       
	}

	




	
