package com.ashok.code;
/* IMPORTANT: class must not be public. */
import java.util.*;
class SPOJStamp {
    public static void main(String args[] ) throws Exception {
       
   
    	 Scanner sc=new Scanner(System.in);
    	 int sum=0;
         int n=sc.nextInt();
         for(int i=0;i<n;i++)
         {
         	int num=sc.nextInt();
         	int num1=sc.nextInt();
         	int arr[]=new int[num1];
         	for(int k=0;k<num1;k++)
         	{
         		arr[k]=sc.nextInt();
         		
         		
         		
         	}
         	int c=0;
        	Arrays.sort(arr);
        	for(int j=num1-1;j>0;j--)
        	{
        		sum=sum+arr[j];
        		c++;
        		
        		if(sum>=num)
        		{
        			break;
        		}
        	
        		
        	}
        	System.out.println("Scenario #"+(i+1)+":");
        	if(sum >=num){
        		System.out.println(c);  
        	
        	}
        	else{
        		System.out.println("impossible"); 
        	}
         	sum=0;
         	System.out.println();
         }
    }

	
		

}
