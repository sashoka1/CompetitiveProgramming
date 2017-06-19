package com.ashok.code;
/* IMPORTANT: class must not be public. */



import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;




class FindStudent {
    public static void main(String args[] ) throws Exception {
       
    	
       
		Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        ArrayList<Integer> arr=new ArrayList<Integer>();
        for(int i=0;i<n;i++)
        {
        	arr.add(sc.nextInt());
        	
        
        }
        make(arr);
    }

	    	
   private static void make(ArrayList<Integer> arr) 
   {
	 Collections.sort(arr);
	 while(arr.isEmpty()){
		 
		 for(Integer i: arr)
		 {
			// if()
			 
		 }
	 }
		
	
   }


   
   
   
   
   
private static void make(int[] arr) 
   {
		Arrays.sort(arr);
		int arr1[]=new int[arr.length];
		int j=0;
		for(int i=0;i<arr.length;i++)
		{
			while(arr[0] <= arr[i])
			{
			 int a=arr[i]-arr[j];
			 
			 arr[i]=a;
			 
			}
			//j++;
		}
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
	   
		
	}





	 
       
}
