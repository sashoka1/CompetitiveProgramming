package com.ashok.code;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;


public class UniqueJems1 {
	
	public static void main(String[] args) throws NumberFormatException, IOException
	{
		 int c=0;
		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	     int n=Integer.parseInt(br.readLine());
	     String arr[]=new String[n];
	     for(int i=0;i<arr.length;i++)
	     {
	    	 arr[i]=br.readLine();
	    	 getAllUniqueSubset(arr[i]);	    	
	     
	    }
	}

	public static void getAllUniqueSubset(String str) {
		 HashMap<String, Integer> charCountMap = new HashMap<String, Integer>();
		int c=0;
        for (int i = 0; i < str.length(); i++)
        {
            for (int j = 0; j < str.length() - i; j++) 
            {
                String elem = str.substring(j, j + (i+1));
              
                
           	 
    	        //Converting given string to char array
    	 
    	        	if(charCountMap.containsKey(elem))
    	            {
    	                //If char is present in charCountMap, incrementing it's count by 1
    	 
    	                charCountMap.put(elem, charCountMap.get(elem)+1);
    	            }
    	            else
    	            {
    	                //If char is not present in charCountMap,
    	                //putting this char to charCountMap with 1 as it's value
    	 
    	                charCountMap.put(elem, 1);
    	            }
    	        
    	        	
              
            }
        }
        Collection<Integer> count=charCountMap.values();
   	 	Iterator<Integer> itr=count.iterator();
   	 	while(itr.hasNext()){
   		 if(itr.next()==1)
   		 {
   			 c++;
   		 }
   	 }
   	 System.out.println(c);
   	 charCountMap.clear();
       
       
    }
}
