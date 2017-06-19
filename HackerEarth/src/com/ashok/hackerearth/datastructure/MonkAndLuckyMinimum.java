/**
 * 
 */
package com.ashok.hackerearth.datastructure;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;


/**
 * @author Ashok Singh 
 * sashoka1@gmail.com
 *
 */
public class MonkAndLuckyMinimum {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		   
	
			Scanner sc=new Scanner(System.in);
	    	int numberOfTestCase=sc.nextInt();
	    	
	    	
	    	for(int i=0;i<numberOfTestCase;i++)
	        {
	    		int sizeOfArray=sc.nextInt();
	    		int arr[]=new int[sizeOfArray];
	    		 for(int j=0;j<sizeOfArray;j++){
	    			 arr[j]=sc.nextInt();
	    		 }
	    		 Arrays.sort(arr);
	    		 findMinLucky(arr);
	           
	        }
	    	sc.close();
	    	
		       
	}

	private static void findMinLucky(int[] arr) {
		
			int frequency = 1;
			if(arr.length>1){
			int j=0;
	        while(j<arr.length-1 && arr[j]==arr[j+1] ){
	            frequency++;
	                j++;
	        }
	        
			}
	
		if(frequency%2==0){
			System.out.println("UnLucky");
			
		}else{
			System.out.println("Lucky");
		}
	  
	}
}	



	
