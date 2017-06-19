/**
 * 
 */
package com.ashok.hackerearth.datastructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.NoSuchElementException;
import java.util.Scanner;


/**
 * @author Ashok Singh 
 * sashoka1@gmail.com
 *
 */
public class MonkAndWelcomeProblem {
	
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		   
	
		Scanner sc=new Scanner(System.in);
	    	int n=sc.nextInt();
	    	int arr1[]=new int[n];
	    	int arr2[]=new int[n];
	    	
	    	for(int i=0;i<n;i++)
	        {
	    		arr1[i]=sc.nextInt();
	           
	        }
	    	for(int i=0;i<n;i++)
	        {
	    		arr2[i]=sc.nextInt();
	           
	        }
	    	
	    	for(int i=0;i<n;i++)
	        {
	    		
	        System.out.print(arr1[i] + arr2[i] + "");
	    //    System.out.println("Arr2 : "+arr2[i]);
	           
	        }
		    
		       
	}
}	



	
