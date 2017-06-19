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
public class MonkAndRotation {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		   
	
			Scanner sc=new Scanner(System.in);
	    	int numberOfTestCase=sc.nextInt();
	    	
	    	
	    	for(int i=0;i<numberOfTestCase;i++)
	        {
	    		int sizeOfArray=sc.nextInt();
	    		int noOfRotation=sc.nextInt();
	    		
	    		int arr[]=new int[sizeOfArray];
	    		 for(int j=0;j<sizeOfArray;j++){
	    			 arr[j]=sc.nextInt();
	    		 }
	    		
	    		 printArrayAfterRotation(arr,noOfRotation,sizeOfArray);
	           
	        }
	    	sc.close();
	    	
		       
	}

	private static void printArrayAfterRotation(int[] arr, int k, int n) {
			
		k%=n;
		for(int i=0;i<n;i++)
			System.out.print(arr[(i+(n-k))%n] + " ");
		System.out.println();
		
		/*	while(noOfRotation!=0){
		//rightShiftUsignArrayCopy(arr);
		rightShift(arr);
		--noOfRotation;
		}
		

		
			for(int i : arr){
				System.out.print(i+" ");
			}
			System.out.println();
*/		
	}

	private static void rightShiftUsignArrayCopy(int[] arr) {
		int last = arr[arr.length-1];
		System.arraycopy(arr, 0, arr, 1, arr.length-1 );
		arr[0] = last;
	}

	private static void rightShift(int[] arr) {
		int temp = arr[arr.length-1]; // store the last element
		
		for(int i=arr.length-1;i>0;i--){
		
		  arr[i]=arr[i-1];   // do the switch
		
		}
		
		arr[0]=temp;
	}

}	



	
