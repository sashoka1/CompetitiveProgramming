package com.ashok.code;
import java.util.ArrayList;
import java.util.Scanner;
public class PublicityInRange {
    public static void main(String args[] ) throws Exception {
       ArrayList<Integer> arr=new ArrayList<Integer>();
    	Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
        for(int i=0;i<t;i++)
        {
            Integer n1=sc.nextInt();
        	Integer n2=sc.nextInt();
        	if(n2==0){
        		System.out.println(n1);
        		break;
        	}
        	else
        	{
        		int c=0;
        		for(int j=0;j<n2;j++)
        		{
        			
        			Integer m1=sc.nextInt();
                	Integer m2=sc.nextInt();
                	if(!arr.contains(m1))
                	{
                		arr.add(m1);
                	}
                	else{
                		c++;
                	}
                	 if(!arr.contains(m2))
                	{
                		 arr.add(m2);

                	}
                	 else{
                 		c++;
                 	}


        			
        		}
        		System.out.println(c);
        	}
        }
        
        
    }

	    	
  

		
	 
       
}
