package com.ashok.code;
/* IMPORTANT: class must not be public. */
import java.util.Scanner;
class ChamChamandPlacement {
    public static void main(String args[] ) throws Exception {
       Scanner sc=new Scanner(System.in);
    	int n=sc.nextInt();
        for(long i=0;i<n;i++)
        {
        	long num=sc.nextInt();
        	Change(num);
        }
    }

	private static void Change(long num)
	{
	
		long sum=0;
		for(long i=0;i<=num;i++)
		{
    		sum=sum+i;
    	 
    	}
    	
    	System.out.println(num+1);
    	System.out.println(sum);
    	
    	for(long i=0;i<=num;i++)
    	{
    		System.out.print(i+" ");
    	 
    	}
    	
		
	}  
       
}
