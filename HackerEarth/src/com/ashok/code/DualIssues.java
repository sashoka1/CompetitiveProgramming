package com.ashok.code;
/* IMPORTANT: class must not be public. */

import java.util.Arrays;
import java.util.Scanner;
class DualIssues{
    public static void main(String args[] ) throws Exception {
    	Integer ways = null;
		Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        
        for(int i=0;i<num;i++)
        {
        	int sizeofm=sc.nextInt();
            int arr[]=new int[sizeofm];
            for(int j=0;j<sizeofm;j++)
            {
        		arr[j]=sc.nextInt();
        		
        	 }
            findPrime(arr);
            
        }
       
    }
    private static void findPrime(int[] arr) {
		boolean flag=false;
		int latestPrime=0;
		Arrays.sort(arr);
    	 for(int j=0;j<arr.length;j++)
         {
     		if(isPrime(arr[j])){
     	              flag=true;
     	              latestPrime=arr[j];
     	          }
     		}
    	 	if(flag){
    	 		System.out.println(latestPrime*latestPrime);
    	 	}
    	 	else{
	        	  System.out.println("-1");
	          }
    	 
     		
     	 }
    public static boolean isPrime(int number){
        for(int i=2; i<number; i++){
        	
           if(number%i == 0){
               return false; 
           }
        }
        if(number==1){
        	return false;
        }
        return true; 
    }



	
	}
	
  
