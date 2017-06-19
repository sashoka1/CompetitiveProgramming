package com.ashok.code;
/* IMPORTANT: class must not be public. */



import java.util.Scanner;




class PlayWithString {
    public static void main(String args[] ) throws Exception 
    {
       Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
        	StringBuffer sb=new StringBuffer(sc.next());
        	FindFunny(sb);
        	
        }
    }

	    	
   static void FindFunny(StringBuffer sb)
   {
	   boolean f = false;
	   String str1=new String(sb);
	   StringBuffer sb1=sb.reverse();
	   	   for(int i=0;i<sb1.length()-1;i++){
		   if((Math.abs(str1.charAt(i+1)-(str1.charAt(i))))==(Math.abs(sb1.charAt(i+1)-(sb1.charAt(i)))))
		   {
			  
			  
			   f=true;
			   
			   
		   }
		   else{
			   f=false;
			   break;
			  
		   }
	   }
	   if(f)
		   System.out.println("Funny");
	   else
	   System.out.println("Not Funny");
	   
   }
		
	 
       
}
