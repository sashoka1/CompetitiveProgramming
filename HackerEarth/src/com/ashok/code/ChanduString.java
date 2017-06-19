package com.ashok.code;
/* IMPORTANT: class must not be public. */


import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;




class ChanduString {
    public static void main(String args[] ) throws Exception {
       
    	
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        ArrayList<Integer> a1=new ArrayList<Integer>();
        ArrayList<Integer> a2=new ArrayList<Integer>();
        		
        for(int i=0;i<n;i++)
        {
        	
        	int l1=(sc.nextInt());
        	int l2=(sc.nextInt());
        	for(int j=0;j<l1;j++){
        		a1.add(sc.nextInt());
        		
        	}
        	for(int j=0;j<l2;j++){
        		a2.add(sc.nextInt());
        		
        	}
        	        	
        	 a1.addAll(a2);
        	 Collections.sort(a1, Collections.reverseOrder());
        	 System.out.println(a1);
        	 
        	 for (int v : a1)
        	 {
        	      System.out.print(v + " ");
        	  }
        	 
        	 System.out.println();
        	 a1.clear();
        	 a2.clear();
        	 
        	


        }
       
    }  
       
}
