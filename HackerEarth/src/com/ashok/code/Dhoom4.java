package com.ashok.code;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
class Dhoom4 {
    public static void main(String args[] ) throws Exception 
    {
        Scanner sc=new Scanner(System.in);
        int c=0;
        int mainKey=sc.nextInt();
        int lock=sc.nextInt();
        int otherKey=sc.nextInt();
        int arr[]=new int[otherKey];
        for(int i=0;i<otherKey;i++)
        {
        	arr[i]=sc.nextInt();
        	        
        }
        for(int i=0;i<otherKey;i++)
        {
      
        	if(arr[i]==lock)
        	{
        			
        	}
        	else
        	{
        		
        		arr[i]=(arr[i])*(mainKey);
        		c++;
        	}
        
        }
        System.out.println(c);

        
    }

	    	
   
}
