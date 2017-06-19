package com.ashok.code;
/* IMPORTANT: class must not be public. */
import java.util.Scanner;
class IndiaHackPb2 {
    public static void main(String args[] ) throws Exception 
    {
       Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
        	String num1=sc.next();
        	String num2=sc.next();
        	FindFunny(num1,num2);
        	
        }
    }

	    	
   static void FindFunny(String num1,String num2)
   {
	   
	   int c=0;
	  for(int i=num1.length()-1;i>=0;i--)
	  {
		  
		  if((num1.charAt(i)-48) + ( num2.charAt(i)-48)>=10)
		  {
			c++;
			  
		  }
		   
	  }
	  if(c==0)
	  {
		  System.out.println("No carry operation");
		  
	  }
	  else if(c==1){
		  System.out.println(c +" carry operation");
	  }
	  else{
		  System.out.println(c +" carry operations");
	  }
	  
   }
		
	 
       
}
