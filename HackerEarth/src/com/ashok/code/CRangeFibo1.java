package com.ashok.code;
/* IMPORTANT: class must not be public. */



import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Scanner;




public class CRangeFibo1 {
    public static void main(String args[] ) throws Exception {
       
    	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    	Long n=Long.parseLong(br.readLine());
    	
    	
    	for(int i=0;i<n;i++)
        {
        	String []b=br.readLine().split(" ");
            
            checkString(b[0],b[1]);
        }
    }

	    	
   private static void checkString(String n1, String n2)
   {
	
	
	BigInteger sum=new BigInteger("0");
	
	BigInteger fib=new BigInteger("0");
	
	
	BigInteger n11=new BigInteger(n1);
	BigInteger n12=new BigInteger(n2);
	
	 for (BigInteger bi = n11;
             bi.compareTo(n12) <= 0;
             bi = bi.add(BigInteger.ONE)) {
		 
		 fib=fib(bi.subtract(new BigInteger("1")));
		 
		 sum=sum.add(fib.mod(new BigInteger("10000")));
	 }
	 System.out.println(sum.mod(new BigInteger("1000000007")));

	   
	   
   }
   
   private static BigInteger fib(BigInteger n) {
	   
	   if (n.compareTo(BigInteger.ONE) <= 1)
		      return n;
		   return fib(n.subtract(new BigInteger("1"))).add(fib(n.subtract(new BigInteger("2"))));
	
}

}
