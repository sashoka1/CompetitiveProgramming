package com.ashok.code;
/* IMPORTANT: class must not be public. */



import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Scanner;




class LuckyNumber {
    public static void main(String args[] ) throws Exception 
    {
       Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
        	int num=sc.nextInt();
        	FindFunny(num);
        	
        }
    }

	    	
   static void FindFunny(int num)
   {
	   int c=0;
	   
	   BigInteger sum = new BigInteger("0");
	   	for(int j=1;j<=num;j++)
	   	{
	   		String binary=Integer.toBinaryString(j);
	   		for(int i=0;i<binary.length();i++)
	   		{
	   			if(binary.charAt(i)=='1')
	   			{
	   			System.out.println(binary);
	   				c++;
	   				
	   			}
	   			
	   		}
	   		System.out.println(c);
	   		if(c==2){
	   			sum=sum.add(new BigInteger(new String().valueOf(j)));
	   	
	   		}
	   		c=0;
	   		
	   		
	   	}
	  System.out.println(sum.mod(new BigInteger("1000000007")));
	   	
	   
   }
		
	 
       
}
