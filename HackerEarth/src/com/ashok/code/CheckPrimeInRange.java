package com.ashok.code;
/* IMPORTANT: class must not be public. */



import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;




public class CheckPrimeInRange {
    public static void main(String args[] ) throws Exception {
       
    	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    	int n=Integer.parseInt(br.readLine());
    	
    	for(int i=0;i<n;i++)
        {
        	String []b=br.readLine().split(" ");
            
            checkString(Integer.parseInt(b[0]),Integer.parseInt(b[1]));
        }
    }

	    	
   private static void checkString(Integer n1, Integer n2)
   {
			
	 boolean p=true;
	 for(int i=n1;i<=n2;i++)
	 {
		 for(int j=2;j<=Math.sqrt(i);j++)
		 {
			 if(i % j==0){
				 p=false;
				 break;
				 
			 }
			 p=true;
		 }
		 if(p && i>1)
			 System.out.println(i);
	 }
	   
   }



		
	 
       
}
