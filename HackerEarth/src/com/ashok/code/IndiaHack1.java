package com.ashok.code;
/* IMPORTANT: class must not be public. */



import java.util.Scanner;




class IndiaHack1 {
    public static void main(String args[] ) throws Exception {
       
    	
        @SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
        	Integer stair=sc.nextInt();
        	Integer ways=(int) fib(stair+1);
        	System.out.println(ways + "w");
        }
    }

	    	
   static Integer fib(Integer n)
   {
	   if (n <= 1)
		      return n;
		   return fib(n-1) + fib(n-2);
	   
   }
		
	 
       
}
