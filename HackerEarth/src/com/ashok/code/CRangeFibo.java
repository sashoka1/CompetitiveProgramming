package com.ashok.code;
/* IMPORTANT: class must not be public. */



import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;




public class CRangeFibo {
    public static void main(String args[] ) throws Exception {
       
    	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    	Long n=Long.parseLong(br.readLine());
    	
    	for(int i=0;i<n;i++)
        {
        	String []b=br.readLine().split(" ");
            
            checkString(Long.parseLong(b[0]),Long.parseLong(b[1]));
        }
    }

	    	
   private static void checkString(Long n1, Long n2)
   {
	Long sum=0L;
	Long fib=0L;
	   for(Long i=n1;i<=n2;i++){
		   fib=fib(i-1);
		   sum=sum +fib % 10000;
		   
	   }
	  // sum=sum%(10^9+7);
	   System.out.println(sum % 1000000007);
	   sum=0L;
	   
	   
	   
   }
   
   static Long fib(Long n)
   {
	   /*if (n == 0) {
           return 0;
       } else if (n == 1) {
           return 1;
       } else {
           return fib(n - 1) + fib(n - 2);
       }*/
   if (n <= 1)
      return n;
   return fib(n-1) + fib(n-2);
   }



		
	 
       
}
