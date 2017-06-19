package com.ashok.code;

import java.util.Scanner;
public class IHP1 {
    public static void main(String args[] ) throws Exception {
       
    	
        
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
        for(int i=0;i<t;i++)
        {
            int str1=sc.nextInt();
        	int str2=sc.nextInt();
            checkString(str1,str2);
            
        }
    }

	    	
   private static void checkString(Integer n1, Integer n2)
   {
		
	   
	   int or = 0;	
		int i1=n1;
	 while(n1!=n2)
	 {
		
		 if(n1==i1)
		 {
			 or= n1 & ( n1+1); 
		 }
		 else
		 {
			 or=or & (n1+1);
		 }
		 n1++;
	 }
	 System.out.println(or);
	
   }
}
